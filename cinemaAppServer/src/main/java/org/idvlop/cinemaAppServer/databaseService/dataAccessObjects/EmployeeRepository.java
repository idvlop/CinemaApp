package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;


import org.idvlop.cinemaAppServer.databaseService.dataSets.EmployeeDataSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDataSet, Long> {
}
