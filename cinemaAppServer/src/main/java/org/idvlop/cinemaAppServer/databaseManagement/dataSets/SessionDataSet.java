package org.idvlop.cinemaAppServer.databaseManagement.dataSets;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Sessions")
@SecondaryTables({
        @SecondaryTable(name = "Movies"),
        @SecondaryTable(name = "Halls")
})
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

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id", nullable = false, table = "movies")//TODO Foreign Key и настройки каскадного* удаления
    private MovieDataSet movie;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "hall_id", referencedColumnName = "id", nullable = false, table = "halls")//TODO Foreign Key и настройки каскадного* удаления
    private HallDataSet hall;

}
