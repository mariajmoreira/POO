
/**
 * Escreva a descrição da classe CasaInteligente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CasaInteligente
{
    private String nome;
    //permite que possamos utilizar todas as implementacçoes de list
    private List<Lampada> lampadas;
    
    //construtor por defeito
    public CasaInteligente(){
        this.nome = new String();
        this.lampadas = new ArrayList<>();  
    }
    
    //construtor parametrizado
    public CasaInteligente(String n, List<Lampada> lps){
        this.nome = n;
        setLampadas(lps); 
    }
    
    //construtor por copia
    public CasaInteligente (CasaInteligente ci){
        this.nome = ci.getNome();
        setLampadas(ci.getLampadas());
    }
    
    //atribui a variavel de instancia lampadas o valor de lps 
    public void setLampadas (List<Lampada> lps){
        this.lampadas = new ArrayList<>();
        for(Lampada l : lps){
            this.lampadas.add(l.clone());
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public List<Lampada> getLampadas(){
        ArrayList<Lampada> aux = new ArrayList<>();
        for(Lampada l : this.lampadas){
            aux.add(l.clone());
        }
        return aux;
    }
    
    //adciona mais uma lampada à casa
    public void addLampada(Lampada l){
        this.lampadas.add(l.clone());
    }
    
    //liga no modo de consumo maximo a lampada que esta na posiçao indicada
    public void ligaLampadaNormal(int index){
        this.lampadas.get(index).lampON(); 
        //devolve a lampada que esta na posiçao index e aplica a funçao LampON a essa lampada
    }
    
    //liga no modo de consumo economico a lampada que esta na posiçao indicada
    public void ligaLampadaEco(int index){
        this.lampadas.get(index).lampECO();
        //devolve a lampada que esta na posiçao index e aplica a funçao LampECO a essa lampada
    }
    
    //determina quantas lampadas estao ligadas em modo economico
    public int qtEmEco(){
        int qt =0;
        for(Lampada l : this.lampadas){
            if(l.getModo() == 2){
                qt++;
            }
        }
        return qt;
    }
    
    //determina quantas lampadas estao ligadas em modo economico com iteradores externos
    public int qtEmEcoIt(){
        int qt =0;
        Iterator<Lampada> it = this.lampadas.iterator();
        while(it.hasNext()){
            Lampada l = it.next();
            if(l.getModo() == 2){
                qt++;
            }
        }
        return qt;
    }
    
    //determina quantas lampadas estao ligadas em modo economico com iteradores internos
    public int qtEmEcoStreams(){
        return (int) this.lampadas.stream()
                                  .filter(l -> l.getModo() ==2)
                                  .count();
    }
    
    //remove a lampada da posicao passada como parametro
    public void removeLampada(int index){
        this.lampadas.remove(index);
    }
    
    //liga todas as lampadas da casa respetivamente em modo consumo economico 
    public void ligaTodasEco(){
        this.lampadas.stream()
                     .forEach(l -> l.lampECO()); 
    }
    
    //liga todas as lampadas da casa respetivamente em modo consumo maximo 
    public void ligaTodasMax(){
        this.lampadas.stream()
                     .forEach(l -> l.lampON()); 
    }
    
    //determina o consumo total da casa
    public long consumoTotal(){
       return this.lampadas.stream()
                  .mapToLong(Lampada::getTotal)
                  .sum();
    }
    
    //efetua reset do contador parcial de consumo em todas as lampadas
    public void reset(){
        
    }
    
    public boolean equals (Object o){
        if(o==this) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        CasaInteligente ci = (CasaInteligente) o;
        return this.nome.equals(ci.getNome()) && 
               this.lampadas.equals(ci.getLampadas());
    }     
}
