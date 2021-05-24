package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.HallRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class HallService {

    @Resource
    private HallRepository hallRepository;

    @Transactional
    public Hall getHallById(Long id) {
        Optional<Hall> hall = hallRepository.findById(id);
        return hall.get();
    }
}
