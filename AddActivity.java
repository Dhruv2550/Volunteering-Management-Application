import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;


public class AddActivity extends javax.swing.JPanel {

   
    public AddActivity() {
        initComponents();
        
try 
      {
      BufferedReader br=new BufferedReader(new FileReader("supervisors.csv"));
      
      cms.removeAllItems();
      supnum.removeAllItems();
      cms.addItem("Select");
      supnum.addItem("Select");
     
      String line;
     
      while ((line=br.readLine())!=null)
      {
      String supervisor[]=line.split(",");
      boolean check  = true;
      
      BufferedReader bm = new BufferedReader(new FileReader("activites.csv"));
      while ((line=bm.readLine())!=null)
      {
          String activity[] = line.split(",");
              if (supervisor[0].equals(activity[2]))
              {
                  check = false;   
              }
      }
      if (check == true){
      cms.addItem(supervisor[1]);
      supnum.addItem(supervisor[0]);
      }
      check = true;
      }
    }
      catch(Exception e){
          System.out.println("error: " + e);
      }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tima = new javax.swing.ButtonGroup();
        supnum = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nma = new javax.swing.JTextField();
        cms = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmp = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        ln = new javax.swing.JRadioButton();
        ad = new javax.swing.JRadioButton();
        db = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Acitivty");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name of Activity");

        cms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name of Supervisor");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Place of Activity");

        jLabel5.setText("Time of Activity");

        cmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "PE Hall", "Presentation Hall", "Quad", "Hall Entrance", "Lab" }));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        tima.add(ln);
        ln.setText("Lunch");

        tima.add(ad);
        ad.setText("All Day");

        tima.add(db);
        db.setText("Day Before");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nma)
                            .addComponent(cms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmp, 0, 155, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ad)
                                    .addComponent(ln)
                                    .addComponent(db))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(cms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(ln)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(db)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(save)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String name = "", sup = "", pla = "", t = "";

        name = nma.getText();
        nma.setText("");
        
        int ind = cms.getSelectedIndex();
        String supervisorid = supnum.getItemAt(ind).toString();
        
        sup = (String) cms.getSelectedItem();
        cms.setSelectedIndex(0);
        
        pla = (String) cmp.getSelectedItem();
        cmp.setSelectedIndex(0);
        
        tima.getSelection();
        ln.setSelected(false);
        ad.setSelected(false);
        db.setSelected(false);

        if (name != ""&&sup != "Select"&&pla != "Select"&&tima.getSelection() != null){

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("activites.csv", true));
            Random rand = new Random();
            int maxNumber = 5000;
            int randomNumber = rand.nextInt(maxNumber) + 1;
            
        if (ln.isSelected())
            t = ln.getText();
        
        if (ad.isSelected())
            t = ad.getText();
        
        if (db.isSelected())
            t = db.getText();
            bw.write(randomNumber + "," + name + "," + supervisorid + "," + pla + "," + t);
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null, "Data Saved!");
            
            cms.removeItemAt(ind);
            
        } catch (IOException s) {
            System.out.println("Error in writing to file" + s);
        }
        }
        else 
            JOptionPane.showMessageDialog(null, "Please Fill All Fields");
        
        System.exit(0);
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ad;
    private javax.swing.JComboBox<String> cmp;
    private javax.swing.JComboBox<String> cms;
    private javax.swing.JRadioButton db;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton ln;
    private javax.swing.JTextField nma;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> supnum;
    private javax.swing.ButtonGroup tima;
    // End of variables declaration//GEN-END:variables
}
