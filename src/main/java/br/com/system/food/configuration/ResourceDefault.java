package br.com.system.food.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResourceDefault extends Exceptions {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6875617430379318326L;

	public ResponseEntity<Object> sucesso(Object classe){
		return new ResponseEntity<Object>(classe, HttpStatus.OK);
	}
}
