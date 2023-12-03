package com.entregadorprojeto.Dianome11.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_entregador")
public class Entregador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String cpf;
    private String nome;
    private int capacidadeVeiculo;
    
    @ManyToOne
    @JoinColumn(name = "departmant_id")
    private Departmant departmant;
    
    public Entregador() {
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidadeVeiculo() {
		return capacidadeVeiculo;
	}

	public void setCapacidadeVeiculo(int capacidadeVeiculo) {
		this.capacidadeVeiculo = capacidadeVeiculo;
	}

	public Departmant getDepartmant() {
		return departmant;
	}

	public void setDepartmant(Departmant departmant) {
		this.departmant = departmant;
	}
}
