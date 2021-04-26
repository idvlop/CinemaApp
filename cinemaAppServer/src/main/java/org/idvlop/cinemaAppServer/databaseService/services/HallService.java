package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.HallRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class HallService {

    @Autowired
    private HallRepository hallRepository;

    @Transactional
    public void testHallRepository() {
        Optional<Hall> clientOptional = hallRepository.findById(127L);

    }
}
