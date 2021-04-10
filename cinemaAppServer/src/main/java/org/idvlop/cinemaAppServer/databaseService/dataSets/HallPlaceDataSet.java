package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HallPlace")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class HallPlaceDataSet implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "hall_id", nullable = false) //TODO Foreign Key и настройки каскадного* удаления
    private Long hallId;

    @Column(name = "client_id") //TODO Foreign Key
    private ClientDataSet placeOwnerClient;

}
