package locadora;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private Integer idFilme;
    private String titulo;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Integer getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
