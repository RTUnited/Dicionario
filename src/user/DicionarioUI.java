package user;

import controle.ManipulaArquivoFonte;
import controle.ManipulaArquivoTxt;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Classe que contem as configuracoes de display e funcionalidade do JFrame.
 * @author RT United.
*/
public class DicionarioUI extends javax.swing.JFrame {
    
    // Cria os ArrayLists com palavras e seus usos/acertos pelo usuario:
    ArrayList<String> novoIdimA = new ArrayList<>();
    ArrayList<String> seuIdimA = new ArrayList<>();
    ArrayList<Integer> usos = new ArrayList<>();
    ArrayList<Integer> acertos = new ArrayList<>();
    
    // Palavra certa a ser escrita, definida sempre que o usuario executa uma 
    // acao na tela de teste:
    String palavraCerta = "";
    
    // Indice da palavra aleatoria escolhida para ser testada, definida sempre 
    // que o usuario executa uma acao na tela de teste:
    int palavraAleatoria = -1; 
    
    // Score total:
    int score = 0;
    
    // Se eh do seu idioma para o novo (pode ser mudado na tela de configuracao):
    boolean seuParaNovo = true;
    
    // Selecao do usuario nas configuracoes, influencia o seuParaNovo acima:
    String estadoTrocaIdioma = "RAND";

    // Captura a posicao na tela na qual o usuario pressiona o mouse:
    private Point mousePressed = null;
    
