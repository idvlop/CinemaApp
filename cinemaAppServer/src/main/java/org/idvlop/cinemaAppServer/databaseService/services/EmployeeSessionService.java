package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.EmployeeSessionRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.EmployeeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class EmployeeSessionService {

    @Autowired
    private EmployeeSessionRepository employeeSessionRepository;

    @Transactional
    public void testEmployeeSessionRepository() {
        Optional<EmployeeSession> clientOptional = employeeSessionRepository.findById(127L);

    }
}
