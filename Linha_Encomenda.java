
/**
 * Escreva a descrição da classe Linha_Encomenda aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Linha_Encomenda
{
    private String nome;
    private String desc;
    private double preco ;
    private double qtd;
    private double taxa;
    private double desconto;
    
    public Linha_Encomenda(){
        this.nome =" ";
        this.desc = new String();
        this.preco= 0.0;
        this.qtd= 0.0;
        this.taxa= 0.0;
        this.desconto= 0.0;
    }
    
    public Linha_Encomenda(String n, String d, double p, double q, double t, double i){
        this.nome= n;
        this.desc= d;
        this.preco= p;
        this.qtd= q;
        this.taxa= t;
        this.desconto= i;
    }
    
    public Linha_Encomenda(Linha_Encomenda e){
        this.nome =e.getNome();
        this.desc = e.getDesc();
        this.preco= e.getPreco();
        this.qtd= e.getQtd();
        this.taxa= e.getTaxa();
        this.desconto= e.getDesconto();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public double getQtd(){
        return this.qtd;
    }
    
    public double getTaxa(){
        return this.taxa;
    }
    
    public double getDesconto(){
        return this.desconto;
    }
    
    public void setNome(String newNome){
        this.nome=newNome;
    }
    
    public Linha_Encomenda clone() {
    return new Linha_Encomenda(this);    
  }    
  
  public double calculaValorLinhaEnc(){
        double valor = this.qtd * this.preco;
        valor = valor + ((100-this.desconto)/100);
        return valor;
    }
}





