package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
