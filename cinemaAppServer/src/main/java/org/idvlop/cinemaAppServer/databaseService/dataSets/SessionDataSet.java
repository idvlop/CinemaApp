package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "Session")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SessionDataSet implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_time", nullable = false)
    private Date dateTime; //TODO возможно date или что-то еще, разобраться

    @Column(name = "movie_id", nullable = false)//TODO Foreign Key и настройки каскадного* удаления
    private MovieDataSet movie;

    @ManyToOne(cascade = CascadeType.ALL) //TODO разобраться с cascadeType
    @JoinColumn(name = "hall_id", referencedColumnName = "id", nullable = false)//TODO Foreign Key и настройки каскадного* удаления
    private HallDataSet hall;

}
