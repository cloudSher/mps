package com.lashou.service.mps.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author Administrator
 * @date 2016-01-12
 *
 */
public class MpsContext implements Serializable {
    /**  */
    private Integer id;

    /** 数据范围field描述 */
    private String scope;

    /** scope的中的值 */
    private String value;

    /**  调用者id*/
    private Integer callerId;

    /** 消息id */
    private Integer messageId;

    /** 创建时间 */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCallerId() {
        return callerId;
    }

    public void setCallerId(Integer callerId) {
        this.callerId = callerId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}