package org.idvlop.cinemaAppServer.databaseManagement.dbRepositories;

import org.idvlop.cinemaAppServer.databaseManagement.dataSets.HallPlaceDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallPlaceRepository extends JpaRepository<HallPlaceDataSet, Long> {
}
