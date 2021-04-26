package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
