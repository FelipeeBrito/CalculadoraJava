//Aluno: Felipe Maycon da Silva Brito
//RA: 21103381-5

package calculadora;

import java.util.Scanner;

public class Operacoes {
    
    float num1, num2, result;
    Scanner numero = new Scanner(System.in);
    
        public float Somar(){
            
            System.out.print("Digite o primeiro número: ");
            num1 = numero.nextFloat();
            System.out.print("Digite o segundo número: ");
            num2 = numero.nextFloat();
            result = num1 + num2;
            System.out.println("\r\nO resultado da soma é:" + result + "\n");
            return result;
        
        }        
        
        public float Subtrair(){
            
            System.out.print("Digite o primeiro número:");
            num1 = numero.nextFloat();
            System.out.print("Digite o segundo número:");
            num2 = numero.nextFloat();
            result = num1 - num2;
            System.out.println("\r\nO resultado da subtração é:" + result + "\n");
            return result;
         
        }
        
        public float Multiplicar(){
            
            System.out.print("Digite o primeiro número: ");
            num1 = numero.nextFloat();
            System.out.print("Digite o segundo número: ");
            num2 = numero.nextFloat();
            result = num1 * num2;
            System.out.println("\r\nO resultado da multiplicação é: " + result + "\n");
            return result;
        }       
        
        public float Dividir(){
            
            System.out.print("Digite o primeiro número: ");
            num1 = numero.nextFloat();
            System.out.print("Digite o segundo número: ");
            num2 = numero.nextFloat();
            result = num1 / num2;
            System.out.println("\r\nO resultado da divisão é: " + result + "\n");
            return result;
        }     
        
        public float Quadrado(){
            
            System.out.print("Digite um número: ");
            num1 = numero.nextFloat();
            result = num1 * num1;
            System.out.println("\r\nO resultado do número elevado ao quadrado é: " + result + "\n");
            return result;
        }       
    
}
