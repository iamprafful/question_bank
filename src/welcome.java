import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
public class welcome extends javax.swing.JFrame {

    public welcome() {
    initComponents();
        this.setLocationRelativeTo(null);
  setIcon();

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddQues = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        c9 = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        c10 = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        c11 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        background1 = new javax.swing.JLabel();
        QuesPaper = new javax.swing.JDialog();
        c1 = new javax.swing.JComboBox();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        l7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        l8 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        wlcmBg1 = new javax.swing.JLabel();
        editQuestion = new javax.swing.JDialog();
        jLabel34 = new javax.swing.JLabel();
        c18 = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        c19 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        c20 = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        wlcmBg2 = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        Change_pwd = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pwd3 = new javax.swing.JPasswordField();
        pwd4 = new javax.swing.JPasswordField();
        wlcmBg3 = new javax.swing.JLabel();
        show_more = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox();
        c5 = new javax.swing.JComboBox();
        c4 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        l21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        instructions = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta3 = new javax.swing.JTextArea();
        wlcmBg4 = new javax.swing.JLabel();
        wlcmBg5 = new javax.swing.JLabel();
        about_us = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contact_us = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        wlcmBg = new javax.swing.JLabel();
        variable = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        AddQues.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AddQues.setTitle("Add Question");
        AddQues.setMinimumSize(new java.awt.Dimension(952, 488));
        AddQues.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Question");
        AddQues.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        c9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        AddQues.getContentPane().add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 80, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Class");
        AddQues.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        c10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        AddQues.getContentPane().add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 80, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Mark");
        AddQues.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Level");
        AddQues.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        c11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "*", "**", "***", "****", "*****" }));
        AddQues.getContentPane().add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Add Question");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        AddQues.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 300, 80));

        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        ta1.setLineWrap(true);
        ta1.setRows(5);
        ta1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ta1);

        AddQues.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 450, 120));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add Q.. bg.jpg"))); // NOI18N
        AddQues.getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        QuesPaper.setTitle("Create Question Paper");
        QuesPaper.setMinimumSize(new java.awt.Dimension(1013, 631));
        QuesPaper.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Formative assement", "Summative assement", "Half Yearly", "Final exam" }));
        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        QuesPaper.getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 210, -1));

        l2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(240, 240, 240));
        l2.setText("Session");
        QuesPaper.getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        l3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        l3.setForeground(new java.awt.Color(240, 240, 240));
        l3.setText("Exam Type");
        QuesPaper.getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        t3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t3.setText("30");
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3MouseClicked(evt);
            }
        });
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        QuesPaper.getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 90, -1));

        l4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        l4.setForeground(new java.awt.Color(240, 240, 240));
        l4.setText("Formative assement-");
        QuesPaper.getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 370, 40));

        l5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        l5.setForeground(new java.awt.Color(240, 240, 240));
        l5.setText("School");
        QuesPaper.getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        t4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t4.setText("Mithi Gobindram public school");
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4MouseClicked(evt);
            }
        });
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        QuesPaper.getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 360, -1));

        l6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        l6.setForeground(new java.awt.Color(240, 240, 240));
        l6.setText("Date");
        QuesPaper.getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        t1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        QuesPaper.getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 140, -1));

        t2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        QuesPaper.getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 140, -1));

        l7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        l7.setForeground(new java.awt.Color(240, 240, 240));
        l7.setText("No of Questions");
        QuesPaper.getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 320, 50));

        t5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        QuesPaper.getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 90, -1));

        l8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        l8.setForeground(new java.awt.Color(240, 240, 240));
        l8.setText("Maximum Marks");
        QuesPaper.getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 320, 50));

        t6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        QuesPaper.getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 90, -1));

        tab3.setAutoCreateRowSorter(true);
        tab3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tab3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Question ", "Marks", "Level", "Class", "Date", "Last Used"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab3.setColumnSelectionAllowed(true);
        tab3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab3.setDoubleBuffered(true);
        tab3.setDragEnabled(true);
        tab3.setFillsViewportHeight(true);
        tab3.setFocusCycleRoot(true);
        tab3.setFocusTraversalPolicyProvider(true);
        tab3.setGridColor(new java.awt.Color(0, 0, 0));
        tab3.setInheritsPopupMenu(true);
        tab3.setIntercellSpacing(new java.awt.Dimension(3, 3));
        tab3.setOpaque(false);
        tab3.setRowSelectionAllowed(false);
        tab3.setSurrendersFocusOnKeystroke(true);
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tab3);
        tab3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tab3.getColumnModel().getColumnCount() > 0) {
            tab3.getColumnModel().getColumn(0).setMinWidth(20);
            tab3.getColumnModel().getColumn(0).setPreferredWidth(20);
            tab3.getColumnModel().getColumn(0).setMaxWidth(20);
            tab3.getColumnModel().getColumn(1).setMinWidth(600);
            tab3.getColumnModel().getColumn(1).setPreferredWidth(600);
            tab3.getColumnModel().getColumn(1).setMaxWidth(600);
            tab3.getColumnModel().getColumn(2).setMinWidth(50);
            tab3.getColumnModel().getColumn(2).setPreferredWidth(50);
            tab3.getColumnModel().getColumn(2).setMaxWidth(50);
            tab3.getColumnModel().getColumn(3).setMinWidth(50);
            tab3.getColumnModel().getColumn(3).setPreferredWidth(50);
            tab3.getColumnModel().getColumn(3).setMaxWidth(50);
            tab3.getColumnModel().getColumn(4).setMinWidth(80);
            tab3.getColumnModel().getColumn(4).setPreferredWidth(80);
            tab3.getColumnModel().getColumn(4).setMaxWidth(80);
            tab3.getColumnModel().getColumn(6).setResizable(false);
        }

        QuesPaper.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 990, 240));

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        QuesPaper.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 100, -1));

        wlcmBg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcom backgroung.png"))); // NOI18N
        wlcmBg1.setText("Nex");
        QuesPaper.getContentPane().add(wlcmBg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        editQuestion.setTitle("Edit question paper ");
        editQuestion.setMinimumSize(new java.awt.Dimension(794, 473));
        editQuestion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Question");
        editQuestion.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        c18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        editQuestion.getContentPane().add(c18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 80, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Class");
        editQuestion.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        c19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one", "2", "3", "4", "5", "6", "7", "8" }));
        c19.setToolTipText("");
        editQuestion.getContentPane().add(c19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 130, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Mark");
        editQuestion.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Level");
        editQuestion.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        c20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "*", "**", "***", "****", "*****" }));
        editQuestion.getContentPane().add(c20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setText("Save question");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        editQuestion.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 140, 40));

        ta2.setColumns(20);
        ta2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        ta2.setLineWrap(true);
        ta2.setRows(5);
        ta2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(ta2);

        editQuestion.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 450, 120));

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setText("Cancel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        editQuestion.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 300, 40));

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        editQuestion.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 150, 40));

        wlcmBg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcom backgroung.png"))); // NOI18N
        wlcmBg2.setText("Nex");
        editQuestion.getContentPane().add(wlcmBg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        previous.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        editQuestion.getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        Change_pwd.setTitle("Change password");
        Change_pwd.setMinimumSize(new java.awt.Dimension(462, 202));
        Change_pwd.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("New Password");
        Change_pwd.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 30));

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton3.setText("Change");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Change_pwd.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Confirm Password");
        Change_pwd.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 30));

        pwd3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Change_pwd.getContentPane().add(pwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 180, -1));

        pwd4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Change_pwd.getContentPane().add(pwd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 180, -1));

        wlcmBg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wlcmBg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcom backgroung.png"))); // NOI18N
        wlcmBg3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Change_pwd.getContentPane().add(wlcmBg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        show_more.setMinimumSize(new java.awt.Dimension(620, 323));
        show_more.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                show_moreWindowClosing(evt);
            }
        });
        show_more.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Gender");
        show_more.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 107, -1));

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Mobile No");
        show_more.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 71, 107, -1));

        t7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t7.setEnabled(false);
        show_more.getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 68, 150, -1));

        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Teacher type");
        show_more.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        c2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PGT", "TGT", "PRT" }));
        c2.setEnabled(false);
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        show_more.getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 131, -1));

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Email ID");
        show_more.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        t8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        t8.setEnabled(false);
        show_more.getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 117, 280, -1));

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("DOB");
        show_more.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 166, 107, -1));

        c3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        c3.setEnabled(false);
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        show_more.getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        c5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014" }));
        c5.setEnabled(false);
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        show_more.getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 90, -1));

        c4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        c4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        c4.setEnabled(false);
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        show_more.getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jButton6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton6.setText("Save changes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        show_more.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 191, -1));

        l21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        l21.setForeground(new java.awt.Color(240, 240, 240));
        show_more.getContentPane().add(l21, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 23, 120, 30));

        jButton7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton7.setText("cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        show_more.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EDIT2.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        show_more.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/368073-background.jpg"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        show_more.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 320));

        instructions.setTitle("Change password");
        instructions.setMinimumSize(new java.awt.Dimension(498, 267));
        instructions.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Instructions:-");
        instructions.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 30));

        jButton11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton11.setText("Next");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        instructions.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        ta3.setColumns(20);
        ta3.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        ta3.setLineWrap(true);
        ta3.setRows(5);
        ta3.setWrapStyleWord(true);
        jScrollPane5.setViewportView(ta3);

        instructions.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 450, 120));

        wlcmBg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wlcmBg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcom backgroung.png"))); // NOI18N
        wlcmBg4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        instructions.getContentPane().add(wlcmBg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        wlcmBg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wlcmBg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcom backgroung.png"))); // NOI18N
        wlcmBg5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        instructions.getContentPane().add(wlcmBg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        about_us.setTitle("About us");
        about_us.setMinimumSize(new java.awt.Dimension(580, 272));
        about_us.setUndecorated(true);
        about_us.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" 1.Prafful Lachhwani");
        jLabel5.setToolTipText("");
        about_us.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<Html><u>Class 12th IP project</u></html>");
        jLabel6.setToolTipText("");
        about_us.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("2.Harsh thakur");
        jLabel8.setToolTipText("");
        about_us.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html><u>Created by-</u></html>");
        jLabel7.setToolTipText("");
        about_us.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jButton12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton12.setText("OK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        about_us.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 191, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about_us bg.jpg"))); // NOI18N
        about_us.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 270));

        contact_us.setMinimumSize(new java.awt.Dimension(720, 278));
        contact_us.setUndecorated(true);
        contact_us.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facebook-icon.png"))); // NOI18N
        jLabel11.setText("<html>find us on <br>facebook.com</html>");
        contact_us.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("<html>Call us<br>+91 8962758754</html>");
        contact_us.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/call2.png"))); // NOI18N
        contact_us.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 140));

        jLabel21.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("<html>Mail us at - <br>prafful.lachhwani@gmail.com<br>lachhwani.prafful@yahoo.com<br>harsh.thakur@gmail.com</html>");
        contact_us.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

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

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contact-us-banner-1-860x280.jpg"))); // NOI18N
        contact_us.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 280));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setAutoCreateRowSorter(true);
        tab1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tab1.setForeground(new java.awt.Color(51, 51, 51));
        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question ", "Marks", "Level", "Class", "Last Edited"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tab1.setColumnSelectionAllowed(true);
        tab1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab1.setGridColor(new java.awt.Color(0, 51, 51));
        tab1.setIntercellSpacing(new java.awt.Dimension(3, 3));
        tab1.setRowHeight(20);
        tab1.setSelectionBackground(new java.awt.Color(236, 28, 60));
        tab1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab1);
        tab1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tab1.getColumnModel().getColumnCount() > 0) {
            tab1.getColumnModel().getColumn(0).setMinWidth(600);
            tab1.getColumnModel().getColumn(0).setPreferredWidth(600);
            tab1.getColumnModel().getColumn(0).setMaxWidth(600);
            tab1.getColumnModel().getColumn(1).setMinWidth(50);
            tab1.getColumnModel().getColumn(1).setPreferredWidth(50);
            tab1.getColumnModel().getColumn(1).setMaxWidth(50);
            tab1.getColumnModel().getColumn(2).setMinWidth(50);
            tab1.getColumnModel().getColumn(2).setPreferredWidth(50);
            tab1.getColumnModel().getColumn(2).setMaxWidth(50);
            tab1.getColumnModel().getColumn(3).setMinWidth(80);
            tab1.getColumnModel().getColumn(3).setPreferredWidth(80);
            tab1.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 940, 540));

        welcomeLable1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        welcomeLable1.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(welcomeLable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 320, 30));

        welcomeLable2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        welcomeLable2.setForeground(new java.awt.Color(240, 240, 240));
        welcomeLable2.setText("Welcome");
        getContentPane().add(welcomeLable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date:-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 90, -1));

        wlcmBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcom backgroung.png"))); // NOI18N
        getContentPane().add(wlcmBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 710));
        getContentPane().add(variable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setOpaque(false);

        jMenu1.setText("Options");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Add Questions");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("LogOut");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("create question paper");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Edit question");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setText("Edit account details");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem6.setText("Change password");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About us");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("About us");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Contact us");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Contact us");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
