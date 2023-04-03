/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amőbaa;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author ricsi
 */
public class Amőba_s extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    /**
     * Creates new form Amőba_s
     */
    public Amőba_s() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
    }

    private void gamePont() {
        jlblJátékosX.setText(String.valueOf(xCount));
        jlblJátékosO.setText(String.valueOf(oCount));
    }

    private void choose_a_player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void winningGame() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();

        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();

        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();

        int n = 3;
        String array[] = new String[]{b1, b2, b3, b4, b5, b6, b7, b8, b9};
        String matrix[][] = new String[n][n];
        boolean van_harom_egyforma = false;
        boolean X_nyert = false;
        boolean O_nyert = false;

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = array[k];
                //System.out.println(matrix[i][j]);
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i >= 1 && j >= 1 && i < n - 1 && j < n - 1
                        && ("X".equals(matrix[i][j])
                        || "O".equals(matrix[i][j]))
                        && matrix[i][j].equals(matrix[i - 1][j - 1])
                        && matrix[i][j].equals(matrix[i + 1][j + 1])) {
                    van_harom_egyforma = true;
                    if ("X".equals(matrix[i][j])) {
                        X_nyert = true;

                    } else {
                        O_nyert = true;
                    }

                } else if (i >= 1 && j >= 1 && i < n - 1 && j < n - 1
                        && ("X".equals(matrix[i][j])
                        || "O".equals(matrix[i][j]))
                        && matrix[i][j].equals(matrix[i - 1][j + 1])
                        && matrix[i][j].equals(matrix[i + 1][j - 1])) {
                    van_harom_egyforma = true;
                    if ("X".equals(matrix[i][j])) {
                        X_nyert = true;

                    } else {
                        O_nyert = true;
                    }

                } else if (j >= 1 && j < n - 1
                        && ("X".equals(matrix[i][j])
                        || "O".equals(matrix[i][j]))
                        && matrix[i][j].equals(matrix[i][j - 1])
                        && matrix[i][j].equals(matrix[i][j + 1])) {
                    van_harom_egyforma = true;
                    if ("X".equals(matrix[i][j])) {
                        X_nyert = true;

                    } else {
                        O_nyert = true;
                    }

                } else if (i >= 1 && i < n - 1
                        && ("X".equals(matrix[i][j])
                        || "O".equals(matrix[i][j]))
                        && matrix[i][j].equals(matrix[i - 1][j])
                        && matrix[i][j].equals(matrix[i + 1][j])) {
                    van_harom_egyforma = true;
                    if ("X".equals(matrix[i][j])) {
                        X_nyert = true;

                    } else {
                        O_nyert = true;
                    }

                }
            }
        }

        if (van_harom_egyforma == true) {
            if (X_nyert == true) {
                xCount++;
                gamePont();
                JOptionPane.showMessageDialog(this, "Az X játékos nyert", "Amőba", JOptionPane.INFORMATION_MESSAGE);
            }
            if (O_nyert == true) {
                oCount++;
                gamePont();
                JOptionPane.showMessageDialog(this, "Az O játékos nyert", "Amőba", JOptionPane.INFORMATION_MESSAGE);
            }
        }

