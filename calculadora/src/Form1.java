
import java.rmi.Naming;
import javax.swing.JOptionPane;


public class Form1 extends javax.swing.JFrame {
    
    ICalculadora calculo;
    boolean erro = false;

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ipServidorTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        confirmarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Bem-Vindo");

        ipServidorTextBox.setBackground(new java.awt.Color(242, 242, 242));
        ipServidorTextBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ipServidorTextBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ipServidorTextBox.setText("localhost");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Introduza um IP de um servidor RMI válido");

        confirmarButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmarButton.setText("Confirmar");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(ipServidorTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(confirmarButton)))
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(ipServidorTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        erro = false;
        
        if(ipServidorTextBox.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "É necessario fornecer primeiro\num endereço IP antes de continuar.","Informação",JOptionPane.INFORMATION_MESSAGE); 
        }
        if(ipServidorTextBox.getText().length() != 0)
        {
            try
            {
                String objName = "rmi://" + ipServidorTextBox.getText() + ":1099/Calc";
                calculo = (ICalculadora) Naming.lookup(objName);
            }
            catch(Exception e)
            {
                erro = true;
                JOptionPane.showMessageDialog(null, "Ocorreu algo errado!\nO servidor RMI não foi encontrado ou encontra-se desligado.\n\n"+e,"Erro",JOptionPane.ERROR_MESSAGE); 
            }
            
            if(erro == false)
            {
                Calculadora calculadora = new Calculadora();
                calculadora.setVisible(true);
                calculadora.setValorIP(ipServidorTextBox.getText());
                this.dispose();
            }
        }
        
    }//GEN-LAST:event_confirmarButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton;
    private javax.swing.JTextField ipServidorTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
