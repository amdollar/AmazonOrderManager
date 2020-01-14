package com.aom.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aom.beans.Address;
import com.aom.beans.OrderManager;
import com.aom.beans.Product;

public class Test {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/aom/common/Application-context.xml"));
		OrderManager manager = factory.getBean("orderManager", OrderManager.class);
		Product product = factory.getBean("product", Product.class);
		Address address = factory.getBean("address", Address.class);
		manager.scheduleDelivery(product, address);
	}
}
