
/**
 * Escreva a descrição da classe Ficha3Ex1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Circulo{
    //FICHA 3 EXERCICIO 1
    //definir variaveis de instancia
    private double x;
    private double y;
    private double raio;
    
    //construtor por defeito
    public Circulo(){
        this.x=0.0;
        this.y=0.0;
        this.raio=0.0;
    }
    
    //construtor parametrizado
    public Circulo(double x, double y, double raio){
        this.x=x;
        this.y=y;
        this.raio=raio;
    }
    
    public Circulo(Circulo c){
        this.x= c.getX();
        this.y= c.getY();
        this.raio= c.getRaio();
    }
    
    //definir metodos get
    //EXERCICIO 1 A)
    public double getX(){
        return this.x;
    }
    //EXERCICIO 1 B)
    public double getY(){
        return this.y;
    }
    //EXERCICIO 1 C)
    public double getRaio(){
        return this.raio;
    }
    
    //EXERCICIO 1 D)
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    //EXERCICIO 1 E)
    public void alteraCentro(double x, double y){
        setX(x);
        setY(y);
    }
    
    //EXERCICIO 1 f)
    public double calculaArea(){
        return ((Math.pow(this.raio,2))*(Math.PI));
    }
    
    //EXERCICIO 1 g)
    public double calculaPerimetro(){
        return ((2*(Math.PI)*this.raio));
    }
}
