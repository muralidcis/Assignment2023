package com.altonInterview.examples.customErrorHandling;

public class InvalidAge extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAge(String errorMessage) {
		super(errorMessage);
	}
}
