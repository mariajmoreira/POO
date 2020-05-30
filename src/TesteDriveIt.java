import java.io.IOException;

public class TesteDriveIt
{
    public static void main (String[] opts){
        Veiculo v1 = new VeiculoNormal("00AA00","Renault", "Zoe",2015,120,2.2,200,5,6,2);
        VeiculoOcasiao v2 = new VeiculoOcasiao("OO00AD","Mercedes","ZZZ",2015,120,2.2,200,6,6,2,false);
        AutocarroInteligente v3 = new AutocarroInteligente("00AA00","Renault", "Zoe",2015,120,2.2,200,5,6,2,1,2,3);

        DriveIt di = new DriveIt();

        try{
            di.adiciona(v1);
            di.adiciona(v2);
            di.adiciona(v3);
        }catch (ExisteVeiculoException e){
            System.out.println("Já existe veiculo com codigo:" + e.getMessage());
        }

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

        //System.out.println(di.ordenarVeiculos(new ComparatorKmsFeitos()));

    try{
        di.gravaCSV("TesteDriveIt.csv");
    }catch (IOException e){
    System.out.println("Erro a gravar em CSV");
    }

    try{
        di.gravaObj("TesteDriveIt.obj");
    }catch (IOException e){
            System.out.println("Erro a gravar em OBJ");
    }

    DriveIt di2 = new DriveIt();

    try{
        di2=di2.lerObj("TesteDriveIt.obj");
    }catch (IOException | ClassNotFoundException e){
        System.out.println("Erro a ler ficheiro OBJ");
    }
    }
}
