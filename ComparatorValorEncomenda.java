
/**
 * Escreva a descrição da classe ComparatorValorEncomenda aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Comparator;

public class ComparatorValorEncomenda implements Comparator<Encomenda_ArrayList>
{
    public int compare(Encomenda_ArrayList a1, Encomenda_ArrayList a2){
        if(a1.calculaValorTotal() > a2.calculaValorTotal()) return 1;
        if(a1.calculaValorTotal() < a2.calculaValorTotal()) return -1;
        return 0;
    }
}
