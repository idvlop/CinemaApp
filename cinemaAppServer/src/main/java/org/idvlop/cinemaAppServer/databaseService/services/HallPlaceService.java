package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.HallPlaceRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.HallPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class HallPlaceService {

    @Autowired
    private HallPlaceRepository hallPlaceRepository;

    @Transactional
    public void testHallPlaceRepository() {
        Optional<HallPlace> clientOptional = hallPlaceRepository.findById(127L);

    }
}
