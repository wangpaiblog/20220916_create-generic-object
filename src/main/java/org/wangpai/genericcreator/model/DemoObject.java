package org.wangpai.genericcreator.model;

public class DemoObject {
    public DemoObject() {
        this.msg = "本对象是使用无参构造器创建的";
    }

    public DemoObject(String para1, String para2) {
        this.msg = para1 + para2;
    }

    private String msg = "这是 DemoObject";

    public void show() {
        System.out.println(this.msg);
    }
}
