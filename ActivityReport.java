import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class ActivityReport extends javax.swing.JPanel {


    public ActivityReport() {
        initComponents();
        
try 
      {
      BufferedReader br=new BufferedReader(new FileReader("volunteers.csv"));
      vlnm.removeAllItems();
      vlnm.addItem("Select");
      String line;
      while ((line=br.readLine())!=null)
      {
      String activity[]=line.split(",");
      vlnm.addItem(activity[1]);
      }
       
    }
      catch(Exception e){
          System.out.println("error: " + e);
      }

    txtarea.setEditable(false);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vlid = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vlnm = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        view = new javax.swing.JButton();

        vlid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Activity Report");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Volunteer Name");

        vlnm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(73, 73, 73)
                                .addComponent(vlnm, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(view)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vlnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(view)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        String name = vlnm.getSelectedItem().toString();

        vlnm.setSelectedIndex(0);
        txtarea.setText("");
        
        if (name != "Select")
        {
try 
      {
      BufferedReader br=new BufferedReader(new FileReader("volunteerreportinfo.csv"));
      String line;
      while ((line=br.readLine())!=null)
      {
      String volunteer[]=line.split(",");
      String volname = volunteer[0];

      if (name.equals(volname)){
          txtarea.setText(volunteer[2]);
      }
      }
       
    }
      catch(Exception e){
          System.out.println("error: " + e);
      }
        }  

    else
        JOptionPane.showMessageDialog(null, "Please Fill All Fields");
        
            
       
    }//GEN-LAST:event_viewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JButton view;
    private javax.swing.JComboBox<String> vlid;
    private javax.swing.JComboBox<String> vlnm;
    // End of variables declaration//GEN-END:variables
}
