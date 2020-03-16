
/**
 * Escreva a descrição da classe Ficha1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.time.LocalDateTime;
public class Ficha1{
    public String pergunta3(String nome, float saldo) {
       return "Nome: " + nome + ", saldo: " + saldo;
    }
    
    public float pergunta1(float graus){
        return (graus * (9/5) + 32);
    }

    public int pergunta2(int a, int b){
        return (Math.max(a,b));
    }
    
    public double pergunta4(double valor, double taxaConversao){
        return (valor * taxaConversao);
    }
    
    public String pergunta5(int a, int b){
        double media = (a+b)/2;
        if (a<b)
            return "Ordem decrescente: "+ b + ", " + a + ", Media: " + media;
        else
            return "Ordem decrescente: "+ a + ", " + b + ", Media: " + media;
    }
    
    public long pergunta6(int num){
        long result=1;
        while (num > 0) {
        result *= num;
        num = num-1;
        }
    return result;
    }    
    
 
    public long pergunta7(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        long fatorial5000 = pergunta6(5000);
        LocalDateTime currentDateTime2 = LocalDateTime.now();
        long tempo = (currentDateTime2) - (currentDateTime);
        return tempo;  
    }
}    