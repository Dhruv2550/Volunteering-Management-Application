import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class AssignVolunteers extends javax.swing.JPanel {

    public AssignVolunteers() {
        initComponents();
        
        try{
            BufferedReader bx = new BufferedReader(new FileReader("volunteers.csv"));

                  vlt.removeAllItems();
                  vltnum.removeAllItems();
                  vltnum.addItem("Select");
                  vlt.addItem("Select");

                  String line;
                  while ((line=bx.readLine())!=null)
                  {
                  String volunteer[]=line.split(",");
                  vlt.addItem(volunteer[1]);
                  vltnum.addItem(volunteer[0]);
                  }
        bx.close();
    }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            BufferedReader bz = new BufferedReader(new FileReader("activites.csv"));
            
                  act.removeAllItems();
                  actnum.removeAllItems();
                  act.addItem("Select");
                  actnum.addItem("Select");

                  String line;
                  while ((line=bz.readLine())!=null)
                  {
                  String activity[]=line.split(",");
                  act.addItem(activity[1]);
                  actnum.addItem(activity[0]);
                  }
        bz.close();
    }catch(Exception e){
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vltnum = new javax.swing.JComboBox<>();
        actnum = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        vlt = new javax.swing.JComboBox<>();
        act = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Assign Volunteers");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Volunteer");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Activity");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        vlt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        act.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vlt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(act, 0, 183, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(save)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String volunt = "", activity = "";
        
        int ind = vlt.getSelectedIndex();
        String volunteerid = vltnum.getItemAt(ind).toString();
        
        int indtwo = act.getSelectedIndex();
        String activityid = actnum.getItemAt(indtwo).toString();
        
        volunt = (String) vlt.getSelectedItem();
        vlt.setSelectedIndex(0);
        
        activity = (String) act.getSelectedItem();
        act.setSelectedIndex(0);
        
        int numb = 0;
           
        try{
            BufferedReader bo = new BufferedReader(new FileReader("volunteerreportinfo.csv"));
                  String line;
                  while ((line=bo.readLine())!=null)
                  {
                  String num[]=line.split(",");
                  if (num[2]==activity)
                  {
                      System.out.println(activity);
                      System.out.println(num[2]);
                      numb = numb + 1; 
                      System.out.println(numb);
                  }
                  }
        bo.close();
    }catch(Exception e){
            System.out.println(e);
        }
        
       
        if (volunt != "Select"&&activity != "Select"){

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("assignedactivity.csv", true));
            bw.write(volunteerid + "," + activityid);
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null, "Data Saved!");
            
        } catch (IOException s) {
            System.out.println("Error in writing to file" + s);
        }

        }
        
        else if (numb >= 5){
            JOptionPane.showMessageDialog(null, "You have enough volunteers for this activity");
        }
        else 
            JOptionPane.showMessageDialog(null, "Please Fill All Fields");
        
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("volunteerreportinfo.csv", true));
            bw.write(volunt + "," + activityid + "," + activity);
            bw.newLine();
            bw.close();
            
        } catch (IOException s) {
            System.out.println("Error in writing to file" + s);
        }
        
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> act;
    private javax.swing.JComboBox<String> actnum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> vlt;
    private javax.swing.JComboBox<String> vltnum;
    // End of variables declaration//GEN-END:variables
}
