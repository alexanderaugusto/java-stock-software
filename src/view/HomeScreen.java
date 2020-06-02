/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import util.RoundAvatar;

/**
 *
 * @author Alexander
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
        
        // Start home open
        menuClick(option1, option2, option3, option4, option5, option6);
        Home screen = new Home();
        screen.show();
        Items.add(screen);
        ((BasicInternalFrameUI) screen.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        options = new javax.swing.JPanel();
        option1 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        option2 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        option3 = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        option4 = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        option5 = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        option6 = new javax.swing.JPanel();
        icon6 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        Items = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        menu.setBackground(new java.awt.Color(0, 153, 204));
        menu.setPreferredSize(new java.awt.Dimension(400, 219));

        avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        avatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatarMouseClicked(evt);
            }
        });

        userName.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("NOME SOBRENOME");

        options.setBackground(new java.awt.Color(0, 153, 204));
        options.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        option1.setBackground(new java.awt.Color(30, 153, 204));
        option1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        option1.setName("no-selected"); // NOI18N
        option1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option1MouseExited(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_white_home_30px.png"))); // NOI18N

        label1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("HOME");

        javax.swing.GroupLayout option1Layout = new javax.swing.GroupLayout(option1);
        option1.setLayout(option1Layout);
        option1Layout.setHorizontalGroup(
            option1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        option1Layout.setVerticalGroup(
            option1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(option1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        options.add(option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        option2.setBackground(new java.awt.Color(30, 153, 204));
        option2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        option2.setName("no-selected"); // NOI18N
        option2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option2MouseExited(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_white_add_30px.png"))); // NOI18N

        label2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("NOVOS PRODUTOS");

        javax.swing.GroupLayout option2Layout = new javax.swing.GroupLayout(option2);
        option2.setLayout(option2Layout);
        option2Layout.setHorizontalGroup(
            option2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        option2Layout.setVerticalGroup(
            option2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(option2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        options.add(option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 60));

        option3.setBackground(new java.awt.Color(30, 153, 204));
        option3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        option3.setName("no-selected"); // NOI18N
        option3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option3MouseExited(evt);
            }
        });

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_white_sell_30px.png"))); // NOI18N

        label3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("VENDER");

        javax.swing.GroupLayout option3Layout = new javax.swing.GroupLayout(option3);
        option3.setLayout(option3Layout);
        option3Layout.setHorizontalGroup(
            option3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        option3Layout.setVerticalGroup(
            option3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(option3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        options.add(option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 60));

        option4.setBackground(new java.awt.Color(30, 153, 204));
        option4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        option4.setName("no-selected"); // NOI18N
        option4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option4MouseExited(evt);
            }
        });

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_white_store_30px.png"))); // NOI18N

        label4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("PRODUTOS");

        javax.swing.GroupLayout option4Layout = new javax.swing.GroupLayout(option4);
        option4.setLayout(option4Layout);
        option4Layout.setHorizontalGroup(
            option4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        option4Layout.setVerticalGroup(
            option4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, option4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(option4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        options.add(option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 60));

        option5.setBackground(new java.awt.Color(30, 153, 204));
        option5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        option5.setName("no-selected"); // NOI18N
        option5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option5MouseExited(evt);
            }
        });

        icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_white_moneybag_30px.png"))); // NOI18N

        label5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("VENDAS");

        javax.swing.GroupLayout option5Layout = new javax.swing.GroupLayout(option5);
        option5.setLayout(option5Layout);
        option5Layout.setHorizontalGroup(
            option5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        option5Layout.setVerticalGroup(
            option5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, option5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(option5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        options.add(option5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 300, 60));

        option6.setBackground(new java.awt.Color(30, 153, 204));
        option6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        option6.setName("no-selected"); // NOI18N
        option6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option6MouseExited(evt);
            }
        });

        icon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_white_deslog_30px.png"))); // NOI18N

        label6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("SAIR");

        javax.swing.GroupLayout option6Layout = new javax.swing.GroupLayout(option6);
        option6.setLayout(option6Layout);
        option6Layout.setHorizontalGroup(
            option6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(option6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(icon6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        option6Layout.setVerticalGroup(
            option6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, option6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(option6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        options.add(option6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 60));

        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_white_settings_30px.png"))); // NOI18N
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        close.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/i_white_close_40px.png"))); // NOI18N
        close.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avatar)
                .addGap(71, 71, 71))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        Items.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ItemsLayout = new javax.swing.GroupLayout(Items);
        Items.setLayout(ItemsLayout);
        ItemsLayout.setHorizontalGroup(
            ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        ItemsLayout.setVerticalGroup(
            ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Items, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
            .addComponent(Items, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked

        try {
            JFileChooser image = new JFileChooser();
            image.setFileFilter(new FileNameExtensionFilter("Imagem", "bmp", "png", "jpg", "jpeg"));
            image.setAcceptAllFileFilterUsed(false);
            image.setDialogTitle("Selecionar imagem");
            image.showOpenDialog(this);

            String imagePath = "" + image.getSelectedFile().getAbsolutePath();

            if (imagePath != null) {
                new RoundAvatar(avatar, imagePath);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_avatarMouseClicked

    private void option1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseClicked
        menuClick(option1, option2, option3, option4, option5, option6);
        Home screen = new Home();
        screen.show();
        Items.add(screen);
        ((BasicInternalFrameUI) screen.getUI()).setNorthPane(null);
    }//GEN-LAST:event_option1MouseClicked

    private void option2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseClicked
        menuClick(option2, option1, option3, option4, option5, option6);
        NewProducts screen = new NewProducts();
        screen.show();
        Items.add(screen);
        ((BasicInternalFrameUI) screen.getUI()).setNorthPane(null);
    }//GEN-LAST:event_option2MouseClicked

    private void option3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseClicked
        menuClick(option3, option1, option2, option4, option5, option6);
        SellProduct screen = new SellProduct();
        screen.show();
        Items.add(screen);
        ((BasicInternalFrameUI) screen.getUI()).setNorthPane(null);
    }//GEN-LAST:event_option3MouseClicked

    private void option4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseClicked
        menuClick(option4, option1, option2, option3, option5, option6);
        Products screen = new Products();
        screen.show();
        Items.add(screen);
        ((BasicInternalFrameUI) screen.getUI()).setNorthPane(null);
    }//GEN-LAST:event_option4MouseClicked

    private void option1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseEntered
        menuEntered(option1);
    }//GEN-LAST:event_option1MouseEntered

    private void option1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseExited
        menuExited(option1);
    }//GEN-LAST:event_option1MouseExited

    private void option2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseEntered
        menuEntered(option2);
    }//GEN-LAST:event_option2MouseEntered

    private void option2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseExited
        menuExited(option2);
    }//GEN-LAST:event_option2MouseExited

    private void option3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseEntered
        menuEntered(option3);
    }//GEN-LAST:event_option3MouseEntered

    private void option3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseExited
        menuExited(option3);
    }//GEN-LAST:event_option3MouseExited

    private void option4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseEntered
        menuEntered(option4);
    }//GEN-LAST:event_option4MouseEntered

    private void option4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseExited
        menuExited(option4);
    }//GEN-LAST:event_option4MouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void option6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option6MouseEntered
        menuEntered(option6);
    }//GEN-LAST:event_option6MouseEntered

    private void option6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option6MouseExited
        menuExited(option6);
    }//GEN-LAST:event_option6MouseExited

    private void option6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option6MouseClicked
        new LoginScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_option6MouseClicked

    private void option5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseClicked
        menuClick(option5, option1, option2, option3, option4, option6);
        Sell screen = new Sell();
        screen.show();
        Items.add(screen);
        ((BasicInternalFrameUI) screen.getUI()).setNorthPane(null);
    }//GEN-LAST:event_option5MouseClicked

    private void option5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseEntered
        menuEntered(option5);
    }//GEN-LAST:event_option5MouseEntered

    private void option5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseExited
        menuExited(option5);
    }//GEN-LAST:event_option5MouseExited

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Items;
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel close;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel option1;
    private javax.swing.JPanel option2;
    private javax.swing.JPanel option3;
    private javax.swing.JPanel option4;
    private javax.swing.JPanel option5;
    private javax.swing.JPanel option6;
    private javax.swing.JPanel options;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables

    private void menuClick(JPanel optionClick, JPanel noClick1, JPanel noClick2, JPanel noClick3, JPanel noClick4, JPanel noClick5) {
        optionClick.setBackground(new Color(70, 153, 204));
        optionClick.setName("selected");
        noClick1.setBackground(new Color(30, 153, 204));
        noClick1.setName("no-selected");
        noClick2.setBackground(new Color(30, 153, 204));
        noClick2.setName("no-selected");
        noClick3.setBackground(new Color(30, 153, 204));
        noClick3.setName("no-selected");
        noClick4.setBackground(new Color(30, 153, 204));
        noClick4.setName("no-selected");
        noClick5.setBackground(new Color(30, 153, 204));
        noClick5.setName("no-selected");
    }

    private void menuEntered(JPanel option) {
        option.setBackground(new Color(60, 153, 204));
    }

    private void menuExited(JPanel option) {
        if (option.getName().equals("selected")) {
            option.setBackground(new Color(70, 153, 204));
        } else {
            option.setBackground(new Color(30, 153, 204));
        }
    }
}
