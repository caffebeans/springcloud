package com.fjut.api;

/**
 * @description: 阿里云手机服务
 * @author: 张亮
 * @date: 2021/11/23
 **/
public interface PhoneMessage {

          String sendMessage(String phoneNum,String code);

}
