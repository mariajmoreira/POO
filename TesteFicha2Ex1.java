
/**
 * Escreva a descrição da classe TesteFicha2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Arrays;
import java.util.Scanner;
public class TesteFicha2Ex1{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Ficha2Ex1 f = new Ficha2Ex1();
        
        System.out.println ("Escreva o tamanho do array.");
        int tamanho = sc.nextInt();
        int [] lista = new int[tamanho];
        System.out.println ("Insira os elementos do array.");
        for (int i = 0; i < tamanho; i++){
            int valor = sc.nextInt();
            lista[i] = valor;
        }
        int resultado = f.minimoEx1a(lista);
        System.out.println ("O valor minimo presente no array é: " + resultado);
        
        System.out.println ("Indique os indices.");
        int indice1 = sc.nextInt();
        int indice2 = sc.nextInt();
        int [] result = new int[indice2 - indice1 + 1];
        result = f.entreEx1b(lista,indice1, indice2);
        System.out.println ("O array entre os indices " + indice1 + " e " + indice2 + " é: ");
        for (int i=0; i<(indice2 - indice1 +1); i++){
            System.out.println (result[i]);
        }
        
        System.out.println ("Escreva o tamanho do segundo array.");
        int tamanho2 = sc.nextInt();
        int [] lista2 = new int[tamanho2];
        System.out.println ("Insira os elementos do segundo array.");
        for (int i = 0; i < tamanho2; i++){
            int valor2 = sc.nextInt();
            lista2[i] = valor2;
        }
        int [] resulta = new int[tamanho2+tamanho];
        resulta = f.comunsEx1c(lista,lista2);
        System.out.println ("Os inteiros comuns aos dois arrays são:");
        for (int i=0; i<tamanho2; i++){
            System.out.println (resulta[i]);
        }
        
        
        
        f.ordenaEx4a(lista);
        System.out.println ("O array ordenado por ordem crescente é: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println (lista[i]);
        }
    }   
}  
        