package org.com.zjut.ie.ck.controller;

import org.com.zjut.ie.ck.dto.ResponseMessage;
import org.com.zjut.ie.ck.exception.RestException;
import org.com.zjut.ie.ck.util.status.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MyController {

	@RequestMapping("/my")
	@ResponseBody
	public ResponseMessage index() {
		ResponseMessage rm = new ResponseMessage(20,"111","nicaai");	
		throw new RestException(HttpStatus.TEST_EXCEPTION);
//		return rm;
	}
}
