package com.igorbavand.minhasfinancas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorbavand.minhasfinancas.model.entity.Usuario;
import com.igorbavand.minhasfinancas.model.repository.UsuarioRepository;
import com.igorbavand.minhasfinancas.service.UsuarioService;
import com.igorbavand.minhasfinancas.service.impl.exception.RegraNegocioException;


@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	
	
	private UsuarioRepository repository;

	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Ja existe um usuario com esse email.");
		}
		
	}
	
}
