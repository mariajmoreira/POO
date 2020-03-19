
/**
 * Escreva a descrição da classe Stack aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.ArrayList;

public class Stack
{
    //variavel de instancia:
   private ArrayList<String> nomes; 
   
   //construtor por defeito
   public Stack(){
       this.nomes = new ArrayList<String>(); 
    }
    
   //construtor parametrizado
   public Stack(ArrayList<String> cenas){
       this.setNomes(cenas); 
    }
    
   //construtor por copia
   public Stack(Stack st){
       this.setNomes(st.getNomes());
    }
    
   public void setNomes(ArrayList<String> cenas){
       this.nomes= new ArrayList<>();
       for(String s : cenas){
           this.nomes.add(s);
        }
    }
    
   public ArrayList<String> getNomes(){
        ArrayList<String> aux = new ArrayList<>();
        for( String s : this.nomes){
            aux.add(s);
        }
        return aux;
    }
   
   //metodo que diz se a stack esta vazia
   public boolean empty(){
        return this.nomes.isEmpty();
    }
   
   //tamanho da stack
   public int legth(){
       return this.nomes.size();
    }
   
   //insere no topo da stack
   public void push(String s){
       this.nomes.add(s);
    }
    
   //remove o elemento do topo da stack se esta nao estiver vazia
   public void pop(){
       this.nomes.remove(this.nomes.size()-1);
    }
    
   //determina o elemento no topo da stack
   public String top(){
       return this.nomes.get(this.nomes.size()-1);
    }
}
