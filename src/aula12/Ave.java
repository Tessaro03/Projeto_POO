package aula12;
public class Ave extends Animais {
    protected String corPena;
    protected float bico;

    public Ave(String corPena, float bico, float peso, int idade, int membros, String nome) {
        super(peso, idade, membros, nome);
        this.corPena = corPena;
        this.bico = bico;
    }

    
    public float getBico() {
        return bico;
    }

    public void setBico(float bico) {
        this.bico = bico;
    }

    
    public String getCorPena() {
        return corPena;
    }   

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Minhoca");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    public void bicar(){
        System.out.printf("Bicando a arvore com %.2f cm \n", this.bico);
    }    
    public void fazerNinho(){
        System.out.println("|___|");
    }

    @Override
    public String toString() {
        return "---- Ave ----\nNome: "+ nome +"\nIdade: " + idade + "\nMembros: " + membros + "\nPeso: "+ peso + "\nBico: " +bico+" cm \nCor Pena: "+ corPena+"\n";
    }
}
