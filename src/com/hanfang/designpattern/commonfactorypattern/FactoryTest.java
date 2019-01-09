package com.hanfang.designpattern.commonfactorypattern;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sf = new SendFactory();
        Sender send = sf.send("mail");
        send.send();

    }
}
