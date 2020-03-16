
/**
 * Escreva a descrição da classe TesteFicha2Ex2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Arrays;
import java.util.Scanner;
public class TesteFicha2Ex2
{
   public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Ficha2Ex2 f = new Ficha2Ex2();
        
        int[][] notasTurma = new int[5][6];
        int [][] matriz = {{0,10,10,11,12,8100},
                          {10,10,10,12,0,8200},
                          {11,11,14,14,16,8300},
                          {12,10,11,10,0,8400},
                          {16,16,18,17,19,8500}};
      
        
        //EXERCICIO 2 a)
        /*for(int i=0; i<5;i++){
            System.out.println ("Insira o nº do aluno.");
            int aluno = sc.nextInt();
            notasTurma[i][5]= aluno;
            for(int j=0; j<5; j++){
        System.out.println ("Insira as notas do aluno " + aluno);
        int nota = sc.nextInt();
        notasTurma [i][j] = nota; 
    }
}
       for(int i=0;i<5;i++){
           for(int j=0;j<6;j++){
               System.out.println (notasTurma[i][j] + " ");
            }
            System.out.println ();
        }
  */
        //EXERCICIO 2 b)
        System.out.println ("Insira a Unidade Curricular que deseja somar");
        int uc = sc.nextInt();
        int resultadoSoma = f.somaNotasEx2b(matriz, uc);
        System.out.println ("A soma das nota da unidade curricular" + uc + " é: " + resultadoSoma);
        
        //EXERCICIO 2 c)
        System.out.println ("Insira o aluno");
        int al = sc.nextInt();
        float resultadoMedia = f.mediaNotasEx2c(matriz, al);
        System.out.println ("A media das notas do aluno " + al + " é: " + resultadoMedia);
        
        //EXERCICIO 2 d)
        System.out.println ("Insira a UC");
        int unc = sc.nextInt();
        float resultadoUCMedia = f.mediaucNotasEx2d(matriz, unc);
        System.out.println ("A media das notas da UC " + unc + " é: " + resultadoUCMedia);
        
        //EXERCICIO 2 e)
        int j=1;
        for(int i=0; i<5; i++){
            int resultadoNotaMaisAlta = f.notaMaisAltaEx2e(matriz, i);
            System.out.println ("A nota mais alta da UC " + j + " é: " + resultadoNotaMaisAlta);
            j++;
        }
        
        //EXERCICIO 2 f)
         int n=1;
        for(int i=0; i<5; i++){
            int resultadoNotaMaisBaixa = f.notaMaisBaixaEx2f(matriz, i);
            System.out.println ("A nota mais baixa da UC " + n + " é: " + resultadoNotaMaisBaixa);
            n++;
        }
        
        //EXERCICIO 2 g)
        System.out.println ("Determinar notas acima de:");
        int notaLimite = sc.nextInt();
        int [] resultadoNotasAcima = new int[25];
        resultadoNotasAcima = f.notasAcimaEx2g(matriz, notaLimite);
        System.out.println ("As notas acima de " + notaLimite + " são: ");
        for(int i=0; i<24; i++){
            System.out.println (resultadoNotasAcima[i]);
        }
        
        //EXERCICIO 2 f)
        System.out.println ("a representaçao em string é:");
        System.out.println (Arrays.deepToString(matriz));
        
        //EXERCICIO 2 i)
        int indice = f.indiceEx2i(matriz);
        System.out.println ("o índice da unidade curricular com a média mais elevada é " + indice);
    }
    
    
}

