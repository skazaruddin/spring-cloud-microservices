package org.sdrc.bbbp.repository;

import java.util.List;

import org.sdrc.bbbp.domain.Area;
import org.sdrc.bbbp.domain.Preodicity;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass=Preodicity.class,idClass=Integer.class)
public interface PrediocityRepository {

	
//	public List<Preodicity> findAll();
	
}
