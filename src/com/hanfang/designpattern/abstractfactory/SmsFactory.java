package com.hanfang.designpattern.abstractfactory;

public class SmsFactory implements provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
