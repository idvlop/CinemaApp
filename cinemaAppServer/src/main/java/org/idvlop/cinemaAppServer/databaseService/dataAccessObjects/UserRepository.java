package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.Client;
import org.idvlop.cinemaAppServer.databaseService.dataSets.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

    User findByLogin(String login);
    void setLogin(String login);
    void editPasswdCodeClient(Long id, String newPasswdCode);
}
