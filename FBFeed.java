
/**
 * Escreva a descrição da classe FBFeed aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDateTime;

public class FBFeed
{
 private List<FBPost> posts;
 
 public FBFeed(){
    this.posts = new ArrayList<>();  
    }
    
 public FBFeed(List<FBPost> p){
    setPosts(p); 
    }
    
 public FBFeed( FBFeed f){
    setPosts(f.getPosts());   
    } 
    
 public List<FBPost> getPosts(){
        ArrayList<FBPost> aux = new ArrayList<>();
        for(FBPost l : this.posts){
            aux.add(l.clone());
        }
        return aux;
    }
    
 public void setPosts (List<FBPost> p){
        this.posts = new ArrayList<>();
        for(FBPost c : p){
            this.posts.add(c.clone());
        }
    }
    
 //determinar o numero de posts de um user
 public int nrPosts (String user){
     return (int) this.posts.stream()
                            .filter(l -> l.getNome() ==user)
                            .count();
    }
 //determinar a lista de posts de um user
 public List<FBPost> postsOf(String user){
     return (ArrayList<FBPost>) this.posts.stream()
                                          .filter(l -> l.getNome()==user); 
    }
 //determinar a lista de posts de um user num determinado intervalo de tempo
 public List<FBPost> postsOf(String user, LocalDateTime inicio, LocalDateTime fim){
     return (ArrayList<FBPost>) this.posts.stream()
                                          .filter(l -> (l.getNome()==user && l.getData().isAfter(inicio) && l.getData().isBefore(fim)));
    }
 //obter um post dado o seu identificador
 public FBPost getPost(int id){
     return (FBPost) this.posts.stream()
                               .filter(l -> l.getIdentificador()==id);
    }
 //inserir um comentario num post
 public void comment(FBPost post, String comentario){
     post.getComentarios().add(comentario);
    }
 //inserir um comentario num post
 public void comment(int postid, String comentario){
        Iterator<FBPost> it = this.posts.iterator();
        while(it.hasNext()){
            FBPost l = it.next();
            if(l.getIdentificador() == postid){
                l.getComentarios().add(comentario);
            }
        }
    }
 //adicionar um like a um post
 public void like(FBPost post){
     int i = (post.getLikes())+1;
     post.setLikes(i);
    }
 //adicionar um like a um post
 public void like(int postid){
     Iterator<FBPost> it = this.posts.iterator();
        while(it.hasNext()){
            FBPost l = it.next();
            if(l.getIdentificador() == postid){
                int i = (l.getLikes())+1;
                l.setLikes(i);
            }
        }
    }
    
 //determinar a lista de 5 posts com mi+ais comentarios
 public List<Integer> top5comments(){
     ArrayList<Integer> aux = new ArrayList<>();
        for(FBPost l : this.posts){
            aux.add(l.getComentarios().size());
        }
     Iterator<FBPost> it = this.posts.iterator();
        while(it.hasNext()){
            FBPost l = it.next();
            if(l.getIdentificador() == postid){
                l.getComentarios().add(comentario);
            }
        }
    }
}
