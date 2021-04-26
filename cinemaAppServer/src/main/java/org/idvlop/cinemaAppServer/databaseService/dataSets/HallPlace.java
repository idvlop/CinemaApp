package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HALL_PLACES")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class HallPlace implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "hall_id", referencedColumnName = "id", nullable = false) //TODO Foreign Key и настройки каскадного* удаления
    private Hall hallId;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "row", nullable = false)
    private Integer row;

    @Column(name = "column", nullable = false)
    private Integer column;
}
