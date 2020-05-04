package com.wanderoliveira.jokenpolizspock.exception;

public class JogadorResourceException extends Exception {
	private static final long serialVersionUID = -7700025490270643973L;
	/**
	 * v.1 Gerado a versao do Serializable 
	 */
	// Construtores do Exception
	public JogadorResourceException() {
		super();
	}

	public JogadorResourceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public JogadorResourceException(String message, Throwable cause) {
		super(message, cause);
	}

	public JogadorResourceException(String message) {
		super(message);
	}

	public JogadorResourceException(Throwable cause) {
		super(cause);
	}
}
