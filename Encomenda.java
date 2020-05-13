
/**
 * Escreva a descrição da classe Encomenda aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.time.LocalDate;
public class Encomenda
{
    private String nome;
    private String nfc;
    private String morada;
    private int numEnc;
    private LocalDate data;
    private LinhaEncomenda[] linhas;
    private int linhasUsadas;
    
    public Encomenda(){
        this.nome = new String();
        this.nfc = new String();
        this.morada= new String();
        this.numEnc= 0;
        this.data=LocalDate.now();
        this.linhas= new LinhaEncomenda[0];
        this.linhasUsadas = 0;
    }
    
    public Encomenda(String n, String f, String m, int num, LinhaEncomenda[] l,int max){
        this.nome = n;
        this.nfc = f;
        this.morada= m;
        this.numEnc= num;
        this.data=LocalDate.now();
        this.linhas= new LinhaEncomenda[max];
        int i;
        for(i=0;i<l.length; i++){
            this.linhas[i]=l[i].clone();
            this.linhasUsadas=i;
        }
    }
    
    public Encomenda( Encomenda e){
        this.nome = e.getNome();
        this.nfc = e.getNfc();
        this.morada= e.getMorada();
        this.numEnc= e.getNumEnc();
        this.data=LocalDate.now();
        this.linhas= new LinhaEncomenda[0];
        this.linhasUsadas = 0;
    }
    
    public LinhaEncomenda [] getLinhas(){
        LinhaEncomenda [] aux = new LinhaEncomenda[linhasUsadas];
        for(int i=0;i<linhasUsadas; i++){
            aux[i]=this.linhas[i].clone();
            this.linhasUsadas=i;
        }
        return aux;
    }
    
    public void setLinhas(LinhaEncomenda [] enc){
       this.linhas= new LinhaEncomenda [enc.length];
       for(int i=0; i<enc.length; i++){
           this.linhas[i]=enc[i].clone();
           this.linhasUsadas=i;
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
        for(int i=0; i<linhasUsadas;i++){
            valor += linhas[i].calculaValorLinhaEnc();
        }
        return valor;
    }
    
    public void adicionaLinha (LinhaEncomenda l){
        this.linhas[this.linhasUsadas++] = l.clone();
    }
    
    public String toString(){
        return "Enc: " + this.nome + "\n nif: " + this.nfc;
    }
    
    public Encomenda clone(){
       return new Encomenda(this);
    }
    
    public boolean equals (Object o){
        if(o==this) return true;
        if(o==null || o.getClass() != this.getClass()) return false;
        Encomenda e = (Encomenda) o;
        return this.nome.equals(e.getNome()) && this.nfc.equals(e.getNfc());
     }
}
