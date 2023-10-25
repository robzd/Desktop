public class Dado {
    private int lados = 6; // o private faz com que nenhum outro arquivo (ex: Main) possa alterar esse valor inicial do objeto Dado
    private int _valor = 1;

    public void lancar() { // o void é quando não tem retorno
        _valor = (int) (Math.random() * lados + 1); // random gera um número entre 0.0 e 1.0, depois esse número é multiplicado pelo range (no caso "lados" (6)), gerando números entre 0 e 5, dps é somado com 1 pra gerar entre 1 e 6
    }
    
    public int valor(){
        return _valor;
    }
}