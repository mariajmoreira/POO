
/**
 * Escreva a descrição da classe TesteDriveIt aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class TesteDriveIt
{
    public static void main (String[] opts){
    Veiculo v1 = new VeiculoNormal("00AA00","Renault", "Zoe",2015,120,2.2,200,5,6,2);
    VeiculoOcasiao v2 = new VeiculoOcasiao("OO00AD","Mercedes","ZZZ",2015,120,2.2,200,6,6,2,false);
    AutocarroInteligente v3 = new AutocarroInteligente("OO00AD","Mercedes","ZZZ",2015,120,2.2,200,7,6,2,100,85);
    
    DriveIt di = new DriveIt();
    
    di.adiciona(v1);
    di.adiciona(v2);
    di.adiciona(v3);
    /*
    System.out.println(di.toString());
    
    di.entraEmPromocao();
    
    System.out.println(di.toString());
    
    System.out.println(di.existeVeiculo("00AA00"));
    
    System.out.println(di.quantos());
    
    System.out.println(di.quantos("Renault"));
    
    System.out.println(di.getVeiculos());
    
    di.registarAluguer("00AA00",5);
    System.out.println(di.toString());
    
    di.registarAluguer("00AA00",6);
    System.out.println(di.toString());
    
    System.out.println(di.custoRealKm("00AA00"));
    */
  
  System.out.println(di.ordenarVeiculos(new ComparatorKmsFeitos()));
}
}
