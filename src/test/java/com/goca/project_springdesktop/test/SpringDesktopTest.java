/**
 * 
 */
package com.goca.project_springdesktop.test;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goca.projectspringdesktop.dao.DisqueraDAO;

/**
 * @author angel
 * Clase de Prueba Unitaria que permite realizar pruebas con el framework Spring
 */
public class SpringDesktopTest {

	@Test
	public void testContext() {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO)context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
				
		System.out.println("Contexto cargado exitósamente ANGEL");
		System.out.println(disqueraDAO);

		//:::::: PROPERTIES:::::::::
		Properties properties = (Properties)context.getBean("properties");
		System.out.println(properties.get("spring-username"));
		
		
		
	}

}
