
/**
 * Escreva a descrição da classe TrabalhadorEstudante aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class TrabalhadorEstudante extends Aluno
{
    private String empresa;
    
    public TrabalhadorEstudante(){
        super(); //invoca o construtor por omissao da superclasse aluno 
        this.empresa = new String();
    }
    
    public TrabalhadorEstudante(String num, String nome, String emp){
        super(num,nome); //invoca o construtor parametrizado da superclasse aluno
        this.empresa=emp;
    }
    
    public TrabalhadorEstudante(TrabalhadorEstudante te){
        super(te.getNumero(), te.getNome());
        this.empresa = te.getEmpresa();
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Empresa:").append(this.empresa).append("\n");
        return sb.toString();
    }
    
    public String getEmpresa(){
        return this.empresa;
    }
    
    public TrabalhadorEstudante clone(){
        return new TrabalhadorEstudante(this);
    }
}
