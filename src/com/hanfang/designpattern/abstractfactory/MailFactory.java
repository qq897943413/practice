package com.hanfang.designpattern.abstractfactory;

public class MailFactory implements provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
