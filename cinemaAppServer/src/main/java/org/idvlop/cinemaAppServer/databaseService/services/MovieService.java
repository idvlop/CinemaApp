package org.idvlop.cinemaAppServer.databaseService.services;

import org.idvlop.cinemaAppServer.databaseService.dataAccessObjects.MovieRepository;
import org.idvlop.cinemaAppServer.databaseService.dataSets.Movie;
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
        Optional<Movie> clientOptional = movieRepository.findById(127L);

    }
}
