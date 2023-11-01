package br.com.system.food.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.system.food.domain.enumerator.CategoriaEnum;
import br.com.system.food.domain.enumerator.SetorEnum;
import br.com.system.food.domain.enumerator.StatusPedidoEnum;
import br.com.system.food.dto.EnumDto;

@RestController
@RequestMapping("/food/system/domain")
public class DomainController {

	
	@GetMapping("categoria")
	public ResponseEntity<List<EnumDto>> recuperarCategoriaEnum() {
		return new ResponseEntity<>(CategoriaEnum.returnEnumValues(), HttpStatus.OK);

	}
	@GetMapping("setor")
	public ResponseEntity<List<EnumDto>> recuperarSetorEnum() {
		return new ResponseEntity<>(SetorEnum.returnEnumValues(), HttpStatus.OK);

	}
	@GetMapping("status")
	public ResponseEntity<List<EnumDto>> recuperarStatusPedidoEnum() {
		return new ResponseEntity<>(StatusPedidoEnum.returnEnumValues(), HttpStatus.OK);

	}
}
