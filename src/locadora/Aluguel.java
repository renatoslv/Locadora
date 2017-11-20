package locadora;
public class Aluguel {
    private Integer idAluguel;
    private String dataAluguel;
    private String dataDevolucao;
    private float valor;
    private Cliente cliente;
    private Filme filme;

    public Integer getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(Integer idLocacao) {
        this.idAluguel = idAluguel;
    }

    public String getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(String dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    
}
