package org.idvlop.cinemaAppServer.databaseService.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE_SESSIONS")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class EmployeeSession implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(cascade = {CascadeType.MERGE}, targetEntity = Session.class)
    @JoinColumn(name = "session_id", referencedColumnName = "id", nullable = false)
    private Session session;

    @ManyToOne(cascade = {CascadeType.MERGE}, targetEntity = Employee.class)
    @JoinColumn(name="employee_id", referencedColumnName = "id", nullable = false)
    private Employee employee;
}
