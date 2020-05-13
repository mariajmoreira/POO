
/**
 * Escreva a descrição da classe ComparatorPrecoKm aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Comparator;
public class ComparatorPrecoKm implements Comparator<Veiculo>
{
    public int compare(Veiculo a1, Veiculo a2){
        if(a1.getPrecoTeorico() > a2.getPrecoTeorico()) return 1;
        if(a1.getPrecoTeorico() < a2.getPrecoTeorico()) return -1;
        return 0;
    }
}
