package com.tenco.bank.handler.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class UnAuthorizedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpStatus status;

	// throw Exception
	public UnAuthorizedException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}

}
