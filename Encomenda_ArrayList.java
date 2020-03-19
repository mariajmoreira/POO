
/**
 * Escreva a descrição da classe Encomenda_ArrayList aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.time.LocalDate;
import java.util.ArrayList;
public class Encomenda_ArrayList
{
    private String nome;
    private String nfc;
    private String morada;
    private int numEnc;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> linhas;
    
    public Encomenda_ArrayList(){
        this.nome = new String();
        this.nfc = new String();
        this.morada= new String();
        this.numEnc= 0;
        this.data=LocalDate.now();
        this.linhas= new ArrayList<LinhaEncomenda>();
    }
    
    public Encomenda_ArrayList(String n, String f, String m, int num,ArrayList<LinhaEncomenda> encs){
        this.nome = n;
        this.nfc = f;
        this.morada= m;
        this.numEnc= num;
        this.data=LocalDate.now();
        this.linhas=new ArrayList<>();
        for(LinhaEncomenda s : encs){
        this.linhas.add(s);
        }
    }
    
    public Encomenda_ArrayList( Encomenda_ArrayList e){
        this.nome = e.getNome();
        this.nfc = e.getNfc();
        this.morada = e.getMorada();
        this.numEnc = e.getNumEnc();
        this.data = LocalDate.now();
        this.setLinhas(e.getLinhas()); 
    }
    
    public ArrayList<LinhaEncomenda> getLinhas(){
        ArrayList<LinhaEncomenda> aux = new ArrayList<>();
        for( LinhaEncomenda s : this.linhas){
            aux.add(s);
        }
        return aux;
    }
    
    public void setLinhas(ArrayList<LinhaEncomenda> enc){
       this.linhas= new ArrayList<>();
       for(LinhaEncomenda s : enc){
           this.linhas.add(s);
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getNfc(){
        return this.nfc;
    }
    
    public String getMorada(){
        return this.morada;
    }
    
    public int getNumEnc(){
        return this.numEnc;
    }
    
    public double calculaValorTotal(){
        double valor=0;
        for(int i=0; i<linhas.size();i++){
        valor += linhas.get(i).calculaValorLinhaEnc();
     }
        return valor;
    }
    
    public double calculaValorDesconto(){
        double valor=0;
        for(int i=0; i<linhas.size();i++){
        valor += linhas.get(i).calculaValorDesconto();
     }
        return valor;
    }
    
    public int numeroTotalProdutos(){
        int numeroProdutos = this.linhas.size();
        return numeroProdutos;
    }
    
    public boolean existeProdutoEncomenda(String refProduto){
        return this.linhas.contains(refProduto);
    }
    
    public void adicionaLinha (LinhaEncomenda l){
        this.linhas.add(l);
    }
    
    public void removeProduto(String codProd){
        for(int i=0; i<linhas.size();i++){
         if (codProd == linhas.get(i).toString()){
             this.linhas.remove(i);
            }
        }
    }
    
    public String toString(){
        return "Enc: " + this.nome + "\n nif: " + this.nfc;
    }
    
    public boolean equals (Object o){
        if(o==this) return true;
        if(o==null || o.getClass() != this.getClass()) return false;
        Encomenda_ArrayList e = (Encomenda_ArrayList) o;
        return this.nome.equals(e.getNome()) && this.nfc.equals(e.getNfc());
     }
}
