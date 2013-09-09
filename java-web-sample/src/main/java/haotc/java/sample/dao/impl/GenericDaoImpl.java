package haotc.java.sample.dao.impl;

import haotc.java.sample.dao.GenericDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class GenericDaoImpl<T> implements GenericDao<T> {
    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> type;

    public GenericDaoImpl() {

    }

    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    /**
     * @Transactional annotation below will trigger Spring Hibernate transaction manager to automatically create
     * a hibernate session. See src/main/webapp/servlet-context.xml
     */
    @Transactional
    @SuppressWarnings("unchecked")
    @Override
    public List<T> readAll() {
        Criteria criteria = getSession().createCriteria(this.type);
        return (List<T>) criteria.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public T read(Long id) {
//        T t = (T) getHibernateTemplate().get(type, id);
//        if (t == null) {
//            return null;
//        } else {
//            return t;
//        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
//        T t = this.read(id);
//        if (t != null) {
//            getHibernateTemplate().delete(t);
//        }
    }

    @Override
    public void create(T t) {
//        getHibernateTemplate().save(t);
    }

    @Override
    public void update(T t) {
//        getHibernateTemplate().update(t);
    }

    @Override
    public int getRowCount() {
        Criteria criteria = getSession().createCriteria(this.type);
        return (Integer) criteria.setProjection(Projections.rowCount()).uniqueResult();
    }
}
