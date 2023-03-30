package com.amaris.beans;

public interface SingletonBeanRegistry{
    //单例的注册
    void registrySingleton(String beanName, Object singletonObject);
    //单例的获取
    Object getSingleton(String beanName);
    //判断是否存在单例
    boolean containsSingleton(String beanName);
    //获取所有单例bean
    String[] getSingletonNames();
}
