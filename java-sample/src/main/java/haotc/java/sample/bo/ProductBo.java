package haotc.java.sample.bo;

import java.util.List;

import haotc.java.sample.entity.ProductEntity;

public interface ProductBo extends GenericBo {
	void update(ProductEntity product);

	List<ProductEntity> getProductList();

	ProductEntity getProductById(Long id);

	void deleteById(Long id);

	void create(ProductEntity product);

	int getRowCount();
}
