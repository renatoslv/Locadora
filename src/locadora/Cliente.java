package locadora;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer idCliente;
    private String nome;
    private String cpf;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
    
    public void addAluguel(Aluguel a){
        alugueis.add(a);
    }
    
    public void removeAluguel(Aluguel a){
        alugueis.remove(a);
    }
    
    public Aluguel getAluguel (int indice){
        return alugueis.get(indice);
    }
    
    public int sizeOfAlugueis(){
        return alugueis.size();
    }
}
