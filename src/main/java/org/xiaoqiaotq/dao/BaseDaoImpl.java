package org.xiaoqiaotq.dao;

import com.googlecode.genericdao.dao.jpa.GenericDAOImpl;
import com.googlecode.genericdao.search.jpa.JPASearchProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * @author colin
 * @date: 27/03/2014
 * @time: 20:52
 */
public class BaseDaoImpl<T, ID extends Serializable> extends GenericDAOImpl<T, ID> {

    @PersistenceContext
    @Override
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }
    @Autowired
    @Override
    public void setSearchProcessor(JPASearchProcessor searchProcessor) {
        super.setSearchProcessor(searchProcessor);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
