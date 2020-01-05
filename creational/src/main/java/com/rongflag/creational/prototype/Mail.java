package com.rongflag.creational.prototype;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Mail implements Cloneable{

    private String name;

    private String emailAddress;

    private String content;

    public Mail(){}

    public Mail(String name, String emailAddress, String content) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("emailAddress", emailAddress)
                .append("content", content)
                .toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone  测试");
        return super.clone();
    }
}
