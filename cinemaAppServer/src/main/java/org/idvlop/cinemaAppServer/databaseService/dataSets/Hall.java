package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.idvlop.cinemaAppServer.databaseService.dataSets.enums.SessionFormatEnum;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HALLS")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Hall implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "places_count", nullable = false)
    private Integer placesCount;

    @Column(name = "format", nullable = false)
    @Enumerated(EnumType.STRING)
    private SessionFormatEnum format; // Выбор из [ 3D / 2D / IMAX ]
}
