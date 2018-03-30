/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import java.awt.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URI;
import java.net.URISyntaxException;
import com.sun.speech.freetts.*;
import java.text.SimpleDateFormat;


/**
 *
 * @author ayo
 */



public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String name;
    String userText;
    String ava = " A.V.A: ";
    String resp;
    Voice voice;
    
    
    
void showDate() {
      
     
       
}
    
    public NewJFrame() {
        initComponents();
//           name = JOptionPane.showInputDialog("What is your name?"); implement login/name identifier  
             name = " You: ";
                chatOutput.setText("Hello you're speaking with Ava \n");
		chatOutput.setText(ava + chatOutput.getText() );
    System.setProperty("mbrola.base", "C:\\Users\\ayo\\Documents\\jar\\mbr302a\\mbr302a\\mbrola.exe");
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        chatInput = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatOutput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A.V.A (Artificial Virtual Assistance) ");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chatInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatInputActionPerformed(evt);
            }
        });

        chatOutput.setEditable(false);
        chatOutput.setColumns(20);
        chatOutput.setRows(5);
        jScrollPane2.setViewportView(chatOutput);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/avaicon.png"))); // NOI18N

        jMenuBar1.setEnabled(false);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Website");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chatInput)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(chatInput))
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("A.V.A");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private static final String VOICENAME="kevin16";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
//-- Old method of storing responses for file       
//        String[] respond = { "I'm fine thanks", 
//                            "Everything is good, thanks for asking", 
//                            "My systems are fully functional, thanks for asking" };
//        int length = respond.length;
//        int rand = (int) (Math.random() * length);
        
//        String[] greeting = { "Hello there!", 
//                            "Hey Human.", 
//                            "Long time no see or It's been a while." };
//        int length1 = greeting.length;
//        int rand1 = (int) (Math.random() * length);
        
        
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(VOICENAME);
        voice.allocate();
//         System.setProperty("mbrola.base", "C:\\Users\\ayo\\Documents\\text to speech\\mbrola");
//         

       userText = chatInput.getText();
       chatOutput.append(name + userText + "\n");
       chatInput.setText("");
       
       if ((userText.matches("(.*)hello(.*)")||
               (userText .matches("(.*)Hello(.*)")) ||
               (userText .matches("(.*)hey(.*)")) ||
               (userText .matches("(.*)Hey(.*)"))))            
       {
            chatOutput.setText(chatOutput.getText() + ava + "Hey Human." +"\n");
           voice.speak("Hey human");
          
       }

       else if((userText.matches("(.*)how(.*)")&&userText .matches("(.*)you(.*)")))
           {
 //-- basic             
//           try {
//               Desktop.getDesktop().open(new File("src/temp9634.vbs"));
//           } catch (IOException ex) {
//               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//           }
//            chatOutput.setText(chatOutput.getText() + ava + "Everything is good, thanks for asking" + "\n");
               
               try{ 
                   File file = new File("src/how.txt"); // Reading from textfile (Learner class should be able to do something here)
                   BufferedReader reader = new BufferedReader(new FileReader(file));
                   String ln = reader.readLine();
                   List<String> lines = new ArrayList<>();
                   while(ln != null){
                          lines.add(ln);
                         ln = reader.readLine();// Reading from textfile (Learner class should be able to do something here)
                    }
                      Random r = new Random();
                      resp = lines.get(r.nextInt(lines.size())); 
                      chatOutput.setText(chatOutput.getText() + ava +" "+resp+"\n");
                      voice.speak(resp);
                }catch (IOException ex){
                 Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }         
           } 
       
        else if ((userText.matches("(.*)what are(.*)")&&userText .matches("(.*)you(.*)")))
         {
//            chatOutput.setText(chatOutput.getText() + ava + "\n");
             try{ 
                   File file = new File("src/what.txt"); // Reading from textfile (Learner class should be able to do something here)
                   BufferedReader reader = new BufferedReader(new FileReader(file));
                   String ln = reader.readLine();
                   List<String> lines = new ArrayList<>();
                   while(ln != null){
                          lines.add(ln);
                         ln = reader.readLine(); // Reading from textfile (Learner class should be able to do something here)
                         
                    }
                      Random r = new Random();
                      resp = lines.get(r.nextInt(lines.size()));
                      
                      chatOutput.setText(chatOutput.getText() + ava +" "+ resp +"\n");
                      
                      voice.speak(resp);// Handles Voice from text usign the random function
                }catch (IOException ex){
                 Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
         }
        else if ((userText.matches("(.*)who are(.*)")&&userText .matches("(.*)you(.*)")))
        {
            chatOutput.setText(chatOutput.getText() + ava + "I'm A.V.A, your Artificial Virtual Assistant \n" );
            voice.speak("I'm AVA, your Artificial Virtual Assistant");// Handles Voice 
        }
        else if(userText.matches("(.*)what is(.*)")&&userText.matches("(.*)your(.*)")&&userText.matches("(.*)name(.*)"))
        {
            chatOutput.setText(chatOutput.getText() + ava + "My name is A.V.A and yours? \n" );
            voice.speak("My name is AVA, and yours?"); // Handles Voice
        }
        else if(userText.matches("(.*)calc(.*)")&&userText.matches("(.*)1(.*)"))
        {
            //does calculations
        }
        else if ((userText.matches("(.*)open(.*)")||(userText.matches("(.*)Open(.*)"))
                &&userText .matches("(.*)google chrome(.*)")))
                      {
                               try
                               {
                                    chatOutput.setText(chatOutput.getText() + ava +" "+"Opening Google chrome web browser..." +"\n");
                                    voice.speak("Opening Google chrome web browser...");// Handles Voice
                               Desktop.getDesktop().open(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe"));
                               
                               }
                               catch(IOException ex)
                               {
                               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                               }
                               
                         } 
        else if ((userText.matches("(.*)google(.*)")))
        {
           
            String search = chatOutput.getText().substring(chatOutput.getText().lastIndexOf("google"));
                               try
                               {
                                   
                                    chatOutput.setText(chatOutput.getText() + ava +" "+"Googling..." +"\n");
                                    voice.speak(search);// Handles Voice with search function
                               Desktop.getDesktop().browse(new URI("http://www.google.com","/search", "q=" + search));
                                
                               }
                               catch(IOException | URISyntaxException ex)
                               {
                               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                               }            
        }
        else if ((userText.matches("(.*)date(.*)")))
        {
            Date dNow = new Date( );
            SimpleDateFormat ft = 
            new SimpleDateFormat ("MMMMM dd, yyyy");
            String showdate = ft.format(dNow);
            chatOutput.setText(chatOutput.getText() +ava + "The date is: " +showdate +"\n");
            voice.speak("The date is " + showdate); 
        }
        else if ((userText.matches("(.*)time(.*)")))
        {
            Date dNow = new Date( );
            SimpleDateFormat ft = 
            new SimpleDateFormat ("HH:mm");
 
       
            String showdate = ft.format(dNow);
            chatOutput.setText(chatOutput.getText() +ava + "The Time is: " +showdate +"\n");
            voice.speak("The Time is " + showdate); // Handles Voice with date function
        }
       else
        {
            chatOutput.setText(chatOutput.getText() +ava+ "Sorry I do not understand that.\n");
            voice.speak("Sorry I do not understand that");// Handles Voice
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chatInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatInputActionPerformed
      jButton1ActionPerformed(evt);
      
                
    }//GEN-LAST:event_chatInputActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chatInput;
    private javax.swing.JTextArea chatOutput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
