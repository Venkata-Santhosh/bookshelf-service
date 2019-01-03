package com.cox.exceptions;

public class BookShelfNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BookShelfNotFoundException() {
		super();
	}

	public BookShelfNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BookShelfNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookShelfNotFoundException(String message) {
		super(message);
	}

	public BookShelfNotFoundException(Throwable cause) {
		super(cause);
	}

}
