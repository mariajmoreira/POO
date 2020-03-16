
/**
 * Escreva a descrição da classe TesteFicha2Ex3 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Month;
public class TesteFicha2Ex3
{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Ficha2Ex3 f = new Ficha2Ex3();
        
        LocalDate[] Datas = new LocalDate[20];
        int capacidade = 0;
       
        LocalDate data1 = LocalDate.of(2017,Month.JANUARY,1);
        LocalDate data2 = LocalDate.of(2018,Month.FEBRUARY,2);
        LocalDate data3 = LocalDate.of(2019,Month.MARCH,3);
        LocalDate data4 = LocalDate.of(2020,Month.APRIL,4);
        
        //EXERCICIO 3 a)
        f.insereDataEx3a(data1, Datas, capacidade);
        capacidade++;
        f.insereDataEx3a(data2, Datas, capacidade);
        capacidade++;
        f.insereDataEx3a(data3, Datas, capacidade);
        capacidade++;
        f.insereDataEx3a(data4, Datas, capacidade);
        capacidade++;
        
        for(int i=0; i<capacidade;i++){
        System.out.println (Datas[i]);
        }
        
        //EXERCICIO 3 b)
    }
}
