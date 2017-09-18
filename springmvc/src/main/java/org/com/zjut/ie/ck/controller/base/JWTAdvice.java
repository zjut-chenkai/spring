package org.com.zjut.ie.ck.controller.base;

import org.com.zjut.ie.ck.dto.ResponseMessage;
import org.com.zjut.ie.ck.exception.RestException;
import org.com.zjut.ie.ck.util.status.ResponseMsgUtil;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;
@Order(1)
@ControllerAdvice(basePackages = {"org.com.zjut.ie.ck.controller"})
public class JWTAdvice {
    /**
     * Ӧ�õ�����@RequestMappingע�ⷽ��������ִ��֮ǰ�ѷ���ֵ����Model
     */
    @ModelAttribute
    public void ini() {
    }

    /**
     * Ӧ�õ�����@RequestMappingע�ⷽ��������ִ��֮ǰ��ʼ�����ݰ���
     * 
     * @param binder
     */
    @InitBinder
    public void inibinder(WebDataBinder binder) {
    }
    
    /**
     * Ӧ�õ�����@RequestMappingע��ķ����������׳�Exception�쳣ʱִ��
     * 
     * @param request
     * @param e
     * @return
     */
    
    @ExceptionHandler(RestException.class)
    public @ResponseBody Object processRestException(RestException ex, NativeWebRequest request) {
    	if(null == ex.getMsg()) {
    		return ResponseMsgUtil.setSpecificMsg(ex.status.value(),ex.status.getReasonPhrase());
    	} else {
    		return ResponseMsgUtil.setSpecificMsg(ex.status.value(), ex.getMsg());
    	}
    }    
    
    
    @ExceptionHandler(Exception.class)
    public @ResponseBody ResponseMessage processUnauthenticatedException1(NativeWebRequest request,
                                                                          Exception e) {
    	System.out.println("===================");
        ResponseMessage rm = new ResponseMessage(102,"","1111111");
        return rm;
    }
}
