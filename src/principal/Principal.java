package principal;

import modelos.ConsultaCep;
import modelos.Endereco;
import modelos.GeradorDeArquivos;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();


            System.out.println("Digite um número de CEP para consulta: ");
            var cep = leitura.nextLine();
        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivos gerador = new GeradorDeArquivos();
            gerador.salvaJson(novoEndereco);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}