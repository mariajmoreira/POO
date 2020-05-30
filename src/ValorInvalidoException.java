public class ValorInvalidoException extends Exception{
    public ValorInvalidoException(){
        super();
    }

    public ValorInvalidoException(int s){
        super(String.valueOf(s));
    }
}
