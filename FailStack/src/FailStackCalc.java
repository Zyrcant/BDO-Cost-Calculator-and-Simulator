import java.awt.event.KeyEvent;
import java.util.*;

/**
 *
 * @author Tiffany
 */
public class FailStackCalc extends javax.swing.JFrame {
    double[][] stats = 
        {{100, 0, 0},
         {100, 0, 0},
         {100, 0, 0},
         {100, 0, 0},
         {100, 0, 0},
         {100, 0, 0},
         {100, 0, 0},
         {20, 2.5, 52.5},
         {17.5, 2, 45.5},
         {15, 1.5, 37.5}, 
         {12.5, 1.25, 32.5},
         {10, 0.75, 23.5},
         {7.5, 0.63, 20},
         {5, 0.5, 15},
         {2.5, 0.5, 15},
         {15, 1.5, 52.5},
         {7.5, 0.75, 33.75},
         {5, 0.5, 27},
         {2, 0.25, 25},
         {1.5, 0.25, 20.1}};

    /**
     * Creates new form FailStackCalc
     */
    public FailStackCalc() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cost = new javax.swing.JLabel();
        eLevel = new javax.swing.JLabel();
        currentE = new javax.swing.JTextField();
        fs = new javax.swing.JLabel();
        currentFS = new javax.swing.JTextField();
        passRateLabel = new javax.swing.JLabel();
        passRate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bsLabel = new javax.swing.JLabel();
        bsCost = new javax.swing.JTextField();
        itemLabel = new javax.swing.JLabel();
        itemCost = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        simulateButton = new javax.swing.JButton();
        simLabel = new javax.swing.JLabel();
        simulations = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cost.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        Cost.setText("Cost Simulator");

        eLevel.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        eLevel.setText("Current enhancement");

        currentE.setText("0");
        currentE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                currentEKeyPressed(evt);
            }
        });

        fs.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        fs.setText("Failstacks");

        currentFS.setText("0");
        currentFS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                currentFSKeyPressed(evt);
            }
        });

        passRateLabel.setText("Pass rate:");

        passRate.setText("0");

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel2.setText("Fail stack Calculator");

        bsLabel.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        bsLabel.setText("MSRP Blackstone");

        bsCost.setText("0");

        itemLabel.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        itemLabel.setText("Item Cost Average");

        itemCost.setText("0");

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        simulateButton.setText("Simulate");
        simulateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateButtonActionPerformed(evt);
            }
        });

        simLabel.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        simLabel.setText("Simulations");

        simulations.setText("30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passRateLabel)
                                .addGap(18, 18, 18)
                                .addComponent(passRate))
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fs)
                                    .addGap(93, 93, 93)
                                    .addComponent(currentFS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(eLevel)
                                    .addGap(18, 18, 18)
                                    .addComponent(currentE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(simLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(simulations, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(itemLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemCost, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(bsLabel)
                                    .addGap(47, 47, 47)
                                    .addComponent(bsCost, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(simulateButton)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eLevel)
                            .addComponent(currentE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fs)
                            .addComponent(currentFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passRateLabel)
                            .addComponent(passRate))
                        .addGap(24, 24, 24)
                        .addComponent(Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bsLabel)
                            .addComponent(bsCost, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemLabel)
                            .addComponent(itemCost, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simLabel)
                            .addComponent(simulations, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(simulateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //if the user inputs a failstack to be calculated
    private void currentFSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentFSKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            calculate();
    }//GEN-LAST:event_currentFSKeyPressed

    //if the user inputs an enhancement rate to be calculated
    private void currentEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentEKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            calculate();
    }//GEN-LAST:event_currentEKeyPressed

    private void simulateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateButtonActionPerformed
        boolean passed = false;
        calculate();
        String savedFS = currentFS.getText();
        String savedPass = passRate.getText();
        int duraUsed = 0;
        int tries = 0;
        int failstacks = Integer.parseInt(currentFS.getText());
        while(!passed){
            calculate();
            double rng = Math.random()*100;
            double pass = Double.parseDouble(passRate.getText());
            if(rng <= pass)
            {
                passed = true;
                currentFS.setText(savedFS);
                passRate.setText(savedPass);
            }
            tries++;
            failstacks++;
            currentFS.setText(failstacks + "");
            output.setText(output.getText() + "\nTry: " + tries + " | failstack : " + failstacks);
        }
    }//GEN-LAST:event_simulateButtonActionPerformed

    //calcualtes the pass rate
    private void calculate()
    {
        //gets the current enhancement and failstack number
        String s = currentE.getText();
        String p = currentFS.getText();
        s = s.toLowerCase();
        int curEnhance = -1;
        //if the current enhancement is above +15 (pri, duo, tri, tet...)
        if(s.matches(".*[a-z].*"))
        {
            switch(s){
                case "pri" : 
                    curEnhance = 15;
                    break;
                case "duo": 
                    curEnhance = 16;
                    break;
                case "tri": 
                    curEnhance = 17;
                    break;
                case "tet":
                    curEnhance = 18;
                    break;
                case "pen":
                    curEnhance = 19;
                    break;
                default: 
                    error();
            }
        }
        else
            curEnhance = Integer.parseInt(s);
        int curFS = Integer.parseInt(p);
        if(curEnhance > -1 && curEnhance < 20){
            if(curEnhance < 7)
               passRate.setText("100.00");
            else
            {
                double basePass = stats[curEnhance][0];
                double pass = basePass + curFS*stats[curEnhance][1];
                if(pass > stats[curEnhance][2])
                    passRate.setText(stats[curEnhance][2] + "");
                else
                    passRate.setText(pass + "");
            }
        }
        else
            error();
    }
    
    private void error()
    {
        passRate.setText("Invalid enhancement.");
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FailStackCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FailStackCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FailStackCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FailStackCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FailStackCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cost;
    private javax.swing.JTextField bsCost;
    private javax.swing.JLabel bsLabel;
    private javax.swing.JTextField currentE;
    private javax.swing.JTextField currentFS;
    private javax.swing.JLabel eLevel;
    private javax.swing.JLabel fs;
    private javax.swing.JTextField itemCost;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    private javax.swing.JLabel passRate;
    private javax.swing.JLabel passRateLabel;
    private javax.swing.JLabel simLabel;
    private javax.swing.JButton simulateButton;
    private javax.swing.JTextField simulations;
    // End of variables declaration//GEN-END:variables
}
