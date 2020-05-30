import java.io.IOException;
import java.util.*;
public class TesteTurmaAlunos
{
    public static void main (String[] opts){
        Aluno a1 = new Aluno("1","Ze",Arrays.asList(1.0,2.0,3.0));
        Aluno a2 = new Aluno("2","Ana",Arrays.asList(1.0,2.0,3.0));
        Aluno a3 = new Aluno("3","To",Arrays.asList(1.0,2.0,3.0));
        TrabalhadorEstudante a4 = new TrabalhadorEstudante("4","Simao",Arrays.asList(1.0,2.0,3.0),"DIUM");

        TurmaAlunos t = new TurmaAlunos();

        String[] ops = {"A", "B", "C"};
        Menu m = new Menu(ops);
        int op;

        m.executa();
        op = m.getOpcao();

        System.out.println("Opcao lida: " + op);
        switch (op){
            case 1:
                System.out.println("Opcao A...");
                break;
            case 2:
                System.out.println("Opcao B...");
                break;
            case 3:
                System.out.println("Opcao C...");
                break;
            default:
                System.out.println("bla bla");

        }

        try {
            t.removeAluno("5");
            t.insereAluno(a1);
            t.insereAluno(a2);
            t.insereAluno(a3);
            t.insereAluno(a4);
        } catch(ExisteAlunoException e){
            System.out.println("O aluno" + e.getMessage() + "ja existe ");
        }
        catch(NaoExisteAlunoException e){
            System.out.println("O aluno" + e.getMessage() + "não existe ");
        }

        System.out.println("Ordem coleçao");
        System.out.println(t.toString());

        Set<String> st = t.todosOsCodigos();
        st.remove("2");

        System.out.println("Ordem coleçao");
        System.out.println(t.alunosOrdemAlfabetica());

        System.out.println("Ordem coleçao");
        System.out.println(t.alunosOrdemDecrescenteNumero());
    }

    try{
        t.gravaObj("PL6.obj");
}
    catch(IOException e){
    System.out.println("O aluno" + e.getMessage() + "ja existe ");
}
    TurmaAlunos t2 = new TurmaAlunos();
    try{
        t2=t2.lerObj("PL6.obj");
}
}
