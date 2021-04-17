package org.idvlop.cinemaAppServer.databaseManagement.dbRepositories;


import org.idvlop.cinemaAppServer.databaseManagement.dataSets.EmployeeDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDataSet, Long> {
}
