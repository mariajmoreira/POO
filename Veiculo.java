
/**
 /**
 * Escreva a descrição da classe Veiculo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public abstract class Veiculo implements Comparable<Veiculo>
{
   private String id;
   private String marca;
   private String modelo;
   private int ano;
   private float velocidade;
   private double preco_km;
   private int classificacao;
   private int kms;
   private int nrUtilizadores;
   private int media;
    
   /**
    * Construtor por omissao
    */
   public Veiculo(){
       this.id = "n/a";
       this.marca = "Sem Marca";
       this.modelo = "Sem Modelo";
       this.ano = 2020;
       this.velocidade = 0;
       this.preco_km = 0.0;
       this.classificacao = 0;
       this.kms = 0;
       this.nrUtilizadores = 0;
       this.media = 0;
   }
   /**
    * Construtor parametrizado
    */
   public Veiculo(String id, String ma, String mo, int ano, float velo, double preco, int classificacao, int kms, int nrUtilizadores, int media){
       this.id = id;
       this.marca = ma;
       this.modelo = mo;
       this.ano = ano;
       this.velocidade = velo;
       this.preco_km = preco;
       this.classificacao = classificacao;
       this.kms = kms;
       this.nrUtilizadores = nrUtilizadores;
       this.media = media;
   }
   /**
    * Construtor copia
    */
   public Veiculo(Veiculo v){
       this.id = v.getId();
       this.marca = v.getMarca();
       this.modelo = v.getModelo();
       this.ano = v.getAno();
       this.velocidade = v.getVelo();
       this.preco_km = v.getPrecoTeorico();
       this.classificacao = v.getClassificacao();
       this.kms = v.getKms();
       this.nrUtilizadores = v.getNrUtilizadores();
       this.media = v.getMedia();
   }
   /**
    * Devolve a String com a identificacao do carro
    */
   public String getId(){
       return this.id;
   }
   /**
    * Devolve a String com a marca do carro
    */
   public String getMarca(){
       return this.marca;
   }
   /**
    * Devolve a String com o modelo do carro
    */
   public String getModelo(){
       return this.modelo;
   }
   /**
    * Devolve o int com ano de construçao do carro
    */
   public int getAno(){
       return this.ano;
   }
   /**
    * Devolve a float comvelocidade media por km do carro
    */
   public float getVelo(){
       return this.velocidade;
   }
   /**
    * Devolve o double com o preço teorico base por km do carro
    */
   public double getPrecoTeorico(){
       return this.preco_km;
   }
   /**
    * Devolve o int com a classificacao do carro
    */
   public int getClassificacao(){
       return this.classificacao;
   }
   /**
    * Devolve o int com o numero de kilometros do carro
    */
   public int getKms(){
       return this.kms;
   }
   /**
    * Devolve o int com o numero de utilizadores do carro
    */
   public int getNrUtilizadores(){
       return this.nrUtilizadores;
   }
   /**
    * Devolve o int com a media das classificaçoes do carro
    */
   public int getMedia(){
       return this.media;
   }
   /**
     * Altera a matricula(id) do carro
     */
   public void setId(String n_id){
       this.id = n_id;
   }
   /**
     * Altera a marca do carro
     */
   public void setMarca(String n_marca){
       this.marca = n_marca;
   }
   /**
    * Altera o modelo do carro
    */
   public void setModelo(String n_modelo){
       this.modelo = n_modelo;
   }
   /**
     * Altera o ano de construçao do carro
     */
   public void setAno(int n_ano){
       this.ano = n_ano;
   }
   /**
    * Altera a velocidade media por km do carro
    */
   public void setVelo(float n_velocidade){
       this.velocidade = n_velocidade;
   }
   /**
     * Altera o preco teorico base por km do carro
     */
   public void setPreco(double n_preco){
       this.preco_km = n_preco;
   }
   /**
    * Altera a classificaçao do carro
    */
   public void setClassificacao(int n_classificacao){
       this.classificacao = n_classificacao;
   }
   /**
    * Altera o numero de kilometros do carro
    */
   public void setKms(int n_kms){
       this.kms = n_kms;
   }
   /**
    * Altera o numero de utilizadores do carro
    */
   public void setNrUtilizadores(int n_nrUtilizadores){
       this.nrUtilizadores = n_nrUtilizadores;
   }
   /**
    * Altera a media das classificaçoes do carro
    */
   public void setMedia(int n_media){
       this.media = n_media;
   }
   
   /**
    * Passa um objeto Veiculo para String
    */
   public String toString(){
       return "Matricula do carro: " + this.id +  
              "\nMarca do carro: " + this.marca +
              "\nModelo do carro: " + this.modelo +
              "\nAno de construçao: " + this.ano +
              "\nVelocidade media por km " + this.velocidade +
              "\nPreço teorico base por km: " + this.preco_km + 
              "\nClassificacao: " + this.classificacao + 
              "\nNumero de kms do carro: " + this.kms + 
              "\nNumero de utilizadores do carro: " + this.nrUtilizadores +
              "\nMedia das classificaçoes do carro:" + this.media;
   }
   /**
    * Metodo que verifica se dois Veiculos sao iguais
    */
   public boolean equals(Object o){
      if(this == o)
           return true;
      if ((o == null) || (this.getClass() != o.getClass()))
           return false;
      Veiculo umVeiculo = (Veiculo) o;
      return (this.id.equals(umVeiculo.getId())) && (this.marca.equals(umVeiculo.getMarca()) && this.modelo.equals(umVeiculo.getModelo()));
   } 
   
   /**
    * Metodo que faz uma copia do objeto receptor da mensagem.
    */
   public abstract Veiculo clone();
   public abstract double custoRealKm();
   
   public int compareTo(Veiculo v){
       if (this.marca.equals(v.getMarca())) 
           return this.modelo.compareTo(v.getModelo());
       return this.marca.compareTo(v.getMarca());
    }
}
