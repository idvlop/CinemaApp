package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.SessionRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class SessionService {

    @Resource
    private SessionRepository sessionRepository;

    @Transactional
    public Session getSessionById(Long id) {
        Optional<Session> session = sessionRepository.findById(id);
        return session.get();
    }
}
