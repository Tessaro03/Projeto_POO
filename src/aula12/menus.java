package aula12;
import java.util.Scanner;

public class menus {
    Scanner sc = new Scanner(System.in);
    Mamifero [] mamiferos = new Mamifero[100];
    Peixe [] peixes = new Peixe[100];
    Reptil [] reptils = new Reptil[100];
    Ave [] aves = new Ave[100];
   
    public void menuPrincipal(){
        int escolha;
	do {
            System.out.println("\n--------- MENU DOS ANIMAIS ---------");
            System.out.println("[0] Cadastra Animal");
            System.out.println("[1] Ver Animais");
            System.out.println("[2] Sair");
            System.out.print("Sua escolha:");
            escolha = sc.nextInt();
	}while (escolha<0 || escolha>2 );
	if(escolha==0) {
            menuCadastraAnimais();
	}
	if(escolha==1) {
            menuVerAnimais();
	}
	if(escolha==2) {  
            System.out.println("");
	}
    }
    
    public void menuCadastraAnimais(){
    	int escolha;
        int cont = 0;
     	do {
            System.out.println("--------- MENU CADASTRO ANIMAIS ---------");
            System.out.println("[0] Peixe");
            System.out.println("[1] Ave");
            System.out.println("[2] Reptil");
            System.out.println("[3] Mamifero");
            System.out.println("[4] Voltar");
            System.out.print("Sua escolha:");
            escolha = sc.nextInt();
            }while (escolha<0 || escolha>4 );
                
                String cor = "";
                String nome = "";
                int idade = 0;
                int membros = 0;
                float peso = 0;
            
            if (escolha == 0) {
                int profundidade = 0; 
                do {sc.nextLine();
                    System.out.print("Cor da Escama: ");
                    cor = sc.nextLine();
                }while ("".equals(cor));
                do {System.out.print("Profundidade: ");
                    profundidade = sc.nextInt();
                    sc.nextLine();
                }while (profundidade < 0);
                do{System.out.print("Peso: ");
                    peso = sc.nextFloat();
                }while(peso < 0);
                do{System.out.print("Idade: ");
                    idade = sc.nextInt();
                }while( idade < 0);
                do{System.out.print("Membros: ");
                    membros = sc.nextInt();
                }while(membros < -1);
                do{sc.nextLine();    
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                }while("".equals(nome));
                for (int i = 0 ; i < 100; i++){
                    if (peixes[i]==null && cont == 0){
                        System.out.println("Cadastrado!!!");
                        cont = 1;
                        peixes[i] = new Peixe(cor,profundidade,peso,idade,membros,nome);
                        System.out.println("");
                    }
                }
                menuPrincipal();
            }
            if(escolha==1) {
                float bico =-1;
                do{sc.nextLine();
                    System.out.print("Cor da pena:");
                    cor = sc.nextLine();
                }while("".equals(cor));
                do{System.out.print("Tamanho do bico:");
                    bico = sc.nextFloat();
                }while(bico < 0);
                do{System.out.print("Peso:");
                    peso = sc.nextFloat();
                }while(peso < 0);
                do{System.out.print("Idade:");
                    idade = sc.nextInt();
                }while( idade < 0);
                do{ System.out.print("Membros:");          
                    membros = sc.nextInt();
                }while(membros < 0);
                do{ sc.nextLine();
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                }while("".equals(nome));
     		for (int i=0 ; i < 100 ; i++){
                    if (aves[i]==null && cont == 0) {
                        System.out.println("Cadastrado!!!");
                        cont = 1;
                	aves[i] = new Ave(cor,bico,peso,idade,membros,nome);
                    }
                }
            menuPrincipal();
            }
	    if(escolha==2) {
		boolean pp;     
                do{sc.nextLine();
                    System.out.print("Cor da escama:");
                    cor = sc.nextLine();
		}while("".equals(cor));
                System.out.print("Peconhento (true ou false):");
                pp = sc.nextBoolean();
     		do{System.out.print("Peso: ");         
                    peso = sc.nextFloat();
                }while(peso < 0);
                do{System.out.print("Idade: ");   
                    idade = sc.nextInt();
                }while( idade < 0);
                do{ System.out.print("Membros: ");          
                    membros = sc.nextInt();
                }while(membros < 0);
                do{ sc.nextLine();
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                }while("".equals(nome));
     		for (int i=0 ; i < 100 ; i++){
                    if (reptils[i]==null && cont==0) {
                        System.out.println("Cadastrado!!!");
                        cont = 1;
                        reptils[i] = new Reptil(cor,pp,peso,idade,membros,nome);
                    }
                }
            menuPrincipal();
            }
            if(escolha==3) {
                int velocidade = -1;
                do{ sc.nextLine();
                    System.out.print("Cor do pelo:");
                    cor = sc.nextLine();
                }while("".equals(cor));
                do{System.out.print("Velocidade:");
                    velocidade = sc.nextInt();
                }while(velocidade <0);                    
                do{System.out.print("Peso:");
                    peso = sc.nextFloat();
                }while(peso <0 );                    
                do{System.out.print("Idade:");
                    idade = sc.nextInt();
                }while( idade <0 );                   
                do{System.out.print("Membros:");
                    membros = sc.nextInt();
                }while(membros <0 );               
                do{sc.nextLine();
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                }while("".equals(nome));    		
                for (int i=0 ; i < 100 ; i++){
                    if (mamiferos[i]==null && cont==0) {
                        System.out.println("Cadastrado!!!");
                        cont = 1;
                	mamiferos[i] = new Mamifero(cor,velocidade,peso,idade,membros,nome);
                    }
                }              
                menuPrincipal();
            }
            if(escolha==4) {
                menuPrincipal();
	    }
    }
    public void menuVerAnimais(){
    	int escolha;
        int id=-1;
        
    	do {
        System.out.println("--------- MENU DO VISUALIZAÇÃO DE LISTA ---------");
        System.out.println("[0] Lista de Peixes");
        System.out.println("[1] Lista de Aves");
        System.out.println("[2] Lista de Raptils");
        System.out.println("[3] Lista de Mamiferos");
        System.out.println("[4] Voltar");
        System.out.print("Sua escolha:");
        escolha = sc.nextInt();
        }while (escolha<0 || escolha>4 );
    	if(escolha==0){
            for (int i=0 ; i < 100 ; i++){
                if (peixes[i]!=null) {
                    System.out.print("Peixe:"+i+" | Nome:");
                    System.out.println(peixes[i].getNome());
                    
                    do{
                        System.out.println("--------------------------");
                        System.out.print("Digite o id do Animal de escolha: ");
                        id = sc.nextInt();
                    }while(id<0 || id>100);
                    System.out.print(peixes[id]);
                }
            }    
        }
            
        if(escolha==1) {
            for (int i=0 ; i < 100 ; i++){
                if (aves[i]!=null) {
                    System.out.print("Ave:"+i+" | Nome:");
                    System.out.println(aves[i].getNome());
                
                    do{
                        System.out.println("--------------------------");
                        System.out.print("Digite o id do Animal de escolha: ");
                        id = sc.nextInt();
                    }while(id<0 || id>100);
                    System.out.print(aves[id]);
               }        
            }
        }
  
        if(escolha==2) {
            for (int i=0 ; i < 100 ; i++){
                if (reptils[i]!=null) {
                    System.out.print("Reptil:"+i+" | Nome:");
                    System.out.println(reptils[i].getNome());
              
        
                    do{
                        System.out.println("---------------------------");
                        System.out.print("Digite o id do Animal de escolha:");
                        id = sc.nextInt();
                    }while(id<0 || id>100);
                    System.out.print(reptils[id]);
                }
            }  
        }        
	if(escolha==3) {
            for (int i=0 ; i < 100 ; i++){
                if (mamiferos[i]!=null) {
                    System.out.print("Mamifero:"+i+" | Nome:");
                    System.out.println(mamiferos[i].getNome());
                    do{
                        System.out.println("---------------------------");
                        System.out.print("Digite o id do Animal de escolha:");
                        id = sc.nextInt();
                    }while(id<0 || id>100);
                    System.out.print(mamiferos[id]);
                }
            }	
        }      
        menuPrincipal();
	if(escolha==4) {
            menuPrincipal();
	}
    }
}
