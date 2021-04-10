package org.idvlop.cinemaAppClient;

import javafx.application.Application;
import org.idvlop.cinemaAppClient.controllers.ClientFXApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		Application.launch(ClientFXApplication.class, args);
	}


}
