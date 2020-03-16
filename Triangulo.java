
/**
 * Escreva a descrição da classe TesteFicha3Ex1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Triangulo{
    //FICHA 3 EXERCICIO 9
    //definir variaveis de instancia
    private Ponto p1; //(0,0)
    private Ponto p2; //(1,1) 
    private Ponto p3; //(3,1)
    
    public Triangulo(){
        this.p1= new Ponto();
        this.p2= new Ponto();
        this.p3= new Ponto();
    }
    
    //criamos um clone do Ponto a,por exemplo, e guardamos essa copia na nossa variavel p1 de maneir a a nao poder ser ser alterada por alguem de fora
    public Triangulo(Ponto a, Ponto b, Ponto c){
        this.p1= a.clone();
        this.p2= b.clone();
        this.p3= c.clone();
    }
    
    //EXERCICIO 9 b)
    // (base * altura)/ 2
    //public double calculaAreaTriangulo(){
        
    //EXERCICIO 9 c)
    // p1 + p2 + p3
    public double calculaPerimetroTriangulo(Triangulo t){
        return (distancia(this.p1)+(this.p2)+(this.p3));
    } 
    //EXERCICIO 9 d)
    // distância no eixo dos y entre o ponto com menor coordenada em y e o ponto com maior coordenada.
    public double altura(Triangulo t){
        
    }
    
    
}
