package com.usuario.service.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.usuario.service.modelos.Carro;

@FeignClient(name="carro-service", url ="http://localhost:8082")
public interface CarroFeignClient {
	@PostMapping("/carro")
	public Carro Save(@RequestBody Carro carro);
	
	@GetMapping("/carro/usuario/{usuarioId}")
	public List <Carro> getCarros(@PathVariable("usuarioId") int usuarioId);
	
	
	
}
