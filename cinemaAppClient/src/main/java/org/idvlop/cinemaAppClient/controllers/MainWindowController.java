package org.idvlop.cinemaAppClient.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainWindowController {
    private ClientFXApplication clientFXApplication;
    private ApplicationContext context;

    public MainWindowController(ClientFXApplication clientFXApplication) {
        this.clientFXApplication = clientFXApplication;
    }
}
