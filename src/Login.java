
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

 
    public Login() {
        initComponents();
       this.setOpacity(0.9f);
        this.setLocationRelativeTo(null);
        setIcon();
        tchrNme.removeAllItems();
        tchrNme.addItem("Select One");
  database();
  c5.removeAllItems();
  c5.addItem("Select One");
        for (int i = 1970; i < 2011; i++) {
            c5.addItem(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        adminPwd = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        apd1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        about_us = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        contact_us = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tp1 = new javax.swing.JTabbedPane();
        p1 = new javax.swing.JPanel();
        frgtPwd = new javax.swing.JLabel();
        tchrNme = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        pwd1 = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        adminL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox();
        c5 = new javax.swing.JComboBox();
        c4 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        pwd3 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        pwd2 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        adminPwd.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adminPwd.setMinimumSize(new java.awt.Dimension(346, 219));
        adminPwd.setModal(true);
        adminPwd.setUndecorated(true);
        adminPwd.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Admin Password Please");
        adminPwd.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        apd1.setBackground(new java.awt.Color(16, 44, 100));
        apd1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        apd1.setForeground(new java.awt.Color(255, 255, 255));
        apd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apd1ActionPerformed(evt);
            }
        });
        adminPwd.getContentPane().add(apd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 290, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        adminPwd.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminLogin.jpg"))); // NOI18N
        adminPwd.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        about_us.setTitle("About us");
        about_us.setMinimumSize(new java.awt.Dimension(580, 272));
        about_us.setUndecorated(true);
        about_us.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" 1.Prafful Lachhwani");
        jLabel18.setToolTipText("");
        about_us.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("<Html><u>Class 12th IP project</u></html>");
        jLabel19.setToolTipText("");
        about_us.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("2.Harsh thakur");
        jLabel22.setToolTipText("");
        about_us.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("<html><u>Created by-</u></html>");
        jLabel23.setToolTipText("");
        about_us.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jButton12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton12.setText("OK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        about_us.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 191, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about_us bg.jpg"))); // NOI18N
        about_us.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 270));

        contact_us.setMinimumSize(new java.awt.Dimension(720, 278));
        contact_us.setUndecorated(true);
        contact_us.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facebook-icon.png"))); // NOI18N
        jLabel24.setText("<html>find us on <br>facebook.com</html>");
        contact_us.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel25.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("<html>Call us<br>+91 8962758754</html>");
        contact_us.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel26.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/call2.png"))); // NOI18N
        contact_us.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 140));

        jLabel27.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("<html>Mail us at - <br>prafful.lachhwani@gmail.com<br>lachhwani.prafful@yahoo.com<br>harsh.thakur@gmail.com</html>");
        contact_us.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton14.setText("X");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        contact_us.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 40, 30));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contact-us-banner-1-860x280.jpg"))); // NOI18N
        contact_us.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 280));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("r");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginLogo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 270, -1));

        p1.setOpaque(false);

        frgtPwd.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        frgtPwd.setForeground(new java.awt.Color(240, 240, 240));
        frgtPwd.setText("Forgot Password");
        frgtPwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                frgtPwdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                frgtPwdMouseExited(evt);
            }
        });

        tchrNme.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        tchrNme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One" }));
        tchrNme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tchrNmeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Password");

        pwd1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        loginBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Teacher name");

        admin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        admin.setToolTipText("Admin");
        admin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });

        adminL.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        adminL.setForeground(new java.awt.Color(255, 255, 255));
        adminL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminL.setText("<html><h4>Login As Admin</h4></html>");
        adminL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminLMouseExited(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");
        jSeparator1.setName("OR"); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");
        jSeparator2.setName("OR"); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("OR");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminL, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5))
                            .addComponent(jLabel17)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(loginBtn))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tchrNme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(404, 404, 404))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(frgtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin)))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(tchrNme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(11, 11, 11)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addComponent(loginBtn)
                                .addGap(228, 228, 228)
                                .addComponent(frgtPwd))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp1.addTab("Login with existing account", p1);

        p2.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Gender");

        c1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selec One", "Male", "Female", "Others" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Mobile No");

        t3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Teacher type");

        c2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "PGT", "TGT", "PRT" }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Email ID");

        t4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("DOB");

        c3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        c5.setEditable(true);
        c5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "2012", "2013", "2014" }));
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });

        c4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select One", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Create Password");

        pwd3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Confirm Password");

        pwd2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton3.setText("Create Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("first name");

        t1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Last name");

        t2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addGap(0, 289, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(p2Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(87, 87, 87))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p2Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(p2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pwd3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                            .addComponent(pwd2)))))
                            .addComponent(jLabel8)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(p2Layout.createSequentialGroup()
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addGap(10, 10, 10)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        tp1.addTab("Create new account", p2);

        getContentPane().add(tp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 710, 470));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/question bank icon.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        exit.setToolTipText("   Exit   ");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 10, 100, 100));

        l1.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_contact.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_about_us.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
