package staff_view;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.GuestModel;
import model.HallManager;
import model.MapStaffAndStudent;
import model.Student;
import view.LoginForm;
import model.HallManager;
import model.MapStaffAndStudent;
import model.Student;

public class HallManagerView extends javax.swing.JFrame {

    public static String hallName;
    
    public HallManagerView(String hallName) {
        initComponents();
        
        //setting for main frame
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.addListener();
        
        //set hall name
        HallManagerView.hallName = hallName;   
        
        //add bench to table
        addRowHallManagerTable();
        
        //setting view student in bench frame
        this.viewStudentFrame.setSize(555, 380);
        this.viewStudentFrame.setResizable(false);
        this.viewStudentFrame.setLocationRelativeTo(null);
        //this.setSize(400, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.addListener();
        HallManagerView.hallName = hallName;    
        addRowHallManagerTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        removeMenuItem = new javax.swing.JMenuItem();
        viewStudentFrame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewGuestForm = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        staffMenu = new javax.swing.JMenu();
        viewBenchMenuItem = new javax.swing.JMenuItem();
        viewBookingGuestMenuItem = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        staffMenu = new javax.swing.JMenu();

        removeMenuItem.setText("Remove");
        popupMenu.add(removeMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hall Bench");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setResizable(false);
            studentTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            studentTable.getColumnModel().getColumn(1).setResizable(false);
            studentTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hall Bench");

        javax.swing.GroupLayout viewStudentFrameLayout = new javax.swing.GroupLayout(viewStudentFrame.getContentPane());
        viewStudentFrame.getContentPane().setLayout(viewStudentFrameLayout);
        viewStudentFrameLayout.setHorizontalGroup(
            viewStudentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStudentFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        viewStudentFrameLayout.setVerticalGroup(
            viewStudentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewStudentFrameLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        studentTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(studentTable1);
        if (studentTable1.getColumnModel().getColumnCount() > 0) {
            studentTable1.getColumnModel().getColumn(0).setResizable(false);
            studentTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            studentTable1.getColumnModel().getColumn(1).setResizable(false);
            studentTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hall Bench");

        javax.swing.GroupLayout viewGuestFormLayout = new javax.swing.GroupLayout(viewGuestForm.getContentPane());
        viewGuestForm.getContentPane().setLayout(viewGuestFormLayout);
        viewGuestFormLayout.setHorizontalGroup(
            viewGuestFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewGuestFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        viewGuestFormLayout.setVerticalGroup(
            viewGuestFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewGuestFormLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hall Manager");

        staffMenu.setText("View");

        viewBenchMenuItem.setText("View Bench");
        viewBenchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBenchMenuItemActionPerformed(evt);
            }
        });
        staffMenu.add(viewBenchMenuItem);

        viewBookingGuestMenuItem.setText("View Guest Booking");
        viewBookingGuestMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingGuestMenuItemActionPerformed(evt);
            }
        });
        staffMenu.add(viewBookingGuestMenuItem);

        staffMenu.setText("View");
        jMenuBar1.add(staffMenu);
        staffMenu.getAccessibleContext().setAccessibleName("Form");

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(521, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(logoutButton)
                .addContainerGap(61, Short.MAX_VALUE))        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    public static void addRowHallManagerTable() {
        DefaultTableModel table = (DefaultTableModel) studentTable.getModel();      
        String id, hall;
        
        for(Map.Entry<String, String> student : HallManager.getListStudentID().entrySet()){           
            id = student.getKey();
            hall = student.getValue();
            
            // add to table
            if(hall.equals(hallName)){
               table.addRow(new Object[]{id, hall}); 
            }  
            
        }
        
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewBenchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBenchMenuItemActionPerformed
        this.viewStudentFrame.setVisible(true);
    }//GEN-LAST:event_viewBenchMenuItemActionPerformed

    private void viewBookingGuestMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingGuestMenuItemActionPerformed
        viewGuestForm.setVisible(true);
    }//GEN-LAST:event_viewBookingGuestMenuItemActionPerformed
    
    private void addListener() {
        studentTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    doubleClickOnTable(studentTable);
                }
            }
        });

        //
        studentTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    popupMenu.show(studentTable, e.getX(), e.getY());
                }
            }
        });
    }

    private void doubleClickOnTable(Component evt) {
        int row = studentTable.getSelectedRow();
        StringBuilder sBuilder = new StringBuilder();
        
        

        try {
            String id = (String) studentTable.getValueAt(row, 0);
            Student student = MapStaffAndStudent.mapStudentAccount.get(id);
            
            //show form to create room
            new CreateStudentRoom(student, student.getGenderIdx(),
                           student.getMajorIdx(), hallName, row).setVisible(true);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(evt, "Please Sellect Student!");
        }

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
            java.util.logging.Logger.getLogger(HallManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HallManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HallManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HallManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HallManagerView().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenuItem removeMenuItem;
    private javax.swing.JMenu staffMenu;
    public static javax.swing.JTable studentTable;
    public static javax.swing.JTable studentTable1;
    private javax.swing.JMenuItem viewBenchMenuItem;
    private static javax.swing.JMenuItem viewBookingGuestMenuItem;
    private javax.swing.JFrame viewGuestForm;
    private javax.swing.JFrame viewStudentFrame;
    // End of variables declaration//GEN-END:variables
}
