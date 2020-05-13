
/**
 * Escreva a descrição da classe VeiculoPremium aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class VeiculoPremium extends Veiculo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int taxa_luxo ;
    
    public VeiculoPremium(){
        super();
        this.taxa_luxo = 0;
    }
    
    public VeiculoPremium(String id, String ma, String mo, int ano, float velo, 
    double preco, int classificacao, int kms, int nrUtilizadores, int media, int t){
        super(id, ma, mo, ano, velo, preco, classificacao, kms, nrUtilizadores, media);
        this.taxa_luxo=t;
    }
    
    public VeiculoPremium(VeiculoPremium v){
        super(v);
        this.taxa_luxo = v.getTaxaLuxo();
    }
    
    
    public int getTaxaLuxo(){
        return this.taxa_luxo;
    }
    
    public void setTaxaLuxo(int t){
        this.taxa_luxo = t;
    }
    
    public double getPrecoTeorico(){
       return super.getPrecoTeorico();
   }
    
    public double custoRealKm(){
        return (1 * this.taxa_luxo) * getPrecoTeorico();
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString()); 
        s.append("\n");
        s.append("Taxa de Luxo" + this.taxa_luxo);
        return s.toString();
    }
    
    public VeiculoPremium clone(){ 
        return new VeiculoPremium(this);
    }

}
