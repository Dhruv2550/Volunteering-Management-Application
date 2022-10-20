import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class Attendance extends javax.swing.JPanel {

    public Attendance() {
        initComponents();

try 
      {
      BufferedReader br=new BufferedReader(new FileReader("activites.csv"));
      act.removeAllItems();
      act.addItem("Select");
      String line;
      while ((line=br.readLine())!=null)
      {
      String acti[]=line.split(",");
      act.addItem(acti[1]);
      }
    }
      catch(Exception e){
          System.out.println("error: " + e);
      }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vlnm = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        act = new javax.swing.JComboBox<>();
        go = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Attendance");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Volunteer");

        vlnm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jButton1.setText("Present");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Absent");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Activity");

        act.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        go.setText("Go");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(go)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vlnm, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(vlnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
    String actnm = "";

    actnm = (String) act.getSelectedItem();
    act.setSelectedIndex(0);
    

try 
      {
      BufferedReader br=new BufferedReader(new FileReader("volunteerreportinfo.csv"));
      vlnm.removeAllItems();
      vlnm.addItem("Select");
      String line;
      while ((line=br.readLine())!=null)
      {
      String volunt[]=line.split(",");
      String nmx = volunt[2];
      if (actnm.equals(nmx))
      {
          vlnm.addItem(volunt[0]);
      }
      }
    }
      catch(Exception e){
          System.out.println("error: " + e);
      }
    }//GEN-LAST:event_goActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String voluname = "";
     
    int ind = vlnm.getSelectedIndex();
       
    voluname = (String) vlnm.getSelectedItem();
    vlnm.setSelectedIndex(0);
        
        if (voluname != "Select"){

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("attendance.csv", true));
            bw.write(voluname + ":" + "Present");
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null, "Data Saved!");
            
            vlnm.removeItemAt(ind);
            
        } catch (IOException s) {
            System.out.println("Error in writing to file" + s);
        }
        }
        else 
            JOptionPane.showMessageDialog(null, "Please Fill All Fields");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String voluname = "";
     
    int ind = vlnm.getSelectedIndex();
       
    voluname = (String) vlnm.getSelectedItem();
    vlnm.setSelectedIndex(0);
        
        if (voluname != "Select"){

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("attendance.csv", true));
            bw.write(voluname + ":" + "Absent");
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null, "Data Saved!");
            
            vlnm.removeItemAt(ind);
            
        } catch (IOException s) {
            System.out.println("Error in writing to file" + s);
        }
        }
        else 
            JOptionPane.showMessageDialog(null, "Please Fill All Fields");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> act;
    private javax.swing.JButton go;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> vlnm;
    // End of variables declaration//GEN-END:variables
}
