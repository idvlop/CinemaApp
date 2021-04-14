//package org.idvlop.cinemaAppServer.configurations.spring;
//
//import org.hibernate.jpa.HibernatePersistenceProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@EnableTransactionManagement
//@ComponentScan("com.spring")
//@EnableJpaRepositories("com.spring.repository")
//@PropertySource("classpath:application.properties")
//public class DataConfig {
//    @Autowired
//    Environment springEnvironment;
//
//    @Autowired
//    Environment hibernateEnvironment;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        //dataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("jdbc.driverClassName")));
//        //dataSource.setUrl(environment.getProperty("jdbc.driver-class-name"));
//        dataSource.setUrl(springEnvironment.getProperty("jdbc.database-platform"));
//        dataSource.setUrl(springEnvironment.getProperty("jdbc.url"));
//        dataSource.setPassword(springEnvironment.getProperty("jdbc.password"));
//        dataSource.setUsername(springEnvironment.getProperty("jdbc.username"));
//
////        dataSource.setUsername(environment.getProperty("spring.jpa.hibernate.dialect"));
////        dataSource.setUsername(environment.getProperty("spring.jpa.hibernate.show_sql"));
//
//        dataSource.setUsername(springEnvironment.getProperty("spring.jpa.generate-ddl"));
//        dataSource.setUsername(springEnvironment.getProperty("spring.jpa.hibernate.ddl-auto"));
//        return dataSource;
//
//
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager() {
//        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
//        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//        return jpaTransactionManager;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//        bean.setDataSource(dataSource());
//        bean.setPackagesToScan("org.idvlop.cinemaAppServer.databaseManagement");
//        bean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        bean.setPackagesToScan("com.spring.model");
//        bean.setJpaProperties(HibernateProperties());
//        return bean;
//    }
//
//    private Properties HibernateProperties() {
//        Properties properties = new Properties();
//        //properties.setProperty("hibernate.dialect", environment.getProperty("hibernate.dialect"));
//        //properties.setProperty("hibernate.connection.driver_class", environment.getProperty("hibernate.connection.driver_class"));
//        properties.setProperty("hibernate.show_sql", hibernateEnvironment.getProperty("hibernate.show_sql"));
//        //properties.setProperty("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
//        return properties;
//    }
//}
