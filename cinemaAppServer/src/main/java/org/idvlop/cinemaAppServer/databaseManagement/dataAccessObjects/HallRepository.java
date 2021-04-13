package org.idvlop.cinemaAppServer.databaseManagement.dataAccessObjects;

import org.idvlop.cinemaAppServer.databaseManagement.dataSets.HallDataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends JpaRepository<HallDataSet, Long> {
}
