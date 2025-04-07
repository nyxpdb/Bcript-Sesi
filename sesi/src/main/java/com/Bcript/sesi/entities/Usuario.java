package com.Bcript.sesi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // define entidade
@Table(name="tb_usuario") // tabela banco
public class Usuario
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // id
	
	@Column(unique = true)
	private String email; // email
	
	private String senha; // senha

	public Usuario() 
	{
		// construtor vazio
	}

	public Usuario(Long id, String email, String senha)
	{
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
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