void database() {
    try{
    Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select distinct first_name,last_name from teacher_details";
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
while(rs.next())
{
 String a=rs.getString("first_name");
 String b=rs.getString("last_name");
 
 tchrNme.addItem(""+(a+" "+b));
}
    }
    catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}  
 }
    private void tchrNmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tchrNmeActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tchrNmeActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c5ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void frgtPwdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frgtPwdMouseEntered
        // TODO add your handling code here:
        frgtPwd.setText(""+"<html><h3><u>Forgot Password</u></h3></html>");
    }//GEN-LAST:event_frgtPwdMouseEntered

    private void frgtPwdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frgtPwdMouseExited
   frgtPwd.setText(""+"Forgot Password");
    }//GEN-LAST:event_frgtPwdMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
     int num=   tchrNme.getItemCount();
if(num==1){
tp1.setSelectedIndex(1);
 }
else{
tp1.setSelectedIndex(0);
}
    }//GEN-LAST:event_formWindowOpened

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
if(tchrNme.getSelectedIndex()==0){
  JOptionPane.showMessageDialog(rootPane,"please select teacher name first");  
  pwd1.setText("");
}
else{
    
try
{
Class.forName("java.sql.Driver");
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select concat(concat(first_name,' '),last_name),password from teacher_details where concat(concat(firs_name,' '),last_name)='"+tchrNme.getSelectedItem()+"'";
Statement stmt=con.createStatement();
String a=(String)tchrNme.getSelectedItem();
  {
    String b=new String(pwd1.getPassword());     
    ResultSet res = stmt.executeQuery("SELECT concat(concat(first_name,' '),last_name),password FROM teacher_details where concat(concat(first_name,' '),last_name)='" + a + "' and password='" + b + "'");
    if (res.next()) 
    {
       
        this.setVisible(false);
        welcome nn= new welcome();
        welcome.welcomeLable1.setText((String) this.tchrNme.getSelectedItem());
       nn.setVisible(true);
    } 
    else
    {
        JOptionPane.showMessageDialog(rootPane,"wrong teacher name/password try again !!!!");
    }
  }
}
catch(Exception ex)
{
  JOptionPane.showMessageDialog(rootPane,ex.getMessage());  
}
}
    }//GEN-LAST:event_loginBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String NewUser=t1.getText()+"_"+t2.getText();
     String User=t1.getText()+" "+t2.getText();
        String day=(String) c3.getSelectedItem();
