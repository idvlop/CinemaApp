package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.HallPlaceRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.HallPlace;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

public class HallPlaceService {

    @Resource
    private HallPlaceRepository hallPlaceRepository;

    @Transactional
    public HallPlace getHallPlaceById(Long id) {
        Optional<HallPlace> hallPlace = hallPlaceRepository.findById(id);
        return hallPlace.get();
    }
}