    // Caso o usuario tente adicionar uma mesma palavra mais de uma vez:
    boolean palavraRepetida = false;
    
    
    public DicionarioUI() {
        
        // Fonte a ser usada no programa, inicializada antes do JFrame:
        
        // Linha para ser usada durante a execução do NetBeans:
        //Font defaultFont = ManipulaArquivoFonte.fonteDeTTF("src\\fontes\\NotoSansUI-Bold.ttf", 14); 
        
        // Linha para quando for compilar. Após pronto o .jar, colocar 
        // NotoSansUI-Bold.ttf na raiz do projeto: 
        Font defaultFont = ManipulaArquivoFonte.fonteDeTTF("NotoSansUI-Bold.ttf", 14);
        
        
        UIManager.getLookAndFeelDefaults().put("defaultFont", defaultFont);
        
        // Faz com que a fonte tambem seja usada em JLabels que contenham HTML:
        GraphicsEnvironment grapEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        grapEnv.registerFont(defaultFont);
        
        // Inicializa todos os componentes Swing do programa (codigo gerado pelo 
        // NetBeans automaticamente):
        initComponents();
        
        // Muda o icone do programa para o favicon RT:
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/favicon.png")));

        
        // Adiciona os botoes de radio da tela de configuracao a um grupo, para 
        // que a escolha dentre eles seja unica:
        grupoBotao.add(seuParaNovoFALSE);
        grupoBotao.add(seuParaNovoTRUE);
        grupoBotao.add(seuParaNovoRAND);
        
        // Seleciona um dos botoes de radio por padrao:
        seuParaNovoRAND.setSelected(true);
        
        // Elimina o scroll horizontal das JTextAreas da tela de 'Adicionar 
        // palavras':  
        novoIdioma.setLineWrap(true);
        seuIdioma.setLineWrap(true);
        
        // Centraliza a tela:
        setLocationRelativeTo(null);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotao = new javax.swing.ButtonGroup();
        fundo = new javax.swing.JPanel();
        menu1 = new javax.swing.JButton();
        menu2 = new javax.swing.JButton();
        menu3 = new javax.swing.JButton();
        menu4 = new javax.swing.JButton();
        config = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        tela1 = new javax.swing.JPanel();
        imagemHome = new javax.swing.JLabel();
        textoHome = new javax.swing.JLabel();
        RT2017Home = new javax.swing.JLabel();
        rtSiteHome = new javax.swing.JLabel();
        tela2 = new javax.swing.JPanel();
        instrucoesAdicionarPalavras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        novoIdioma = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        seuIdioma = new javax.swing.JTextArea();
        adicionarPalavras = new javax.swing.JButton();
        labelNovoIdioma = new javax.swing.JLabel();
        labelSeuIdioma = new javax.swing.JLabel();
        imagemAdicionarPalavras = new javax.swing.JLabel();
        tela3 = new javax.swing.JPanel();
        palavraTraduzir = new javax.swing.JLabel();
        instrucoesTeste = new javax.swing.JLabel();
        imagemTeste = new javax.swing.JLabel();
        palavraInput = new javax.swing.JTextField();
        acertoScore = new javax.swing.JLabel();
        tela4 = new javax.swing.JPanel();
        dicionarioCompleto = new javax.swing.JScrollPane();
        palavrasConhecidas = new javax.swing.JList<>();
        removerDicionario = new javax.swing.JButton();
        instrucoesDicionario = new javax.swing.JLabel();
        telaconfig = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        apagarDados = new javax.swing.JButton();
        salvarDicionario = new javax.swing.JButton();
        importarDicionario = new javax.swing.JButton();
        instrucoesConfig1 = new javax.swing.JLabel();
        instrucoesConfig2 = new javax.swing.JLabel();
        instrucoesConfig3 = new javax.swing.JLabel();
        seuParaNovoFALSE = new javax.swing.JRadioButton();
        seuParaNovoTRUE = new javax.swing.JRadioButton();
        seuParaNovoRAND = new javax.swing.JRadioButton();
        instrucoesMudaTraducao = new javax.swing.JLabel();

        setTitle("Dic");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Container"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        fundo.setBackground(new java.awt.Color(155, 223, 123));
        fundo.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        fundo.setPreferredSize(new java.awt.Dimension(800, 60));
        fundo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fundoMouseDragged(evt);
            }
        });
        fundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fundoMousePressed(evt);
            }
        });

        menu1.setBackground(new java.awt.Color(186, 218, 125));
        menu1.setText("Início");
        menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu1.setMaximumSize(new java.awt.Dimension(75, 25));
        menu1.setMinimumSize(new java.awt.Dimension(75, 25));
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        menu2.setBackground(new java.awt.Color(186, 218, 125));
        menu2.setText("Adicionar palavras");
        menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu2.setMaximumSize(new java.awt.Dimension(75, 25));
        menu2.setMinimumSize(new java.awt.Dimension(75, 25));
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        menu3.setBackground(new java.awt.Color(186, 218, 125));
        menu3.setText("Teste");
        menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu3.setMaximumSize(new java.awt.Dimension(75, 25));
        menu3.setMinimumSize(new java.awt.Dimension(75, 25));
        menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3ActionPerformed(evt);
            }
        });

        menu4.setBackground(new java.awt.Color(186, 218, 125));
        menu4.setText("Dicionário");
        menu4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu4.setMaximumSize(new java.awt.Dimension(75, 25));
        menu4.setMinimumSize(new java.awt.Dimension(75, 25));
        menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu4ActionPerformed(evt);
            }
        });

        config.setBackground(new java.awt.Color(125, 162, 218));
        config.setText("Configurações");
        config.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        config.setMaximumSize(new java.awt.Dimension(75, 25));
        config.setMinimumSize(new java.awt.Dimension(75, 25));
        config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(218, 126, 125));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        container.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        container.setMaximumSize(new java.awt.Dimension(800, 540));
        container.setMinimumSize(new java.awt.Dimension(800, 540));
        container.setName(""); // NOI18N
        container.setPreferredSize(new java.awt.Dimension(800, 540));
        container.setLayout(new java.awt.CardLayout());

        tela1.setBackground(new java.awt.Color(186, 232, 184));

        imagemHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        textoHome.setText("<html>&nbsp;&nbsp;Esta ferramenta foi feita com o intuito de ajudar na memorização de palavras.<br><br>&nbsp;&nbsp;Adicione palavras do seu idioma de interesse e teste seu conhecimento escrevendo-as diversas vezes.<br><br>&nbsp;&nbsp;Em caso de dúvidas, siga o passo a passo e as dicas do tutorial, na pasta do programa.<br><br>&nbsp;&nbsp;Bons estudos!</html>");
        textoHome.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        RT2017Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RT2017Home.setText("RT United 2017");

        rtSiteHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtSiteHome.setText("rtunited.github.io");
        rtSiteHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tela1Layout = new javax.swing.GroupLayout(tela1);
        tela1.setLayout(tela1Layout);
        tela1Layout.setHorizontalGroup(
            tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(textoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rtSiteHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RT2017Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagemHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(311, 311, 311))
        );
        tela1Layout.setVerticalGroup(
            tela1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(textoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(imagemHome)
                .addGap(18, 18, 18)
                .addComponent(RT2017Home, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtSiteHome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        container.add(tela1, "card1");

        tela2.setBackground(new java.awt.Color(186, 232, 184));

        instrucoesAdicionarPalavras.setText("<html>&nbsp;&nbsp;Escreva palavras apenas no idioma que deseja aprender no quadro da esquerda e apenas no seu idioma no quadro da direita. Expressões são permitidas.<br>&nbsp;&nbsp;Cada palavra/frase deverá estar contida em uma linha. Escreva da maneira que quiser, mas atente que, nos testes, deverá escrever da mesma maneira.</html>");

        novoIdioma.setColumns(20);
        novoIdioma.setRows(5);
        jScrollPane1.setViewportView(novoIdioma);

        seuIdioma.setColumns(20);
        seuIdioma.setRows(5);
        jScrollPane2.setViewportView(seuIdioma);

        adicionarPalavras.setBackground(new java.awt.Color(125, 162, 218));
        adicionarPalavras.setText("OK");
        adicionarPalavras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPalavrasActionPerformed(evt);
            }
        });

        labelNovoIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNovoIdioma.setText("Novo idioma");

        labelSeuIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSeuIdioma.setText("Seu idioma");

        imagemAdicionarPalavras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/double-arrow.png"))); // NOI18N

        javax.swing.GroupLayout tela2Layout = new javax.swing.GroupLayout(tela2);
        tela2.setLayout(tela2Layout);
        tela2Layout.setHorizontalGroup(
            tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela2Layout.createSequentialGroup()
                        .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tela2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(imagemAdicionarPalavras))
                            .addComponent(labelNovoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tela2Layout.createSequentialGroup()
                                .addComponent(labelSeuIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(tela2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adicionarPalavras))))
                    .addComponent(instrucoesAdicionarPalavras, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        tela2Layout.setVerticalGroup(
            tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(instrucoesAdicionarPalavras, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNovoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSeuIdioma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela2Layout.createSequentialGroup()
                        .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela2Layout.createSequentialGroup()
                        .addGap(0, 124, Short.MAX_VALUE)
                        .addGroup(tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela2Layout.createSequentialGroup()
                                .addComponent(imagemAdicionarPalavras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela2Layout.createSequentialGroup()
                                .addComponent(adicionarPalavras, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174))))))
        );

        container.add(tela2, "card2");

        tela3.setBackground(new java.awt.Color(186, 232, 184));

        palavraTraduzir.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        palavraTraduzir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        instrucoesTeste.setText("Escreva a palavra correspondente na área branca e aperte ENTER.");

        imagemTeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equals.png"))); // NOI18N

        palavraInput.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        palavraInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        palavraInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                palavraInputKeyPressed(evt);
            }
        });

        acertoScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tela3Layout = new javax.swing.GroupLayout(tela3);
        tela3.setLayout(tela3Layout);
        tela3Layout.setHorizontalGroup(
            tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela3Layout.createSequentialGroup()
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(imagemTeste))
                    .addGroup(tela3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tela3Layout.createSequentialGroup()
                                .addComponent(instrucoesTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(acertoScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(palavraInput, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(palavraTraduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        tela3Layout.setVerticalGroup(
            tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(tela3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acertoScore, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrucoesTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(palavraTraduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagemTeste)
                .addGap(42, 42, 42)
                .addComponent(palavraInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        container.add(tela3, "card3");

        tela4.setBackground(new java.awt.Color(186, 232, 184));

        dicionarioCompleto.setViewportView(palavrasConhecidas);

        removerDicionario.setBackground(new java.awt.Color(218, 126, 125));
        removerDicionario.setText("Remover selecionada(s)");
        removerDicionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerDicionarioActionPerformed(evt);
            }
        });

        instrucoesDicionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instrucoesDicionario.setText("Todas as palavras já adicionadas.");

        javax.swing.GroupLayout tela4Layout = new javax.swing.GroupLayout(tela4);
        tela4.setLayout(tela4Layout);
        tela4Layout.setHorizontalGroup(
            tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela4Layout.createSequentialGroup()
                .addGroup(tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela4Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dicionarioCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                            .addComponent(instrucoesDicionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(tela4Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(removerDicionario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        tela4Layout.setVerticalGroup(
            tela4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(instrucoesDicionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dicionarioCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removerDicionario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        container.add(tela4, "card4");

        telaconfig.setBackground(new java.awt.Color(186, 232, 184));

        scoreLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        apagarDados.setBackground(new java.awt.Color(218, 126, 125));
        apagarDados.setText("Apagar score, acertos e usos de palavras");
        apagarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarDadosActionPerformed(evt);
            }
        });

        salvarDicionario.setBackground(new java.awt.Color(125, 162, 218));
        salvarDicionario.setText("Salvar dicionário atual");
        salvarDicionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarDicionarioActionPerformed(evt);
            }
        });

        importarDicionario.setBackground(new java.awt.Color(125, 162, 218));
        importarDicionario.setText("Importar um dicionário");
        importarDicionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarDicionarioActionPerformed(evt);
            }
        });

        instrucoesConfig1.setText("<html>&nbsp;&nbsp;A porcentagem de acerto de uma determinada palavra influencia quantas vezes ela aparece, então é interessante apagar os dados com uma certa frequência.<br>&nbsp;&nbsp;Se você sentir que algumas palavras estão repetindo mais do que gostaria, aperte o botão ao lado.</html>");
        instrucoesConfig1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        instrucoesConfig2.setText("<html>&nbsp;&nbsp;Salva o dicionário atual em um arquivo de texto (.txt).</html>");
        instrucoesConfig2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        instrucoesConfig3.setText("<html>&nbsp;&nbsp;Importa um dicionário de um arquivo de texto (.txt). Os arquivos deverão estar como nos exemplos na pasta \"/dicionarios\".</html>");
        instrucoesConfig3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        seuParaNovoFALSE.setText("Sempre do novo idioma para o seu");
        seuParaNovoFALSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seuParaNovoFALSEActionPerformed(evt);
            }
        });

        seuParaNovoTRUE.setText("Sempre do seu idioma para o novo");
        seuParaNovoTRUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seuParaNovoTRUEActionPerformed(evt);
            }
        });

        seuParaNovoRAND.setText("Ambos");
        seuParaNovoRAND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seuParaNovoRANDActionPerformed(evt);
            }
        });

        instrucoesMudaTraducao.setText("Configuração da tradução dos testes:");

        javax.swing.GroupLayout telaconfigLayout = new javax.swing.GroupLayout(telaconfig);
        telaconfig.setLayout(telaconfigLayout);
        telaconfigLayout.setHorizontalGroup(
            telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaconfigLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apagarDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(salvarDicionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(importarDicionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaconfigLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instrucoesConfig2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instrucoesConfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instrucoesConfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaconfigLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seuParaNovoTRUE)
                            .addComponent(seuParaNovoFALSE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seuParaNovoRAND))
                    .addGroup(telaconfigLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(instrucoesMudaTraducao)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        telaconfigLayout.setVerticalGroup(
            telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaconfigLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaconfigLayout.createSequentialGroup()
                        .addComponent(instrucoesMudaTraducao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaconfigLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(seuParaNovoTRUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(seuParaNovoFALSE))
                            .addGroup(telaconfigLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(seuParaNovoRAND))))
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaconfigLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(apagarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaconfigLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instrucoesConfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarDicionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instrucoesConfig2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(telaconfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaconfigLayout.createSequentialGroup()
                        .addComponent(importarDicionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaconfigLayout.createSequentialGroup()
                        .addComponent(instrucoesConfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        container.add(telaconfig, "card5");

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(config, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(config, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ao usuario clicar no primeiro botao do menu, mostra a tela de 'Inicio'.
     * @param evt Clique no botao, acao do usuario.
    */
    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "card1");
    }//GEN-LAST:event_menu1ActionPerformed

    /**
     * Ao usuario clicar no segundo botao do menu, mostra a tela de 'Adicionar 
     * palavras'.
     * @param evt Clique no botao, acao do usuario.
    */
    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "card2");
    }//GEN-LAST:event_menu2ActionPerformed

    /**
     * Ao usuario clicar no terceiro botao do menu, mostra a tela de 'Teste'.
     * @param evt Clique no botao, acao do usuario.
    */
    private void menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3ActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "card3");
        
        // Seleciona uma nova palavra para ser testada:
        palavraAleatoria = updatePalavraATraduzir();
        
        // Se o índice da palavra escolhida for -1, significa que o usuario 
        // ainda nao tem palavras registradas. Caso contrario, mostra a palavra 
        // selecionada, que pode ser traduzida na area de texto:
        if (palavraAleatoria != -1) {
            // Troca a ordem dos idiomas:
            if (seuParaNovo == true) {
                palavraCerta = novoIdimA.get(palavraAleatoria);
            } else {
                palavraCerta = seuIdimA.get(palavraAleatoria);
            }
            
        } else {
            palavraCerta = "";
        }
        
        acertoScore.setText("");
        palavraInput.setText("");
        if (seuIdimA.isEmpty()) {
            palavraTraduzir.setText("");
        }
    }//GEN-LAST:event_menu3ActionPerformed
 
    /**
     * Ao usuario clicar no ultimo botao do menu ('X'), o programa encerra.
     * @param evt Clique no botao, acao do usuario.
    */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0); // Fecha o programa.
    }//GEN-LAST:event_exitActionPerformed

    /**
     * Ao usuario clicar no quinto botao do menu, mostra a tela de 'Configuracoes'.
     * @param evt Clique no botao, acao do usuario.
    */
    private void configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "card5");
        
        // Mostra o score com todos os acertos dentro do total de testes feitos:
        int somatorioUsos = somarTodosUsos();
        scoreLabel.setText("Score: " + score + "/" + somatorioUsos);
        
    }//GEN-LAST:event_configActionPerformed

    /**
     * Ao usuario clicar no botao de 'Ok', na tela de 'Adicionar palavras', insere 
     * os textos digitados nos ArrayLists do programa.
     * @param evt Clique no botao, acao do usuario.
    */
    private void adicionarPalavrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPalavrasActionPerformed
        // Captura os textos digitados:
        String novoIdim = novoIdioma.getText();
        String seuIdim = seuIdioma.getText();
        
        // Limpa os campos JTextArea:
        novoIdioma.setText("");
        seuIdioma.setText("");
        
        // Transfere os textos para os ArrayLists, adicionando tambem usos e 
        // acertos respectivos:
        String[] novo = novoIdim.split("\n");
        String[] seu = seuIdim.split("\n");
        
        for (int contador = 0; contador < novo.length; contador++) {
            // Se a palavra no idioma novo ja nao existir:
            if (!novoIdimA.contains(novo[contador])) {
                novoIdimA.add(novo[contador]);
                seuIdimA.add(seu[contador]);
                usos.add(0);
                acertos.add(0);
            } else {
                palavraRepetida = true;
            }
        }
        
        // Exibe mensagem de finalizacao:
        if (palavraRepetida) {
            JOptionPane.showMessageDialog(container, "Palavras repetidas não foram adicionadas.");
            palavraRepetida = false;
        } else {
            JOptionPane.showMessageDialog(container, "Palavras adicionadas com sucesso.");
        }
        
    }//GEN-LAST:event_adicionarPalavrasActionPerformed

    /**
     * Ao usuario clicar no quarto botao do menu, mostra a tela de 'Dicionario'.
     * @param evt Clique no botao, acao do usuario.
    */
    private void menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu4ActionPerformed
        CardLayout card = (CardLayout)container.getLayout();
        card.show(container, "card4");
        
        // Mostra a lista de palavras atualizada:
        updateLista();
        
    }//GEN-LAST:event_menu4ActionPerformed

    
    
    /**
     * Ao usuario clicar no botao de 'Remover selecionada(s)' na tela de 
     * 'Dicionario', remove os itens selecionados dos ArrayLists do programa.
     * @param evt Clique no botao, acao do usuario.
    */
    private void removerDicionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerDicionarioActionPerformed
        // Captura os indices dos itens selecionados:
        int[] indicesRemover = palavrasConhecidas.getSelectedIndices();
        
        // Remove os itens apenas dos ArrayLists. Quando houver o updateLista()
        // abaixo, as palavras deixarao a lista automaticamente.
        // Remove de tras para frente para nao retirar palavras que nao foram 
        // selecionadas:
        for (int contador = indicesRemover.length - 1; contador >= 0; contador--) {
            seuIdimA.remove(indicesRemover[contador]);
            novoIdimA.remove(indicesRemover[contador]);
            usos.remove(indicesRemover[contador]);
            acertos.remove(indicesRemover[contador]);
        }
        
        // Limpa a selecao de linhas:
        palavrasConhecidas.clearSelection();
       
        updateLista();
        
    }//GEN-LAST:event_removerDicionarioActionPerformed

    
    /**
     * Ao usuario apertar 'ENTER' no campo de texto da tela de 'Teste', verifica 
     * se a palavra digitada foi correta, adicionando ou nao ao score.
     * @param evt Usuario pressiona a tecla ENTER dentro do campo de texto.
    */
    private void palavraInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palavraInputKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            // Verifica se a palavra eh a correta, e se ha realmente palavras a 
            // serem testadas:
            if (palavraCerta.equals(palavraInput.getText()) && (!palavraCerta.equals(""))) {
                // Texto adicionando ao score:
                acertoScore.setForeground(Color.blue);
                acertoScore.setText("Você acertou! Score + 1.");
                score++;
                
                // Adiciona aos usos e acertos da palavra do momento:
                usos.set(palavraAleatoria, usos.get(palavraAleatoria) + 1);
                acertos.set(palavraAleatoria, acertos.get(palavraAleatoria) + 1);
                 
            } else if (!palavraCerta.equals("")) {
                // Texto informando o erro:
                acertoScore.setForeground(Color.red);
                acertoScore.setText("Você errou. :c");
                
                // Adiciona aos usos da palavra do momento:
                usos.set(palavraAleatoria, usos.get(palavraAleatoria) + 1);
                
            }
            
            // Escolhe uma nova palavra:
            palavraAleatoria = updatePalavraATraduzir();
            // Se houve de fato uma nova palavra escolhida:
            if (palavraAleatoria != -1) {
                // Troca a ordem dos idiomas, caso isso tenha sido definido 
                // aleatoriamente no metodo updatePalavraATraduzir():
                if (seuParaNovo == true) {
                    palavraCerta = novoIdimA.get(palavraAleatoria);
                } else {
                    palavraCerta = seuIdimA.get(palavraAleatoria);
                }
                
            } else {
                palavraCerta = "";
            }
            
            palavraInput.setText("");
        }
        
        
    }//GEN-LAST:event_palavraInputKeyPressed

    
    /**
     * Ao usuario clicar em 'Apagar scores, acertos e usos de palavras' na tela
     * de 'Configuracoes', apaga seu score, dados de usos e acertos de palavras.
     * @param evt Clique no botao, acao do usuario.
    */
    private void apagarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarDadosActionPerformed
        score = 0;
        for (int contador = 0; contador < usos.size(); contador++) {
            usos.set(contador, 0);
            acertos.set(contador, 0);
        }
        
        scoreLabel.setText("Score: 0/0");
    }//GEN-LAST:event_apagarDadosActionPerformed

    
    /**
     * Ao usuario clicar em 'Salvar dicionario atual' na tela de 'Configuracoes', 
     * abre uma janela de selecao de arquivo. Apos escolhido um arquivo, salva 
     * neste.
     * @param evt Clique no botao, acao do usuario.
    */
    private void salvarDicionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarDicionarioActionPerformed
        JFileChooser fileChooser = new JFileChooser(".");
        
        // Abre o seletor de arquivo, selecionando apenas arquivos de texto:
        fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos de texto", "txt"));
        int sucesso = fileChooser.showOpenDialog(container);
        
        
        // Caso tenha selecionado um arquivo com sucesso:
        if (sucesso == 0) {
            // Caminho do arquivo (adiciona '.txt' se nao tiver):
            String arquivo = fileChooser.getSelectedFile().getAbsolutePath();
            if (!arquivo.endsWith(".txt")) {
                arquivo = arquivo + ".txt";
            }
            
            // Transforma os ArrayLists em uma String:
            String conteudo = arrayPalavrasToString();
            
            // Abre o arquivo .txt e escreve o conteudo:
            ManipulaArquivoTxt.escreverConteudo(ManipulaArquivoTxt.abrirArquivoEscrita(arquivo), conteudo);
        }
        
    }//GEN-LAST:event_salvarDicionarioActionPerformed

    
    /**
     * Ao usuario clicar em 'Importar um dicionario' na tela de 'Configuracoes', 
     * abre uma janela de selecao de arquivo. Apos escolhido um arquivo, le as 
     * palavras deste e as adiciona ao programa.
     * @param evt Clique no botao, acao do usuario.
    */
    private void importarDicionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarDicionarioActionPerformed
        JFileChooser fileChooser = new JFileChooser(".");

        // Abre o seletor de arquivo, selecionando apenas arquivos de texto:
        fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos de texto", "txt"));
        int sucesso = fileChooser.showOpenDialog(container);

        // Caso tenha selecionado um arquivo com sucesso:
        if (sucesso == 0) {
            // Caminho do arquivo:
            String arquivo = fileChooser.getSelectedFile().getAbsolutePath();

            // Abre o arquivo .txt e le o conteudo:
            String conteudo = ManipulaArquivoTxt.lerConteudo(ManipulaArquivoTxt.abrirArquivoLeitura(arquivo));

            // Transforma o conteudo nos ArrayLists requeridos pelo programa:
            stringPalavrasParaArrays(conteudo);

        }
    }//GEN-LAST:event_importarDicionarioActionPerformed

    /**
     * Ao usuario clicar no botao de radio 'Sempre do seu idioma para o novo' 
     * na tela de 'Configuracoes', muda a variavel estadoTrocaIdioma do programa,
     * que influencia em como os testes sao feitos.
     * @param evt Clique no botao de radio, acao do usuario.
    */
    private void seuParaNovoTRUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seuParaNovoTRUEActionPerformed
        estadoTrocaIdioma = "TRUE";
    }//GEN-LAST:event_seuParaNovoTRUEActionPerformed

    /**
     * Ao usuario clicar no botao de radio 'Sempre do novo idioma para o seu' na 
     * tela de 'Configuracoes', muda a variavel estadoTrocaIdioma do programa,
     * que influencia em como os testes sao feitos.
     * @param evt Clique no botao de radio, acao do usuario.
    */
    private void seuParaNovoFALSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seuParaNovoFALSEActionPerformed
        estadoTrocaIdioma = "FALSE";
    }//GEN-LAST:event_seuParaNovoFALSEActionPerformed

    /**
     * Ao usuario clicar no botao de radio 'Ambos' na tela de 'Configuracoes', 
     * muda a variavel estadoTrocaIdioma do programa, que influencia em como os 
     * testes sao feitos.
     * @param evt Clique no botao de radio, acao do usuario.
    */
    private void seuParaNovoRANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seuParaNovoRANDActionPerformed
        estadoTrocaIdioma = "RAND";
    }//GEN-LAST:event_seuParaNovoRANDActionPerformed
    
    
    /**
     * Ao usuario clicar com o mouse na tela, captura o ponto que pressionou. 
     * @param evt Clique longo do mouse.
    */
    private void fundoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoMousePressed
        mousePressed = evt.getPoint();
        
    }//GEN-LAST:event_fundoMousePressed

    /**
     * Ao usuario arrastar o mouse, move a tela.
     * @param evt Clique longo do mouse.
    */
    private void fundoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoMouseDragged
        // Coordenadas capturadas sempre que o usuario arrasta o mouse pela tela:
        Point coordsAtuais = evt.getLocationOnScreen();
        
        // Coloca a tela numa nova posicao, calculada a partir do quanto o usuario 
        // moveu o mouse enquanto estava pressionado:
        setLocation(coordsAtuais.x - mousePressed.x, coordsAtuais.y - mousePressed.y);
    }//GEN-LAST:event_fundoMouseDragged

    

    /**
     * Atualiza a lista de palavras na tela de 'Dicionario', mostrando, em cada 
     * linha, as palavras em ambos os idiomas e a percentagem de acertos.
    */
    private void updateLista() {
        // Modelo de lista. Os itens sao adicionados ao modelo e este, posteriormente,
        // compoe a lista mostrada na tela:
        DefaultListModel listModel = new DefaultListModel();
        
        double percAcerto;
        for (int contador = 0; contador < novoIdimA.size(); contador++) {
            if (usos.get(contador) != 0) {
                percAcerto = acertos.get(contador).doubleValue()/usos.get(contador).doubleValue();
                listModel.addElement(novoIdimA.get(contador) + "  =  " + seuIdimA.get(contador) + 
                        "                                Percentagem de acerto: " + percAcerto*100 + "%");
            } else {
                listModel.addElement(novoIdimA.get(contador) + "  =  " + seuIdimA.get(contador) + "                                Nunca testada");
            }
            
        }
        
        // Aplica o modelo a lista da tela:
        palavrasConhecidas.setModel(listModel);
        
    }


    /**
     * Escolhe uma palavra dentre as possiveis no dicionario. As prioridades sao:
     * 1 - Palavras menos usadas.
     * 2 - Palavras com menor percentagem de acerto.
     * 3 - Escolha aleatoria.
     * @return Um indice inteiro, que eh a palavra escolhida nos ArrayLists. 
     * Se nao houver palavras a escolher, retorna -1.
    */
    private int updatePalavraATraduzir() {
        // Se os ArrayLists estiverem vazios, retorna -1:
        if (!seuIdimA.isEmpty()) {
            int palavraAleatoria;
            Random numAleatorio = new Random();
            
            // Pesquisa o menor uso dentre as palavras: 
            int minimoUso = Collections.min(usos);
            ArrayList<Integer> escolhasMinimoUso = new ArrayList<Integer>();
            
            for (int contador = 0; contador < seuIdimA.size(); contador++) {
                if (usos.get(contador) == minimoUso) {
                    // Adiciona os indices das palavras menos usadas:
                    escolhasMinimoUso.add(contador);
                }
            }

            // Seleciona, dentre as menos usadas, as palavras com menor taxa 
            // de acerto (caso o minimo de usos seja 0, nao ha taxa de acerto):
            if (minimoUso != 0) {
                
                // ArrayList para as taxas de acerto:
                ArrayList<Double> percAcertos = new ArrayList<Double>();
                for (int escolha : escolhasMinimoUso) {
                    percAcertos.add(acertos.get(escolha).doubleValue()/usos.get(escolha).doubleValue());
                }
                
                // Escolhe a menor taxa de acerto:
                Double minimoAcertos = Collections.min(percAcertos);
                
                ArrayList<Integer> escolhasMinimoAcerto = new ArrayList<Integer>();
            
                for (int contador = 0; contador < percAcertos.size(); contador++) {
                    if (percAcertos.get(contador).equals(minimoAcertos)) {
                        // Adiciona os indices das palavras menos acertadas:
                        escolhasMinimoAcerto.add(escolhasMinimoUso.get(contador));
                    }
                }
            
                // Por ultimo, eh selecionada uma palavra aleatoria:
                palavraAleatoria = escolhasMinimoAcerto.get(numAleatorio.nextInt(escolhasMinimoAcerto.size()));              
            } else {
                palavraAleatoria = escolhasMinimoUso.get(numAleatorio.nextInt(escolhasMinimoUso.size()));
            }
            
            
            // Aleatoriamente muda se a pessoa tem que fazer a traducao ao contrario
            // (do idioma nativo para o novo ou vice-versa), de acordo com o escolhido
            // nas configuracoes:
            if (estadoTrocaIdioma.equals("RAND")) {
                seuParaNovo = numAleatorio.nextBoolean();
            } else if (estadoTrocaIdioma.equals("TRUE")) {
                seuParaNovo = true;
            } else if (estadoTrocaIdioma.equals("FALSE")) {
                seuParaNovo = false;
            }
            
            // Muda o campo de texto na tela de 'Teste' para a palavra escolhida:
            if (seuParaNovo == true) {
                palavraTraduzir.setText(seuIdimA.get(palavraAleatoria));
            } else {
                palavraTraduzir.setText(novoIdimA.get(palavraAleatoria));
            }
            
            // Retorna o indice escolhido:
            return palavraAleatoria;
        
        } else {
            return -1;
        }
    
    }

    /**
     * Calcula quantos testes ja foram realizados, somando todos os usos. 
     * @return int, total de testes realizados.
    */
    private int somarTodosUsos() {
        int somatorio = 0;
        for (Integer numero : usos) {
            somatorio += numero;
        }
        return somatorio;
    }

    /**
     * Transforma os ArrayLists de palavras do programa numa String a fim de 
     * serem salvos num arquivo de texto.
     * @return String, conteudo de palavras do dicionario no formato para ser 
     * salvo.
    */
    private String arrayPalavrasToString() {
        StringBuilder conteudo = new StringBuilder();
        
        for (int contador = 0; contador < seuIdimA.size(); contador++) {
            conteudo.append(seuIdimA.get(contador) + "\t" + novoIdimA.get(contador) + "\r\n");
        }
        
        return conteudo.toString();
        
    }

    
    /**
     * Transforma uma String em varios ArrayLists de palavras a serem utilizados 
     * pelo programa como dicionario.
     * @param conteudo String vinda de um arquivo de texto no formato para ser 
     * transformado em dicionario pelo programa.
    */
    private void stringPalavrasParaArrays(String conteudo) {
        String[] linhas = conteudo.split("\n");
    
        // Cada linha da String deve conter uma palavra no idioma nativo, TAB e 
        // uma palavra no idioma novo:
        String[] palavras = new String[2];
        for (String linha : linhas) {
            palavras = linha.split("\t");
            
            seuIdimA.add(palavras[0]);
            novoIdimA.add(palavras[1]);
            
            usos.add(0);
            acertos.add(0);
        } 
    }

    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DicionarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DicionarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DicionarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DicionarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DicionarioUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RT2017Home;
    private javax.swing.JLabel acertoScore;
    private javax.swing.JButton adicionarPalavras;
    private javax.swing.JButton apagarDados;
    private javax.swing.JButton config;
    private javax.swing.JPanel container;
    private javax.swing.JScrollPane dicionarioCompleto;
    private javax.swing.JButton exit;
    private javax.swing.JPanel fundo;
    private javax.swing.ButtonGroup grupoBotao;
    private javax.swing.JLabel imagemAdicionarPalavras;
    private javax.swing.JLabel imagemHome;
    private javax.swing.JLabel imagemTeste;
    private javax.swing.JButton importarDicionario;
    private javax.swing.JLabel instrucoesAdicionarPalavras;
    private javax.swing.JLabel instrucoesConfig1;
    private javax.swing.JLabel instrucoesConfig2;
    private javax.swing.JLabel instrucoesConfig3;
    private javax.swing.JLabel instrucoesDicionario;
    private javax.swing.JLabel instrucoesMudaTraducao;
    private javax.swing.JLabel instrucoesTeste;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNovoIdioma;
    private javax.swing.JLabel labelSeuIdioma;
    private javax.swing.JButton menu1;
    private javax.swing.JButton menu2;
    private javax.swing.JButton menu3;
    private javax.swing.JButton menu4;
    private javax.swing.JTextArea novoIdioma;
    private javax.swing.JTextField palavraInput;
    private javax.swing.JLabel palavraTraduzir;
    private javax.swing.JList<String> palavrasConhecidas;
    private javax.swing.JButton removerDicionario;
    private javax.swing.JLabel rtSiteHome;
    private javax.swing.JButton salvarDicionario;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextArea seuIdioma;
    private javax.swing.JRadioButton seuParaNovoFALSE;
    private javax.swing.JRadioButton seuParaNovoRAND;
    private javax.swing.JRadioButton seuParaNovoTRUE;
    private javax.swing.JPanel tela1;
    private javax.swing.JPanel tela2;
    private javax.swing.JPanel tela3;
    private javax.swing.JPanel tela4;
    private javax.swing.JPanel telaconfig;
    private javax.swing.JLabel textoHome;
    // End of variables declaration//GEN-END:variables

    
}
