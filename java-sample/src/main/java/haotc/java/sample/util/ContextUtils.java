package haotc.java.sample.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtils {
	public static final String CONTEXT_FILE_URL = "resource/spring/config/BeanLocations.xml";

	private static final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
			CONTEXT_FILE_URL);

	public static Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}
}
