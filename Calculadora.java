public class Calculadora {
    private double valor = 0.0;

    public void soma(double a){
        valor += a;
    }
    public void sub(double a){
        valor -= a;
    }
    public void mul(double a){
        valor *= a;
    }
    public void div(double a){
        valor /= a;
    }

    public double getvalor(){
        return valor;
    }
}
