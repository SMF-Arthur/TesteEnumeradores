package Numero4e5;

import java.util.Scanner;

public class TesteEnumeradores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero que corresponde ao mês desejado :");
        diaDaSemana(scan.nextInt());
        
    }
    
    public static EnuDiaSemana diaDaSemana(int dia){
        
        EnuDiaSemana eds = EnuDiaSemana.JANEIRO;
        
        switch(dia){
            case 1:
                System.out.println("O mês "+ dia +" é : " + eds.JANEIRO );
                break;
            
            case 2:
                System.out.println("O mês "+ dia +" é : " + eds.FEVEREIRO );
                break;
                
            case 3:
                System.out.println("O mês "+ dia +" é : " + eds.MARCO );
                break;
                
            case 4:
                System.out.println("O mês "+ dia +" é : " + eds.ABRIL );
                break;
                
            case 5:
                System.out.println("O mês "+ dia +" é : " + eds.MAIO );
                break;
            
            case 6:
                System.out.println("O mês "+ dia +" é : " + eds.JUNHO );
                break;
            
            case 7:
                System.out.println("O mês "+ dia +" é : " + eds.JULHO );
                break;
                
            case 8:
                System.out.println("O mês "+ dia +" é : " + eds.AGOSTO);
                break;
                
            case 9:
                System.out.println("O mês "+ dia +" é : " + eds.SETEMBRO );
                break;
                
            case 10:
                System.out.println("O mês "+ dia +" é : " + eds.OUTUBRO );
                break;
            
            case 11:
                System.out.println("O mês "+ dia +" é : " + eds.NOVEMBRO );
                break;
             
            case 12:
                System.out.println("O mês "+ dia +" é : " + eds.DEZEMBRO );
                break;
            
            default:
                System.out.println("Digite um numero de 1 até 7...." );
            
        }        
        
        return eds;
        
    }
    
}
