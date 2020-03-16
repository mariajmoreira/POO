
/**
 * Escreva a descrição da classe Ficha2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Arrays;
public class Ficha2Ex1{
    
        public int minimoEx1a (int[] a){
            int min = Integer.MAX_VALUE;
            int pos = -1;
            for (int i=0; i<a.length; i++){
                if (a[i] < min){
                    min =a[i];
                    pos = i;
                }
            }
            return min;
        }
        
        public int[] entreEx1b (int[] c, int a, int b){
            int j = 0;
            int [] listanova = new int[b-a+1];
            for(int i=a; i<(b-1); i++){
                listanova[j]=c[i];
                j++;
            }
            return listanova;
        }
        
        public int[] comunsEx1c (int[] d, int [] e){
            int x=0;
            int [] comuns = new int [e.length];
            for (int i=0; i < d.length; i++){
                for( int j=0; j < e.length; j++){
                    if (d[i]==e[j]){
                        comuns[x] = e[j];
                        x++;
                    }
                }
            }
            return comuns;
        }
        
        public void ordenaEx4a(int[] b){
           Arrays.sort(b);   
        }
}
           
    