String g;
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
AddQues.setLocationRelativeTo(null);
AddQues.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 try{
 Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql1="select curdate()";    
Statement stmt=con.createStatement();
ResultSet rs1=stmt.executeQuery(sql1);
while(rs1.next()){
String date1=rs1.getString("curdate()");
date.setText(date1);
}

 }
 catch(Exception e){
   JOptionPane.showMessageDialog(rootPane, e.getMessage());
 }
        g=welcomeLable1.getText().replace(" ","_");
        DefaultTableModel model=(DefaultTableModel) tab1.getModel();
        
                int rows=model.getRowCount();
                if(rows>0)
                {
                for(int i=0;i<rows;i++)
                {
                model.removeRow(0);
              
                }
                }
                try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select questions,marks,level,class,date from "+g+"";  

    System.out.println(sql);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);

while(rs.next()){
model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5)});

}                 
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}
                
               
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

      this.dispose();
        Login nn= new Login();
        nn.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        g=welcomeLable1.getText().replace(" ","_");
try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="insert into "+g+" (questions,marks,level,class,date) values('"+ta1.getText()+"','"+c9.getSelectedItem()+"','"+c11.getSelectedItem()+"','"+c10.getSelectedItem()+"','"+date.getText()+"');";                     

System.out.println(sql);
Statement stmt=con.createStatement();
    int rs=stmt.executeUpdate(sql);

}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}
 g=welcomeLable1.getText().replace(" ","_");
        DefaultTableModel model=(DefaultTableModel) tab1.getModel();
       
                int rows=model.getRowCount();
                if(rows>0)
                {
                for(int i=0;i<rows;i++)
                {
                model.removeRow(0);
          
                }
                }
                try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select questions,marks,level,class,date from "+g+"";  
    System.out.println(sql);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5)});

}                 
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}
c9.setSelectedIndex(0); 
c10.setSelectedIndex(0);
c11.setSelectedIndex(0);
ta1.setText("");
AddQues.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed
private static  String VOICENAME="kevin16";
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       QuesPaper.setVisible(true);
       QuesPaper.setLocationRelativeTo(null);
        DefaultTableModel mode2=(DefaultTableModel) tab3.getModel();
           int rows=mode2.getRowCount();
                if(rows>0)
                {
                for(int i=0;i<rows;i++)
                {
                mode2.removeRow(0);
                }
                }
                            try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select questions,marks,level,class,date,last_used from "+g+"";  
