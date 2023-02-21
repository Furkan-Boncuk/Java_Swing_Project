import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Timer;

/*
* @author FURKAN BONCUK
 */
public class frmDemo extends javax.swing.JFrame {

    DefaultListModel model;

    public frmDemo() {
        initComponents();
        model = new DefaultListModel();
        lstStudents.setModel(model);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstStudents = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddStudent = new javax.swing.JButton();
        lblRemoveStudent = new javax.swing.JButton();
        lblRemoveSelected = new javax.swing.JButton();
        lblErrorMessage = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstStudents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstStudents.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstStudents);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Öğrenci Adı : ");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblAddStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddStudent.setText("Öğrenci Ekle");
        lblAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAddStudentActionPerformed(evt);
            }
        });

        lblRemoveStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRemoveStudent.setText("Öğrenciyi Sil");
        lblRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRemoveStudentActionPerformed(evt);
            }
        });

        lblRemoveSelected.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRemoveSelected.setText("Seçili Olan Öğrenciyi Sil");
        lblRemoveSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRemoveSelectedActionPerformed(evt);
            }
        });

        lblErrorMessage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(204, 0, 0));

        lblMessage.setBackground(new java.awt.Color(255, 255, 255));
        lblMessage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblAddStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRemoveStudent)))
                .addGap(26, 26, 26)
                .addComponent(lblRemoveSelected)
                .addGap(0, 163, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddStudent)
                    .addComponent(lblRemoveStudent))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRemoveSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>                        

    private void lblAddStudentActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(txtName.getText().isBlank()){
            lblErrorMessage.setText("Değer Girilmesi Zorunludur !");

            Timer timer = new Timer(1500, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    lblErrorMessage.setText("");
                }
            });
            timer.setRepeats(false);
            timer.start();
        }else{
            model.addElement(txtName.getText());
            lblMessage.setText("Öğrenci Eklendi : "+txtName.getText());
            txtName.setText("");
           
            //kullanıcıya vereceğimiz mesajın yalnızca belli bir süre ekranda durmasını istiyoruz:
            Timer timer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMessage.setText("");
            }
        });
        timer.setRepeats(false); //İşlemi yalnız 1 kez yapması için false değer verdik
        timer.start(); //timer'ı başlattık
        }
    }                                             

    private void lblRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if(txtName.getText().isBlank()){
            lblErrorMessage.setText("Silinecek Öğrenci Adı Yazılmadı !");
            Timer timer = new Timer(1500, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblErrorMessage.setText("");
                }
            });
            timer.setRepeats(false);
            timer.start();   
        } else{
            model.removeElement(txtName.getText());
            lblMessage.setText("Öğrenci Listeden Silindi : "+txtName.getText());
            txtName.setText("");
            
            Timer timer = new Timer(1500, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblMessage.setText("");

                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }                                                

    private void lblRemoveSelectedActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        int index = lstStudents.getSelectedIndex();
        if(index != -1){ // eğer seçili ifade yoksa getSelectedIndex() -1 veriyor.
            model.removeElementAt(index);
            lblMessage.setText("Seçili Öğrenci Silindi : ");
            
            Timer timer = new Timer(1500, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblMessage.setText("");
                }
            });
            timer.setRepeats(false);
            timer.start();
        }else{
            lblErrorMessage.setText("Seçili Bir Öğrenci Yok !");
            Timer timer = new Timer(1500, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblErrorMessage.setText("");
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }                                                 

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(frmDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblAddStudent;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JButton lblRemoveSelected;
    private javax.swing.JButton lblRemoveStudent;
    private javax.swing.JList<String> lstStudents;
    private javax.swing.JTextField txtName;
    // End of variables declaration                   

}
