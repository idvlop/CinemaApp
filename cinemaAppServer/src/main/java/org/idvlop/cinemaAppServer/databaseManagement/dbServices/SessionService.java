package org.idvlop.cinemaAppServer.databaseManagement.dbServices;

import org.idvlop.cinemaAppServer.databaseManagement.dbRepositories.SessionRepository;
import org.idvlop.cinemaAppServer.databaseManagement.dataSets.SessionDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Transactional
    public void testSessionRepository() {
        Optional<SessionDataSet> clientOptional = sessionRepository.findById(127L);

    }
}
