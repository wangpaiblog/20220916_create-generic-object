package org.wangpai.genericcreator.modeltest;

import org.junit.jupiter.api.Test;
import org.wangpai.genericcreator.model.Demo;
import org.wangpai.genericcreator.model.GenericCreator;

public class GenericArrayWithReflectionTest {
    @Test
    void test() {
        int length = 100;
        // demoArray 为空数组，不能直接使用，还需初始化其内各元素
        Demo[] demoArray = GenericCreator.createGenericArray(Demo[].class, length);
    }
}
