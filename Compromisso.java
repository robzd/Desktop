import java.time.LocalDateTime;

public class Compromisso {
    private String assunto;
    private String local;
    private LocalDateTime data;
    
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public void setData(LocalDateTime data){
        this.data = data;
    }
    public String getAssunto(){
        return this.assunto;
    }
    public String getLocal(){
        return this.local;
    }
    public LocalDateTime getData(){
        return this.data;
    }
    public String toString(){
        return "Assunto: "+assunto+"\nLocal: "+local+"\nData: "+data;
    }
}