package org.idvlop.cinemaAppClient;

import javafx.stage.Stage;
import org.idvlop.cinemaAppClient.controllers.ClientFXApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<ClientFXApplication.StageReadyEvent> {

    @Override
    public void onApplicationEvent(ClientFXApplication.StageReadyEvent event) {
        Stage stage = event.getStage();
    }
}
