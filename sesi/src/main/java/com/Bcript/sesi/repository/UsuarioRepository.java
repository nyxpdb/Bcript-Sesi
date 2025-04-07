package com.Bcript.sesi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bcript.sesi.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{
	Usuario findByEmail(String email); // busca por email
}