String sql1="select curdate()'date'";  

    System.out.println(sql);
Statement stmt=con.createStatement();
Statement stmt1=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
ResultSet rs1=stmt1.executeQuery(sql1);
while(rs.next()){
mode2.addRow(new Object[]{false, rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6)});
}      
while(rs1.next()){
String date=rs1.getString("date");
String year=date.substring(0,4);
t1.setText(year);
t2.setText(date);
} 
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void t3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseClicked
        t3.selectAll();        // TODO add your handling code here:
    }//GEN-LAST:event_t3MouseClicked

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseClicked
        t4.selectAll();
    }//GEN-LAST:event_t4MouseClicked

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged
        // TODO add your handling code here:
 String a=(String) c1.getSelectedItem();
 l4.setText(""+a+" -");
    }//GEN-LAST:event_c1ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
instructions.setVisible(true);
instructions.setLocationRelativeTo(null);
ta3.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
JOptionPane.showMessageDialog(null,"To edit any question first click on the table row You want to edit");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
String name=welcomeLable1.getText();

try{
    Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql1="select sex,teacher_type,mobile_no,email_id,dob from teacher_details where concat(concat(first_name,' '),last_name)='"+name+"'";
System.out.println(sql1);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql1);
while(rs.next())
{
 String sex=rs.getString("sex");
  String Teacher_type=rs.getString("Teacher_type");
   String Mobile_no=rs.getString("mobile_no");
    String dob=rs.getString("dob");
     String email_id=rs.getString("email_id");

     
String date1=dob.substring(0,2);
String month=dob.substring(3,5);
String year=dob.substring(6,10);
     l21.setText(""+sex);

c2.setSelectedItem(Teacher_type);
c3.setSelectedItem(date1);

//c5.setSelectedItem(year);
c4.setSelectedItem(month);
t7.setText(""+Mobile_no);
t8.setText(email_id);
}
}
    catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane, e.getMessage());
}   
      
  show_more.setVisible(true);
