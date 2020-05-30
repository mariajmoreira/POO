public class VeiculoPremium extends Veiculo implements BonificaKms
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double taxa_luxo ;
    private int pontos;

    public VeiculoPremium(){
        super();
        this.taxa_luxo = 0;
        this.pontos=0;
    }

    public VeiculoPremium(String id, String ma, String mo, int ano, float velo,
                          double preco, int classificacao, int kms, int nrUtilizadores, int media, double t,int p){
        super(id, ma, mo, ano, velo, preco, classificacao, kms, nrUtilizadores, media);
        this.taxa_luxo=t;
        this.pontos=p;
    }

    public VeiculoPremium(VeiculoPremium v){
        super(v);
        this.taxa_luxo = v.getTaxaLuxo();
        this.pontos=v.getPntsPorKm();
    }


    public double getTaxaLuxo(){
        return this.taxa_luxo;
    }


    public void setTaxaLuxo(double t){
        this.taxa_luxo = t;
    }

    public void setPontos(int t){
        this.pontos = t;
    }

    public int getPontos(){
        return this.pontos;
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
        s.append("Taxa de Luxo").append(this.taxa_luxo);
        s.append("\n");
        return s.toString();
    }

    public VeiculoPremium clone(){
        return new VeiculoPremium(this);
    }

    public void definirPtsPorKm(int pts){
        this.pontos=pts;
    }

    public int getPntsPorKm() {
        return this.pontos;
    }

}
