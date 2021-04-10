package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.EmployeeSessionDataSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSessionRepository extends JpaRepository<EmployeeSessionDataSet, Long> {
}
