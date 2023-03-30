package com.amaris.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleBeanFactory implements BeanFactory {
    private List<BeanDefinition> beanDefinitions;
    private List<String> beanNames;
    private Map<String, Object> singletons;
    public SimpleBeanFactory() {
        beanDefinitions = new ArrayList<>();
        beanNames = new ArrayList<>();
        singletons = new HashMap<>();
    }

    @Override
    public Object getBean(String beanName) throws BeanException {
        Object singleton = singletons.get(beanName);
        if(singleton == null) {
            int i = beanNames.indexOf(beanName);
            if(i == -1) {
                throw new BeanException();
            } else {
                //获取bean定义
                BeanDefinition beanDefinition = beanDefinitions.get(i);
                try {
                    singleton = Class.forName(beanDefinition.getClassName()).newInstance();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                //注册bean实例
                singletons.put(beanDefinition.getId(), singleton);
            }
        }
        return singleton;
    }

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        this.beanDefinitions.add(beanDefinition);
        this.beanNames.add(beanDefinition.getId());
    }
}
