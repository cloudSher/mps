package com.lashou.service.mps.api;

import com.lashou.service.mps.domain.Caller;
import com.lashou.service.mps.domain.Message;
import com.lashou.service.mps.domain.MpsContext;
import com.lashou.service.mps.domain.OpResult;

/**
 *
 * 发送消息 api
 * Created by cloudsher.zw on 2016/1/11.
 */
public interface PushReqMsgService {

    /***
     *  发送短消息接口
     * @return
     */
    OpResult push_msg(Caller caller,Message msg,MpsContext context);


}
