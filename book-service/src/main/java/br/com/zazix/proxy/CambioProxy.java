package br.com.zazix.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.zazix.response.Cambio;



@FeignClient(name = "cambio-service") //Faz o load balancing -- o balancer fica dentro do microsserviço
public interface CambioProxy {

	
	@GetMapping(value = "/cambio-service/{amount}/{from}/{to}")
	public Cambio getCambio(@PathVariable("amount") Double amount, @PathVariable("from") String from,
			@PathVariable("to") String to);
}
