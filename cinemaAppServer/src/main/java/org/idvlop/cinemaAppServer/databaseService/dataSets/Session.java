package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SESSIONS")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Session implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_time", nullable = false)
    private Date dateTime; //TODO возможно date или что-то еще, разобраться

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id", nullable = false)//TODO Foreign Key и настройки каскадного* удаления
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "hall_id", referencedColumnName = "id", nullable = false)//TODO Foreign Key и настройки каскадного* удаления
    private Hall hall;

}
