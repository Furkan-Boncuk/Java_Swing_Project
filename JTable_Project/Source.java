import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public NewJFrame() {
        initComponents();
        model = (DefaultTableModel) tblCountry.getModel(); 
        //Country table'ının modeli. Casting ile DefaultTableModel tipine çeviririz
        try{
            ArrayList<City> cityList = getCities(); //getCities() metodu bize CityList arraylist'ini dönecek.
            for(City city : cityList){
                Object[] row = {city.getCountry_id(),city.getCountry(),city.getLast_update()};
                model.addRow(row); //Satırlarımızı ekleyelim
            }
        }catch(SQLException e){
            DBHelper.showErrorMessage(e);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCountry = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCountry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Country_id", "Country", "Last_Update"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCountry);
        if (tblCountry.getColumnModel().getColumnCount() > 0) {
            tblCountry.getColumnModel().getColumn(0).setResizable(false);
            tblCountry.getColumnModel().getColumn(1).setResizable(false);
            tblCountry.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    public ArrayList<City> getCities() throws SQLException{
            Connection connection = null;
            DBHelper dbHelper = new DBHelper();
            Statement statement = null;
            ResultSet resultSet;
            ArrayList<City> cityList = null;
            
            
            try{
                connection = dbHelper.getConnection();
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM Country");
                cityList = new ArrayList<>();
                //cursor mantığı ile verileri dolaşacağız
                while(resultSet.next()){
                    cityList.add(new City(resultSet.getInt("country_id"),
                            resultSet.getString("country"),
                            resultSet.getString("last_update")
                    )); 
                }
            }catch(SQLException e){
                dbHelper.showErrorMessage(e);
            }finally{
                connection.close();
                statement.close();
            }
            
            return cityList;
        }

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCountry;
    // End of variables declaration                   
}
