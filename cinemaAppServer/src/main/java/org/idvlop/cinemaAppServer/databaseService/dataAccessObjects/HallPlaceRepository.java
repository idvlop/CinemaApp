package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.HallPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HallPlaceRepository extends JpaRepository<HallPlace, Long> {

    List<HallPlace> findHallPlacesByHall_Id(Long hallId);


}
