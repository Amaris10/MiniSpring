package com.amaris.beans;

public interface BeanFactory {
    Object getBean(String beanName) throws BeanException;
    Boolean containsBean(String name);
    void registerBean(String beanName, Object obj);
}