show_more.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
String pre=previous.getText();
        System.out.println(pre);
       String  name_edit=welcomeLable1.getText().replace(" ","_");
                try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="delete from "+name_edit+" where questions='"+pre+"' ";  

    System.out.println(sql);
Statement stmt=con.createStatement();
stmt.executeUpdate(sql);
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
} 
  
                
                

        g=welcomeLable1.getText().replace(" ","_");
try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="insert into "+g+" (questions,marks,level,class,date) values('"+ta2.getText()+"','"+c18.getSelectedItem()+"','"+c20.getSelectedItem()+"','"+c19.getSelectedItem()+"','"+date.getText()+"');";                     
System.out.println(sql);
Statement stmt=con.createStatement();
stmt.executeUpdate(sql);

}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}
 g=welcomeLable1.getText().replace(" ","_");
        DefaultTableModel model=(DefaultTableModel) tab1.getModel();
       
                int rows=model.getRowCount();
                if(rows>0)
                {
                for(int i=0;i<rows;i++)
                {
                model.removeRow(0);
          
                }
                }
                try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select questions,marks,level,class,date from "+g+"";  
    System.out.println(sql);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5)});

}                 
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}
c19.setSelectedIndex(0); 
c20.setSelectedIndex(0);
c18.setSelectedIndex(0);
ta2.setText("");
editQuestion.setVisible(false);
previous.setText("");
                
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
editQuestion.setVisible(false);
previous.setText("");
c19.setSelectedIndex(0); 
c20.setSelectedIndex(0);
c18.setSelectedIndex(0);
ta2.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
 String  name_edit=welcomeLable1.getText().replace(" ","_");
        int a=tab1.getSelectedRow();
