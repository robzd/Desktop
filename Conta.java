public class Conta {
    private double saldo = 0.0;
    public boolean depositar(double valor){
        if(valor > 0.0 && valor<100000.0){
            saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    private boolean podeSacar(double valor){
        return saldo >= valor; // funciona como um IF que retorna true ou false
    }

    public boolean sacar(double valor){
        if (podeSacar(valor) && valor >= 0.0){ //se o valor for menor ou igual que o saldo e o valor for maior que 0
            saldo -= valor;
            return true;
        }
        return false; // aqui não é possível sacar
    }

    public boolean transferir(double valor, Conta destino){
        if(sacar(valor)){ // se puder sacar
            if(destino.depositar(valor)){
                return true;
            }
            depositar(valor);
            return false;
        }
        return false;
        // isso tudo também poderia ser: return(sacar) 
    }
}
