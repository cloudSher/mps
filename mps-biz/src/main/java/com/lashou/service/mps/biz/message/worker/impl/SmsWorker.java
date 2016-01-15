package com.lashou.service.mps.biz.message.worker.impl;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.lashou.service.mps.biz.message.queue.BasicQueue;
import com.lashou.service.mps.biz.message.worker.Worker;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author cloudsher
 * @version 1.0
 * @date 2016/1/15
 */
public class SmsWorker implements Worker {

    private Logger logger = LoggerFactory.getLogger(SmsWorker.class);

    @Resource
    private BasicQueue<Integer,Objects> smsMessageQueue;

    @Override
    public void run() {

    }

}
