package haotc.java.sample.bo.impl;

import java.util.List;

import haotc.java.sample.bo.ProductBo;
import haotc.java.sample.dao.ProductDao;
import haotc.java.sample.entity.ProductEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productBo")
public class ProductBoImpl extends GenericBoImpl implements ProductBo {
	
	private ProductDao productDao;

	public void update(ProductEntity product) {
		productDao.update(product);
	}

	public ProductDao getProductDao() {
		return productDao;
	}
	
	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<ProductEntity> getProductList() {
		return productDao.readAll();
	}
	
	@Override
	public ProductEntity getProductById(Long id) {
		return productDao.read(id);
	}

	@Override
	public void deleteById(Long id) {
		productDao.deleteById(id);
	}

	@Override
	public void create(ProductEntity product) {
		productDao.create(product);
	}
	
	@Override
	public int getRowCount() {
		return productDao.getRowCount();
	}
}
