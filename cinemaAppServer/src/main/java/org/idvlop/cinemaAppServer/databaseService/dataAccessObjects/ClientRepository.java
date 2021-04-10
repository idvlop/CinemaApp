package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.ClientDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface ClientRepository extends JpaRepository<ClientDataSet, Long> {

    void createNewClient(String login, String passwd, String name, Timestamp birthDate);
    void editNameClient(Long id, String newName);
    void editPasswdClient(Long id, String newPasswd);
    void editBirthDateClient(Long id, Timestamp birthDate);
}
