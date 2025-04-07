package com.Bcript.sesi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Bcript.sesi.dto.UsuarioDTO;
import com.Bcript.sesi.entities.Usuario;
import com.Bcript.sesi.repository.UsuarioRepository;

@Service
public class UsuarioService 
{

    @Autowired
    UsuarioRepository usuarioRepository; // repo

    @Autowired
    PasswordEncoder config; // encoder

    public UsuarioDTO salvarUsuario(UsuarioDTO dto) 
    {
        Usuario usuario = new Usuario(); // novo user
        
        usuario.setEmail(dto.getEmail()); // email
        
        usuario.setSenha(dto.getSenha()); // senha (normal)
        
        usuario.setSenha(config.encode(dto.getSenha())); // senha (criptada)
        
        usuario = usuarioRepository.save(usuario); // salva
        
        return new UsuarioDTO(usuario); // retorna
    }
    
    public boolean login(Usuario dto) 
    {
    	Usuario usuario = usuarioRepository.findByEmail(dto.getEmail()); // busca
        
    	if(usuario == null) 
    	{
    		return false; // não achou
    	}
    	
    	return config.matches(dto.getSenha(), usuario.getSenha()); // compara senha
    }
    
}
