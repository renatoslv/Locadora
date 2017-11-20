
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import locadora.Aluguel;
import locadora.Cliente;
import locadora.Filme;


public class App {
    
    static List<Cliente> lista_cliente = new ArrayList<>();
    static List<Filme> lista_filmes =  new ArrayList<>();
    static List<Aluguel> lista_aluguel = new ArrayList<>();
    static Scanner leitura = new Scanner(System.in);
    static int idCliente = 0;
    static int idFilme = 0;
    static int idAluguel = 0;
    
    public static void main(String [] args){
        int opcaoMenu = 0;
        
        do{
            showMenu();
            opcaoMenu = leitura.nextInt();
            leitura.nextLine();
            
            switch(opcaoMenu){
                case 0:
                    System.out.println("FIM DO PROGRAMA.");
                    break;
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    excluirCliente();
                    break;
                case 4:
                    mostrarTodosClientes();
                    break;
                case 5:
                    cadastrarFilme();
                    break;
                case 8:
                    mostrarTodosFilmes();
                    break;
                case 9:
                    alugarFilme();
                    break;
                case 12:
                    mostrarTodasLocacoes();
                    break;
                default:
                    System.out.println("MENU INVALIDO");
            }
        }while (opcaoMenu != 0);
            
            
            
        showMenu();
        cadastrarCliente();
        mostrarTodosClientes();
    }
    public static void showMenu(){
        System.out.println("0 - SAIR DO SISTEMA ");
        System.out.println("01 - CADASTRAR CLIENTE");
        System.out.println("02 - EXCLUIR CLIENTE");
        System.out.println("03 - ATUALIZAR CLIENTE");
        System.out.println("04 - MOSTRAR TODOS OS CLIENTES");
        System.out.println("05 - CADASTRAR FILMES");
        System.out.println("06 - EXCLUIR FILMES");
        System.out.println("07 - ATUALIZAR FILMES");
        System.out.println("08 - MOSTRAR TODOS OS FILMES");
        System.out.println("09 - ALUGAR FILMES");
        System.out.println("10 - DEVOLVER FILMES");
        System.out.println("11 - MOSTRAR FILMES NAO DEVOLVIDOS");
        System.out.println("12 - MOSTRAR TODAS AS LOCACOES");
    }
    public static void cadastrarCliente (){
        
        System.out.println("===== CADASTRO DE CLIENTE =====");
        System.out.println("DIGITE O NOME DO CLIENTE: ");
        String nome = leitura.nextLine();
        
        System.out.println("DIGITE O CPF DO CLIENTE: ");
        String cpf = leitura.nextLine();
        
        idCliente++;
        Cliente cliente = new Cliente();
        cliente.setIdCliente(idCliente);
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        
        lista_cliente.add(cliente);
        System.out.println("CLIENTE CADASTRADO COM SUCESSO");        
    }
    public static void mostrarTodosClientes () {
        System.out.println("===== CLIENTES CADASTRADOS =====");
        
        for(int i = 0; i < lista_cliente.size(); i++){
            Cliente cliente = lista_cliente.get(i);
            System.out.println("CODIGO " + cliente.getIdCliente());
            System.out.println("NOME " + cliente.getNome());
            System.out.println("CPF " + cliente.getCpf());
            System.out.println("");
        }
    }
    public static void excluirCliente() {
        System.out.println("===== EXCLUIR CLIENTE =====");
        
        System.out.println("DIGITE O CODIGO DO CLIENTE QUE DESEJA EXCLUIR: ");
        int codigo = leitura.nextInt();
        boolean foiExcluido = false;
        
        for(int i = 0; i < lista_cliente.size(); i++){
            Cliente cliente = lista_cliente.get(i);
            if(cliente.getIdCliente() == codigo){
                lista_cliente.remove(i);
                foiExcluido = true;
                break;
            }
        }
        if (foiExcluido){
            System.out.println("CLIENTE REMOVIDO COM SUCESSO");
        }else{
            System.out.println("CLIENTE NAO ESTA CADASTRADO");
        }
    }

    private static void cadastrarFilme() {
        System.out.println("===== CADASTRO DE FILME =====");
        System.out.println("DIGITE O TITULO DO FILME: ");
        String titulo = leitura.nextLine();
                
        idFilme++;
        Filme filme = new Filme();
        filme.setIdFilme(idFilme);
        filme.setTitulo(titulo);
        
        lista_filmes.add(filme);
        System.out.println("FILME CADASTRADO COM SUCESSO");        
    }

    private static void mostrarTodosFilmes() {
        System.out.println("===== FILMES CADASTRADOS =====");
        
        for(int i = 0; i < lista_filmes.size(); i++){
            Filme filme = lista_filmes.get(i);
            System.out.println("CODIGO " + filme.getIdFilme());
            System.out.println("TITULO " + filme.getTitulo());
            System.out.println("");
        }
    }

    private static void mostrarTodasLocacoes() {
        System.out.println("===== FILMES ALUGADOS =====");
        
        for(int i = 0; i < lista_aluguel.size(); i++){
            Aluguel aluguel = lista_aluguel.get(i);
            System.out.println("CODIGO " + aluguel.getIdAluguel());
            System.out.println("CLIENTE " + aluguel.getCliente().getNome());
            System.out.println("CPF DO CLIENTE: " + aluguel.getCliente().getCpf());
            System.out.println("FILME " + aluguel.getFilme().getTitulo());
            System.out.println("DATA DA LOCACAO " + aluguel.getDataAluguel());
            System.out.println("");
        }
    }

    private static void alugarFilme() {
        System.out.println("===== ALUGAR FILME =====");
        
        System.out.println("DIGITE O CODIGO DO CLIENTE: ");
        int codigoCliente = leitura.nextInt();
        Cliente clienteLocador = null;
        
        for(int i = 0; i < lista_cliente.size(); i++){
            Cliente cliente = lista_cliente.get(i);
            if(cliente.getIdCliente() == codigoCliente){
                clienteLocador = cliente;
            }
        }
        
        System.out.println("DIGITE O CODIGO DO FILME ");
        int codigoFilme = leitura.nextInt();
        Filme filmeAlugado = null;
        
        for(int i = 0; i < lista_filmes.size(); i++){
            Filme filme = lista_filmes.get(i);
            if(filme.getIdFilme() == codigoFilme){
                filmeAlugado = filme;
            }
        }
        leitura.nextLine();
        if(filmeAlugado != null && clienteLocador != null){
            System.out.println("DIGITE A DATA DA LOCACAO ");
            String dataLocacao = leitura.nextLine();
            
            System.out.println("DIGITE O VALOR DA LOCACAO ");
            float valorLocacao = leitura.nextFloat();
            
            idAluguel++;
            Aluguel aluguel = new Aluguel();
            aluguel.setIdAluguel(idCliente);
            aluguel.setDataAluguel(dataLocacao);
            aluguel.setValor(valorLocacao);
            aluguel.setCliente(clienteLocador);
            aluguel.setFilme(filmeAlugado);
            
            clienteLocador.addAluguel(aluguel);
            filmeAlugado.addAluguel(aluguel);
            
            lista_aluguel.add(aluguel);
            
            System.out.println("FILME ALUGADO COM SUCESSO ");
        }else{
            System.out.println("O FILME NAO FOI ALUGADO, POIS O CLIENTE OU FILME NAO ESTAO CADASTRADOS");   
        }
        
        
        
    }
        
}
