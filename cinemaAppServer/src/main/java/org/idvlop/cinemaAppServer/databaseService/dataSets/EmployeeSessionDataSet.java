package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EmployeeSession")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class EmployeeSessionDataSet implements Serializable {

    @Id
    @Column(name = "session_id", nullable = false)
    @OneToOne() //TODO разобраться как внедрить связь таблиц (Foreign Key)
    private SessionDataSet session; //TODO Foreign Key и настройки каскадного* удаления
    //TODO Расставить связи
    @Id
    @Column(name = "employee_id", nullable = false) //TODO Foreign Key и настройки каскадного* удаления
    private EmployeeDataSet employee;
}
