
/**
 * Escreva a descrição da classe GestaoEncomendas aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
public class GestaoEncomendas
{
    private Map<String,Encomenda_ArrayList> encomendas;
    
    public GestaoEncomendas(){
        this.encomendas = new HashMap<>();
    }
    
    public GestaoEncomendas(Map<String,Encomenda_ArrayList> encs){
        setEncomendas(encs);
    }
    
    public GestaoEncomendas( GestaoEncomendas g){
        setEncomendas(g.getEncomendas());
    }
    
    public Map<String,Encomenda_ArrayList> getEncomendas(){
       Map<String,Encomenda_ArrayList> aux = new HashMap<>();
       //percorrer todos os elementos que estao no Map<String,Aluno> alunos
       //os elemntos do Map sao pares
       //entrySet devolve um par
       for(Map.Entry<String,Encomenda_ArrayList> e : this.encomendas.entrySet()){
           //e.getKey nao precisa de clone porque é string
           //e.getValue precisa de clone pois é do tipo Aluno
           aux.put(e.getKey(),e.getValue().clone());
        }
        return aux;
    }
    
    public void setEncomendas(Map<String,Encomenda_ArrayList> encs){
       this.encomendas = new HashMap<>();
       // e é um par <String,Aluno> resultante de cada entrySet
       encs.entrySet().forEach(e -> this.encomendas.put(e.getKey(), e.getValue().clone()));
    }
    
    public Set<String> todosCodigosEnc(){
        return this.encomendas.keySet();
    }
    
    public void addEncomenda(Encomenda_ArrayList enc){
        this.encomendas.put(enc.getNome(), enc.clone());
    }
    
    public Encomenda_ArrayList getEncomenda(String codEnc){
        return this.encomendas.get(codEnc).clone();
    }
    
    public void removeEncomenda(String codEnc){
        this.encomendas.remove(codEnc);
    }
   
    public int maiorQuantidade (ArrayList<LinhaEncomenda> l){
        int i=0;
        int max=0;
        for(i=0;i<l.size();i++){
            if(l.get(i).getQuantidade() > max){
                max=l.get(i).getQuantidade();
            }
        }
        return max;
    }
    
    public String encomendaComMaisProdutos(){
       int max=0; 
       String maior= new String();
       ArrayList<LinhaEncomenda> aux = new ArrayList<>();
       int qnt=0;
       for(Encomenda_ArrayList e : this.encomendas.values()){
           aux=e.getLinhas();
           qnt=maiorQuantidade(aux);
           if(qnt > max){
               max = qnt;
               maior=e.getNome();
            }
        }
        return maior;
    }
    
   public Set<String> encomendasComProduto(String codProd){
        Set<String> s = new TreeSet<>();
        ArrayList<LinhaEncomenda> aux = new ArrayList<>();
        for(Encomenda_ArrayList e : this.encomendas.values()){
            aux=e.getLinhas();
           for(int i=0; i<aux.size(); i++){
               if(aux.get(i).getReferencia() == codProd){
               s.add(e.getNome());
            }
        }
    }
        return s;
    }
    
    public Set<String> encomendasAposData(LocalDate d){
        Set<String> s = new TreeSet<>();
        for(Encomenda_ArrayList e : this.encomendas.values()){
           if(e.getData().isAfter(d)){
               s.add(e.getNome());
            }
        }
        return s;
    }
    
    public Set<Encomenda_ArrayList> encomendasValorDecrescente(){
        Set<Encomenda_ArrayList> s = new TreeSet<>(new ComparatorValorEncomenda());
        for(Encomenda_ArrayList a : this.encomendas.values()){
           s.add(a.clone());
        }
        return s;
    }
    
   public Map<String,List<String>> encomendasDeProduto(){
      Map<String,List<String>> auxMap = new HashMap<>();
      ArrayList<String> auxAL = new ArrayList<>();
      for(Encomenda_ArrayList a : this.encomendas.values()){
          for(int i=0; i<a.getLinhas().size(); i++){
          toList.encomendasComProduto(a.get(i).getLinhas().getReferencia());
        }
        }
   }
   
  public String toString(){
         StringBuilder sb = new StringBuilder();
        sb.append("Total:\n").append(this.encomendas).append("\n").append("\n");
        return sb.toString();                
    }
    
    public boolean equals (Object o) {
       if(o==this) return true;
       if(o==null || o.getClass() != this.getClass()) return false;
       GestaoEncomendas g = (GestaoEncomendas) o;
       return this.encomendas.equals(g.getEncomendas());
    }
}
