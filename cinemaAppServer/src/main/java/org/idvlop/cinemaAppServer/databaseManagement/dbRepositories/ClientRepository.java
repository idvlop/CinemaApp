package org.idvlop.cinemaAppServer.databaseManagement.dbRepositories;

import org.idvlop.cinemaAppServer.databaseManagement.dataSets.ClientDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<ClientDataSet, Long> {


//    void createNewClient(String login, String passwd, String name, Timestamp birthDate);
//    void editNameClient(Long id, String newName);
//    void editPasswdClient(Long id, String newPasswd);
//    void editBirthDateClient(Long id, Timestamp birthDate);


}
