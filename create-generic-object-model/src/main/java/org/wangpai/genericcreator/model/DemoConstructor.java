package org.wangpai.genericcreator.model;

@FunctionalInterface
public interface DemoConstructor<T> {
    T constructor(String firstPara, String secondPara);
}
