package com.wanderoliveira.jokenpolizspock.exception;

public class JogadorNotFoundException extends Exception {
	private static final long serialVersionUID = -6703759387665754751L;
	// A serializacao eh para ele ser unico

	public JogadorNotFoundException() {
	}

	// Construtores Exception
	public JogadorNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public JogadorNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public JogadorNotFoundException(String message) {
		super(message);
	}

	public JogadorNotFoundException(Throwable cause) {
		super(cause);
	}

}
