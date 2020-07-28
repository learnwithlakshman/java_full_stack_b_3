package com.lwl.cj;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Properties;

public class ReflectionAPI {

	public static void main(String[] args) {

		Properties props = new Properties();

		try {
			props.load(ReflectionAPI.class.getResourceAsStream("/app.properties"));
			String clsName = props.getProperty("beanname");

			Class<?> cls = Class.forName(clsName);

			Method[] methods = cls.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println("***********************************************");
				System.out.println("Method modifier :" + Modifier.toString(method.getModifiers()));
				System.out.println("Method name : " + method.getName());
				System.out.println("Metho return type: " + method.getReturnType());
				Class params[] = method.getParameterTypes();
				for (int i = 0; i < params.length; i++) {
					System.out.println("Param [i] " + " = " + params[i]);
				}
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
