package com.igorbavand.minhasfinancas.model.repository;

import org.springframework.stereotype.Repository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.igorbavand.minhasfinancas.model.entity.Usuario;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")

//teste aqui
@Repository

public class UsuarioRepositoryTest {

	
	
	
	
	@Autowired
	UsuarioRepository repository;
	
	
	@Test
	public void deveVerificarExistenciaDeUmEmail() {
	//	//cenario
		Usuario usuario = Usuario.builder().nome("igor").email("igor@gmail.com").senha("smdks").build();
	repository.save(usuario);
		
		//acao - execução
		boolean result = repository.existsByEmail("igor@gmail.com");
		
		//verificação
		Assertions.assertThat(result).isTrue();
		
		
	
	}
}
