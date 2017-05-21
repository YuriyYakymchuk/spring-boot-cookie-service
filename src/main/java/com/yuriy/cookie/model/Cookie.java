package com.yuriy.cookie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by yyakymchuk on 5/21/2017.
 */
@Entity
public class Cookie {

	@Id
	@GeneratedValue
	private Long id;

	@NotBlank
	private String name;

	public Cookie() {
	}

	public Cookie(final String name) {
		this.name = name;
	}

	public Cookie(final Long id, final String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return new org.apache.commons.lang3.builder.ToStringBuilder(this)
			.append("id", id)
			.append("name", name)
			.toString();
	}
}
