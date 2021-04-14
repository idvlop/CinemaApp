package org.idvlop.cinemaAppServer.databaseManagement.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Clients")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ClientDataSet implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "login", unique = true, updatable = false, nullable = false)
    private String login;

    @Column(name = "passwd_code", nullable = false)
    private String passwdCode;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birth_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Transient
    private Integer age;
    //TODO разобраться с @SuppressWarnings("UnusedDeclaration")

}
