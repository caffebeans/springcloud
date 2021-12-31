package com.fjut.message.service;

import com.fjut.api.PhoneMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 张亮
 * @date: 2021/11/23
 **/

@Service
@Slf4j
public class PhoneMessageServiceImpl implements PhoneMessage {

    @Override
    public String sendMessage(String phoneNum, String code) {
        log.info("有人调用了我这个服务");
        return null;
    }


}
