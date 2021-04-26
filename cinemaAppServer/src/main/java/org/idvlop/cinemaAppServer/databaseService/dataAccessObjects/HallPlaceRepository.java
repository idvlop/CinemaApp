package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.HallPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallPlaceRepository extends JpaRepository<HallPlace, Long> {
}
