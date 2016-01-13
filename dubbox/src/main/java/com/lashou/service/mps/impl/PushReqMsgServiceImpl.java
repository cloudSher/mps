package com.lashou.service.mps.impl;

import com.lashou.service.mps.api.PushReqMsgService;
import com.lashou.service.mps.domain.Caller;
import com.lashou.service.mps.domain.Message;
import com.lashou.service.mps.domain.MpsContext;
import com.lashou.service.mps.domain.OpResult;

/**
 * <p> PushReqMsgServiceImpl</p>
 * <p> 说明 </p>
 * <p> Copyright:版权所有 （c）2014-2015 </p>
 * <p> Company:lashou </p>
 *
 * @author cloudsher
 * @version 1.0
 * @date 2016/1/12
 */
public class PushReqMsgServiceImpl implements PushReqMsgService {
    @Override
    public OpResult push_msg(Caller caller, Message msg, MpsContext context) {
        return null;
    }
}
