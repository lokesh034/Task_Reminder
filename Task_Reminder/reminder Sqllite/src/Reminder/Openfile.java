/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reminder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lokesh
 */
public class Openfile {
     
     private int flag;
     private String url;
    public void openFile()
    {
          FileInputStream fis=null;
        ObjectInputStream ois=null;
        try
        { 
            String current = new java.io.File( "." ).getCanonicalPath();
            fis=new FileInputStream(current+"\\urlInfo.ser");
            ois=new ObjectInputStream(fis);
            CollectionUrl cu=null;
            cu=(CollectionUrl) ois.readObject();
            flag=cu.getFlag();
            url=cu.getPath();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReminderUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReminderUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReminderUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
           try {
               fis.close();
               ois.close();
           } catch (IOException ex) {
               Logger.getLogger(ReminderUI.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }

    public int getFlag() {
        return flag;
    }

    public String getUrl() {
        return url;
    }
}
