public class Agenda {
    private Compromisso[] compromissos;
    private int tam;

    public Agenda(){
        this.tam = 0;
    }
    public int getQuantidade(){
        return this.tam;
    }

    public void Inserir(Compromisso c){
        
    }
    public void Excluir(Compromisso c){

    }
    public String[] Listar(){
        return this.compromissos;
    }
}