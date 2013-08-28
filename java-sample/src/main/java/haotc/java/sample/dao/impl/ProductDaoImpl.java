package haotc.java.sample.dao.impl;

import haotc.java.sample.dao.ProductDao;
import haotc.java.sample.entity.ProductEntity;

import org.springframework.stereotype.Component;

@Component(value = "productDao")
public class ProductDaoImpl extends GenericDaoHibernateImpl<ProductEntity>
		implements ProductDao {

	public ProductDaoImpl() {
		super(ProductEntity.class);
	}

}
