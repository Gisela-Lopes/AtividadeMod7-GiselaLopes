package PrimeiraParte;

/**
 * @author Gisela
 */
public class PrimeiraClasse {
    /**
     * Comentário do que o método faz
     * @param args valores do sistema
     */
    public static void main(String args[]) {
        System.out.println("Oi Gisela");
       Cliente cliente = new Cliente();
       cliente.cadastrarEndereco("Rua 1");
       cliente.setCodigo(1);
       System.out.println(cliente.getEndereco());
        //cliente.imprimirEndereco();
      String end = cliente.retornarNomeCliente();
      System.out.println((end));
      System.out.println(cliente.getValorTotal());
    }
}
