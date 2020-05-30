import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Aluno implements Comparable<Aluno>, Notas, Serializable
{
    private String numero;
    private String nome;
    private List<Double> notas;


    public Aluno()
    { this.numero = new String();
        this.nome = new String();
    }

    public Aluno (String num, String nom, List<Double> nts)
    { this.numero = num;
        this.nome = nom;
        this.notas=nts;
    }

    public Aluno (Aluno al)
    { this.numero = al.getNumero();
        this.nome = al.getNome();
        this.notas = al.getNotas();
    }

    public String getNome()
    { return this.nome; }

    public String getNumero()
    { return this.numero; }

    public List<Double> getNotas(){
        return new ArrayList<>(this.notas);
    }


    public String toString()
    { StringBuilder sb = new StringBuilder();
        sb.append("Aluno: ").append(this.numero).append(" , ")
                .append(this.nome).append("\n");
        return sb.toString();
    }

    public boolean equals (Object o)
    { if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Aluno a = (Aluno) o;
        return this.numero.equals(a.getNumero()) &&
                this.nome.equals(a.getNome());
    }

    public Aluno clone()
    { return new Aluno(this); }

    public int compareTo(Aluno a)
    { return this.nome.compareTo(a.getNome());
    }

    public double mediaNotas(){
        double res = 0;
        for(double d : this.notas)
            res+=d;
        res /= this.notas.size();
        return res;
    }

}
