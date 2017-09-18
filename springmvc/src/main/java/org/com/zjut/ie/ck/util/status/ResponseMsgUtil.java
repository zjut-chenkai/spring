package org.com.zjut.ie.ck.util.status;

import org.com.zjut.ie.ck.dto.ResponseMessage;

public class ResponseMsgUtil {
    public static ResponseMessage setSpecificCodeMsg(int code) {
        ResponseMessage responseMsg = new ResponseMessage();
        responseMsg.setCode(code);
        return responseMsg;
    }

    public static ResponseMessage setSpecificMsg(int code, String msg) {
        ResponseMessage responseMsg = new ResponseMessage();
        responseMsg.setCode(code);
        responseMsg.setMessage(msg);
        return responseMsg;
    }
}
