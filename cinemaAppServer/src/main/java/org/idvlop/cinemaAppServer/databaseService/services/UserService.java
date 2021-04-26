package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.ClientRepository;
import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.UserRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Client;
import org.idvlop.cinemaAppServer.databaseService.dataSets.User;
import org.idvlop.cinemaAppServer.databaseService.dataSets.enums.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User registerNewUserAccount(User accountDto) {
        if (userRepository.findByLogin(accountDto.getLogin()) != null) {
            System.out.println("There is an account with that login:" + accountDto.getLogin());
        }
        User user = new User();

        user.setPasswdCode(passwordEncoder.encode(accountDto.getPasswdCode()));

        user.setLogin(accountDto.getLogin());
        user.setRole(RoleEnum.CLIENT);
        return userRepository.save(user);
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