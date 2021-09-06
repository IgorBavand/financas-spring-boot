package com.igorbavand.minhasfinancas.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igorbavand.minhasfinancas.model.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{ //parametros: nome da entidade e o tipo da chave primaria
	
	//retorna se existe email
	//findByNOME DA PROPRIEDADE faz uma consulta
	boolean existsByEmail(String email);
}