String abcd= (String) tab1.getValueAt(a, 0);
previous.setText(abcd);
editQuestion.setVisible(true);
editQuestion.setLocationRelativeTo(null);
ta2.setText(abcd);
 
      
                try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select marks,level,class from "+name_edit+" where questions='"+abcd+"'";  

    System.out.println(sql);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);

while(rs.next()){
String class1=rs.getString("class");
c19.setSelectedItem(class1);
String marks=rs.getString("marks");
String level=rs.getString("level");
c18.setSelectedItem(marks);
c20.setSelectedItem(level);
}                 
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}
    }//GEN-LAST:event_tab1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

 String  name_edit=welcomeLable1.getText();
        String pwd21=new String(pwd4.getPassword());
        String pwd31=new String(pwd3.getPassword());
        if(pwd21.equals(pwd31)){
            try{
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
                String sql="update teacher_details set password='"+pwd21+"' where concat(concat(first_name,' '),last_name)='"+name_edit+"'";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane,"Password changed");
           Change_pwd.setVisible(false);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Password did not matched");
            pwd4.setText("");
            pwd3.setText("");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
Change_pwd.setVisible(true);
Change_pwd.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c5ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
String  name_edit=welcomeLable1.getText();
String  dob=c3.getSelectedItem()+"/"+c4.getSelectedItem()+"/"+c5.getSelectedItem();
     
            try{
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
                String sql="update teacher_details set teacher_type ='"+c2.getSelectedItem()+"' where concat(concat(first_name,' '),last_name)='"+name_edit+"'";
                String sql1="update teacher_details set mobile_no ='"+t7.getText()+"' where concat(concat(first_name,' '),last_name)='"+name_edit+"'";
               String sql2="update teacher_details set email_id ='"+t8.getText()+"' where concat(concat(first_name,' '),last_name)='"+name_edit+"'";
               String sql3="update teacher_details set dob ='"+dob+"' where concat(concat(first_name,' '),last_name)='"+name_edit+"'";
              
                System.out.println(sql);
                Statement stmt=con.createStatement();
                Statement stmt1=con.createStatement();
                 Statement stmt2=con.createStatement();
                  Statement stmt3=con.createStatement();
                stmt.executeUpdate(sql);
                stmt1.executeUpdate(sql1);
                 stmt2.executeUpdate(sql2);
                  stmt3.executeUpdate(sql3);
               show_more.setVisible(false);
                JOptionPane.showMessageDialog(rootPane,"Saved changes");
                c2.setEnabled(false);
        c3.setEnabled(false);
         c4.setEnabled(false);
          c5.setEnabled(false);
          t8.setEnabled(false);
          t7.setEnabled(false);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
  
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
show_more.setVisible(false);
         c2.setEnabled(false);
        c3.setEnabled(false);
         c4.setEnabled(false);
          c5.setEnabled(false);
          t8.setEnabled(false);
          t7.setEnabled(false);
       c2.setSelectedIndex(0);
  c3.setSelectedIndex(0);
           c4.setSelectedIndex(0);
       c5.setSelectedIndex(0);
          t8.setText("");
          t7.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    
       c2.setEnabled(true);
        c3.setEnabled(true);
         c4.setEnabled(true);
          c5.setEnabled(true);
          t8.setEnabled(true);
          t7.setEnabled(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       String  name_edit=welcomeLable1.getText().replace(" ","_");
     String e="";
       if(c1.getSelectedIndex()==0){
     e="FA";
    }
       else  if(c1.getSelectedIndex()==1){
     e="SA";
    }
    else    if(c1.getSelectedIndex()==2){
     e="Half yearly";
    }
         if(c1.getSelectedIndex()==3){
     e="Final";
    }
       String edit=e+" "+t5.getText();
        try{
                Class.forName("java.sql.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
               
        String user=System.getProperty("user.home");
        try {
            XWPFDocument document= new XWPFDocument();
            
     int a=1;       
 FileOutputStream out = new FileOutputStream(
   new File(user+"\\Desktop\\Question paper("+t2.getText()+").docx"));
         
            
            XWPFParagraph paragraph = document.createParagraph();
            paragraph.setAlignment(ParagraphAlignment.CENTER);
            //Set Bold an Italic
            XWPFRun One = paragraph.createRun();
            
            One.setBold(true);
            One.setItalic(true);
            One.setFontSize(20);
            One.setText(t4.getText());
            One.addBreak();
            One.setText(l4.getText()+t5.getText());
            One.addBreak();
            One.setText("("+t1.getText()+")");
            One.addBreak();
            XWPFParagraph paragraph2 = document.createParagraph();
            paragraph2.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun mm = paragraph2.createRun();
             mm.setBold(true);
             mm.setFontSize(18);
            mm.setText("MM-"+t3.getText());
            
            
            XWPFParagraph paragraph1 = document.createParagraph();
            XWPFRun Three = paragraph1.createRun();
           paragraph1.setAlignment(ParagraphAlignment.LEFT);
            Three.setFontSize(19);
            Three.setBold(false);
            Three.setText("Instructions:-");
            Three.addBreak();
            Three.setText(ta3.getText());
            Three.addBreak();
              XWPFRun F = paragraph1.createRun();
                paragraph1.setAlignment(ParagraphAlignment.LEFT);
              F.setFontSize(20);
           F.setSubscript(
                    VerticalAlign.SUBSCRIPT);
       for (int i = 0; i < tab3.getRowCount(); i++) {
                boolean isChecked = (Boolean) tab3.getValueAt(i, 0);
                
                if (isChecked) {
                    String x=(String) tab3.getValueAt(i, 1);
                    Object y= tab3.getValueAt(i, 2);
                    String sql="update "+name_edit+" set last_used ='"+edit+"' where questions='"+x+"'";
                        F.setText("(Q. "+(a++)+")"+(String) x+"                             ("+y+" marks)");
                          F.addBreak();
                  Statement stmt=con.createStatement();
                          stmt.executeUpdate(sql);
              
                }

            } 
        
         
        
               document.write(out);
                    out.close();
         JOptionPane.showMessageDialog(rootPane,"Question Paper Created");
         
         Desktop.getDesktop().open(new java.io.File(user+"\\Desktop\\Question paper("+t2.getText()+").docx"));
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(rootPane,ex.getMessage());
        }
        }
         catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        QuesPaper.setVisible(false);
        instructions.setVisible(false);
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void show_moreWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_show_moreWindowClosing
        c2.setEnabled(false);
        c3.setEnabled(false);
         c4.setEnabled(false);
          c5.setEnabled(false);
          t8.setEnabled(false);
          t7.setEnabled(false);
    }//GEN-LAST:event_show_moreWindowClosing

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
String pre=previous.getText();
        System.out.println(pre);
       String  name_edit=welcomeLable1.getText().replace(" ","_");
                try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="delete from "+name_edit+" where questions='"+pre+"' ";  

    System.out.println(sql);
Statement stmt=con.createStatement();
stmt.executeUpdate(sql);
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}  
                 g=welcomeLable1.getText().replace(" ","_");
        DefaultTableModel model=(DefaultTableModel) tab1.getModel();
       
                int rows=model.getRowCount();
                if(rows>0)
                {
                for(int i=0;i<rows;i++)
                {
                model.removeRow(0);
          
                }
                }
                try
{
Class.forName("java.sql.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher","root","123");
String sql="select questions,marks,level,class,date from "+g+"";  
    System.out.println(sql);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5)});

}                 
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}
       c19.setSelectedIndex(0); 
