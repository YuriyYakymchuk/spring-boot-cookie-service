package com.yuriy.cookie.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yyakymchuk on 5/21/2017.
 */
@RefreshScope
@RestController
public class MessageController {

	private final String message;

	public MessageController(@Value("#{'${message:Default message}'}") final String message) {
		this.message = message;
	}

	@RequestMapping(path = "/message", method = RequestMethod.GET)
	public String getMessage() {
		return this.message;
	}
}
