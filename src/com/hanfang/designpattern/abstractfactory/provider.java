package com.hanfang.designpattern.abstractfactory;
//工厂方法模式:类的创建依赖工厂类,如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
//所以用抽象工厂模式
public interface provider {
    public Sender produce();
}
