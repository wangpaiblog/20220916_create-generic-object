package org.wangpai.genericcreator.test;

import org.junit.jupiter.api.Test;
import org.wangpai.genericcreator.model.Demo;
import org.wangpai.genericcreator.model.GenericCreator;

public class GenericObjectWithIocTest {
    @Test
    void test1() {
        Demo demo1 = GenericCreator.createGenericObject(Demo::new);
        demo1.show();
    }

    @Test
    void test2() {
        // createGenericObject 方法的后两个实参对应 lambda 表达式的两个形参
        Demo demo2 = GenericCreator.createGenericObject(
                (firstPara, secondPara) -> new Demo(firstPara, secondPara),
                "本对象是使用两个参数的构造器创建的。",
                "编号 002");
        demo2.show();
    }

    @Test
    void test3() {
        Demo demo3 = GenericCreator.createGenericObject(Demo::new,
                "本对象是使用两个参数的构造器创建的。", "编号 003");
        demo3.show();
    }
}
