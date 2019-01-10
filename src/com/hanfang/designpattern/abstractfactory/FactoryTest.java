package com.hanfang.designpattern.abstractfactory;

public class FactoryTest {
    public static void main(String[] args) {
        MailFactory mailFactory = new MailFactory();
        Sender sender = mailFactory.produce();
        sender.send();

    }
}
