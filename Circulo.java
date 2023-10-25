public class Circulo {
    private double raio;
    public Circulo(double raio){ // o THIS serve pro atributo raio ser usado já aqui, sem precisar passar parâmetros pelo Main
        this.raio = raio;
    }
    public double circunferencia(){
        double circunferencia = raio * 3.14 * 2;
        return circunferencia;
    }
    public double area(){
        double area = raio * raio * 3.14;
        return area;
    }
}