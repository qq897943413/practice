package com.hanfang.designpattern.abstractfactory;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailSender");
    }
}
