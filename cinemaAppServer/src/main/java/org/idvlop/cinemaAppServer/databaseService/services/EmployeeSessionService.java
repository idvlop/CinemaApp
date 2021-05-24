package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.EmployeeSessionRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.EmployeeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

public class EmployeeSessionService {

    @Resource
    private EmployeeSessionRepository employeeSessionRepository;

    @Transactional
    public EmployeeSession getEmployeeSessionById(Long id) {
        Optional<EmployeeSession> employeeSession = employeeSessionRepository.findById(id);
        return employeeSession.get();
    }
}
