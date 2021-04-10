package org.idvlop.cinemaAppServer;

import org.idvlop.cinemaAppServer.databaseService.DatabaseManager;
import org.idvlop.cinemaAppServer.databaseService.dataSets.ClientDataSet;
import org.idvlop.cinemaAppServer.databaseService.dataSets.SessionDataSet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaAppServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CinemaAppServerApplication.class, args);

		//Server
		//ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

		var dbm = new DatabaseManager();
		dbm.printConnectInfo();

		//server.start();
		//server.join();
	}

}
