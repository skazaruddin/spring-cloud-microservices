package org.sdrc.bbbp.repository;

import java.util.List;

import org.sdrc.bbbp.domain.Area;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

/**
 * This repository interface contains methods that help us fetch data from database
 * 
 * @author Ratikanta Pradhan (ratikanta@sdrc.co.in) on 16-May-2017 11:39:03 am
 * @author Naseem Akhtar (naseem@sdrc.co.in) on 6th June 2017 16.50
 */
@RepositoryDefinition(domainClass=Area.class,idClass=Integer.class)
public interface AreaRepository {

	List<Area> findAll();

//	Area findByAreaNId(Integer integer);
//
//	List<Area> findAllByOrderByNameAsc();
//
//	List<Area> findByAreaNIdIn(List<Integer> areaIdList);
//
//
//	List<Area> findByLevel(Integer areaId);
//
//	Area findByAreaId(String parentAreaCode);
//
//
//	@Query("SELECT ar from Area ar WHERE ar.parentAreaId =:areaId")
//	List<Area> findByAreaParentId(@Param("areaId") Integer areaId);
//	
//
//	@Query(value = "select ar.area_nid_pk,ar.name,ar.level from area ar "
//			+ "where ar.area_nid_pk =:areaId OR ar.area_nid_pk =:parentId", nativeQuery = true)
//	List<Object[]> findAreaAndParentByAreaId(@Param("areaId") Integer areaNId, @Param("parentId") Integer parentId);
//
//	
//	@Query("SELECT ar FROM Area ar WHERE ar.level <= :childLevel AND ar.level >=   (SELECT parArea.level FROM Area parArea WHERE parArea.areaId = :areaId)")
//	public Area[] getAreaNid(@Param("areaId") String areaCode, @Param("childLevel") Integer childLevel);
//


}
