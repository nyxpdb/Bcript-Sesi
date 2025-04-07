package com.Bcript.sesi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bcript.sesi.dto.UsuarioDTO;
import com.Bcript.sesi.entities.Usuario;
import com.Bcript.sesi.services.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController 
{
	@Autowired
	UsuarioService usuarioservice; // service
	
	@PostMapping(value = "cadastrar")
	public ResponseEntity<UsuarioDTO> cadastrar(@RequestBody UsuarioDTO dto)
	{
		dto = usuarioservice.salvarUsuario(dto); // salva
		return ResponseEntity.ok(dto); // retorna
	}
	
	@PostMapping(value = "login")
	public ResponseEntity<?> login(@RequestBody Usuario dto) {
	    boolean teste = usuarioservice.login(dto); // login
		
	    if (teste) {
	        return ResponseEntity.ok("Sucesso"); // ok
	    }
	    
	    return ResponseEntity.status(400).body("Senha ou login incorretos!!"); // erro
	}
}
