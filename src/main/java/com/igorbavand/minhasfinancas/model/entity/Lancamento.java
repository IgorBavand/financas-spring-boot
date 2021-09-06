package com.igorbavand.minhasfinancas.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

import org.springframework.data.convert.Jsr310Converters;

import com.igorbavand.minhasfinancas.model.enums.StatusLancamento;
import com.igorbavand.minhasfinancas.model.enums.TipoLancamento;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "lancamento", schema = "financas")
@Builder
@Data
public class Lancamento{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	
	@Column(name="descricao")
	private String descricao;
	
	
	@Column(name = "mes")
	private Integer mes;


	@Column(name = "ano")
	private Integer ano;
	
	
	@ManyToOne // relacinamento muitos lancamento para um usuario
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	

	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "data_cadastro")
	//@Convert(converter = Jsr310Converters.LocalDateToDateConverter.class)
	@Convert(converter = Jsr310Converters.LocalDateToDateConverter.class)
	private LocalDate dataCadastro;
	
	
	@Column(name = "tipo")
	@Enumerated(value = EnumType.STRING)
	private TipoLancamento tipo;
	
	@Column(name = "status")
	@Enumerated(value = EnumType.STRING)
	private StatusLancamento status;
	
}
