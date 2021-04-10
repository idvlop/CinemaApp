package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "Movie")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MovieDataSet implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "director", nullable = false)
    private String director;

    @Column(name = "year", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date year; //TODO возможно Timestamp + формат

    @Column(name = "duration", nullable = false)
    private Integer duration; //Время в минутах
    //TODO возможно Timestamp

    @Column(name = "age_rating", nullable = false)
    private Integer ageRating;

}
