package org.wangpai.genericcreator.model;

public class Demo {
    public Demo() {
        this.msg = "本对象是使用无参构造器创建的";
    }

    public Demo(String para1, String para2) {
        this.msg = para1 + para2;
    }

    private String msg = "这是 Demo";

    public void show() {
        System.out.println(this.msg);
    }
}
