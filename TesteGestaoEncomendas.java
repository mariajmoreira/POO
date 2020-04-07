
/**
 * Escreva a descrição da classe TesteGestaoEncomendas aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.ArrayList;
public class TesteGestaoEncomendas
{
    public static void main (String[] opts){
        LinhaEncomenda l1 = new LinhaEncomenda("AX8953","Arroz",10.0,10,0.4,0.3);
        LinhaEncomenda l2 = new LinhaEncomenda("LD6469","Batata",9.0,9,0.3,0.2);
        LinhaEncomenda l3 = new LinhaEncomenda("BG4838","Amendoins",8.0,8,0.2,0.1);
        
        ArrayList<LinhaEncomenda> linhas = new ArrayList<>();
        linhas.add(l1);
        linhas.add(l2);
        linhas.add(l3);
        
        Encomenda_ArrayList e1 = new Encomenda_ArrayList("Guilherme","20", "Viana",8,linhas);
        Encomenda_ArrayList e2 = new Encomenda_ArrayList("Maria","19", "Braga",4,linhas);
        Encomenda_ArrayList e3 = new Encomenda_ArrayList("Joao","31", "Algarve",56,linhas);
       
        
        GestaoEncomendas t = new GestaoEncomendas();
        
        t.addEncomenda(e1);
        t.addEncomenda(e2);
        t.addEncomenda(e3);
        
        System.out.println(t.toString());
        
        System.out.println(t.encomendaComMaisProdutos());
        
        System.out.println(t.encomendasComProduto("LD6469"));
        
        //System.out.println(t.encomendasAposData(LocalDate d));
        
        System.out.println(t.encomendasValorDecrescente());
        
        //System.out.println(t. encomendasDeProduto());
    }
}
