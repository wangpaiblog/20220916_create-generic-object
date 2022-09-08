package org.wangpai.genericcreator.test;

import org.wangpai.genericcreator.model.DemoObject;
import org.wangpai.genericcreator.model.GenericCreator;

public class GenericArrayTest {
    public static void main(String[] args) {
        int length = 10;
        // demoArray1 为空数组，不能直接使用，还需初始化其内各元素
        DemoObject[] demoArray1 = GenericCreator.createGenericArray(DemoObject[]::new, length);

        DemoObject[] demoArray2 = GenericCreator.createGenericArray(
                arrayLength -> {
                    DemoObject[] demoArray = new DemoObject[arrayLength];
                    for (int order = 0; order < demoArray.length; ++order) {
                        demoArray[order] = new DemoObject("本对象是使用两个参数的构造器创建的。", "编号 " + order);
                    }
                    return demoArray;
                }, length);
        for (var demoObject : demoArray2) {
            demoObject.show();
        }
    }
}
