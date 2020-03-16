
/**
 * Escreva a descrição da classe Ficha1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.time.LocalDateTime;
import java.util.Scanner;
public class TesteFicha1{
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        Ficha1 f = new Ficha1();
        
        long demorou = f.pergunta7();
        System.out.println("Resposta =" + demorou);
        
        System.out.println("Insira o valor");
        int num = sc.nextInt();
        long fact = f.pergunta6(num);
        System.out.println("Resposta = " + fact);
        
        System.out.println("Insira os dois valores");
        int c = sc.nextInt();
        int d = sc.nextInt();
        String result = f.pergunta5(c,d);
        System.out.println("Resposta = " + result);
        
        System.out.println("Insira o valor e a taxa de conversão");
        double valor = sc.nextDouble();
        double taxa = sc.nextDouble();
        double libras = f.pergunta4(valor,taxa);
        System.out.println("Resposta = " + libras);
        
        System.out.println("Insira os dois numeros a testar");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maior = f.pergunta2(a,b); 
        System.out.println("Resposta = " + maior);
        
        System.out.println("Insira nome e saldo");
        String nome = sc.nextLine();
        float saldo = sc.nextFloat();
        String str = f.pergunta3(nome, saldo);
        System.out.println("Resposta = " + str);
        
        System.out.println("Insira os graus (ºC)");
        float graus = sc.nextFloat();
        float fahrenheit = f.pergunta1(graus);
        System.out.println("Resposta = " + fahrenheit);
        
       
    }
}

