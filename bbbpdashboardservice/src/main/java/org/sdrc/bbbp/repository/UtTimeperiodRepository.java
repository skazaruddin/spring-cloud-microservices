package org.sdrc.bbbp.repository;

import org.sdrc.bbbp.domain.UtTimeperiod;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

/**
 * 
 * @author Azaruddin(azaruddin@sdrc.co.in)
 * @author Harsh Pratyush(harsh@sdrc.co.in)
 */
@RepositoryDefinition(domainClass=UtTimeperiod.class,idClass=Integer.class)
public interface UtTimeperiodRepository {

//	UtTimeperiod save(UtTimeperiod utTimeperiod);
//
//	@Query(value = "SELECT t FROM UtTimeperiod t WHERE  timePeriod_NId = :timePeriod_NId")
//	UtTimeperiod findByTimeperiodNid(@Param("timePeriod_NId") Integer timePeriod_NId);
//	
//	
}
