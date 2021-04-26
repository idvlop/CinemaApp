package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.ClientRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional
    public Client getClient(String login){
        return clientRepository.findByLogin(login);
    }
}

//  Готовый перечень операций из CrudRepository:
//    S save(S var1);
//    Iterable<S> saveAll(Iterable<S> var1);
//    Optional<T> findById(ID var1);
//    boolean existsById(ID var1);
//    Iterable<T> findAll();
//    Iterable<T> findAllById(Iterable<ID> var1);
//    long count();
//    void deleteById(ID var1);
//    void delete(T var1);
//    void deleteAll(Iterable<? extends T> var1);
//    void deleteAll();