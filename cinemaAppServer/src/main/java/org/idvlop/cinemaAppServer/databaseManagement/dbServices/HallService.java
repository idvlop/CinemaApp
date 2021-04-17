package org.idvlop.cinemaAppServer.databaseManagement.dbServices;

import org.idvlop.cinemaAppServer.databaseManagement.dbRepositories.HallRepository;
import org.idvlop.cinemaAppServer.databaseManagement.dataSets.HallDataSet;
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
        Optional<HallDataSet> clientOptional = hallRepository.findById(127L);

    }
}
