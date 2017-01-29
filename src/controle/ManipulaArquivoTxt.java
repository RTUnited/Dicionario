
package controle;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Classe com metodos para manipulacao de arquivos de texto.
 * @author RT United.
*/
public final class ManipulaArquivoTxt {
    
    // Construtor privado, classe estatica:
    private ManipulaArquivoTxt() {}

    // -----------------------
    // Leitura:

    /**
     * Abre um arquivo para leitura, cujo caminho esteja especificado. 
     * @param caminho String, caminho do arquivo, junto com seu nome e extensao.
     * @return Objeto FileInputStream, o arquivo aberto.
    */
    public static FileInputStream abrirArquivoLeitura(String caminho) {
        FileInputStream arquivo = null;

        try {
            arquivo = new FileInputStream(caminho);
        } catch (FileNotFoundException e) {
            // Nao envia mensagem de erro nenhuma.
        }

        return arquivo;
    }

    /**
     * Fecha o buffer de leitura que estah lendo de um arquivo ja aberto.
     * @param leitor BufferedReader, buffer de leitura de um arquivo de texto.
    */
    public static void fecharArquivoLeitura(BufferedReader leitor) {
        try {
            leitor.close();
        } catch (IOException e) {
            // Nao envia mensagem de erro nenhuma.
        }
    }

    /**
     * Le o conteudo de um arquivo de texto.
     * @param arquivo FileInputStream, arquivo aberto para leitura.
     * @return String que contenha todo o conteudo do arquivo.
    */
    public static String lerConteudo(FileInputStream arquivo) {

        // Conteudo do arquivo:
        StringBuilder conteudo = new StringBuilder("");

        // Inicia uma linha vazia:
        String linha;

        try {
            // Abre com um novo leitor do tipo BufferedReader:
            BufferedReader leitor = new BufferedReader(new InputStreamReader(arquivo, "UTF-8"));
            

            // Enquanto a linha pertencer ao arquivo, a adiciona ao conteudo:
            while((linha = leitor.readLine()) != null) { 
                conteudo.append(linha + "\n"); 
            }

            // Fecha o recurso:
            fecharArquivoLeitura(leitor);


        } catch (Exception e) {
            // Nao envia mensagem de erro nenhuma.
        }

        return conteudo.toString();

    }
    
    
    // -----------------------
    // Escrita:
    
    /**
     * Abre um arquivo para escrita, cujo caminho esteja especificado. 
     * @param caminho String, caminho do arquivo, junto com seu nome e extensao.
     * @return Objeto FileOutputStream, o arquivo aberto.
    */
    public static FileOutputStream abrirArquivoEscrita(String caminho) {
        FileOutputStream arquivo = null;

        try {
            arquivo = new FileOutputStream(caminho);
        } catch (IOException ex) {
            // Nao envia mensagem de erro nenhuma.
        }

        return arquivo;
    }

    
    /**
     * Fecha o buffer de escrita que estah escrevendo num arquivo ja aberto.
     * @param leitor OutputStreamWriter, buffer de escrita de um arquivo de texto.
    */
    public static void fecharArquivoEscrita(OutputStreamWriter leitor) {
        try {
            leitor.close();
        } catch (IOException ex) {
            // Nao envia mensagem de erro nenhuma.
        }
        
    }

    
    /**
     * Escreve conteudo num arquivo de texto. Atencao: o conteudo anterior eh 
     * sobrescrito.
     * @param arquivo FileOutputStream, arquivo aberto para escrita.
     * @param conteudo String que contenha todo o conteudo a ser escrito.
    */
    public static void escreverConteudo(FileOutputStream arquivo, String conteudo) {
        
        try {
            // Abre com um novo escritor do tipo OutputStreamWriter:
            OutputStreamWriter escritor = new OutputStreamWriter(arquivo, "UTF-8");

            // Escreve o conteudo:
            escritor.write(conteudo);

            // Fecha o recurso:
            fecharArquivoEscrita(escritor);


        } catch (Exception e) {
            // Nao envia mensagem de erro nenhuma.
        }
   
    }
    
    
}
