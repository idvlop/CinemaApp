package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


    //Client findByLogin(String login);
//    void createNewClient(String login, String passwd, String name, Timestamp birthDate);
//    void editNameClient(Long id, String newName);
//    void editPasswdClient(Long id, String newPasswd);
//    void editBirthDateClient(Long id, Timestamp birthDate);


}
