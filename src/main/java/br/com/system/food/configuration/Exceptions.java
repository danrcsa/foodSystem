package br.com.system.food.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public abstract class Exceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5949580789641060002L;

	protected <T> ResponseEntity<T> errorResponse(final HttpStatus status, final T response) {
		return ResponseEntity.status(status).body(response);
	}

	public ResponseEntity<Object> handleException(final Exceptions e,
			final WebRequest request) {
		return errorResponse(HttpStatus.BAD_REQUEST, errorResponse(HttpStatus.BAD_REQUEST, e ));
	}
}
