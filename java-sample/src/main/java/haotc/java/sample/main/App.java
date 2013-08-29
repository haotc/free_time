//package haotc.java.sample.main;
//
//import haotc.java.sample.bo.ProductBo;
//import haotc.java.sample.entity.ProductEntity;
//import haotc.java.sample.util.ContextUtils;
//
///* Testing class */
//public class App {
//	public static void main(String[] args) {
////		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource/spring/config/BeanLocations.xml");
//		ProductBo productBo = (ProductBo) ContextUtils.getBean("productBo");
//		
//		ProductEntity product = new ProductEntity();
//		product.setId((long) 1);
//		product.setName("Ban long");
//		product.setShortDesc("Tien hiep");
//		product.setDetailDesc("2k chap v.v..");
//		product.setCategoryId((long) 1);
//		product.setProducerId((long) 1);
////		productBo.save(product);
//		
////		List<ProductEntity> list = productBo.getProductList();
////		System.out.println(list.size());
//		
//		
////		ProductEntity rs = productBo.getProductById((long) 7);
////		System.out.println(rs.getName());
//		
////		productBo.deleteById((long) 7);
//		
////		productBo.create(product);
//		
//		System.out.println(productBo.getRowCount());
//	}
//}
