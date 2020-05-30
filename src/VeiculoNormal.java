public class VeiculoNormal extends Veiculo
{

    public VeiculoNormal(){
        super();
    }

    public VeiculoNormal(String id, String ma, String mo, int ano, float velo,
                         double preco, int classificacao, int kms, int nrUtilizadores, int media){
        super(id, ma, mo, ano, velo, preco, classificacao, kms, nrUtilizadores, media);
    }

    public VeiculoNormal(VeiculoNormal v){
        super(v);
    }

    public double custoRealKm(){
        return 1.10 * getKms() * getPrecoTeorico();
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append("\n");
        return s.toString();
    }

    public VeiculoNormal clone(){
        return new VeiculoNormal(this);
    }
}