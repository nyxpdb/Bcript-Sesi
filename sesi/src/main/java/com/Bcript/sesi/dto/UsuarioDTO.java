package com.Bcript.sesi.dto;

import com.Bcript.sesi.entities.Usuario;

public class UsuarioDTO 
{

	private Long id; // id
	private String email; // email
	private String senha; // senha

	public UsuarioDTO()
	{
		// vazio
	}
	
	public UsuarioDTO(Long id, String email, String senha) 
	{
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	
	public UsuarioDTO(Usuario entity) 
	{
		id = entity.getId(); // pega id
		senha = entity.getSenha(); // pega senha
		email = entity.getEmail(); // pega email
	}

	public Long getId()
	{
		return id; // get id
	}

	public void setId(Long id) 
	{
		this.id = id; // set id
	}

	public String getEmail() 
	{
		return email; // get email
	}

	public void setEmail(String email)
	{
		this.email = email; // set email
	}

	public String getSenha()
	{
		return senha; // get senha
	}

	public void setSenha(String senha) 
	{
		this.senha = senha; // set senha
	}
}
