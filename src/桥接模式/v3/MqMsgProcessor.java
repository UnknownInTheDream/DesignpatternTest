package 桥接模式.v3;

import 桥接模式.v3.handler.MsgHandler;

/**
 * @author: tangliang
 * @date: 2020/3/29 22:42.
 * @description: XXX
 */
public abstract class MqMsgProcessor {

    protected MsgHandler msgHandler;

    public MqMsgProcessor(MsgHandler msgHandler) {
        this.msgHandler = msgHandler;
    }

    public abstract void processMqMsg(String topic, String message);
}
