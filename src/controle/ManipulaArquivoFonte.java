
package controle;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Classe com metodos para manipulacao de arquivos de fontes tipograficas.
 * @author RT United.
*/
public final class ManipulaArquivoFonte {
    
    // Construtor privado, classe estatica:
    private ManipulaArquivoFonte() {}
    
    /**
     * Transforma uma fonte no formato .ttf em uma fonte compativel com o programa.
     * @param arquivo Caminho do arquivo .ttf. 
     * @param tamanho Tamanho desejado para a fonte transformada.
     * @return Objeto Font para ser utilizado pelo Java.
    */
    public static Font fonteDeTTF(String arquivo, float tamanho) {
        // Cria uma fonte padrao:
        Font fontTTFComTamanho = new Font("Arial", Font.PLAIN, 14);
        
        File file = new File(arquivo);
        FileInputStream conteudo;        
        Font fonteTTF;
        
        // Abre o arquivo e tenta ler a fonte:
        try {
            conteudo = new FileInputStream(file);
            
            fonteTTF = Font.createFont(Font.TRUETYPE_FONT, conteudo);
            fontTTFComTamanho = fonteTTF.deriveFont(tamanho);
        } catch (IOException | FontFormatException ex) {
            // Nao envia mensagem de erro nenhuma.
        }
        
        return fontTTFComTamanho;
    }
}
