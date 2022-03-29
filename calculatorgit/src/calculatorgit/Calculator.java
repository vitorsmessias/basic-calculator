/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculatorgit;

/**
 *
 * @author Vitor
 */
public class Calculator extends javax.swing.JFrame {

    double firstNumber;
    double secondNumber;
    double result;
    String operations;
    
    
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldShowEntry = new javax.swing.JTextField();
        jButtonNumberTwo = new javax.swing.JButton();
        jButtonNumberOne = new javax.swing.JButton();
        jButtonNumberFour = new javax.swing.JButton();
        jButtonNumberFive = new javax.swing.JButton();
        jButtonNumberSix = new javax.swing.JButton();
        jButtonNumberSeven = new javax.swing.JButton();
        jButtonNumberEight = new javax.swing.JButton();
        jButtonNumberThree = new javax.swing.JButton();
        jButtonNumberNine = new javax.swing.JButton();
        jButtonFirstOperator = new javax.swing.JButton();
        jButtonSecondOperator = new javax.swing.JButton();
        jButtonThirdOperator = new javax.swing.JButton();
        jButtonFourthOperator = new javax.swing.JButton();
        jButtonFifthOperator = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtonNumberZero = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelLogo2 = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldShowEntry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldShowEntry.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldShowEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldShowEntryActionPerformed(evt);
            }
        });

        jButtonNumberTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberTwo.setText("2");
        jButtonNumberTwo.setToolTipText("");
        jButtonNumberTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberTwoActionPerformed(evt);
            }
        });

        jButtonNumberOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberOne.setText("1");
        jButtonNumberOne.setToolTipText("");
        jButtonNumberOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberOneActionPerformed(evt);
            }
        });

        jButtonNumberFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberFour.setText("4");
        jButtonNumberFour.setToolTipText("");
        jButtonNumberFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberFourActionPerformed(evt);
            }
        });

        jButtonNumberFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberFive.setText("5");
        jButtonNumberFive.setToolTipText("");
        jButtonNumberFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberFiveActionPerformed(evt);
            }
        });

        jButtonNumberSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberSix.setText("6");
        jButtonNumberSix.setToolTipText("");
        jButtonNumberSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberSixActionPerformed(evt);
            }
        });

        jButtonNumberSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberSeven.setText("7");
        jButtonNumberSeven.setToolTipText("");
        jButtonNumberSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberSevenActionPerformed(evt);
            }
        });

        jButtonNumberEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberEight.setText("8");
        jButtonNumberEight.setToolTipText("");
        jButtonNumberEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberEightActionPerformed(evt);
            }
        });

        jButtonNumberThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberThree.setText("3");
        jButtonNumberThree.setToolTipText("");
        jButtonNumberThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberThreeActionPerformed(evt);
            }
        });

        jButtonNumberNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberNine.setText("9");
        jButtonNumberNine.setToolTipText("");
        jButtonNumberNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberNineActionPerformed(evt);
            }
        });

        jButtonFirstOperator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFirstOperator.setText("+");
        jButtonFirstOperator.setToolTipText("");
        jButtonFirstOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstOperatorActionPerformed(evt);
            }
        });

        jButtonSecondOperator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSecondOperator.setText("-");
        jButtonSecondOperator.setToolTipText("");
        jButtonSecondOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecondOperatorActionPerformed(evt);
            }
        });

        jButtonThirdOperator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonThirdOperator.setText("/");
        jButtonThirdOperator.setToolTipText("");
        jButtonThirdOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThirdOperatorActionPerformed(evt);
            }
        });

        jButtonFourthOperator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFourthOperator.setText("*");
        jButtonFourthOperator.setToolTipText("");
        jButtonFourthOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFourthOperatorActionPerformed(evt);
            }
        });

        jButtonFifthOperator.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonFifthOperator.setText("+/-");
        jButtonFifthOperator.setToolTipText("");
        jButtonFifthOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFifthOperatorActionPerformed(evt);
            }
        });

        jButtonDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDot.setText(".");
        jButtonDot.setToolTipText("");

        jButtonNumberZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNumberZero.setText("0");
        jButtonNumberZero.setToolTipText("");
        jButtonNumberZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumberZeroActionPerformed(evt);
            }
        });

        jButtonEquals.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEquals.setText("=");
        jButtonEquals.setToolTipText("");
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jLabelLogo.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelLogo.setText("CRAZY");

        jLabelLogo2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabelLogo2.setText("CaLcUlAtOr");

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonClear.setText("C");
        jButtonClear.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldShowEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButtonNumberNine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNumberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFirstOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSecondOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonNumberFive, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jButtonThirdOperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonFourthOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonFifthOperator)
                                .addGap(11, 11, 11)
                                .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonNumberSix, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jButtonNumberTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNumberThree, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNumberSeven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNumberFour, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNumberEight, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLogo2))
                        .addGap(25, 25, 25))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jButtonNumberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(386, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextFieldShowEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNumberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonNumberThree, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonNumberFour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNumberSix, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNumberFive, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNumberSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNumberEight, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNumberNine, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFirstOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSecondOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNumberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonThirdOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFourthOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFifthOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jButtonNumberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNumberZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberZeroActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberZero.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberZeroActionPerformed

    private void jButtonNumberOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberOneActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberOne.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberOneActionPerformed

    private void jTextFieldShowEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldShowEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldShowEntryActionPerformed

    private void jButtonNumberTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberTwoActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberTwo.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberTwoActionPerformed

    private void jButtonNumberThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberThreeActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberThree.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberThreeActionPerformed

    private void jButtonNumberFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberFourActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberFour.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberFourActionPerformed

    private void jButtonNumberFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberFiveActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberFive.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberFiveActionPerformed

    private void jButtonNumberSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberSixActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberSix.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberSixActionPerformed

    private void jButtonNumberSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberSevenActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberSeven.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberSevenActionPerformed

    private void jButtonNumberEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberEightActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberEight.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberEightActionPerformed

    private void jButtonNumberNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumberNineActionPerformed
        String enterNumber = jTextFieldShowEntry.getText() + jButtonNumberNine.getText();
        jTextFieldShowEntry.setText(enterNumber);
    }//GEN-LAST:event_jButtonNumberNineActionPerformed

    private void jButtonFirstOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstOperatorActionPerformed
        firstNumber = Double.parseDouble(jTextFieldShowEntry.getText());
        jTextFieldShowEntry.setText("");
        operations = "+";
    }//GEN-LAST:event_jButtonFirstOperatorActionPerformed

    private void jButtonSecondOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSecondOperatorActionPerformed
        firstNumber = Double.parseDouble(jTextFieldShowEntry.getText());
        jTextFieldShowEntry.setText("");
        operations = "-";
    }//GEN-LAST:event_jButtonSecondOperatorActionPerformed

    private void jButtonThirdOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThirdOperatorActionPerformed
        firstNumber = Double.parseDouble(jTextFieldShowEntry.getText());
        jTextFieldShowEntry.setText("");
        operations = "/";
    }//GEN-LAST:event_jButtonThirdOperatorActionPerformed

    private void jButtonFourthOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFourthOperatorActionPerformed
        firstNumber = Double.parseDouble(jTextFieldShowEntry.getText());
        jTextFieldShowEntry.setText("");
        operations = "*";
    }//GEN-LAST:event_jButtonFourthOperatorActionPerformed

    private void jButtonFifthOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFifthOperatorActionPerformed
        double ops = Double.parseDouble(String.valueOf(jTextFieldShowEntry.getText()));
        ops = ops * (-1);
        jTextFieldShowEntry.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonFifthOperatorActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed
        String answer;
        secondNumber = Double.parseDouble(jTextFieldShowEntry.getText());
        
        if (operations == "+") {
            result = firstNumber + secondNumber;
            answer = String.format("%.0f", result);
            jTextFieldShowEntry.setText(answer);
        }
        else if (operations == "-") {
            result = firstNumber - secondNumber;
            answer = String.format("%.0f", result);
            jTextFieldShowEntry.setText(answer);
        }
        else if (operations == "/") {
            result = firstNumber / secondNumber;
            answer = String.format("%.0f", result);
            jTextFieldShowEntry.setText(answer);
        }
        else if (operations == "*") {
            result = firstNumber * secondNumber;
            answer = String.format("%.0f", result);
            jTextFieldShowEntry.setText(answer);
        }
        else if (operations == "%") {
            result = firstNumber % secondNumber;
            answer = String.format("%.0f", result);
            jTextFieldShowEntry.setText(answer);
        }
        
    }//GEN-LAST:event_jButtonEqualsActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonFifthOperator;
    private javax.swing.JButton jButtonFirstOperator;
    private javax.swing.JButton jButtonFourthOperator;
    private javax.swing.JButton jButtonNumberEight;
    private javax.swing.JButton jButtonNumberFive;
    private javax.swing.JButton jButtonNumberFour;
    private javax.swing.JButton jButtonNumberNine;
    private javax.swing.JButton jButtonNumberOne;
    private javax.swing.JButton jButtonNumberSeven;
    private javax.swing.JButton jButtonNumberSix;
    private javax.swing.JButton jButtonNumberThree;
    private javax.swing.JButton jButtonNumberTwo;
    private javax.swing.JButton jButtonNumberZero;
    private javax.swing.JButton jButtonSecondOperator;
    private javax.swing.JButton jButtonThirdOperator;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JTextField jTextFieldShowEntry;
    // End of variables declaration//GEN-END:variables
}
