
package fatec.poo.model;

/**
 *
 * @author Nicolas
 */
public class Aluno {
    
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public void setRA(int valorRA){
        
        RA = valorRA;
        
    }
    
    public void setNtPrv1(double valorNota1){
    
        NtPrv1 = valorNota1;
        
    }
    
    public void setNtPrv2(double valorNota2){
    
        NtPrv2 = valorNota2;
    
    }
    
    public void SetNtTrab1(double valorTrab1){
        
        NtTrab1 = valorTrab1;
    }
    
    public void SetNtTrab2(double valorTrab2){
    
        NtTrab2 = valorTrab2;
        
    }
    
    public int getRA(){
        return RA;
        
    }
    
    public double getNtPrv1(){
        return NtPrv1;
    }
    
    public double getNtPrv2(){
        return NtPrv2;
    }
    
    public double getNtTrab1(){
         return NtTrab1;
     }
     
    public double getNtTrab2(){
         return NtTrab2;
     }
    
    public double calcMediaProva(){
        
        return 0.75 * (NtPrv1 + (2 * NtPrv2))/3;
        
    }
    
    public double calcMediaTrab(){
        
        return 0.25 *(NtTrab1 + NtTrab2)/2;
        
    }
    
    public double calcMediaFinal(){
        
        return calcMediaProva() + calcMediaTrab();
        
    }
    
    public boolean iaAprovado(){
        if (calcMediaFinal() < 6){
            return(false);
            else{
                    return(true);
                    }
        }
    
    
  }  
}

Aplic.java

*
 *
 * @author kevin
 */

import fatec.poo.model.Aluno;
import java.util.Scanner;
public class Aplic {

    public static void main(String[] args) {
        
        Aluno objAluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        int RA, opcao;
        double prova1, prova2, trabalho1, trabalho2, medProva, medTrab, medFinal;
        
        System.out.println("entre com os dados do aluno:");
        System.out.print("RA: ");
        RA = entrada.nextInt();
        System.out.print("\nInforme a nota prova 1: ");
        prova1 = entrada.nextDouble();
        System.out.print("\nIforme a nota prova 2: ");
        prova2 = entrada.nextDouble();
        System.out.print("\nIforme a nota do trabalho 1: ");
        trabalho1 = entrada.nextDouble();
        System.out.print("\nInforme a nota do trabalho 2: ");
        trabalho2 = entrada.nextDouble();
        
        objAluno.setRA(RA);
        objAluno.setNtPrv1(prova1);
        objAluno.setNtPrv2(prova2);
        objAluno.SetNtTrab1(trabalho1);
        objAluno.SetNtTrab2(trabalho2);
        
        medProva = objAluno.calcMediaProva();
        medTrab = objAluno.calcMediaTrab();
        medFinal = objAluno.calcMediaFinal();
        
        do{
//            mostra ao usuario os dados informados
            System.out.println("RA: " + objAluno.getRA());
            System.out.println("nota prova 1: " + objAluno.getNtPrv1());
            System.out.println("nota prova 2: " + objAluno.getNtPrv2());
            System.out.println("nota trabalho 1: " + objAluno.getNtTrab1());
            System.out.println("nota trabalho2: " + objAluno.getNtTrab2());
            
//            da ao usuario as opções que ele deseja visualizar
            System.out.println("\nescolha uma opção");
            System.out.println("\n1- media provas");
            System.out.println("2- media trabalhos");
            System.out.println("3-media final");
            System.out.println("4-sair");
//            escolha da opção
            opcao = entrada.nextInt();
            
            switch(opcao){
                
                case 1: System.out.println("A media das provas do aluno foi: " + objAluno.calcMediaProva());
                break;
                case 2: System.out.println("a media dos trabalhos do aluno foi: " + objAluno.calcMediaTrab());
                break;
                case 3: System.out.println("a media final do aluno foi: " + objAluno.calcMediaFinal());
                if (objAluno.iaAprovado() == true) {
                        System.out.println("Situação: Aprovado");
                }else{
                        System.out.println("Situação: Reprovado");
                    
                }
                break;
                
                case 4: System.out.println("Programa encerrado");
                break;
                
                
            }
            
