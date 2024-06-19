package arquivos;

import java.io.*;

public class ExemploArquivos {
    public static void main(String[] args) {

        // Lendo e exibindo as linhas do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader("./resources/arquivo.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Criando um novo arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./resources/arquivo2.txt"))) {
            bw.write("Olá, mundo!");
            bw.write("\nEu estou aqui!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

}

