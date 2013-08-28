package haotc.java.sample.dao.impl;

import haotc.java.sample.dao.GenericDao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GenericDaoHibernateImpl<T> extends HibernateDaoSupport implements
		GenericDao<T> {

	private Class<T> type;

	public GenericDaoHibernateImpl() {

	}

	public GenericDaoHibernateImpl(Class<T> type) {
		this.type = type;
	}

	@Autowired
	@Resource(name = "sessionFactory")
	public void setSpringSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> readAll() {
		Criteria criteria = getSession().createCriteria(this.type);
		return (List<T>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T read(Long id) {
		T t = (T) getHibernateTemplate().get(type, id);
		if (t == null) {
			return null;
		} else {
			return t;
		}
	}

	@Override
	public void deleteById(Long id) {
		T t = this.read(id);
		if (t != null) {
			getHibernateTemplate().delete(t);
		}
	}

	@Override
	public void create(T t) {
		getHibernateTemplate().save(t);
	}

	@Override
	public void update(T t) {
		getHibernateTemplate().update(t);
	}
	
	@Override
	public int getRowCount() {
		Criteria criteria = getSession().createCriteria(this.type);
		return (Integer) criteria.setProjection(Projections.rowCount()).uniqueResult();
	}
}
