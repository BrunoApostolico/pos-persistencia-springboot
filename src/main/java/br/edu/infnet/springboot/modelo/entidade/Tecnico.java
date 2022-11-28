package br.edu.infnet.springboot.modelo.entidade;

import javax.persistence.Entity;

@Entity
public class Tecnico extends Colaborador{
    private String coren;
    private boolean diarista;
    private String sexo;

    public Tecnico(Long id, String nome, String email, String telefone, String coren, boolean diarista, String sexo) {
        super(id, nome, email, telefone);
        this.coren = coren;
        this.diarista = diarista;
        this.sexo = sexo;
    }

    public Tecnico(){

    }

    @Override
    public String toString() {
        return coren + "; " + diarista + "; " + sexo + "; " + super.toString();
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public boolean isDiarista() {
        return diarista;
    }

    public void setDiarista(boolean diarista) {
        this.diarista = diarista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
