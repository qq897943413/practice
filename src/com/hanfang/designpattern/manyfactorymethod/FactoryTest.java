package com.hanfang.designpattern.manyfactorymethod;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sf = new SendFactory();
        Sender send = sf.produceSms();
        send.send();

    }
}
