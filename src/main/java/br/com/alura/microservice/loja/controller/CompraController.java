package br.com.alura.microservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.loja.controller.dto.compraDTO;
import br.com.alura.microservice.loja.service.CompraService;
import ch.qos.logback.core.joran.spi.NoAutoStart;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;

	@RequestMapping(method = RequestMethod.POST)
	public void realizaCompra(@RequestBody compraDTO compra) {
		compraService.realizaCompra(compra);
		
	}

}
