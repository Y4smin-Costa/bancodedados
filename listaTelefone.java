/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;*/
import java.util.ArrayList;
import java.util.List; 


/**
 *
 * @author Yasmin
 */


public class listaTelefone {
    public static void main(String[] args) {
        // Código para testar a conexão ou outras funcionalidades
        conexão.connect();
        manipulandobanco da = new manipulandobanco();

        // Adicionando uma lista de pessoas
        List<manipulandobanco.Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new manipulandobanco.Pessoa(13, "Mike", "Araca"));
        listaDePessoas.add(new manipulandobanco.Pessoa(14, "Airton", "Cascavel"));
        da.adicionarListaDePessoas(listaDePessoas);
        System.out.println("Inserções feitas. Segue abaixo a lista atualizada da tabela pessoa.");
        
       //imprime as informações da tabela pessoa, as mesma informações podem ser vista diretamente pelo banco de dados.
        manipulandobanco imprimirTabelaPessoa = new manipulandobanco();
        imprimirTabelaPessoa.imprimirTabelaPessoa();

        // Buscando pessoas por nome parcial
        da.buscarPessoasPorNome("fran"); 
        
        
        
        
        
        /* Segue exemplos de chamadas de alguns metodos criados.
        // Adicionando uma pessoa
        da.adicionarPessoa(88, "Jorge", "São Paulo");

        // Atualizando a pessoa
        da.atualizarPessoa(88, "jorge", "manaus");
        
        int pessoaIdParaRemover = 8;
        da.removerPessoa(pessoaIdParaRemover);
        System.out.println("Pessoa com ID " + pessoaIdParaRemover + " removida.");

        // Pesquisando a pessoa por ID
        da.pesquisarPessoaPorId(1); */

  
}
  
    }
