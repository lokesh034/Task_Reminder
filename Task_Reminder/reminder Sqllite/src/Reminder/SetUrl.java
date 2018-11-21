
package Reminder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SetUrl extends javax.swing.JFrame implements Serializable {

 
    private static String url;
    public SetUrl() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        setUrl = new javax.swing.JFileChooser();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setUrl.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        setUrl.setApproveButtonText("Set Path\n");
        setUrl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setUrlMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                setUrlMouseReleased(evt);
            }
        });
        setUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUrlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(setUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setUrlActionPerformed
        url=setUrl.getCurrentDirectory().toString();
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try
        {
            String current = new java.io.File( "." ).getCanonicalPath();
            fos=new FileOutputStream(current+"\\urlInfo.ser");
            System.out.println(current+"\\urlInfo.ser");
            oos=new ObjectOutputStream(fos);
            CollectionUrl cu=new CollectionUrl();
            cu.setFlag(1);
            cu.setPath(url);
            oos.writeObject(cu);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SetUrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SetUrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
          
            try {
                oos.close();
                 fos.close();
                } catch (IOException ex) {
                Logger.getLogger(SetUrl.class.getName()).log(Level.SEVERE, null, ex);
              } 
           }     
                ReminderUI rui=new ReminderUI();
                rui.setVisible(true);
                this.setVisible(false);
          
    }//GEN-LAST:event_setUrlActionPerformed

    private void setUrlMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setUrlMouseReleased
     
    }//GEN-LAST:event_setUrlMouseReleased

    private void setUrlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setUrlMouseClicked
       
     
    }//GEN-LAST:event_setUrlMouseClicked

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetUrl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser setUrl;
    // End of variables declaration//GEN-END:variables
}
