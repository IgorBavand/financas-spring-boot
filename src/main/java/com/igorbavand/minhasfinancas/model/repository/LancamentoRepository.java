package com.igorbavand.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorbavand.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
