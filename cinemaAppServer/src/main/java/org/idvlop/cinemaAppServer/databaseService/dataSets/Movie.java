package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MOVIES")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Movie implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "director", nullable = false)
    private String director;

    @Column(name = "duration", nullable = false)
    private Integer duration; //Время в минутах

    @Column(name = "age_rating", nullable = false, precision = 2)
    private Integer ageRating;

}
