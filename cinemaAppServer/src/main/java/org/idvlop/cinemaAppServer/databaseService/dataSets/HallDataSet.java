package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.idvlop.cinemaAppServer.databaseService.dbServiceUtils.SessionFormatEnum;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Hall")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class HallDataSet implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@OneToMany
    //@JoinColumns(value = )
    private Long id;

    @Column(name = "places_count", nullable = false)
    private Integer placesCount;

    @Column(name = "format", nullable = false)
    private SessionFormatEnum format; // Выбор из [ 3D / 2D / IMAX ]
    //TODO Возможно можно заменить на Enum
}
