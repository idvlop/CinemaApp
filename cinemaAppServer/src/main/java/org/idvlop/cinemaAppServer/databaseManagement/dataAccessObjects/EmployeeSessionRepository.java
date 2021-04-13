package org.idvlop.cinemaAppServer.databaseManagement.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseManagement.dataSets.EmployeeSessionDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSessionRepository extends JpaRepository<EmployeeSessionDataSet, Long> {
}
