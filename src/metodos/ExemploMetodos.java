package metodos;

public class ExemploMetodos {
    public static void main(String[] args) {

        // Criando uma instancia de produto usando o construtor
        Produto produto = new Produto("123","Geladeira",3500.50);
        System.out.println(produto);

        // Exibindo somento o nome do produto chamando o método getNome()
        System.out.println(produto.getNome());

    }
}
