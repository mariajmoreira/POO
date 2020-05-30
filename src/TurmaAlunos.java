import java.io.IOException;
import java.io.ObjectOutput;
import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
//maps nao tem nocao de ordem
public class TurmaAlunos implements Notas, Serializable
{
    private String nome;
    private String codigo;
    private Map<String,Aluno> alunos;

    public TurmaAlunos(){
        this.nome = new String();
        this.codigo = new String();
        this.alunos = new HashMap<>();
    }

    public TurmaAlunos(String n, String c, Map<String,Aluno> als){
        this.nome = n; //strings garantem o encapsulamento logo nao precisamos de fazer clones
        this.codigo = c;
        setAlunos(als);
    }

    public TurmaAlunos(TurmaAlunos t){
        this.nome = t.getNome();
        this.codigo = t.getCodigo();
        setAlunos(t.getAlunos());
    }

    public String getNome(){
        return this.nome;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public Map<String,Aluno> getAlunos(){
        Map<String,Aluno> aux = new HashMap<>();
        //percorrer todos os elementos que estao no Map<String,Aluno> alunos
        //os elemntos do Map sao pares
        //entrySet devolve um par
        for(Map.Entry<String,Aluno> e : this.alunos.entrySet()){
            //e.getKey nao precisa de clone porque é string
            //e.getValue precisa de clone pois é do tipo Aluno
            aux.put(e.getKey(),e.getValue().clone());
        }
        return aux;
    }

    public void setAlunos(Map<String,Aluno> als){
        this.alunos = new HashMap<>();
        // e é um par <String,Aluno> resultante de cada entrySet
        als.entrySet().forEach(e -> this.alunos.put(e.getKey(), e.getValue().clone()));
    }

    public int compareTo(TurmaAlunos t){
        return this.nome.compareTo(t.getNome());
    }

    public void insereAluno(Aluno a) throws ExisteAlunoException{
        if(this.alunos.containsKey(a.getNumero()))
            throw new ExisteAlunoException(a.getNumero());
        else
        this.alunos.put(a.getNumero(), a.clone());
    }

    public Aluno getAluno (String codAluno){
        return this.alunos.get(codAluno).clone();
    }

    public void removeAluno(String codAluno) throws NaoExisteAlunoException{
        if(this.alunos.containsKey(codAluno))
            this.alunos.remove(codAluno);
        else
            throw new NaoExisteAlunoException(codAluno);
    }

    public Set<String> todosOsCodigos(){
        return new TreeSet(this.alunos.keySet());
    }

    public int qtsAlunos(){
        return this.alunos.size();
    }

    public Set<Aluno> alunosOrdemAlfabetica(){
        Set<Aluno> s = new TreeSet<>();
        for(Aluno a : this.alunos.values()){
            s.add(a.clone());
        }
        return s;
    }

    public Set<Aluno> alunosOrdemAlfabetica_ComStreams(){
        //transforma numa stream
        return this.alunos.values().stream()
                //cria clones de todos os elementos da stream
                .map(a -> a.clone())
                //passa os clones para um TreeSet
                .collect(Collectors.toCollection(TreeSet :: new));
    }

    public Set<Aluno> alunosOrdemDecrescenteNumero(){
        //sempre que inserirmos um elemento no TreeSet vai ser comparado
        //atraves de ComparatorAlunoNumero para ser ordenado consoante o numero do aluno
        Set<Aluno> s = new TreeSet<>( new ComparatorAlunoNumero());
        for(Aluno a : this.alunos.values()){
            s.add(a.clone());
        }
        return s;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Turma:\n").append(this.nome).append("\n")
                .append(this.codigo).append("\n")
                .append(this.alunos);
        return sb.toString();
    }

    public TurmaAlunos clone(){
        return new TurmaAlunos(this);
    }

    public boolean equals (Object o) {
        if(o==this) return true;
        if(o==null || o.getClass() != this.getClass()) return false;
        TurmaAlunos t = (TurmaAlunos) o;
        return this.nome.equals(t.getNome()) &&
                this.codigo.equals(t.getCodigo()) &&
                this.alunos.equals(t.getAlunos());
    }

    public double mediaNotas(){
        return this.alunos.values().stream()
                                   .mapToDouble(a -> a.mediaNotas())
                                   .average().orElse(0.0);
    }

    //grava em ficheiro txt
    public void gravaTxt(String filename) throws IOException {
        PrintWriter pw = new PrintWriter(filename);
        pw.print(this);
        pw.flush();
        pw.close();
    }

    //grava em ficheiro binario
    public void gravaObj(String filename) throws IOException{
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(filename));
        o.writeObject(this);
        o.flush();
        o.close();
    }

    public TurmaAlunos lerObj(String filename) throws  IOException, ClassNotFoundException{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(filename));
        TurmaAlunos t = (TurmaAlunos) o.readObject();
        o.close();
        return t;
    }
}

