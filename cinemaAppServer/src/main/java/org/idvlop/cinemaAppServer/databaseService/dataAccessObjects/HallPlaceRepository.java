package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.HallPlaceDataSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallPlaceRepository extends JpaRepository<HallPlaceDataSet, Long> {
}
