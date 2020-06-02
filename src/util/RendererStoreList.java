/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import model.Store;

/**
 *
 * @author Alexander
 */
public class RendererStoreList extends JPanel implements ListCellRenderer<Store> {
    private javax.swing.JLabel divider = new JLabel();
    private javax.swing.JLabel icon = new JLabel();
    private javax.swing.JLabel storeCnpj = new JLabel();
    private javax.swing.JLabel storeName = new JLabel();
    private javax.swing.JPanel panel = new JPanel();

    private PanelAddStore addStore = new PanelAddStore();

    //private StoreListScreen storeItem = new StoreListScreen();
    public RendererStoreList() {
        //this.setLayout(new BorderLayout(5, 5));
        
        renderItem();
        this.add(panel);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Store> list, Store store, int index, boolean isSelected,
            boolean cellHasFocus) {

        storeName.setText(store.getName());
        storeCnpj.setText(store.getCnpj());

        //storeName = store.getName();
        //storeCnpj = store.getCnpj();

        /*if (isSelected) {
            lbNome.setBackground(list.getSelectionBackground());
            lbValor.setBackground(list.getSelectionBackground());
            lbQuantidade.setBackground(list.getSelectionBackground());
            lbIcone.setBackground(list.getSelectionBackground());
            setBackground(list.getSelectionBackground());
            panelIcon.setBackground(list.getSelectionBackground());
        } else { // when don't select
            lbNome.setBackground(list.getBackground());
            lbValor.setBackground(list.getBackground());
            lbQuantidade.setBackground(list.getBackground());
            lbIcone.setBackground(list.getBackground());
            setBackground(list.getBackground());
            panelIcon.setBackground(list.getBackground());
        }*/
        return this;
    }

    public void renderItem() {
        icon = new javax.swing.JLabel();
        divider = new javax.swing.JLabel();
        storeName = new javax.swing.JLabel();
        storeCnpj = new javax.swing.JLabel();

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.setPreferredSize(new java.awt.Dimension(350, 250));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/store.png"))); // NOI18N

        divider.setBackground(new java.awt.Color(153, 153, 153));
        divider.setOpaque(true);

        storeName.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        storeName.setForeground(new java.awt.Color(51, 51, 51));
        storeName.setText("NOME DA EMPRESA");

        storeCnpj.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        storeCnpj.setForeground(new java.awt.Color(102, 102, 102));
        storeCnpj.setText("94.456.858/0001-09");
        storeCnpj.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(storeCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                        .addComponent(storeName, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                        .addComponent(divider, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(divider, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(storeName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(storeCnpj)
                                .addContainerGap())
        );
    }
}
