package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findClientByUser_Id(Long userId);

    //Client findByLogin(String login);
//    void createNewClient(String login, String passwd, String name, Timestamp birthDate);
//    void editNameClient(Long id, String newName);
//    void editPasswdClient(Long id, String newPasswd);
//    void editBirthDateClient(Long id, Timestamp birthDate);


}
