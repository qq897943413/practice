package com.hanfang.designpattern.staticfactorymethod;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is smsSender");
    }
}
