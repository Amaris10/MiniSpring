package com.amaris.beans;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{
    protected List<String >
    @Override
    public void registrySingleton(String beanName, Object singletonObject) {

    }

    @Override
    public Object getSingleton(String beanName) {
        return null;
    }

    @Override
    public boolean containsSingleton(String beanName) {
        return false;
    }

    @Override
    public String[] getSingletonNames() {
        return new String[0];
    }
}
