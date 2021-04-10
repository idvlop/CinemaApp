package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "Client")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ClientDataSet implements Serializable{
    private static final long serialVersionUID = -8706689714326132798L; //TODO разобраться с этой строчкой
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "login", unique = true, updatable = false, nullable = false)
    private String login;

    @Column(name = "passwd_code", nullable = false)
    private String passwdCode; //TODO Возможно нужно переделать в Long

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birth_date", nullable = false)
    private Timestamp birthDate; //TODO разобраться с sql.Date и util.Date, и форматами

    //TODO разобраться, почему пустой конструктор нужен для Hibernate, и не нарушает ли он работу

    //TODO доп. конструкторы и геттеры для каждого поля + желательно переопределение toString()
    //TODO разобраться с @SuppressWarnings("UnusedDeclaration")

}
