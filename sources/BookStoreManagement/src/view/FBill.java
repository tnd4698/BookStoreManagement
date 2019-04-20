/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BillController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tnd
 */
public class FBill extends javax.swing.JFrame {
    BillController Controller=new BillController();
    /**
     * Creates new form FBill
     */
    private static FBill instance=null;
    public static FBill getInstance(){
        if(instance==null)
            instance=new FBill();
        return instance;
    }
    private FBill() {
        initComponents();
        reload();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCustomer = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txfDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        spCount = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBill = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txfValue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txfMoneyReceive = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txfChange = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lập hóa đơn");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Lập hóa đơn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(409, 409, 409))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nhập thông tin hóa đơn");

        jLabel4.setText("Khách hàng");

        jLabel5.setText("Ngày hóa đơn");

        jLabel6.setText("Sách");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton1.setText("Tìm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Số lượng", "Giá bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBook);

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Xóa");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel10.setText("Số lượng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnUpdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRemove)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAdd))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(40, 40, 40)
                                        .addComponent(spCount))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel6)
                                    .addComponent(cbCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(txfDate)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(spCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnUpdate))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Hóa đơn");

        tableBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Số lượng", "Giá bán", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableBill);

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setText("Tạo mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel7.setText("Trị giá hóa đơn");

        txfValue.setEnabled(false);

        jLabel8.setText("Số tiền nhận");

        txfMoneyReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMoneyReceiveActionPerformed(evt);
            }
        });

        jLabel9.setText("Còn lại");

        txfChange.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNew)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfMoneyReceive, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(txfChange))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfValue, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txfMoneyReceive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnSave)
                    .addComponent(btnNew))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        FManagement.getInstance().setVisible(true);
        FBill.getInstance().setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controller.searchBook(txfSearch.getText(),tableBook);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            String name=tableBook.getModel().getValueAt(tableBook.getSelectedRow(),2).toString();
            String id=tableBook.getModel().getValueAt(tableBook.getSelectedRow(),1).toString();
            int count= (int)spCount.getValue();
            float price=Float.parseFloat(tableBook.getModel().getValueAt(tableBook.getSelectedRow(),4).toString());
            float total=count*price;
            if(checkContain()==-1)
            {
                Object[] row=new Object[]{
                tableBill.getRowCount()+1,
                id,
                name,
                count,
                price,
                total
                };
                DefaultTableModel model = (DefaultTableModel) tableBill.getModel();
                model.addRow(row);
            }
            else
            {
                int rowIndex=checkContain();
                int countTable=Integer.parseInt(tableBill.getModel().getValueAt(rowIndex, 3).toString())+(int)spCount.getValue();
                float priceTable=Float.parseFloat(tableBook.getModel().getValueAt(tableBook.getSelectedRow(),4).toString());
                float totalTable=countTable*priceTable;
                tableBill.getModel().setValueAt(countTable, rowIndex, 3);
                tableBill.getModel().setValueAt(priceTable, rowIndex, 4);
                tableBill.getModel().setValueAt(totalTable, rowIndex, 5);
            }

            float value=0;
            for(int i=0;i<tableBill.getRowCount();i++)
                value+=Float.parseFloat(tableBill.getModel().getValueAt(i, 5).toString());
            txfValue.setText(String.valueOf(value));
            
            float moneyReceive=Float.parseFloat(txfMoneyReceive.getText());
            txfChange.setText(String.valueOf(Float.parseFloat(txfValue.getText())-moneyReceive));
        }
        catch(Exception e){}
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try{
            ((DefaultTableModel)tableBill.getModel()).removeRow(tableBill.getSelectedRow());
            for(int i=0;i<tableBill.getRowCount();i++)
                tableBill.getModel().setValueAt(i+1,i,0);
        }catch(Exception e){           
        }
        
        float value=0;
        for(int i=0;i<tableBill.getRowCount();i++)
            value+=Float.parseFloat(tableBill.getModel().getValueAt(i, 5).toString());
        txfValue.setText(String.valueOf(value));
        
        float moneyReceive=Float.parseFloat(txfMoneyReceive.getText());
        txfChange.setText(String.valueOf(Float.parseFloat(txfValue.getText())-moneyReceive));
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            int rowIndex=tableBill.getSelectedRow();
            int countTable=Integer.parseInt(tableBill.getModel().getValueAt(rowIndex, 3).toString());
            float priceTable=Float.parseFloat(tableBill.getModel().getValueAt(rowIndex, 4).toString());
            float totalTable=countTable*priceTable;
            tableBill.getModel().setValueAt(totalTable, rowIndex, 5);


            float value=0;
            for(int i=0;i<tableBill.getRowCount();i++)
                value+=Float.parseFloat(tableBill.getModel().getValueAt(i, 5).toString());
            txfValue.setText(String.valueOf(value));
            
            float moneyReceive=Float.parseFloat(txfMoneyReceive.getText());
            txfChange.setText(String.valueOf(Float.parseFloat(txfValue.getText())-moneyReceive));
            
        }catch(Exception e){}
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txfMoneyReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMoneyReceiveActionPerformed
        try{
            float moneyReceive=Float.parseFloat(txfMoneyReceive.getText());
            txfChange.setText(String.valueOf(Float.parseFloat(txfValue.getText())-moneyReceive));
        }catch(Exception e){
            JOptionPane.showConfirmDialog(FCategoryBook.getInstance(), "Nhập dữ liệu không đúng định dạng !","Thông báo", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_txfMoneyReceiveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        reload();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int rowCount=tableBill.getRowCount();
        String[][]data=new String[rowCount][4];
        for(int i=0;i<rowCount;i++)
        {
            data[i][0]=tableBill.getModel().getValueAt(i, 1).toString();
            data[i][1]=tableBill.getModel().getValueAt(i, 3).toString();
            data[i][2]=tableBill.getModel().getValueAt(i, 4).toString();
            data[i][3]=tableBill.getModel().getValueAt(i, 5).toString();
        }
        String date=txfDate.getText();
        String value=txfValue.getText();
        String moneyReceive=txfMoneyReceive.getText();
        String moneyChange=txfChange.getText();
        String customerID=cbCustomer.getSelectedItem().toString().split(":")[1];
        
        
        try {
            if(Controller.AddBill(data,date,value,moneyReceive,moneyChange,customerID))
            {
                JOptionPane.showConfirmDialog(FCategoryBook.getInstance(), "Lưu hóa đơn thành công !","Thông báo", JOptionPane.OK_OPTION);
                loadBook();
            }
            else
            {
                JOptionPane.showConfirmDialog(FCategoryBook.getInstance(), "Lưu hóa đơn thất bại !","Thông báo", JOptionPane.OK_OPTION);
                
            }
        } catch (ParseException ex) {
            Logger.getLogger(FBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FBill.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbCustomer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spCount;
    private javax.swing.JTable tableBill;
    private javax.swing.JTable tableBook;
    private javax.swing.JTextField txfChange;
    private javax.swing.JTextField txfDate;
    private javax.swing.JTextField txfMoneyReceive;
    private javax.swing.JTextField txfSearch;
    private javax.swing.JTextField txfValue;
    // End of variables declaration//GEN-END:variables

    public void reload() {
        loadCustomer();
        loadDate();
        loadBook();
        
        txfValue.setText("0");
        txfMoneyReceive.setText("0");
        txfChange.setText("0");
        spCount.setValue(0);
        txfSearch.setText("");
        
        tableBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Số lượng", "Giá bán", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableBill);
    }

    private void loadCustomer() {
        Controller.loadCustomer(cbCustomer);
    }
        private void loadDate() {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        Date date=new Date();
        date.getTime();
        txfDate.setText(df.format(date));
    }

    
    private int checkContain()
    {
        String id=tableBook.getModel().getValueAt(tableBook.getSelectedRow(),1).toString();
        for(int i=0;i<tableBill.getRowCount();i++)
        {
            if(tableBill.getModel().getValueAt(i, 1).toString().equals(id))
                return i;
        }
        return -1;
    }

    private void loadBook() {
        Controller.loadBook(tableBook);
    }
}