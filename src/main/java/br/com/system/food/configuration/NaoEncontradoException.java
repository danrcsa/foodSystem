package br.com.system.food.configuration;

public class NaoEncontradoException extends RuntimeException {
	/**
	* 
	*/
	private static final long serialVersionUID = 349967970903701323L;

	// Parameterless Constructor
	public NaoEncontradoException() {
	}

	// Constructor that accepts a message
	public NaoEncontradoException(String message) {
		super(message);
	}
}
