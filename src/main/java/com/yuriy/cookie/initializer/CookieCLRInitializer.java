package com.yuriy.cookie.initializer;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yuriy.cookie.model.Cookie;
import com.yuriy.cookie.service.CookieService;

/**
 * Created by yyakymchuk on 5/21/2017.
 */
@Component
public class CookieCLRInitializer implements CommandLineRunner {

	private final CookieService cookieService;

	@Autowired
	public CookieCLRInitializer(final CookieService cookieService) {
		this.cookieService = cookieService;
	}

	@Override
	public void run(final String... strings) throws Exception {
		Stream.of("Sweet", "Sugar", "Sugar")
			.forEach(s -> cookieService.save(new Cookie(s)));

		cookieService.findAll().stream()
			.forEach(System.out::println);
	}
}
