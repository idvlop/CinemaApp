package org.idvlop.cinemaAppServer.databaseManagement.dbServices;

import org.idvlop.cinemaAppServer.databaseManagement.dbRepositories.MovieRepository;
import org.idvlop.cinemaAppServer.databaseManagement.dataSets.MovieDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public void testMovieRepository() {
        Optional<MovieDataSet> clientOptional = movieRepository.findById(127L);

    }
}
