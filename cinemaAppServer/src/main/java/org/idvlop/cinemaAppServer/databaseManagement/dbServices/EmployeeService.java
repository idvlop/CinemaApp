package org.idvlop.cinemaAppServer.databaseManagement.dbServices;

import org.idvlop.cinemaAppServer.databaseManagement.dbRepositories.EmployeeRepository;
import org.idvlop.cinemaAppServer.databaseManagement.dataSets.EmployeeDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void testEmployeeRepository() {
        Optional<EmployeeDataSet> clientOptional = employeeRepository.findById(127L);
    }
}
