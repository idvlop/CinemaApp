package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.EmployeeSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSessionRepository extends JpaRepository<EmployeeSession, Long> {
}
