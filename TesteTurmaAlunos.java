
/**
 * Escreva a descrição da classe TesteTurmaAluno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Set;
public class TesteTurmaAlunos
{
    public static void main (String[] opts){
        Aluno a1 = new Aluno("1","Ze");
        Aluno a2 = new Aluno("2","Ana");
        Aluno a3 = new Aluno("3","To");
        TrabalhadorEstudante a4 = new TrabalhadorEstudante("4","Simao","DIUM");
        
        TurmaAlunos t = new TurmaAlunos();
        
        t.insereAluno(a1);
        t.insereAluno(a2);
        t.insereAluno(a3);
        t.insereAluno(a4);
        
        System.out.println("Ordem coleçao");
        System.out.println(t.toString());
        
        Set<String> st = t.todosOsCodigos();
        st.remove("2");
        
        System.out.println("Ordem coleçao");
        System.out.println(t.alunosOrdemAlfabetica());
        
        System.out.println("Ordem coleçao");
        System.out.println(t.alunosOrdemDecrescenteNumero());
    }
}
