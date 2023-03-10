package com.QQ.common;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.Serializable;

/**
 * //表示客户端和服务端通信时的消息对象
 */
public class Message implements Serializable, MessageType {
    private static final long serialVersionUID = 1L;  //保证兼容性


    private String sender;  //发送者
    private String getter; // 接收者

    private String content; //消息内容
    private String sendTime; // 发送时间
    private String mesType; //消息类型【可以在接口定义消息类型】

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }

    public String getMesType() {
        return mesType;
    }
}
