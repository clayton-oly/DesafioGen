package com.nsg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;



@Entity
@Table(name = "tb_aluno")
public class Aluno {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "O campo Nome é obrigatório.")
    private String nome;

    @NotNull(message = "A idade é obrigatória.")
    @Min(value = 0, message = "A idade deve ser maior ou igual a 0.")
    @Max(value = 120, message = "A idade deve ser menor ou igual a 120.")
    private Integer idade;

    @NotNull(message = "A nota do primeiro semestre é obrigatória.")
    @Min(value = 0, message = "A nota deve ser maior ou igual a 0.")
    @Max(value = 10, message = "A nota deve ser menor ou igual a 10.")
    private Double notaPrimeiroSemestre;

    @NotNull(message = "A nota do segundo semestre é obrigatória.")
    @Min(value = 0, message = "A nota deve ser maior ou igual a 0.")
    @Max(value = 10, message = "A nota deve ser menor ou igual a 10.")
    private Double notaSegundoSemestre;

    private String nomeProfessor;
    private Integer numeroSala;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getNotaPrimeiroSemestre() {
		return notaPrimeiroSemestre;
	}

	public void setNotaPrimeiroSemestre(Double notaPrimeiroSemestre) {
		this.notaPrimeiroSemestre = notaPrimeiroSemestre;
	}

	public Double getNotaSegundoSemestre() {
		return notaSegundoSemestre;
	}

	public void setNotaSegundoSemestre(Double notaSegundoSemestre) {
		this.notaSegundoSemestre = notaSegundoSemestre;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public Integer getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}
    

}
