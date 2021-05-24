package org.idvlop.cinemaAppServer.databaseService.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseService.dataSets.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    //@Query("select Session from EmployeeSession where employee.id=:employeeId")
    //List<Session> findSessionsByEmployee_Id(Long employeeId);

    List<Session> findSessionsByMovie_Id(Long movieId);

    List<Session> findSessionsByHall_Id(Long hallId);


}
