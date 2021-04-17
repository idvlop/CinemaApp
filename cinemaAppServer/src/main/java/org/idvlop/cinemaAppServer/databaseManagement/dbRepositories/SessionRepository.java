package org.idvlop.cinemaAppServer.databaseManagement.dbRepositories;

import org.idvlop.cinemaAppServer.databaseManagement.dataSets.SessionDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<SessionDataSet, Long> {
}
