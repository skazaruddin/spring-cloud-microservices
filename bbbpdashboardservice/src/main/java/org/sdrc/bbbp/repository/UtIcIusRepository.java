package org.sdrc.bbbp.repository;

import org.sdrc.bbbp.domain.UtData;
import org.sdrc.bbbp.domain.UtIcIus;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * 
 * @author Azaruddin(azaruddin@sdrc.co.in)
 *
 */
@RepositoryDefinition(domainClass=UtIcIus.class,idClass=Integer.class)
public interface UtIcIusRepository {

//	UtIcIus save(UtIcIus UtIcIus);
}
