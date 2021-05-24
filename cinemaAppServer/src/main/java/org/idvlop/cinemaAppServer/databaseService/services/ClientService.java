package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.ClientRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class ClientService {

    @Resource
    private ClientRepository clientRepository;

    @Transactional
    public Boolean checkAge18(Long userId){
        Optional<Client> client = clientRepository.findClientByUser_Id(userId);
        if(client.isPresent())
            return client.get().getAge() >= 18;
        else throw new NullPointerException();
    }
}
