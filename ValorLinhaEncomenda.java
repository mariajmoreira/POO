
/**
 * Escreva a descrição da classe ValorLinhaEncomenda aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class ValorLinhaEncomenda
{
    private Linha_Encomenda e;
    
    public double calculaValorLinhaEnc(){
        double valor = quantidade * preco;
        valor = valor + ((100-desconto)/100);
        return valor;
    }
}
