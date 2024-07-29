import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame{
    
    ArrayList<Double> numeros = new ArrayList<Double>();
    
    String ipServidor = "";
    
    String conta = ""; 
    String operacao = "";
    double numeroA;
    double numeroB;
    double ans;
    
    ICalculadora calculo;
    
    boolean resultadoCheck = false;
    
    public void setValorIP(String valor) {
        ipServidor = valor;
    }
    
    public void atualizarInputTextBox(String caracter)
    {
        if(inputTextBox.getText().length() < 10 && resultadoCheck == false)
        {
            inputTextBox.setText(inputTextBox.getText()+caracter);
        }
    }
    
    public void mostrarConta(String op)
    {
       if(inputTextBox.getText().length() > 0)
       {
            numeros.add(Double.parseDouble(inputTextBox.getText()));
            conta = conta + inputTextBox.getText() + op;
            contaCompletaTextBox.setText(conta);
            inputTextBox.setText("");
       }
    }
    
    public void apagarCaracter()
    {
        if (inputTextBox.getText() != null && inputTextBox.getText().length() > 0) {
            inputTextBox.setText(inputTextBox.getText().substring(0, inputTextBox.getText().length() - 1));
        }
    }
    
    public void desativarOperacoes(boolean opcao)
    {       
        if( contaCompletaTextBox.getText().length() > 0){
            buttonSomar.setEnabled(opcao);
            buttonSubtrair.setEnabled(opcao);
            buttonDividir.setEnabled(opcao);
            buttonMultiplicar.setEnabled(opcao);
            buttonExpoente.setEnabled(opcao);
            buttonRaiz.setEnabled(opcao);
            buttonLog.setEnabled(opcao);
            buttonMod.setEnabled(opcao);
            buttonCos.setEnabled(opcao);
            buttonSin.setEnabled(opcao);
            buttonTan.setEnabled(opcao);
            buttonAcos.setEnabled(opcao);
            buttonAsin.setEnabled(opcao);
            buttonAtan.setEnabled(opcao);
        }
    }
    
    public void resgatarNumeros()
    {
        numeroA = numeros.get(0);
        
        if (numeros.size() > 1)
        {
            numeroB = numeros.get(1);
        }
    }
    
           
    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        contaCompletaTextBox = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputTextBox = new javax.swing.JTextPane();
        numero7 = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        pontoFlutuante = new javax.swing.JButton();
        buttonResultado = new javax.swing.JButton();
        buttonSomar = new javax.swing.JButton();
        buttonSubtrair = new javax.swing.JButton();
        buttonMultiplicar = new javax.swing.JButton();
        buttonDividir = new javax.swing.JButton();
        buttonApagarCaracter = new javax.swing.JButton();
        buttonApagarTudo = new javax.swing.JButton();
        buttonSinalMenos = new javax.swing.JButton();
        buttonAns = new javax.swing.JButton();
        buttonExpoente = new javax.swing.JButton();
        buttonRaiz = new javax.swing.JButton();
        buttonLog = new javax.swing.JButton();
        buttonMod = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        buttonCos = new javax.swing.JButton();
        buttonSin = new javax.swing.JButton();
        buttonTan = new javax.swing.JButton();
        buttonAcos = new javax.swing.JButton();
        buttonAsin = new javax.swing.JButton();
        buttonAtan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora RMI");
        setMaximumSize(new java.awt.Dimension(308, 499));
        setSize(new java.awt.Dimension(315, 500));

        contaCompletaTextBox.setEditable(false);
        contaCompletaTextBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contaCompletaTextBox.setFocusable(false);
        jScrollPane1.setViewportView(contaCompletaTextBox);

        inputTextBox.setEditable(false);
        inputTextBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputTextBox.setFocusable(false);
        jScrollPane2.setViewportView(inputTextBox);

        numero7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero7.setText("7");
        numero7.setPreferredSize(new java.awt.Dimension(65, 50));
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });

        numero0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero0.setText("0");
        numero0.setPreferredSize(new java.awt.Dimension(65, 50));
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });

        numero2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero2.setText("2");
        numero2.setPreferredSize(new java.awt.Dimension(65, 50));
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero3.setText("3");
        numero3.setPreferredSize(new java.awt.Dimension(65, 50));
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });

        numero1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero1.setText("1");
        numero1.setPreferredSize(new java.awt.Dimension(65, 50));
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero5.setText("5");
        numero5.setPreferredSize(new java.awt.Dimension(65, 50));
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });

        numero4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero4.setText("4");
        numero4.setPreferredSize(new java.awt.Dimension(65, 50));
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });

        numero6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero6.setText("6");
        numero6.setPreferredSize(new java.awt.Dimension(65, 50));
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });

        numero8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero8.setText("8");
        numero8.setPreferredSize(new java.awt.Dimension(65, 50));
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });

        numero9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numero9.setText("9");
        numero9.setPreferredSize(new java.awt.Dimension(65, 50));
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });

        pontoFlutuante.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pontoFlutuante.setText(".");
        pontoFlutuante.setToolTipText("Ponto flutuante");
        pontoFlutuante.setPreferredSize(new java.awt.Dimension(65, 50));
        pontoFlutuante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoFlutuanteActionPerformed(evt);
            }
        });

        buttonResultado.setBackground(new java.awt.Color(51, 51, 255));
        buttonResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonResultado.setForeground(new java.awt.Color(255, 255, 255));
        buttonResultado.setText("=");
        buttonResultado.setToolTipText("Resultado");
        buttonResultado.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResultadoActionPerformed(evt);
            }
        });

        buttonSomar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonSomar.setText("+");
        buttonSomar.setToolTipText("Soma");
        buttonSomar.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSomarActionPerformed(evt);
            }
        });

        buttonSubtrair.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonSubtrair.setText("-");
        buttonSubtrair.setToolTipText("Subtração");
        buttonSubtrair.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtrairActionPerformed(evt);
            }
        });

        buttonMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonMultiplicar.setText("x");
        buttonMultiplicar.setToolTipText("Multiplicação");
        buttonMultiplicar.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicarActionPerformed(evt);
            }
        });

        buttonDividir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonDividir.setText("÷");
        buttonDividir.setToolTipText("Divisão");
        buttonDividir.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDividirActionPerformed(evt);
            }
        });

        buttonApagarCaracter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonApagarCaracter.setText("<-");
        buttonApagarCaracter.setToolTipText("Apagar caracter");
        buttonApagarCaracter.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonApagarCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApagarCaracterActionPerformed(evt);
            }
        });

        buttonApagarTudo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonApagarTudo.setText("C");
        buttonApagarTudo.setToolTipText("Apagar tudo");
        buttonApagarTudo.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonApagarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApagarTudoActionPerformed(evt);
            }
        });

        buttonSinalMenos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonSinalMenos.setText("(-)");
        buttonSinalMenos.setToolTipText("Sinal");
        buttonSinalMenos.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonSinalMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSinalMenosActionPerformed(evt);
            }
        });

        buttonAns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAns.setText("Ans");
        buttonAns.setToolTipText("Resultado anterior");
        buttonAns.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnsActionPerformed(evt);
            }
        });

        buttonExpoente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonExpoente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exponent_icon_138629.png"))); // NOI18N
        buttonExpoente.setToolTipText("Expoente");
        buttonExpoente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonExpoente.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonExpoente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExpoenteActionPerformed(evt);
            }
        });

        buttonRaiz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRaiz.setText("x√y");
        buttonRaiz.setToolTipText("Raiz");
        buttonRaiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRaiz.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRaizActionPerformed(evt);
            }
        });

        buttonLog.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLog.setText("log");
        buttonLog.setToolTipText("Logaritmo(base)logaritmando");
        buttonLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLog.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogActionPerformed(evt);
            }
        });

        buttonMod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonMod.setText("mod");
        buttonMod.setToolTipText("Resto da divisão");
        buttonMod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMod.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModActionPerformed(evt);
            }
        });

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttonCos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCos.setText("cos");
        buttonCos.setToolTipText("Cosseno");
        buttonCos.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCosActionPerformed(evt);
            }
        });

        buttonSin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSin.setText("sin");
        buttonSin.setToolTipText("Seno");
        buttonSin.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSinActionPerformed(evt);
            }
        });

        buttonTan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTan.setText("tan");
        buttonTan.setToolTipText("Tangente");
        buttonTan.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTanActionPerformed(evt);
            }
        });

        buttonAcos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAcos.setText("cos⁻¹ ");
        buttonAcos.setToolTipText("Inverso de cosseno");
        buttonAcos.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonAcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcosActionPerformed(evt);
            }
        });

        buttonAsin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAsin.setText("sin⁻¹ ");
        buttonAsin.setToolTipText("Inverso de seno");
        buttonAsin.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonAsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAsinActionPerformed(evt);
            }
        });

        buttonAtan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAtan.setText("tan⁻¹ ");
        buttonAtan.setToolTipText("Inverso de tangente");
        buttonAtan.setPreferredSize(new java.awt.Dimension(65, 50));
        buttonAtan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVoltar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(buttonAtan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonAsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonCos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonSin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonTan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonAcos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(buttonSinalMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(numero0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(pontoFlutuante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(buttonAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonApagarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonApagarCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(buttonLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonExpoente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(buttonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(numero9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buttonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(numero6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buttonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(numero7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(numero8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(buttonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAcos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(buttonAsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAtan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonApagarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonApagarCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonExpoente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numero0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pontoFlutuante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonSinalMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApagarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApagarTudoActionPerformed
        desativarOperacoes(true);
        inputTextBox.setText("");
        contaCompletaTextBox.setText("");
        conta = "";
        operacao = "";
        numeros.clear();
        buttonLog.setEnabled(true);
        resultadoCheck = false;
    }//GEN-LAST:event_buttonApagarTudoActionPerformed

    private void buttonApagarCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApagarCaracterActionPerformed
        if(resultadoCheck == false){
            apagarCaracter();
        }
    }//GEN-LAST:event_buttonApagarCaracterActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        atualizarInputTextBox("1");
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        atualizarInputTextBox("2");
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        atualizarInputTextBox("3");
    }//GEN-LAST:event_numero3ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        atualizarInputTextBox("4");
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
        atualizarInputTextBox("5");
    }//GEN-LAST:event_numero5ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        atualizarInputTextBox("6");
    }//GEN-LAST:event_numero6ActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
        atualizarInputTextBox("7");
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
        atualizarInputTextBox("8");
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        atualizarInputTextBox("9");
    }//GEN-LAST:event_numero9ActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed
        atualizarInputTextBox("0");
    }//GEN-LAST:event_numero0ActionPerformed

    private void buttonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDividirActionPerformed
        operacao = "dividir";
        mostrarConta("÷");
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonDividirActionPerformed

    private void buttonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicarActionPerformed
        operacao = "multiplicar";
        mostrarConta("x");
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonMultiplicarActionPerformed

    private void buttonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtrairActionPerformed
        operacao = "subtrair";
        mostrarConta("-");
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonSubtrairActionPerformed

    private void buttonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSomarActionPerformed
        operacao = "somar";
        mostrarConta("+");
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonSomarActionPerformed

    private void buttonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResultadoActionPerformed

        if(inputTextBox.getText().length() > 0 && resultadoCheck == false && operacao.length() != 0)
        {
            mostrarConta("=");
            resgatarNumeros();
            resultadoCheck = true;
            try
            {
                String objName = "rmi://"+ipServidor+":1099/Calc";
                calculo = (ICalculadora) Naming.lookup(objName);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Ocorreu algo errado!\nO servidor RMI não foi encontrado ou encontra-se desligado.\n\n"+e,"Erro",JOptionPane.ERROR_MESSAGE); 
            }
            try
            {
                switch(operacao){
                    case "somar":
                        ans = calculo.adicao(numeroA,numeroB);
                        inputTextBox.setText(String.valueOf(ans));
                        break;
                
                    case "subtrair":
                        ans = calculo.subtracao(numeroA,numeroB);
                        inputTextBox.setText(String.valueOf(ans));
                        break;
                
                    case "dividir":
                        ans = calculo.divisao(numeroA,numeroB);
                        inputTextBox.setText(String.valueOf(ans));
                        break;
            
                    case "multiplicar":
                        ans = calculo.multiplicacao(numeroA,numeroB);
                        inputTextBox.setText(String.valueOf(ans));
                        break;
                    
                    case "expoente":
                        ans = calculo.exp(numeroA,numeroB);
                        inputTextBox.setText(String.valueOf(ans));
                        break;

                    case "raiz":
                        ans = calculo.raiz(numeroA,numeroB);
                        inputTextBox.setText(String.valueOf(ans));
                        break;

                    case "log":
                        ans = calculo.logaritmo(numeroA,numeroB);
                        inputTextBox.setText(String.valueOf(ans));
                        break;

                    case "mod":
                        ans = calculo.mod(numeroA,numeroB);
                        inputTextBox.setText(String.valueOf(ans));
                        break;

                    case "cos":
                        ans = calculo.cos(numeroA);
                        inputTextBox.setText(String.valueOf(ans));
                        break;

                    case "sin":
                        ans = calculo.sin(numeroA);
                        inputTextBox.setText(String.valueOf(ans));
                        break;
            
                    case "tan":
                        ans = calculo.tan(numeroA);
                        inputTextBox.setText(String.valueOf(ans));
                        break;

                    case "acos":
                        ans = calculo.acos(numeroA);
                        inputTextBox.setText(String.valueOf(ans));
                        break;

                    case "asin":
                        ans = calculo.asin(numeroA);
                        inputTextBox.setText(String.valueOf(ans));
                        break;

                    case "atan":
                        ans = calculo.atan(numeroA);
                        inputTextBox.setText(String.valueOf(ans));
                        break;
            }
        }                                                                                                                                                                                                   
        catch(Exception e)
        {
            System.out.println(e);
        }
       }
    }//GEN-LAST:event_buttonResultadoActionPerformed

    private void pontoFlutuanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoFlutuanteActionPerformed
        if (inputTextBox.getText().contains(".") == false && inputTextBox.getText().length() != 0) {
            atualizarInputTextBox(".");
        }
    }//GEN-LAST:event_pontoFlutuanteActionPerformed

    private void buttonSinalMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSinalMenosActionPerformed
        if(inputTextBox.getText().length() == 0)
        {
            atualizarInputTextBox("-");
        }
    }//GEN-LAST:event_buttonSinalMenosActionPerformed
    
    private void buttonAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnsActionPerformed
        if(inputTextBox.getText().equals("-") || inputTextBox.getText().length() == 0 )
        {
            atualizarInputTextBox(String.valueOf(ans));
        }
    }//GEN-LAST:event_buttonAnsActionPerformed

    private void buttonExpoenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExpoenteActionPerformed
        operacao = "expoente";
        mostrarConta("^");
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonExpoenteActionPerformed

    private void buttonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRaizActionPerformed
        operacao = "raiz";
        mostrarConta("√");
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonRaizActionPerformed

    private void buttonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogActionPerformed
        if(conta.contains("log"))
        {
            operacao = "log";
            numeros.add(Double.parseDouble(inputTextBox.getText()));
            conta = conta + inputTextBox.getText() + ")";
            contaCompletaTextBox.setText(conta);
            inputTextBox.setText("");
            buttonLog.setEnabled(false);
        }
        else
        {
            conta = conta + "log(";
            contaCompletaTextBox.setText(conta);
            desativarOperacoes(false);
            buttonLog.setEnabled(true);
        }
        
    }//GEN-LAST:event_buttonLogActionPerformed

    private void buttonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModActionPerformed
        operacao = "mod";
        mostrarConta("mod");
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonModActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        Form1 formInicial = new Form1();
        formInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCosActionPerformed
        operacao = "cos";
        conta = conta + "cos(";
        contaCompletaTextBox.setText(conta);
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonCosActionPerformed

    private void buttonSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSinActionPerformed
        operacao = "sin";
        conta = conta + "sin(";
        contaCompletaTextBox.setText(conta);
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonSinActionPerformed

    private void buttonTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTanActionPerformed
        operacao = "tan";
        conta = conta + "tan(";
        contaCompletaTextBox.setText(conta);
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonTanActionPerformed

    private void buttonAcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcosActionPerformed
        operacao = "acos";
        conta = conta + "cos⁻¹(";
        contaCompletaTextBox.setText(conta);
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonAcosActionPerformed

    private void buttonAsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAsinActionPerformed
        operacao = "asin";
        conta = conta + "sin⁻¹(";
        contaCompletaTextBox.setText(conta);
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonAsinActionPerformed

    private void buttonAtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtanActionPerformed
        operacao = "atan";
        conta = conta + "tan⁻¹(";
        contaCompletaTextBox.setText(conta);
        desativarOperacoes(false);
    }//GEN-LAST:event_buttonAtanActionPerformed
    
    public static void main(String args[]) throws Exception{

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
                
            }
        }
        );
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAcos;
    private javax.swing.JButton buttonAns;
    private javax.swing.JButton buttonApagarCaracter;
    private javax.swing.JButton buttonApagarTudo;
    private javax.swing.JButton buttonAsin;
    private javax.swing.JButton buttonAtan;
    private javax.swing.JButton buttonCos;
    private javax.swing.JButton buttonDividir;
    private javax.swing.JButton buttonExpoente;
    private javax.swing.JButton buttonLog;
    private javax.swing.JButton buttonMod;
    private javax.swing.JButton buttonMultiplicar;
    private javax.swing.JButton buttonRaiz;
    private javax.swing.JButton buttonResultado;
    private javax.swing.JButton buttonSin;
    private javax.swing.JButton buttonSinalMenos;
    private javax.swing.JButton buttonSomar;
    private javax.swing.JButton buttonSubtrair;
    private javax.swing.JButton buttonTan;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextPane contaCompletaTextBox;
    private javax.swing.JTextPane inputTextBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JButton pontoFlutuante;
    // End of variables declaration//GEN-END:variables
   
}
