package org.idvlop.cinemaAppClient.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.idvlop.cinemaAppClient.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class ClientFXApplication extends Application {
    private Parent rootNode;
    private ConfigurableApplicationContext springContext;

    @Override
    public void init() throws  Exception{
        springContext = new SpringApplicationBuilder(Main.class).run();
        springContext = SpringApplication.run(Main.class);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/MainWindow.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        rootNode = fxmlLoader.load();
    }

    @Override
    public void start(Stage stage) {
        springContext.publishEvent(new StageReadyEvent(stage));
        stage.setScene(new Scene(rootNode, 1366, 768));
        stage.setMinWidth(1366);
        stage.setMinHeight(768);
        stage.show();
    }

    @Override
    public void stop() {
        springContext.close();
        Platform.exit();
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