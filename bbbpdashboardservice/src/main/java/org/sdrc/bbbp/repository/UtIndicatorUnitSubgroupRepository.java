package org.sdrc.bbbp.repository;

import org.sdrc.bbbp.domain.UtIndicatorEn;
import org.sdrc.bbbp.domain.UtIndicatorUnitSubgroup;
import org.sdrc.bbbp.domain.UtSubgroupValsEn;
import org.sdrc.bbbp.domain.UtUnitEn;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

/**
 * 
 * @author Azaruddin(azaruddin@sdrc.co.in)
 *
 */
@RepositoryDefinition(domainClass=UtIndicatorUnitSubgroup.class,idClass=Integer.class)

public interface UtIndicatorUnitSubgroupRepository {

//	UtIndicatorUnitSubgroup save(UtIndicatorUnitSubgroup utIndicatorUnitSubgroup);
//
//	
//	@Query("select ius from UtIndicatorUnitSubgroup ius where ius.indicator_NId = :in and ius.unit_NId = :un and ius.subgroup_Val_NId = :sub")
//	UtIndicatorUnitSubgroup findByIndicator_NIdUnit_NIdSubgroup_Val_NId(@Param("in")UtIndicatorEn in,@Param("un")UtUnitEn un,@Param("sub")UtSubgroupValsEn sub);
//
//
//	@Query("select ius from UtIndicatorUnitSubgroup ius where ius.IUSNId = :iusId")
//	UtIndicatorUnitSubgroup findByIndicator_NId(@Param("iusId")Integer iusId); 
//	
}
