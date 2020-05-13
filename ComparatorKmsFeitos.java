
/**
 * Escreva a descrição da classe ComparatorKmsFeitos aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Comparator;
public class ComparatorKmsFeitos implements Comparator<Veiculo>
{
    public int compare(Veiculo a1, Veiculo a2){
        if(a1.getKms() > a2.getKms()) return 1;
        if(a1.getKms() < a2.getKms()) return -1;
        return 0;
    }
}
