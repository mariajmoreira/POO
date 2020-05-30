import java.util.*;
public class TrabalhadorEstudante extends Aluno
{
    private String empresa;

    public TrabalhadorEstudante(){
        super(); //invoca o construtor por omissao da superclasse aluno
        this.empresa = new String();
    }

    public TrabalhadorEstudante(String num, String nome,List<Double> nts, String emp){
        super(num,nome,nts); //invoca o construtor parametrizado da superclasse aluno
        this.empresa=emp;
    }

    public TrabalhadorEstudante(TrabalhadorEstudante te){
        super(te);
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

