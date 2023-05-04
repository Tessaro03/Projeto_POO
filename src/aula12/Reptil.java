package aula12;
public class Reptil extends Animais {
    protected String corEscama;
    protected boolean peconheto;

    public Reptil(String corEscama, boolean peconheto, float peso, int idade, int membros, String nome) {
        super(peso, idade, membros, nome);
        this.corEscama = corEscama;
        this.peconheto = peconheto;
    }


    public boolean getPeconheto() {
        return peconheto;
    }

    public void setPeconheto(boolean peconheto) {
        this.peconheto = peconheto;
    }
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo Vegetais");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Réptil ");
    }
    
    public void envenenamento(){
    if (this.peconheto){
        System.out.println("VOCÊ ESTA ENVENENADO");
    } else {
        System.out.println("Não envenena!");
    }
    }
  
    @Override
    public String toString() {
        return "---- Reptil ----\nNome: "+ nome +"\nIdade: " + idade + "\nMembros: " + membros + "\nPeso: "+ peso + "\nPeçonheto: " +peconheto+"\nCor Escama: "+ corEscama+"\n";
    }
}