String month=(String) c4.getSelectedItem();
String year=(String) c5.getSelectedItem();
String dob=day+"/"+month+"/"+year;
String pwd21=new String(pwd2.getPassword());
String pwd31=new String(pwd3.getPassword());
if(pwd21.equals(pwd31)){
try
        {
Class.forName("java.sql.Driver");
Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
    String password=new String(pwd3.getPassword());
        
String qry="insert into teacher_details values('"+t1.getText()+"','"+t2.getText()+"','"+password+"','"+c1.getSelectedItem()+"','"+c2.getSelectedItem()+"','"+t3.getText()+"','"+t4.getText()+"','"+dob+"');";
String qry2="create table "+NewUser+"(questions varchar(100) primary key,marks int(2),level varchar(10),class varchar(7),date varchar(15),last_used varchar(15) default'never')";
Statement stmt=con.createStatement();
    int rs=stmt.executeUpdate(qry);
     rs=stmt.executeUpdate(qry2);
        this.setVisible(false);
        welcome nn= new welcome();
        welcome.welcomeLable1.setText(User);
       nn.setVisible(true);
}
catch(Exception ex)
{
     JOptionPane.showMessageDialog(rootPane,ex.getMessage());
}
tchrNme.removeAllItems(); 
tchrNme.addItem("Select One");

database();
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
pwd2.setText("");
pwd3.setText("");
c1.setSelectedIndex(0);
c2.setSelectedIndex(0);
c3.setSelectedIndex(0);
c4.setSelectedIndex(0);
c5.setSelectedIndex(0);
}
else{
JOptionPane.showMessageDialog(rootPane,"Password did not matched");
pwd2.setText("");
pwd3.setText("");
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void adminLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLMouseEntered
adminL.setText(""+"<html><h2><u>Login As Admin</u></h2></html>");        // TODO add your handling code here:
    }//GEN-LAST:event_adminLMouseEntered

    private void adminLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLMouseExited
adminL.setText(""+"<html><h4>Login As Admin</h4></html>");    
    }//GEN-LAST:event_adminLMouseExited

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
     adminL.setText(""+"<html><h2><u>Login As Admin</u></h2></html>");      // TODO add your handling code here:
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
      adminL.setText(""+"<html><h4>Login As Admin</h4></html>");    // TODO add your handling code here:
    }//GEN-LAST:event_adminMouseExited

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
adminPwd.setLocationRelativeTo(null);
        adminPwd.setVisible(true);        // TODO add your handling code here:
   
    }//GEN-LAST:event_adminMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
 int close = JOptionPane.showConfirmDialog(rootPane,"are you sure?");
      if(close==0) 
      System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        String user=System.getProperty("user.home");
        // TODO add your handling code here:
        ImageIcon image = new ImageIcon(user+"\\Desktop\\question bank\\src\\close2.png");
exit.setIcon(image);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
          String user=System.getProperty("user.home");
        ImageIcon image = new ImageIcon(user+"\\Desktop\\question bank\\src\\close.png");
exit.setIcon(image);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseExited

    private void adminLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLMouseClicked
adminPwd.setLocationRelativeTo(null);
        adminPwd.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_adminLMouseClicked

    private void apd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apd1ActionPerformed
        // TODO add your handling code here:
       String a=new String(apd1.getPassword());
       if(a.equals("admin")){
               adminPwd.setVisible(false);    
           this.setVisible(false);
       Admin nn1=new Admin();
       nn1.setVisible(true);
       }else
       {
       apd1.setText("");
           JOptionPane.showMessageDialog(rootPane, "Wrong password Try Again!!");
         adminPwd.setVisible(true);    
       }
    }//GEN-LAST:event_apd1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        adminPwd.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        about_us.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
        contact_us.setVisible(false);
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked

  
     contact_us.setVisible(true);
      contact_us.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
  about_us.setVisible(true);
  about_us.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseEntered

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_t1KeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                new Login().setVisible(true);
             }

            //To change body of generated methods, choose Tools | Templates.
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog about_us;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel adminL;
    private javax.swing.JDialog adminPwd;
    private javax.swing.JPasswordField apd1;
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox c2;
    private javax.swing.JComboBox c3;
    private javax.swing.JComboBox c4;
    private javax.swing.JComboBox c5;
    private javax.swing.JDialog contact_us;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel frgtPwd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel l1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JPasswordField pwd2;
    private javax.swing.JPasswordField pwd3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    public static javax.swing.JComboBox tchrNme;
    private javax.swing.JTabbedPane tp1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("question bank icon.png")));
    }

   
}
