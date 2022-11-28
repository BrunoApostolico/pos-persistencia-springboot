package br.edu.infnet.springboot.modelo.entidade;

import javax.persistence.Entity;

@Entity
public class Atendente extends Colaborador{
    private int idade;
    private String formacao;
    private String turno;

    public Atendente(Long id, String nome, String email, String telefone, int idade, String formacao, String turno) {
        super(id, nome, email, telefone);
        this.idade = idade;
        this.formacao = formacao;
        this.turno = turno;
    }

    public Atendente(){

    }

    @Override
    public String toString() {
        return idade + "; " + formacao + "; " + turno + "; " + super.toString();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
