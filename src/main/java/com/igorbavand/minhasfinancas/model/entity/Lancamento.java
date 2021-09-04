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
import java.util.Objects;

import org.springframework.data.convert.Jsr310Converters;

@Entity
@Table(name = "lancamento", schema = "financas")
public class Lancamento{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	
	@Column(name="descricao")
	private String descricao;
	
	
	@Column(name = "mes")
	private Integer mes;
	
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", mes=" + mes + ", ano=" + ano + ", usuario="
				+ usuario + ", valor=" + valor + ", dataCadastro=" + dataCadastro + ", tipo=" + tipo + ", status="
				+ status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, dataCadastro, descricao, id, mes, status, tipo, usuario, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamento other = (Lancamento) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(dataCadastro, other.dataCadastro)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(mes, other.mes) && status == other.status && tipo == other.tipo
				&& Objects.equals(usuario, other.usuario) && Objects.equals(valor, other.valor);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public TipoLancamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}

	public StatusLancamento getStatus() {
		return status;
	}

	public void setStatus(StatusLancamento status) {
		this.status = status;
	}

	@Column(name = "ano")
	private Integer ano;
	
	
	@ManyToOne // relacinamento muitos lancamento para um usuario
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	

	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "data_cadastro")
	@Convert(converter = Jsr310Converters.LocalDateToDateConverter.class)
	private LocalDate dataCadastro;
	
	
	@Column(name = "tipo")
	@Enumerated(value = EnumType.STRING)
	private TipoLancamento tipo;
	
	@Column(name = "status")
	@Enumerated(value = EnumType.STRING)
	private StatusLancamento status;
	
}
