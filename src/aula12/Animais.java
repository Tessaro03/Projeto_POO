package aula12;

import java.io.Serializable;

public abstract class Animais implements Serializable {

    protected String nome;
    protected float peso;
    protected int idade;
    protected int membros;

    public Animais(float peso, int idade, int membros, String nome) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    
    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emitirSom();
    
    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    
}
