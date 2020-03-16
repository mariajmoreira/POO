
/**
 * Escreva a descrição da classe Ficha2Ex2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Ficha2Ex2
{
    //notas = int[i][j]
    // nota do aluno 1 na unidade curricular 1 = int[1][1]
    
    public int somaNotasEx2b (int[][] a, int uc){
        int soma=0;
        for(int i=0; i<5; i++){
            soma+=a[i][uc];
        }
        return soma;
    }
    
    public float mediaNotasEx2c (int[][] a, int aluno){
        int soma=0;
        for(int i=0; i<5; i++){
            soma+=a[aluno][i];
        }
        float media = (soma/5);
        return media;
    }
    
    public float mediaucNotasEx2d (int[][] a, int uc){
        float soma=0;
        for(int i=0; i<5; i++){
            soma+=a[i][uc];
        }
        float media = (soma/5);
        return media;
    }
    
    public int notaMaisAltaEx2e (int[][] a, int i){
        int nota=0;
        for(int j=0; j<5; j++){
            if (a[j][i] >= nota){
                    nota = a[j][i];
                }
            }
        return nota;
    }
    
    public int notaMaisBaixaEx2f (int[][] a, int n){
        int nota=20;
        for(int j=0; j<5; j++){
            if (a[j][n] <= nota){
                    nota = a[j][n];
                }
            }
        return nota;
    }
    
    public int[] notasAcimaEx2g (int[][] a, int n){
        int[] arrayNotas = new int[25];
        int y=0;
        for(int i=0; i<5;i++){
            for(int j=0;j<5;j++){
            if(a[j][i] > n){
                arrayNotas[y]=a[j][i];
                y++;
            }
        }
        }
        return arrayNotas;
    }
    
    //public int[] stringEx2h (int[][] a){
       
    public int indiceEx2i (int[][] a){
        float n=0;
        int indice=0;
        for(int j=0; j<5;j++){
            if(mediaucNotasEx2d(a,j) > n){
                n=mediaucNotasEx2d(a,j);
                indice=j;
            }
        }
        return indice;
    }
}
