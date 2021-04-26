package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.EmployeeRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Employee;
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
        Optional<Employee> clientOptional = employeeRepository.findById(127L);
    }
}
