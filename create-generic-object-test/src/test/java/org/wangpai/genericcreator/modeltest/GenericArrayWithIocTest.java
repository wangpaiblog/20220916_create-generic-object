package org.wangpai.genericcreator.modeltest;

import org.junit.jupiter.api.Test;
import org.wangpai.genericcreator.model.Demo;
import org.wangpai.genericcreator.model.GenericCreator;

public class GenericArrayWithIocTest {
    @Test
    void test1() {
        int length = 100;
        // demoArray1 为空数组，不能直接使用，还需初始化其内各元素
        Demo[] demoArray1 = GenericCreator.createGenericArray(Demo[]::new, length);
    }

    @Test
    void test2() {
        int length = 100;
        Demo[] demoArray2 = GenericCreator.createGenericArray(
                arrayLength -> {
                    Demo[] demoArray = new Demo[arrayLength];
                    for (int order = 0; order < demoArray.length; ++order) {
                        demoArray[order] = new Demo("本对象是使用两个参数的构造器创建的。", "编号 " + order);
                    }
                    return demoArray;
                }, length);
        for (var demoObject : demoArray2) {
            demoObject.show();
        }
    }
}
