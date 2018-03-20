package org.sdrc.bbbp.repository;

import java.sql.Timestamp;
import java.util.List;

import org.sdrc.bbbp.domain.Preodicity;
import org.sdrc.bbbp.domain.Type;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

@RepositoryDefinition(domainClass=Type.class,idClass=Integer.class)
public interface TypeRepository {

//	@Transactional
//	List<Type> findAll();
//
//	List<Type> findByCreatedDateGreaterThanOrUpdatedDateGreaterThan(
//			Timestamp lastSyncDate, Timestamp lastSyncDate2);

}
