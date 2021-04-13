package org.idvlop.cinemaAppServer.databaseManagement.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseManagement.dataSets.MovieDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieDataSet, Long> {
}
