package org.idvlop.cinemaAppServer.databaseManagement.dbServices;

import org.idvlop.cinemaAppServer.databaseManagement.dbRepositories.HallPlaceRepository;
import org.idvlop.cinemaAppServer.databaseManagement.dataSets.HallPlaceDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class HallPlaceService {

    @Autowired
    private HallPlaceRepository hallPlaceRepository;

    @Transactional
    public void testHallPlaceRepository() {
        Optional<HallPlaceDataSet> clientOptional = hallPlaceRepository.findById(127L);

    }
}
