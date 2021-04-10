package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.idvlop.cinemaAppServer.databaseService.dbServiceUtils.EmployeePositionEnum;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Employee")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class EmployeeDataSet implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login", unique = true, updatable = false, nullable = false)
    private String login;

    @Column(name = "passwd_code", nullable = false)
    private String passwdCode;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "position", nullable = false)
    private EmployeePositionEnum position; //TODO возможно можно заменить на Enum

    @Column(name = "salary")
    private Integer salary;
}
