package com.igorbavand.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorbavand.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{ //parametros: nome da entidade e o tipo da chave primaria
	
	//retorna se existe email
	//findByNOME DA PROPRIEDADE faz uma consulta
	boolean existsByEmail(String email);
}
