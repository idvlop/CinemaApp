package org.idvlop.cinemaAppServer.databaseManagement.dbServices;

import org.idvlop.cinemaAppServer.databaseManagement.dbRepositories.EmployeeSessionRepository;
import org.idvlop.cinemaAppServer.databaseManagement.dataSets.EmployeeSessionDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class EmployeeSessionService {

    @Autowired
    private EmployeeSessionRepository employeeSessionRepository;

    @Transactional
    public void testEmployeeSessionRepository() {
        Optional<EmployeeSessionDataSet> clientOptional = employeeSessionRepository.findById(127L);

    }
}
