package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.idvlop.cinemaAppServer.databaseService.dataSets.enums.EmployeePositionEnum;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "login", unique = true, updatable = false, nullable = false)
    private String login;

    @Column(name = "passwd_code", nullable = false)
    private String passwdCode;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private EmployeePositionEnum role;
}
