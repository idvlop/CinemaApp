package org.idvlop.cinemaAppClient.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.idvlop.cinemaAppClient.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class ClientFXApplication extends Application {
    private Parent rootNode;
    private ConfigurableApplicationContext springContext;
    private Stage stage;

    @Override
    public void init() throws  Exception{
        System.out.println("App is initializing");

        springContext = new SpringApplicationBuilder(Main.class)
                .sources(ClientFXApplication.class)
                .run(getParameters().getRaw().toArray(new String[0]));
        springContext = SpringApplication.run(Main.class);

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/MainWindow.fxml"));
        fxmlLoader.setClassLoader(MainWindowController.class.getClassLoader());
        fxmlLoader.setControllerFactory(springContext::getBean);

        MainWindowController mainWindowController = new MainWindowController(this);
        fxmlLoader.setController(mainWindowController);

        rootNode = fxmlLoader.load();
    }

    @Override
    public void start(Stage stage) {

        System.out.println("App is starting");

        springContext.publishEvent(new StageReadyEvent(stage));
        this.stage = stage;

        stage.setScene(new Scene(rootNode, 1366, 768));
        stage.setTitle("Авторизация");
        stage.setResizable(false);


        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("App is stopping");
        springContext.close();
        Platform.exit();
    }

    public void ChangeScene(String fxmlUrl) throws IOException, NullPointerException {
        Parent pane = FXMLLoader.load(getClass().getResource("/fxml/" + fxmlUrl));
        stage.setHeight(768);
        stage.setWidth(1366);
        stage.centerOnScreen();
        stage.getScene().setRoot(pane);
    }

    public static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }
        public Stage getStage() {
            return ((Stage) getSource());
        }
    }
}