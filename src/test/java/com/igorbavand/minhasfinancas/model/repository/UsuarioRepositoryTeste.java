package com.igorbavand.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.igorbavand.minhasfinancas.model.entity.Usuario;



@SpringBootTest
@RunWith(SpringRunner.class)

public class UsuarioRepositoryTeste {

	
	
	
	
	@Autowired
	UsuarioRepository repository;
	
	
	@Test
	public void deveVerificarEmail() {
		//cenario
		Usuario usuario = Usuario.builder().nome("igor").email("igor@gmail.com").build();
		repository.save(usuario);
		
		//acao - execução
		boolean result = repository.existsByEmail("igor@gmail.com");
		
		//verificação
		Assertions.assertThat(result).isTrue();
		
		
	
	}
}
