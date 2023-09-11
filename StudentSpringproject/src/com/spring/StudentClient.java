package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class StudentClient 
{

	public static void main(String a[])
	{
		Resource resourse=new FileSystemResource("StudCfg.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resourse);
		Student stud = (Student)beanFactory.getBean("student");
		System.out.println(stud);
		
		
		
	}
}
