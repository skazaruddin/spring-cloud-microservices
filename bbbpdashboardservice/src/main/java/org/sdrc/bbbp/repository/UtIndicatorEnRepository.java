package org.sdrc.bbbp.repository;

import java.util.List;

import org.sdrc.bbbp.UtUnitType;
import org.sdrc.bbbp.domain.UtIndicatorEn;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

/**
 * 
 * @author Azaruddin(azaruddin@sdrc.co.in)
 *
 */
@RepositoryDefinition(domainClass=UtIndicatorEn.class,idClass=Integer.class)
public interface UtIndicatorEnRepository {

	UtIndicatorEn save(UtIndicatorEn utIndicatorEn);

//	@Query("SELECT utius, utUnit, " + "  utIn, " + "  subEn   "
//			+ " FROM UtIcIus uticius JOIN uticius.IUSNId utius "
//			+ " JOIN utius.indicator_NId utIn JOIN  utius.unit_NId utUnit JOIN utius.subgroup_Val_NId subEn "
//			+ " WHERE uticius.IC_NId.IC_NId = :sectorNid and utUnit.utUnitType = :utunittype Order by uticius.IUSNId   ")
//	public List<Object[]> fetchIndicatorFromSector(@Param("sectorNid") Integer sectorNid,@Param("utunittype") UtUnitType utunittype) throws DataAccessException;


	List<UtIndicatorEn> findAll();

}
