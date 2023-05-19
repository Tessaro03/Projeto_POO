package aula12;

import java.io.Serializable;

public class Peixe extends Animais  {
    protected String corEscama;
    protected int profundidade;

    public Peixe(String corEscama, int profundidade, float peso, int idade, int membros, String nome) {
        super(peso, idade, membros, nome);
        this.corEscama = corEscama;
        this.profundidade = profundidade;
    }

    

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    } 

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz Som");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    @Override
    public void locomover() {
        System.out.printf("Nadando a %d Metros de profundidade \n", this.profundidade);
    }
    
    public void soltarBolha(){
        System.out.println("0   0    0    o     o");
    }
    
    @Override
    public String toString() {
        return "---- Peixe ----\nNome: "+ nome +"\nIdade: " + idade + "\nMembros: " + membros + "\nPeso: "+ peso + "\nNivel de Profundidade: " + profundidade+" m \nCor Escama: "+ corEscama+"\n";
    }
}
