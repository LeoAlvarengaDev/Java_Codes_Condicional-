

package atividadeavaliativa;

import java.util.Scanner;

/*
 * @author Leonardo_Araujo_Alvarenga_RA:32218544
 */
public class Atividade01 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int Contador = 0;
        String Nome = "Leonardo";
        String Jogos = "Zelda";
        String Nomedigitado,Jogo;
        char Letra = 'L';
        char Sobrenome = 'A';
        int Idade = 18;
        int Mes = 01;
        double Peso = 58;
        double Altura = 1.75;
        boolean Homem = true;
        boolean Galo = true;
       
        System.out.print("Insira seu nome: ");
         Nomedigitado = in.nextLine();

        if (Nome.equals(Nomedigitado)) {
            System.out.print("Seu nome é igual ao meu!\n");
            Contador++;}

        else
            System.out.print("Seu nome não é igual ao meu!\n");
        
        System.out.print("Insira seu jogo Favorita: \n");
            Jogo = in.nextLine();

        if(Jogos.equals(Jogo)) {
            System.out.println("Seu jogo favorita é igual ao meu\n");
            Contador++;}
        else
            System.out.println("Seu jogo favorito não é igual ao meu\n");

        System.out.print("Insira a Primeira Letra do seu Sobrenome: \n");
            char Letra1 = in.next().charAt(0);

        if( Letra == Letra1 ) {
            System.out.println("Primeira Letra do seu Sobrenome é igual a minha\n");
            Contador++;}
        else
            System.out.println("Primeira Letra do seu Sobrenome nao é igual a minha\n");
        
        
        System.out.print("Insira a Primeira Letra do seu nome: \n");
            char Sobrenome1 = in.next().charAt(0);

        if( Sobrenome == Sobrenome1 ) {
            System.out.println("Primeira Letra do seu nome é igual a minha\n");
            Contador++;}
        else
            System.out.println("Primeira Letra do seu nome nao é igual a minha\n");
        
        
        System.out.print("Insira sua idade: ");
            int Idade1 = in.nextInt();

        if (Idade1 == Idade){
            System.out.print("Sua idade  é igual a minha!\n");
            Contador++;}
        else
            System.out.print("Sua idade nao é igual a minha!\n");

        System.out.print("Insira o Mes que nasceu: ");
            int Mes1 = in.nextInt();

        if (Mes1 == Mes){
            System.out.print("O mes de nascimento é igual ao meu!\n");
            Contador++;}
        else
            System.out.print("O mes de nascimento nao é igual ao meu!\n");
        
        
        System.out.print("Insira seu Peso: ");
            double Peso1 = in.nextDouble();

        if(Peso == Peso1){
            System.out.print("Seu peso é igual ao meu!\n");
            Contador++;}

        else
            System.out.print("Seu peso é nao igual ao meu!\n");

        System.out.println("Informe sua altura: ");
            double Altura1 = in.nextDouble();

        if(Altura == Altura1) {
            System.out.println("Sua Altura  é igual a minha");
            Contador++;}
        else 
            System.out.println("Sua Altura nao é igual a minha"); 
             
        System.out.println("Informe seu sexo.\n True para Homem,False para Mulher:");
            boolean sexo = in.nextBoolean();

        if(sexo == Homem ) {
            System.out.println("Seu sexo é igual ao meu");
             Contador++;}
        else 
            System.out.println("Seu sexo nao é igual ao meu");
        
        System.out.println("Informe seu Time.\nTrue para Galo,False para Outro:");
            boolean Time = in.nextBoolean();

        if(Time == Galo ) {
            System.out.println("Seu Time é igual ao meu\n");
        Contador++;}
        else 
            System.out.println("Seu Time nao é igual ao meu\n"); 


       
        //Contador 
        if(Contador > 5) {
            System.out.println("Essa pessoa é parecida comigo");
        } else {
            System.out.println("Essa pessoa é diferente de mim");
        }
    }
}
               
        
        
        
        
        

