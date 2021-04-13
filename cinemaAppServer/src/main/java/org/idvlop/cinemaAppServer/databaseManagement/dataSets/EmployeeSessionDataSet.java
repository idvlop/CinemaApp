package org.idvlop.cinemaAppServer.databaseManagement.dataSets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EmployeeSessions")
@SecondaryTables({
        @SecondaryTable(name = "Sessions"),
        @SecondaryTable(name = "Employees")
})
@Getter
@Setter
@ToString
@NoArgsConstructor
public class EmployeeSessionDataSet implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(cascade = {CascadeType.MERGE}, targetEntity = SessionDataSet.class)
    @JoinColumn(name = "session_id", table = "Sessions", referencedColumnName = "id", nullable = false)
    private SessionDataSet session;

    @ManyToOne(cascade = {CascadeType.MERGE}, targetEntity = EmployeeDataSet.class)
    @JoinColumn(name="employee_id", table = "Employees", referencedColumnName = "id", nullable = false)
    private EmployeeDataSet employee;
}
