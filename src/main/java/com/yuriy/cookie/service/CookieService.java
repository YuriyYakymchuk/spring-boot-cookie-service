package com.yuriy.cookie.service;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.yuriy.cookie.model.Cookie;

/**
 * Created by yyakymchuk on 5/21/2017.
 */
@RepositoryRestResource
public interface CookieService extends JpaRepository<Cookie, Long>{

	@RestResource(path = "filter")
	Collection<Cookie> findByName(@Param("byName") final String cookieName);
}
