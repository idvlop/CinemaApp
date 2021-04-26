package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;


import org.idvlop.cinemaAppServer.databaseService.dataSets.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
