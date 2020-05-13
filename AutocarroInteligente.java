
/**
 * Escreva a descrição da classe AutocarroInteligente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AutocarroInteligente extends Veiculo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int capacidade ;
    private int lugares_ocupados ;
    
    public AutocarroInteligente(){
        super();
        this.capacidade = 0;
        this.lugares_ocupados = 0;
    }
    
    public AutocarroInteligente(String id, String ma, String mo, int ano, float velo, 
    double preco, int classificacao, int kms, int nrUtilizadores, int media, int t,int l){
        super(id, ma, mo, ano, velo, preco, classificacao, kms, nrUtilizadores, media);
        this.capacidade=t;
        this.lugares_ocupados =l;
    }
    
    public AutocarroInteligente(AutocarroInteligente v){
        super(v);
        this.capacidade = v.getCapacidade();
        this.lugares_ocupados = v.getLugaresOcupados();
    }
    
    
    public int getCapacidade(){
        return this.capacidade;
    }
    
    public int getLugaresOcupados(){
        return this.lugares_ocupados;
    }
    
    public void setCapacidade(int t){
        this.capacidade = t;
    }
    
    public double calculaOcupacao(){
        return (this.lugares_ocupados / this.capacidade) * 100; //percentagem de ocupaçao
    }
    
    public double custoReal(){
        return 1.10 * getKms() * getPrecoTeorico();
    }
    
    public double custoRealKm(double ocupacao){
      if(ocupacao < 60) {
          return (custoReal())*0.50;
        } else {
           return (custoReal())*0.75; 
        }
    }
    
    public double custoRealKm(){
      if(calculaOcupacao() < 60) {
          return (custoReal())*0.50;
        } else {
           return (custoReal())*0.75; 
        }
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString()); 
        s.append("\n");
        s.append("Capacidade" + this.capacidade);
        return s.toString();
    }
    
    public AutocarroInteligente clone(){ 
        return new AutocarroInteligente(this);
    }

}
