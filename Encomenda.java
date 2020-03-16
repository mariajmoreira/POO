
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
    private Linha_Encomenda[] linhas;
    private int linhasUsadas;
    
    public Encomenda(){
        this.nome = new String();
        this.nfc = new String();
        this.morada= new String();
        this.numEnc= 0;
        this.data=LocalDate.now();
        this.linhas= new Linha_Encomenda[0];
        this.linhasUsadas = 0;
    }
    
    public Encomenda(String n, String f, String m, int num, Linha_Encomenda[] l,int max){
        this.nome = n;
        this.nfc = f;
        this.morada= m;
        this.numEnc= num;
        this.data=LocalDate.now();
        this.linhas= new Linha_Encomenda[max];
        int i;
        for(i=0;i<l.length; i++){
            this.linhas[i]=l[i].clone();
            this.linhasUsadas=i;
        }
    }
    
    /*public Encomenda( Encomenda e){
        this.nome = e.getNome();
        this.nfc = e.getNfc();
        this.morada= e.getMorada();
        this.numEnc= e.getNumEnc;
        this.data=LocalDate.now();
        this.linhas= new Linha_Encomenda[0];
        this.linhasUsadas = 0;
    }*/
    
    public double calculaValorTotal(){
        double valor=0;
        for(int i=0; i<linhasUsadas;i++){
            valor += linhas[i].calculaValorLinhaEnc();
        }
        return valor;
    }
}
