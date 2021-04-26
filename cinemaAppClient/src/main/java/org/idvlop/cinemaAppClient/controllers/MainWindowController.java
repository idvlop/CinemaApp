package org.idvlop.cinemaAppClient.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainWindowController {
    private ClientApplication clientApplication;
    private ApplicationContext context;

    public MainWindowController(ClientApplication clientApplication) {
        this.clientApplication = clientApplication;
    }
}
