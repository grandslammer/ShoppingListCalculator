
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trainee
 */
public class ShopGUI extends javax.swing.JFrame {

    static String selection;
    static String selectedPrice;
    static int quantity = 0;
    static double subTotal;
    
    static DecimalFormat d = new DecimalFormat("#.##");
    /**
     * Creates new form ShopGUI
     */
    public ShopGUI() {
        initComponents();
        displayControls(false);
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
        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstShoppingList = new javax.swing.JList<>();
        btnNewitem = new javax.swing.JButton();
        btnCostExclVat = new javax.swing.JButton();
        btnCostInclVat = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblVat = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        txtVat = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeader.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblHeader.setText("Shopping List");
        jPanel1.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 58, -1, -1));

        lstShoppingList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tea bags", "Milk", "Eggs", "Potatoes", "Carrots", "Fish", "Beef", "Chicken" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstShoppingList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lstShoppingList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstShoppingListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstShoppingList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 201, 163, -1));

        btnNewitem.setText("New Item");
        btnNewitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewitemActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 567, -1, -1));

        btnCostExclVat.setText("Cost Excl Vat");
        btnCostExclVat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostExclVatActionPerformed(evt);
            }
        });
        jPanel1.add(btnCostExclVat, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 567, -1, -1));

        btnCostInclVat.setText("Cost Incl Vat");
        btnCostInclVat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostInclVatActionPerformed(evt);
            }
        });
        jPanel1.add(btnCostInclVat, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 567, -1, -1));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(894, 567, -1, -1));

        lblPrice.setText("Price:");
        jPanel1.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 205, -1, -1));

        lblQuantity.setText("Quantity:");
        jPanel1.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        lblSubTotal.setText("sub Total:");
        jPanel1.add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 328, -1, -1));

        lblVat.setText("VAT:");
        jPanel1.add(lblVat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 397, -1, -1));

        lblTotal.setText("Total:");
        lblTotal.setToolTipText("");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 458, -1, -1));

        txtPrice.setEditable(false);
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 201, 80, -1));

        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 266, 80, -1));

        txtSubTotal.setEditable(false);
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 324, 80, -1));

        txtVat.setEditable(false);
        txtVat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtVat, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 393, 80, -1));

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 450, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnNewitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewitemActionPerformed
        // TODO add your handling code here:
        displayControls(false);
        txtPrice.setText("");
        txtQuantity.setText("");
        txtSubTotal.setText("");
        txtTotal.setText("");
        txtVat.setText("");
    }//GEN-LAST:event_btnNewitemActionPerformed

    private void displayControls(boolean onOff) {
        btnCostExclVat.setVisible(onOff);
        btnCostInclVat.setVisible(onOff);
        btnNewitem.setVisible(onOff);
        lblPrice.setVisible(onOff);
        lblQuantity.setVisible(onOff);
        lblSubTotal.setVisible(onOff);
        lblTotal.setVisible(onOff);
        lblVat.setVisible(onOff);
        txtPrice.setVisible(onOff);
        txtQuantity.setVisible(onOff);
        txtSubTotal.setVisible(onOff);
        txtTotal.setVisible(onOff);
        txtVat.setVisible(onOff);
    }
    private void lstShoppingListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstShoppingListValueChanged
        // TODO add your handling code here:
        displayControls(true);

        selection = lstShoppingList.getSelectedValue();

        double teaBagsPrice = 2.50;
        double milkPrice = 1.99;
        double eggsPrice = 1.60;
        double potatoesPrice = 5.50;
        double carrotsPrice = 1.00;
        double fishPrice = 6.50;
        double beefPrice = 4.50;
        double chickenPrice = 4.99;

        switch (selection) {
            case "Tea bags":
                txtPrice.setText("2.50");
            case "Milk":
                txtPrice.setText("1.99");
            case "Eggs":
                txtPrice.setText("1.60");
            case "Potatoes":
                txtPrice.setText("5.50");
            case "Carrots":
                txtPrice.setText("1.00");
            case "Fish":
                txtPrice.setText("6.50");
            case "Beef":
                txtPrice.setText("4.50");
            case "Chicken":
                txtPrice.setText("4.99");
        }
    }//GEN-LAST:event_lstShoppingListValueChanged

    private void btnCostExclVatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostExclVatActionPerformed
        // TODO add your handling code here:
        selectedPrice = txtPrice.getText();
        double dblPrice = Double.parseDouble(selectedPrice);
        
        try {
            quantity = Integer.parseInt(txtQuantity.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid quantity!");
        }
        
        subTotal = dblPrice * quantity;
        txtSubTotal.setText(String.valueOf(subTotal));
    }//GEN-LAST:event_btnCostExclVatActionPerformed

    private void btnCostInclVatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostInclVatActionPerformed
        // TODO add your handling code here:
        double vat = subTotal / 0.25;
        txtVat.setText(String.valueOf(vat));
        
        double total = subTotal * 1.25;
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnCostInclVatActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); //Exits program
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(ShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopGUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostExclVat;
    private javax.swing.JButton btnCostInclVat;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewitem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVat;
    private javax.swing.JList<String> lstShoppingList;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVat;
    // End of variables declaration//GEN-END:variables
}
