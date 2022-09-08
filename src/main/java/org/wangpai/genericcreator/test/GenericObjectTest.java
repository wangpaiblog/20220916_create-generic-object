package org.wangpai.genericcreator.test;

import org.wangpai.genericcreator.model.DemoObject;
import org.wangpai.genericcreator.model.GenericCreator;

public class GenericObjectTest {
    public static void main(String[] args) {
        DemoObject demoObject1 = GenericCreator.createGenericObject(DemoObject::new);
        demoObject1.show();

        DemoObject demoObject2 = GenericCreator.createGenericObject(
                (firstPara, secondPara) -> new DemoObject(firstPara, secondPara),
                "本对象是使用两个参数的构造器创建的。",
                "编号 002");
        demoObject2.show();

        DemoObject demoObject3 = GenericCreator.createGenericObject(DemoObject::new,
                "本对象是使用两个参数的构造器创建的。", "编号 003");
        demoObject3.show();
    }
}
