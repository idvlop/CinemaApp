package org.idvlop.cinemaAppServer.databaseManagement.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HallPlaces")
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

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "hall_id", referencedColumnName = "id", nullable = false) //TODO Foreign Key и настройки каскадного* удаления
    private HallDataSet hallId;

    @ManyToMany(mappedBy = "sessions")
    @JoinColumn(name = "session_id", referencedColumnName = "id", nullable = false)
    private SessionDataSet session_id;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false) //TODO Foreign Key
    private ClientDataSet placeOwnerClient;

}
