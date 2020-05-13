
/**
 * Escreva a descrição da classe DriveIt aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.*;
import java.util.stream.Collectors;
public class DriveIt
{
   //private Set<Veiculo> veiculos;
   private Map<String,Veiculo> veiculos;
   private boolean promocao;
   
   public DriveIt(){
       this.veiculos = new HashMap<>();
       this.promocao = false;
    }
    
   public DriveIt(Map<String,Veiculo> vcs){
       this.veiculos = new HashMap<>();
       this.veiculos = vcs.values().stream().collect(Collectors.toMap((e) -> e.getId(), (e) -> e.clone()));
       this.promocao = false;
    }
    
   public DriveIt(DriveIt di){
        this.veiculos = di.getVeiculos();
        this.promocao = di.getPromocao();
    } 
    
   public Map<String, Veiculo> getVeiculos(){
        Map<String, Veiculo> veiculos = new HashMap<>();
        for (Veiculo v : this.veiculos.values()){
            veiculos.put(v.getId(), v.clone());
        }
        return veiculos;
    }
    
    public boolean getPromocao(){
        return this.promocao;
    }
    
    public void setPromocao(boolean p){
        this.promocao=p;
    }
    
   public void setVeiculo(Map<String,Veiculo> veiculos){
        for (Veiculo v : veiculos.values()){
            this.veiculos.put(v.getId(),v.clone());
        }
    }
    
   public boolean existeVeiculo(String cod){
       return this.veiculos.containsKey(cod);
    }
    
   public int quantos(){
        return this.veiculos.size();
    }
    
   public int quantos(String marca){
        return (int) this.veiculos.values().stream()
                                           .filter(x -> x.getMarca().equals(marca))
                                           .count();
    } 
    
   public Veiculo getVeiculo(String cod){
         return this.veiculos.get(cod).clone();
    }
    
   public void adiciona(Veiculo v){
         this.veiculos.put(v.getId(), v.clone()); //chama o clone da Veiculo
    }
   
   public void adiciona(Set<Veiculo> vs){
         for (Veiculo v : vs){
            this.veiculos.put(v.getId(), v.clone());
        }
    }
    
   public List<Veiculo> getAllVeiculos(){
        List<Veiculo> veiculos = new ArrayList<>();
        for (Veiculo v : this.veiculos.values()){
            veiculos.add(v.clone());
        }
        return veiculos; 
    }
    
   public void registarAluguer(String codVeiculo, int numKms){
        int kms = this.veiculos.get(codVeiculo).getKms();
        this.veiculos.get(codVeiculo).setKms(numKms+kms);
    }
    
   public void classificarVeiculo(String cod, int classificacao){
        int utilizadores = this.veiculos.get(cod).getNrUtilizadores();
        int cls = this.veiculos.get(cod).getClassificacao();
        int totalUtilizadores = (utilizadores + 1);
        int totalClassificacoes = (cls + classificacao);
        int media = ((totalClassificacoes) / (totalUtilizadores));
        this.veiculos.get(cod).setMedia(media);
        this.veiculos.get(cod).setClassificacao(totalClassificacoes);
        this.veiculos.get(cod).setNrUtilizadores(totalUtilizadores);
    }
    
   public int custoRealKm(String cod){
        double preco = this.veiculos.get(cod).getPrecoTeorico();
        double perc =  (1.10)*preco;
        int total = (int) perc;
        return total;
    }
    
   public void entraEmPromocao(){
       setPromocao(true);
       for (Veiculo v : this.veiculos.values()){
           if(v instanceof VeiculoOcasiao){
               VeiculoOcasiao vo = (VeiculoOcasiao) v;
               vo.setPromocao(true);
            }
        }
    }
    
    
    public void alteraPromocao(boolean b){ //substitui o metodo entraEmPromocao e o terminaPromocao
        setPromocao(b);
        for(Veiculo v : this.veiculos.values()){
            if(v instanceof VeiculoOcasiao) 
            {   VeiculoOcasiao vo = (VeiculoOcasiao) v;
                vo.setPromocao(b);
            }
        }
    }
    
   public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Lista: ").append(this.veiculos);
        return s.toString();
    }
    
    public DriveIt clone(){
        return new DriveIt(this);
    }
    
   public boolean equals (Object o) {
       if(o==this) return true;
       if(o==null || o.getClass() != this.getClass()) return false;
       DriveIt di = (DriveIt) o;
       return this.veiculos.equals(di.getVeiculos());
    } 
    
    public Set<Veiculo> ordenarVeiculos(){
        Set<Veiculo> aux = new TreeSet<>();
        for(Veiculo v : this.veiculos.values())
            aux.add(v.clone());
        return aux;
    }
    
    public Set<Veiculo> ordenarVeiculos(Comparator<Veiculo> c){
        Set<Veiculo> aux = new TreeSet<>(c);
        for(Veiculo v : this.veiculos.values())
            aux.add(v.clone());
        return aux;
    }
    
    public List<Veiculo> ordenarVeiculosLista(){
        return this.veiculos.values().stream()
                                     .sorted()
                                     .map(c -> c.clone()) //ou .map(Veiculo::clone)
                                     .collect(Collectors.toList());
                                    }
                                    
     private static Map<String,Comparator<Veiculo>> ordem = new TreeMap<>();
    //e static pq e global a todas as instancias(para poupar memoria nas instancias)
    //e uma variavel de classe
    
    public void addOrdem(String n, Comparator<Veiculo> c){ //adiciona um elemento ao map
        ordem.put(n,c);        
    }
    
    public Iterator<Veiculo> ordenarVeiculo(String criterio){
        Set<Veiculo> aux = new TreeSet<>(ordem.get(criterio)); //o TreeSet tem a noçao de ordem; o argumento dele e o comparador
        for(Veiculo v : this.veiculos.values())
            aux.add(v.clone());
        return aux.iterator();
    }
}
