package org.idvlop.cinemaAppServer.databaseService;

import org.idvlop.cinemaAppServer.databaseService.dataSets.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Component;

@Component
public class DatabaseManager {

    private final String hibernate_hbm2ddl_auto = "update"; // [validate / update / create / create-drop]
    private final SessionFactory sessionFactory;
    private final Session session;


    public DatabaseManager(){
        Configuration configuration = getConfiguration();
        sessionFactory = getSessionFactory(configuration);
        session = sessionFactory.openSession();
    }

    //TODO Переделать в hibernate.cfg.xml файл
    private Configuration getConfiguration(){
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(ClientDataSet.class);
        configuration.addAnnotatedClass(EmployeeDataSet.class);
        configuration.addAnnotatedClass(EmployeeSessionDataSet.class);
        configuration.addAnnotatedClass(HallDataSet.class);
        configuration.addAnnotatedClass(HallPlaceDataSet.class);
        configuration.addAnnotatedClass(MovieDataSet.class);
        configuration.addAnnotatedClass(Session.class);

        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL94Dialect");
        //configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/CinemaAppDB");
        configuration.setProperty("hibernate.connection.username", "DBApiUser");
        configuration.setProperty("hibernate.connection.password", "DBApiUser");
        configuration.setProperty("hibernate.show_sql", "true");
        configuration.setProperty("hibernate.hbm2ddl.auto", hibernate_hbm2ddl_auto);
        return configuration;
    }


    //TODO желательно сделать вывод инфы
    public void printConnectInfo() {
            System.out.println("isConnected: " + session.isConnected());
            System.out.println("info: " + session.toString());
    }
    
    //TODO разобраться, что здесь происходит
    private static SessionFactory getSessionFactory(Configuration configuration) {
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
        builder.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = builder.build();

        return configuration.buildSessionFactory(serviceRegistry);
    }
}
