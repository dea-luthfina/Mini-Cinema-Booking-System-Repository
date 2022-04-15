/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import javax.swing.table.DefaultTableModel;

// OOP import
import Core.Human;
import javax.swing.JOptionPane;

/**
 *
 * @author Prio
 */
public class Admin extends javax.swing.JFrame {
    // inisiasi Human
    Human human = new Human();

    // Variable table model
    private DefaultTableModel model;

    // Variable table temporary model
    private DefaultTableModel tempModel;
    
    // Variable current id
    private int id = 0;
    
    // Varieble id yang dipilih
    private int selectedId = 0;

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
       
        // Memanggil fungsi init table
        this.initTable();
    }
    
    private void initTable() {
        // Initialize Table
        model = new DefaultTableModel();
        tb_data.setModel(model);
        
        // Menambahkan kolom awal pada bagian atas
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Phone Number");
        model.addColumn("Film");
        model.addColumn("Day");
        model.addColumn("Time");
        model.addColumn("Ticket Amount");
        model.addColumn("Total Price");
        model.addColumn("Seats");
        model.addColumn("Studio");
    }

    private void store() {
        String name = this.human.getName();
        this.human.setName(name);

        String phone = this.human.getPhone();
        this.human.setPhone(phone);

        String film = this.human.getTitle();
        this.human.setTitle(film);
        
        String day  = this.human.getDay();
        this.human.setDay(day);

        String time = this.human.getTime();
        this.human.setTime(time);

        String amount = this.human.getAmount();
        this.human.setAmount(amount);

        String total = this.human.getTotal();
        this.human.setTotal(total);

        String seats = this.human.getSeats();
        this.human.setSeats(seats);

        String studio = this.human.getStudio();
        this.human.setStudio(studio);

        this.id = this.id + 1;
        String id = String.valueOf(this.id);

        Object[] obj = new Object[]{
            id,
            name,
            phone,
            film,
            day,
            time,
            amount,
            total,
            seats,
            studio,
        };
        
        this.model.addRow(obj);
    }

    // Fungsi untuk mengubah data yang ada pada tabel
    private void update() {
        String selectedId = String.valueOf(this.selectedId);

        String name = this.human.getName();
        this.human.setName(name);

        String phone = this.human.getPhone();
        this.human.setPhone(phone);

        String film = this.human.getTitle();
        this.human.setTitle(film);
        
        String day  = this.human.getDay();
        this.human.setDay(day);

        String time = this.human.getTime();
        this.human.setTime(time);

        String amount = this.human.getAmount();
        this.human.setAmount(amount);

        String total = this.human.getTotal();
        this.human.setTotal(total);

        String seats = this.human.getSeats();
        this.human.setSeats(seats);

        String studio = this.human.getStudio();
        this.human.setStudio(studio);
        
        for (int i = 0; model.getRowCount() > i; i++) {
            String id = (String) model.getValueAt(i, 0);
            
            if (id.equals(selectedId)) {
                model.setValueAt(name, i, 1);
                model.setValueAt(phone, i, 2);
                model.setValueAt(film, i, 3);
                break;
            }
        }
    }

    // fungsi search untuk mouse ditekan dan tombol pencarian (refactor)
    private void search(String _id) {
        String name = null;
        String phone = null;
        String gender = null;

        // Pencarian baris dan kolom pada model tabel
        for (int i = 0; model.getRowCount() > i; i++) {
            String id = (String) model.getValueAt(i, 0); //1
            
            if (id.equals(_id)) {
                this.selectedId = Integer.parseInt(id);
                
                name = (String) model.getValueAt(i, 1);
                phone = (String) model.getValueAt(i, 2);
                gender = (String) model.getValueAt(i, 3);
                
                // Tombol 
                btn_delete.setVisible(true);
                break;
            }
            
        }
        
        if(name == null) {
            this.selectedId = 0;
        }
        
        tf_name.setText(name);
        tf_phone.setText(phone);
        cb_gender.setSelectedItem(gender);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        bt_reset = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_data);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel1.setText("CINEMOUNT");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel2.setText("MINI CINEMA");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel3.setText("ADMIN's MENU");

        bt_save.setText("Save");

        jButton2.setText("Reset");

        bt_exit.setText("Exit");

        bt_reset.setText("Back");

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel4.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(bt_reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_exit)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(79, 79, 79)
                        .addComponent(bt_save)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(418, 418, 418)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(431, 431, 431)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_search))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_save)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_exit)
                    .addComponent(bt_reset))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        tempModel = new DefaultTableModel();
        tb_data.setModel(tempModel);

        // Menambahkan kolom awal pada bagian atas
        tempModel.addColumn("ID");
        tempModel.addColumn("Name");
        tempModel.addColumn("Phone Number");
        tempModel.addColumn("Gender");

        String id = tf_search.getText();

        this.search(id);

        if (this.selectedId < 1) {
            JOptionPane.showMessageDialog(null, "We can't found any data",
                "Data not found", JOptionPane.INFORMATION_MESSAGE);
            this.resetForm();
            return;
        }

        Object[] obj = new Object[]{
            this.selectedId,
            tf_name.getText(),
            tf_phone.getText(),
            cb_gender.getSelectedItem().toString()
        };

        tempModel.addRow(obj);
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_reset;
    private javax.swing.JButton bt_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_data;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