//        //if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
//        {
//            JOptionPane.showMessageDialog(this, "Az X játékos nyert","Amőba",JOptionPane.INFORMATION_MESSAGE);
//            xCount++;
//            gamePont();
//            jButton1.setBackground(Color.cyan);
//            jButton2.setBackground(Color.cyan);
//            jButton3.setBackground(Color.cyan);
//        }
//        
//         if(b4 == ("X") && b5==("X") && b6 == ("X"))
//        {
//            JOptionPane.showMessageDialog(this, "Az X játékos nyert","Amőba",JOptionPane.INFORMATION_MESSAGE);
//            xCount++;
//            gamePont();
//            jButton4.setBackground(Color.cyan);
//            jButton5.setBackground(Color.cyan);
//            jButton6.setBackground(Color.cyan);
//        }
//          if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
//        {
//            JOptionPane.showMessageDialog(this, "Az X játékos nyert","Amőba",JOptionPane.INFORMATION_MESSAGE);
//            xCount++;
//            gamePont();
//            jButton7.setBackground(Color.cyan);
//            jButton8.setBackground(Color.cyan);
//            jButton9.setBackground(Color.cyan);
//        }
//          
//          
//           if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
//        {
//            JOptionPane.showMessageDialog(this, "Az X játékos nyert","Amőba",JOptionPane.INFORMATION_MESSAGE);
//            xCount++;
//            gamePont();
//            jButton1.setBackground(Color.CYAN);
//            jButton4.setBackground(Color.CYAN);
//            jButton7.setBackground(Color.CYAN);
//        }
//           
//            if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
//        {
//            JOptionPane.showMessageDialog(this, "Az X játékos nyert","Amőba",JOptionPane.INFORMATION_MESSAGE);
//            xCount++;
//            gamePont();
//            jButton2.setBackground(Color.CYAN);
//            jButton5.setBackground(Color.CYAN);
//            jButton8.setBackground(Color.CYAN);
//        }
//            
//            if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
//        {
//            JOptionPane.showMessageDialog(this, "Az X játékos nyert","Amőba",JOptionPane.INFORMATION_MESSAGE);
//            xCount++;
//            gamePont();
//            jButton3.setBackground(Color.CYAN);
//            jButton6.setBackground(Color.CYAN);
//            jButton8.setBackground(Color.CYAN);
//        }
//            
//            if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
//        {
//            JOptionPane.showMessageDialog(this, "Az X játékos nyert","Amőba",JOptionPane.INFORMATION_MESSAGE);
//            xCount++;
//            gamePont();
//            jButton1.setBackground(Color.cyan);
//            jButton5.setBackground(Color.cyan);
//            jButton9.setBackground(Color.cyan);
//        }
//          
//            if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
//        {
//            JOptionPane.showMessageDialog(this, "Az X játékos nyert","Amőba",JOptionPane.INFORMATION_MESSAGE);
//            xCount++;
//            gamePont();
//            jButton3.setBackground(Color.cyan);
//            jButton5.setBackground(Color.cyan);
//            jButton7.setBackground(Color.cyan);
//        }
//        int oCounter;
//            
//             if (b1==("O") && b2 == ("O") && b3 == ("O"))
//        {
//            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//            oCount++;
//            gamePont();
//            jButton1.setBackground(Color.PINK);
//            jButton2.setBackground(Color.PINK);
//            jButton3.setBackground(Color.PINK);
//        }
//        
//             
//        if (b4==("O") && b5 == ("O") && b6 == ("O"))
//        {
//            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//            oCount++;
//            gamePont();
//            jButton4.setBackground(Color.PINK);
//            jButton5.setBackground(Color.PINK);
//            jButton6.setBackground(Color.PINK);
//        }
//        
//        
//        if (b7==("O") && b8 == ("O") && b9 == ("O"))
//        {
//            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//            oCount++;
//            gamePont();
//            jButton7.setBackground(Color.PINK);
//            jButton8.setBackground(Color.PINK);
//            jButton9.setBackground(Color.PINK);
//        }
//        
//        
//        if (b1==("O") && b4 == ("O") && b7 == ("O"))
//        {
//            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//            oCount++;
//            gamePont();
//            jButton1.setBackground(Color.PINK);
//            jButton4.setBackground(Color.PINK);
//            jButton7.setBackground(Color.PINK);
//        }
//        
//        
//        if (b2==("O") && b5 == ("O") && b8 == ("O"))
//        {
//            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//            oCount++;
//            gamePont();
//            jButton2.setBackground(Color.PINK);
//            jButton5.setBackground(Color.PINK);
//            jButton8.setBackground(Color.PINK);
//        }
//        
//        
//        if (b3==("O") && b6 == ("O") && b9 == ("O"))
//        {
//            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//            oCount++;
//            gamePont();
//            jButton3.setBackground(Color.PINK);
//            jButton6.setBackground(Color.PINK);
//            jButton9.setBackground(Color.PINK);
//        }
//        
//        
//        if (b1==("O") && b5 == ("O") && b9 == ("O"))
//        {
//            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//            oCount++;
//            gamePont();
//            jButton1.setBackground(Color.PINK);
//            jButton5.setBackground(Color.PINK);
//            jButton9.setBackground(Color.PINK);
//        }
//        
//        
//        if (b3==("O") && b5 == ("O") && b7 == ("O"))
//        {
//            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//            oCount++;
//            gamePont();
//            jButton3.setBackground(Color.PINK);
//            jButton5.setBackground(Color.PINK);
//            jButton7.setBackground(Color.PINK);
//        }
//        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlblJátékosX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jlblJátékosO = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jbtnÚjra = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jbtnKilépés = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amőba");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 90)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Amőba");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Játékos X:");
        jPanel7.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jlblJátékosX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblJátékosX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jlblJátékosX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Játékos O:");
        jPanel13.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jlblJátékosO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblJátékosO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel14.add(jlblJátékosO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jbtnÚjra.setBackground(new java.awt.Color(51, 255, 102));
        jbtnÚjra.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnÚjra.setText("Újra");
        jbtnÚjra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnÚjraActionPerformed(evt);
            }
        });
        jPanel15.add(jbtnÚjra, java.awt.BorderLayout.CENTER);

        jButton10.setBackground(new java.awt.Color(0, 153, 153));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Mentés");
        jButton10.setToolTipText("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton10, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel15);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jbtnKilépés.setBackground(new java.awt.Color(255, 0, 0));
        jbtnKilépés.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnKilépés.setText("Kilépés");
        jbtnKilépés.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKilépésActionPerformed(evt);
            }
        });
        jPanel18.add(jbtnKilépés, java.awt.BorderLayout.CENTER);

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Folytatás");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton11, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel18);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnKilépésActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKilépésActionPerformed
        frame = new JFrame("Kilépés");
        if (JOptionPane.showConfirmDialog(frame, "Fogadja el a kilépéshez", "Amőba",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
        {
            System.exit(0);

        }
    }//GEN-LAST:event_jbtnKilépésActionPerformed

    private void jbtnÚjraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnÚjraActionPerformed
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);

        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);

        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);

        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);

        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);

        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_jbtnÚjraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.black);
        } else {
            jButton1.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.black);
        } else {
            jButton2.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.black);
        } else {
            jButton3.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton4.setForeground(Color.black);
        } else {
            jButton4.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton5.setForeground(Color.black);
        } else {
            jButton5.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton6.setForeground(Color.black);
        } else {
            jButton6.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton7.setForeground(Color.black);
        } else {
            jButton7.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.black);
        } else {
            jButton8.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton9.setForeground(Color.black);
        } else {
            jButton9.setForeground(Color.black);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String b1 = jButton1.getText();
        if (b1 == "") {
            b1 = "E";
        };
        String b2 = jButton2.getText();
        if (b2 == "") {
            b2 = "E";
        };
        String b3 = jButton3.getText();
        if (b3 == "") {
            b3 = "E";
        };

        String b4 = jButton4.getText();
        if (b4 == "") {
            b4 = "E";
        };
        String b5 = jButton5.getText();
        if (b5 == "") {
            b5 = "E";
        };
        String b6 = jButton6.getText();
        if (b6 == "") {
            b6 = "E";
        };

        String b7 = jButton7.getText();
        if (b7 == "") {
            b7 = "E";
        };
        String b8 = jButton8.getText();
        if (b8 == "") {
            b8 = "E";
        };
        String b9 = jButton9.getText();
        if (b9 == "") {
            b9 = "E";
        };

        String res = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9;
        try {
            FileWriter myWriter = new FileWriter("D://Amoba/mentes.txt");
            myWriter.flush(); //Ezzel lehet tĂ¶rĂ¶lni
            myWriter.write(res);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        JButton btns[] = new JButton[9];
        btns[0] = jButton1;
        btns[1] = jButton2;
        btns[2] = jButton3;

        btns[3] = jButton4;
        btns[4] = jButton5;
        btns[5] = jButton6;

        btns[6] = jButton7;
        btns[7] = jButton8;
        btns[8] = jButton9;

        try {

            File myObj = new File("D://Amoba/mentes.txt");
            Scanner myReader = new Scanner(myObj);

            String data = myReader.nextLine();
            String temp = data;
            for (int i = 0; i < temp.length(); i++) {

                if (temp.charAt(i) == 'E') {
                    btns[i].setText("");
                } else {
                    String vmi = String.valueOf(temp.charAt(i));
                    btns[i].setText(vmi);
                }

            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }


    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Amőba_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Amőba_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Amőba_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Amőba_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Amőba_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnKilépés;
    private javax.swing.JButton jbtnÚjra;
    private javax.swing.JLabel jlblJátékosO;
    private javax.swing.JLabel jlblJátékosX;
    // End of variables declaration//GEN-END:variables
}
