

/**
 * Escreva a descrição da classe FBPost aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDateTime;

public class FBPost
{
    private int identificador;
    private String nome;
    private LocalDateTime instante;
    private String content;
    private int likes;
    private List<String> comentarios;
    
    public FBPost(){
        this.identificador=0;
        this.nome=new String();
        this.instante=LocalDateTime.now();
        this.content=new String();
        this.likes=0;
        this.comentarios=new ArrayList<>();  
    }
    
    public FBPost(int i, String n,String c, int l, List<String> cm){
        this.identificador=i;
        this.nome=n;
        this.instante=LocalDateTime.now();
        this.content=c;
        this.likes=l;
        setComentarios(cm);  
    }
    
    public FBPost( FBPost p){
        this.identificador=p.getIdentificador();
        this.nome=p.getNome();
        this.instante=LocalDateTime.now();
        this.content=p.getContent();
        this.likes=p.getLikes();
        setComentarios(p.getComentarios()); 
    }
    
    public int getIdentificador(){
        return this.identificador;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getContent(){
        return this.content;
    }
    
    public LocalDateTime getData(){
        return this.instante;
    }
    
    public int getLikes(){
        return this.likes;
    }
    
    public void setLikes(int l){
      this.likes = l;
    }
    
    public List<String> getComentarios(){
        ArrayList<String> aux = new ArrayList<>();
        for(String l : this.comentarios){
            aux.add(l);
        }
        return aux;
    }
    
    public void setComentarios (List<String> cm){
        this.comentarios = new ArrayList<>();
        for(String c : cm){
            this.comentarios.add(c);
        }
    }
    
    public FBPost clone(){
        return new FBPost(this);
    }
}
