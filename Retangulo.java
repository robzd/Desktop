public class Retangulo {
    private double b = 0.0;
    private double h = 0.0;
    
    public void setBase(double b){ 
        this.b = b; // ESSA BOBA DO RATO é this.b: é o b PRIVADO 
    }
    public void setAltura(double h){
        this.h = h;
    }
    public double getBase(){
        return b;
    }
    public double getAltura(){
        return h;
    }
    public double calcArea(){
        return b*h;
    }
    public double calcDiagonal(){
        return Math.sqrt(b*b+h*h);
    }
    public String toString(){
        return "Area = "+calcArea()+"\nDiagonal = "+calcDiagonal();
    }
}