//Aluno: Felipe Maycon da Silva Brito
//RA: 21103381-5

package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        char op; 
        Scanner entrada = new Scanner(System.in);
        
        do {
            
            System.out.println("Escolha uma das operações abaixo para realizarmos os calculos! \r\n");
            System.out.println("1.Soma  \r\n2.Subtração \r\n3.Multiplicação \r\n4.Divisão \r\n5.Quadrado de um número \r\n0.Sair");
            System.out.print("Digite aqui: ");
            op = entrada.next().charAt(0);
            entrada.nextLine();
            
            switch (op){
                
                case '1':
                    System.out.println("\r\n1.Soma\r\n");
                    Operacoes soma = new Operacoes();
                    soma.Somar();
                    break;
                
                case '2':
                System.out.println("\r\n2.Subtração\r\n");
                    Operacoes sub = new Operacoes();
                    sub.Subtrair();
                    break;
                    
                case '3':
                    System.out.println("\r\n3.Multiplicação\r\n");
                    Operacoes mult = new Operacoes();
                    mult.Multiplicar();
                    break;
                    
                 case '4':
                    System.out.println("\r\n4.Divisão\r\n");
                    Operacoes div = new Operacoes();
                    div.Dividir();
                    break;
                    
                case '5':
                    System.out.println("\r\n5.Quadrado de um número\r\n");
                    Operacoes quad = new Operacoes();
                    quad.Quadrado();
                    break;

                case '0':
                    System.out.println("\r\nSaindo...");
                    System.exit(0);
                    break;
                
                default: 
                    System.out.print("\r\nOpção Inválida\r\n");
                    break;
                    
            }
        
        }while(op != '0');
        
        entrada.close();  
    }
    
}
