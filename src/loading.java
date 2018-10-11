import java.sql.*;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JOptionPane;
class stoptimer
{
    static Timer t;
    public static void send(ActionListener e)
    {
         t= new Timer(100,e);
        t.start();
    }
    public static void stopt()
    {
        t.stop();
            }
}

public class loading extends javax.swing.JFrame {

    public loading() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        perLbl = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        loadingBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        perLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(perLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 80, 20));

        loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loading.gif"))); // NOI18N
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        heading.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        heading.setForeground(new java.awt.Color(240, 240, 240));
        heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/question bank icon.png"))); // NOI18N
        heading.setText("Question bank");
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 390, -1));

        l1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Loading please wait........");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 10, 0));

        loadingBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loading background.jpg"))); // NOI18N
        getContentPane().add(loadingBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   int h;
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
int g= 0;
g=g*1000;
ActionListener b=new ActionListener()
{       
public void actionPerformed(ActionEvent e) {
perLbl.setText(""+h+"%");
h=h+6;
if(h==96){
stoptimer.stopt();

        try{
        String a=null;
        int co=0;
        try{
    Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select distinct first_name,last_name from teacher_details";
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
    }
    catch(Exception ex)
{
a=ex.getMessage();

}  
 if(a.equals("Unknown database 'teacher'"))
 {
 co=JOptionPane.showConfirmDialog(rootPane, "No database found! do you Want to create new one?");
 if(co==0){
 try{
    Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123");
String sql="create database teacher;";
String sql2="use teacher;";
String sql3="create table teacher_details(first_name varchar(20) primary key,last_name varchar(20),password varchar(32),sex varchar(7),teacher_type varchar(5),mobile_no varchar(10),email_id varchar(50),DOB varchar(12));";
Statement stmt=con.createStatement();
stmt.executeUpdate(sql);
stmt.executeUpdate(sql2);
stmt.executeUpdate(sql3);
 }
    catch(Exception ex)
{

}  
    }
 else 
     if(co==1){
System.exit(0);
     }
     
 }
        }
        catch(Exception ex){
        
        }
          b1.doClick();
 Login mm=new Login();
mm.setVisible(true);
}    
}
};
stoptimer.send(b);

    }//GEN-LAST:event_formWindowOpened

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_b1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel loadingBg;
    private javax.swing.JLabel perLbl;
    // End of variables declaration//GEN-END:variables
}
