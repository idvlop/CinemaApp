package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.ClientRepository;
import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.RoleRepository;
import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.UserRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Client;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Role;
import org.idvlop.cinemaAppServer.databaseService.dataSets.User;
import org.idvlop.cinemaAppServer.databaseService.dataSets.enums.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return user;
    }

    public User findUserById(Long userId) {
        Optional<User> userFromDb = userRepository.findById(userId);
        return userFromDb.orElse(new User());
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public boolean saveUser(User user) {
        User userFromDB = userRepository.findByLogin(user.getUsername());

        if (userFromDB != null) {
            return false;
        }

        user.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
        user.setPasswdCode(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return true;
    }

    @Deprecated
    public boolean deleteUser(Long userId) {
        if (userRepository.findById(userId).isPresent()) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
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