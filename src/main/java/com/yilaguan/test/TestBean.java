package com.yilaguan.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class TestBean {

    @Test
    public void testSpring(){
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring/beanFactoryTest.xml"));
        MyTestBean myTestBean=(MyTestBean)beanFactory.getBean("myTestBean");
        Assert.assertEquals("testStr",myTestBean.getTestStr());
    }
}
