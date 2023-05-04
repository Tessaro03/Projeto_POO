package aula12;
public class Mamifero extends Animais {
    protected String corPelo;
    protected int velocidade;

    public Mamifero(String corPelo, int velocidade, float peso, int idade, int membros, String nome) {
        super(peso, idade, membros, nome);
        this.corPelo = corPelo;
        this.velocidade = velocidade;
    }

    

    public int getVelocidade() {
        return velocidade;
    }

    public void setRabo(int velocidade) {
        this.velocidade = velocidade;
    }
    

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    @Override
    public void locomover(){
        System.out.printf("Correndo a %d Km/h \n", this.velocidade);
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }

    @Override
    public String toString() {
        return "---- Mamifero ----\nNome: "+ nome +"\nIdade: " + idade + "\nMembros: " + membros + "\nPeso: "+ peso + "\nVelocidade: " + velocidade+" Km/h\nCor Pelo: "+ corPelo+"\n";
    }

    
    
}
