package org.wangpai.genericcreator.model;

@FunctionalInterface
public interface DemoObjectConstructor<T> {
    T constructor(String firstPara, String secondPara);
}
