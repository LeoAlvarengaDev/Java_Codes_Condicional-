/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpf;

import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class CPF {  


    public static void programador(){
        JOptionPane.showMessageDialog(null,"Atividade CPF\nNome:Leonardo Araujo Alvarenga\nRa:32218544");        
    }
    public static String tela(){
        String cpf;
        cpf = JOptionPane.showInputDialog(null,"Checador de CPFs\nInsira seu CPF para começar:");
        return cpf;
    }
    public static double verificador(double A,double B,double C,double D,double E,double F,double G,double H,double I,double J){
        double sm;
        sm = 11*A+10*B+9*C+8*D+7*E+6*F+5*G+4*H+3*I+2*J;       
        return 11 -(sm%11);        
    }
    public static void main (String[]args){      
        String cpf; 
        
        boolean l = true;
        
        char convertido;
        char[] conversao = new char [14];
        
        int opcao;
        
        double [] numeros = new double[14];        
        double digitos,primeiroDigito,segundoDigito;
        
        programador();
      
        do{
            cpf = tela() ;   
        
            for(int i = 0;i<cpf.length();i++){
                convertido = cpf.charAt(i);
                conversao[i] = convertido;}          
        
            for(int i = 0;i<14;i++){
                digitos = Character.getNumericValue(conversao[i]);
                numeros[i] = digitos;}
            
            primeiroDigito = verificador(0,numeros[0],numeros[1],numeros[2],numeros[4],numeros[5],numeros[6],numeros[8],numeros[9],numeros[10]);           
            segundoDigito =  verificador(numeros[0],numeros[1],numeros[2],numeros[4],numeros[5],numeros[6],numeros[8],numeros[9],numeros[10],primeiroDigito);        

            if(cpf.length() == 14 &&  numeros[12] == primeiroDigito &&  numeros[13] == segundoDigito){
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"O CPF inserido é Válido!\nGostaria de Testar outro CPF:\n1-Sim\n2-Não"));
            switch(opcao){
                case 2:l = false;
                        }    
            }else{
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"O CPF inserido é Inválido!\nGostaria de Testar outro CPF:\n1-Sim\n2-Não"));
            switch(opcao){
                case 2:l = false;   
                        }
            }
        }while(l);
    }
}

   
    
    