c20.setSelectedIndex(0);
c18.setSelectedIndex(0);
ta2.setText("");
editQuestion.setVisible(false);
previous.setText("");
                
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed


    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
about_us.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        contact_us.setVisible(true);
contact_us.setLocationRelativeTo(null);

        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
about_us.setVisible(true);
about_us.setLocationRelativeTo(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
        contact_us.setVisible(false);
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
 int a=tab3.getSelectedRow();
 
    }//GEN-LAST:event_tab3MouseClicked

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddQues;
    private javax.swing.JDialog Change_pwd;
    private javax.swing.JDialog QuesPaper;
    private javax.swing.JDialog about_us;
    private javax.swing.JLabel background1;
    public static javax.swing.JComboBox c1;
    private javax.swing.JComboBox c10;
    private javax.swing.JComboBox c11;
    private javax.swing.JComboBox c18;
    private javax.swing.JComboBox c19;
    private javax.swing.JComboBox c2;
    private javax.swing.JComboBox c20;
    private javax.swing.JComboBox c3;
    private javax.swing.JComboBox c4;
    private javax.swing.JComboBox c5;
    private javax.swing.JComboBox c9;
    private javax.swing.JDialog contact_us;
    private javax.swing.JLabel date;
    private javax.swing.JDialog editQuestion;
    private javax.swing.JDialog instructions;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel previous;
    private javax.swing.JPasswordField pwd3;
    private javax.swing.JPasswordField pwd4;
    private javax.swing.JDialog show_more;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    private javax.swing.JTextArea ta3;
    private javax.swing.JTable tab1;
    private javax.swing.JTable tab3;
    private javax.swing.JLabel variable;
    public static final javax.swing.JLabel welcomeLable1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel welcomeLable2 = new javax.swing.JLabel();
    private javax.swing.JLabel wlcmBg;
    private javax.swing.JLabel wlcmBg1;
    private javax.swing.JLabel wlcmBg2;
    private javax.swing.JLabel wlcmBg3;
    private javax.swing.JLabel wlcmBg4;
    private javax.swing.JLabel wlcmBg5;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("question bank icon.png")));
    }
}
