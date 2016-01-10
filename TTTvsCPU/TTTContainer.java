package TTTvsCPU;

import java.awt.CardLayout;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class TTTContainer extends javax.swing.JFrame 
{
    int[][] board = new int[3][3];;
    TTTbot bot = new TTTbot();;
    Icon xIcon = new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/x.jpg"));
    Icon oIcon = new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/o.jpg"));
    Icon nullIcon = new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"));
    
    
    public TTTContainer() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TTTlabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();
        startPanel = new javax.swing.JPanel();
        difficultyLabel = new javax.swing.JLabel();
        easyButton = new javax.swing.JButton();
        mediumButton = new javax.swing.JButton();
        hardButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TTTPanel = new javax.swing.JPanel();
        board00 = new javax.swing.JButton();
        board01 = new javax.swing.JButton();
        board02 = new javax.swing.JButton();
        board10 = new javax.swing.JButton();
        board11 = new javax.swing.JButton();
        board12 = new javax.swing.JButton();
        board20 = new javax.swing.JButton();
        board21 = new javax.swing.JButton();
        board22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe vs CPU!");
        setResizable(false);

        TTTlabel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        TTTlabel.setText("Tic Tac Toe -vs- CPU");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        gamePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gamePanel.setPreferredSize(new java.awt.Dimension(250, 250));
        gamePanel.setLayout(new java.awt.CardLayout());

        startPanel.setPreferredSize(new java.awt.Dimension(250, 250));

        difficultyLabel.setText("Choose Difficulty:");

        easyButton.setText("Easy");
        easyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                easyButtonMouseClicked(evt);
            }
        });
        easyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButtonActionPerformed(evt);
            }
        });

        mediumButton.setText("Medium");
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButtonActionPerformed(evt);
            }
        });

        hardButton.setText("Hard");
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Impossible");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mediumButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(easyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addComponent(difficultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(hardButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(difficultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(easyButton)
                .addGap(12, 12, 12)
                .addComponent(mediumButton)
                .addGap(12, 12, 12)
                .addComponent(hardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        gamePanel.add(startPanel, "startCard");

        TTTPanel.setPreferredSize(new java.awt.Dimension(250, 250));

        board00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board00ActionPerformed(evt);
            }
        });

        board01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board01ActionPerformed(evt);
            }
        });

        board02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board02ActionPerformed(evt);
            }
        });

        board10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board10ActionPerformed(evt);
            }
        });

        board11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board11ActionPerformed(evt);
            }
        });

        board12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board12ActionPerformed(evt);
            }
        });

        board20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board20ActionPerformed(evt);
            }
        });

        board21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board21ActionPerformed(evt);
            }
        });

        board22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTTvsCPU/null.jpg"))); // NOI18N
        board22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TTTPanelLayout = new javax.swing.GroupLayout(TTTPanel);
        TTTPanel.setLayout(TTTPanelLayout);
        TTTPanelLayout.setHorizontalGroup(
            TTTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TTTPanelLayout.createSequentialGroup()
                .addGroup(TTTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TTTPanelLayout.createSequentialGroup()
                        .addComponent(board20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(board21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(board22))
                    .addGroup(TTTPanelLayout.createSequentialGroup()
                        .addComponent(board00)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(board01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(board02))
                    .addGroup(TTTPanelLayout.createSequentialGroup()
                        .addComponent(board10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(board11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(board12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TTTPanelLayout.setVerticalGroup(
            TTTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TTTPanelLayout.createSequentialGroup()
                .addGroup(TTTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(board00)
                    .addComponent(board01)
                    .addComponent(board02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TTTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(board10)
                    .addComponent(board11)
                    .addComponent(board12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(TTTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(board21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(board22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(board20, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        gamePanel.add(TTTPanel, "gameCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(TTTlabel)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(TTTlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startGame() {
        CardLayout cl = (CardLayout)(gamePanel.getLayout());
        cl.show(gamePanel, "gameCard");
    }
    
    private void resetBoard() {
        board = new int[3][3];
    }
    
    private void botMove() {
        int[] botPlay = bot.makeMove(board);
        
        if(botPlay[0] == 0) {
            switch(botPlay[1]) {
                case 0: 
                    board00.setIcon(oIcon);
                    board[0][0] = -1;
                    break;
                case 1:
                    board01.setIcon(oIcon);
                    board[0][1] = -1;
                    break;
                case 2:
                    board02.setIcon(oIcon);
                    board[0][2] = -1;
                    break;
                default: break;
            }
        }
        
        if(botPlay[0] == 1) {
            switch(botPlay[1]) {
                case 0: 
                    board10.setIcon(oIcon);
                    board[1][0] = -1;
                    break;
                case 1:
                    board11.setIcon(oIcon);
                    board[1][1] = -1;
                    break;
                case 2:
                    board12.setIcon(oIcon);
                    board[1][2] = -1;
                    break;
                default: break;
            }
        }
        
        if(botPlay[0] == 2) {
            switch(botPlay[1]) {
                case 0: 
                    board20.setIcon(oIcon);
                    board[2][0] = -1;
                    break;
                case 1:
                    board21.setIcon(oIcon);
                    board[2][1] = -1;
                    break;
                case 2:
                    board22.setIcon(oIcon);
                    board[2][2] = -1;
                    break;
                default: break;
            }
        }
        
        checkBotWin();     
    }
    
    private boolean checkPlayerWin() {
        boolean playerWin = false;
        for(int i = 0; i < 3; i++) {
            if(board[i][0] + board[i][1] + board[i][2] == 3) playerWin = true;
            if(board[0][i] + board[1][i] + board[2][i] == 3) playerWin = true;
        }
        if(board[0][0] + board[1][1] + board[2][2] == 3) playerWin = true;
        if(board[0][2] + board[1][1] + board[2][0] == 3) playerWin = true; 
        if(playerWin) {
            System.out.println("The player has won");
            //JOptionPane.showMessageDialog(null, "Good job you won!");
            JOptionPane.showMessageDialog(null, "You have defeated the CPU  :)", "You Win!", JOptionPane.INFORMATION_MESSAGE);
        }
        return playerWin;
    }
    
    private boolean checkBotWin() {
        boolean botWin = false;
        for(int i = 0; i < 3; i++) {
            if(board[i][0] + board[i][1] + board[i][2] == -3) botWin = true;
            if(board[0][i] + board[1][i] + board[2][i] == -3) botWin = true;
        }
        if(board[0][0] + board[1][1] + board[2][2] == -3) botWin = true;
        if(board[0][2] + board[1][1] + board[2][0] == -3) botWin = true; 
        if(botWin) {
            System.out.println("The bot has won");
            //JOptionPane.showMessageDialog(null, "The CPU has bested you :(");
            JOptionPane.showMessageDialog(null, "The CPU has bested you  :(", "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
        }
        return botWin;
    }
    
    private boolean checkStalemate() {
        boolean stalemate = true;
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == 0) stalemate = false;
            }
        if(stalemate) {
            System.out.println("A stalemate has occured.");
            //JOptionPane.showMessageDialog(null, "There was a Stalemate :(");
            JOptionPane.showMessageDialog(null, "A stalemate has occured  :(", "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
        }
        return stalemate;
    }
    
    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumButtonActionPerformed
        bot.setDifficulty(1);
        startGame();
    }//GEN-LAST:event_mediumButtonActionPerformed

    private void easyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyButtonActionPerformed
        bot.setDifficulty(0);
        startGame();
    }//GEN-LAST:event_easyButtonActionPerformed

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardButtonActionPerformed
        bot.setDifficulty(2);
        startGame();
    }//GEN-LAST:event_hardButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void easyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyButtonMouseClicked

    }//GEN-LAST:event_easyButtonMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        CardLayout cl = (CardLayout)(gamePanel.getLayout());
        cl.show(gamePanel, "startCard");
        resetBoard();
        board00.setIcon(nullIcon);
        board01.setIcon(nullIcon);
        board02.setIcon(nullIcon);
        board10.setIcon(nullIcon);
        board11.setIcon(nullIcon);
        board12.setIcon(nullIcon);
        board20.setIcon(nullIcon);
        board21.setIcon(nullIcon);
        board22.setIcon(nullIcon);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void board00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board00ActionPerformed
        if(board[0][0] == 0) {
            board00.setIcon(xIcon);
            board[0][0] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board00ActionPerformed

    private void board01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board01ActionPerformed
        if(board[0][1] == 0) {
            board01.setIcon(xIcon);
            board[0][1] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board01ActionPerformed

    private void board02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board02ActionPerformed
        if(board[0][2] == 0) {
            board02.setIcon(xIcon);
            board[0][2] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board02ActionPerformed

    private void board10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board10ActionPerformed
        if(board[1][0] == 0) {
            board10.setIcon(xIcon);
            board[1][0] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board10ActionPerformed

    private void board11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board11ActionPerformed
        if(board[1][1] == 0) {
            board11.setIcon(xIcon);
            board[1][1] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board11ActionPerformed

    private void board12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board12ActionPerformed
        if(board[1][2] == 0) {
            board12.setIcon(xIcon);
            board[1][2] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board12ActionPerformed

    private void board20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board20ActionPerformed
        if(board[2][0] == 0) {
            board20.setIcon(xIcon);
            board[2][0] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board20ActionPerformed

    private void board21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board21ActionPerformed
        if(board[2][1] == 0) {
            board21.setIcon(xIcon);
            board[2][1] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board21ActionPerformed

    private void board22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board22ActionPerformed
        if(board[2][2] == 0) {
            board22.setIcon(xIcon);
            board[2][2] = 1;
            if(checkPlayerWin()){
            
            }
            else if(checkStalemate()) {
            
            }
            else botMove();
        }
    }//GEN-LAST:event_board22ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bot.setDifficulty(3);
        startGame();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TTTPanel;
    private javax.swing.JLabel TTTlabel;
    private javax.swing.JButton board00;
    private javax.swing.JButton board01;
    private javax.swing.JButton board02;
    private javax.swing.JButton board10;
    private javax.swing.JButton board11;
    private javax.swing.JButton board12;
    private javax.swing.JButton board20;
    private javax.swing.JButton board21;
    private javax.swing.JButton board22;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JButton easyButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton hardButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton mediumButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel startPanel;
    // End of variables declaration//GEN-END:variables
   
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTTContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            TTTContainer container = new TTTContainer();
            container.setLocationRelativeTo(null);
            container.setVisible(true);
        });
    }

}
