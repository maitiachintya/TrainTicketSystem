/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrainTicket;
/**
 *
 * @author ACHINTYA MAITI
 */
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;//Generate the random ticket numbers
public class TrainsTickets extends javax.swing.JFrame 
{
    String c,a;
    /**
     * Creates new form TrainsTickets
     */
    public TrainsTickets() {
        initComponents();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup2.add(jRadioButton4);
        buttonGroup2.add(jRadioButton5);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 96)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Train Ticketing System");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrainTicket/download.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton1.setText("Standard");

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton2.setText("Economy");

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton3.setText("First Class");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Class");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Ticket Type");

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton4.setText("Single");

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton5.setText("Return");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Adult");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Child");

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton6.setText("Yes");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton7.setText("Yes");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Destination");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Howrah", "Kharagpur", "Digha", "Haldia", "Medinipur", "Mecheda", "Burdwan", "Shewraphuli", "Tarkeshwar", "Durgapur", "Asnan", "Katwa" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton6))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton5))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        jPanel3.setForeground(new java.awt.Color(255, 255, 51));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Sub Total");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Tax");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Total");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Total");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(71, 71, 71)
                .addComponent(jButton2)
                .addGap(76, 76, 76)
                .addComponent(jButton3)
                .addGap(120, 120, 120))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jPanel5.setBackground(new java.awt.Color(255, 0, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 0, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        jPanel6.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Class");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Ticket Type");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Adult");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Child");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setText("From");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setText("To");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setText("Date");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("Time");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setText("Ticket No.");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setText("Price");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setText("Route");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.BLACK);
    }//GEN-LAST:event_formWindowActivated

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jLabel11.setText(null);
        jLabel12.setText(null);
        jLabel13.setText(null);
        jLabel18.setText(null);
        jLabel19.setText(null);
        jLabel20.setText(null);
        jLabel21.setText(null);
        jLabel33.setText(null);
        jLabel34.setText(null);
        jLabel35.setText(null);
        jLabel26.setText(null);
        jLabel27.setText(null);
        jLabel28.setText(null);
        jLabel29.setText(null);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //==============================Time=================================//
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("   HH:mm:ss");
        jLabel29.setText(tTime.format(timer.getTime()));
        //==============================Date================================//
        SimpleDateFormat tDate = new SimpleDateFormat("   dd-MM-yyyy");
        jLabel28.setText(tDate.format(timer.getTime()));
        jLabel26.setText("   Howrah *");
        jLabel27.setText((String) jComboBox1.getSelectedItem()+" *");
        //======================Random Number Generator=======================//
        int num1;
        String q1 ="";
        num1 = 1325 + (int) (Math.random()*4238);
        q1 +=num1 + 13225;
        jLabel33.setText(  q1);
        //=====================================================================//
        jLabel34.setText("   ANY");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        double tax = 19.50;
        double milesk8 = 25.78;//mecheda
        double milesk12 = 25.10;//kharagpur
        double milesk20 = 45.23;//digha
        double milesk30 = 55.98;//haldia
        double milesk35 = 65.10;//medinipur
        double milesk42 = 70.38;//tarkeshwar
        double milesk50 = 75.18;//shewraphuli
        double milesk60 = 77.98;//burdwan
        double milesk65 = 80.38;//katwa
        double milesk66 = 82.58;//asnan
        double milesk70 = 87.68;//durgapur
        double total_cost, eco = 3.85, fclass = 5.60;
        //===============Howrah-->>Mecheda for adult in std class with single ticket===============//
        if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * milesk8) / 100;
            String stax = String.format("%.2f Rs.", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f Rs.", milesk8);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk8 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("   STD");
            jLabel19.setText("   ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText("   NIL");
        }
        //===============Mecheda-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * milesk8) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk8 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Mecheda for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * milesk8) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk8 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Mecheda-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * milesk8) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk8 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("CLASS");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Kharagpur for adult in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * milesk12) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk12 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("CLASS");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Kharagpur-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * milesk12) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk8 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("CLASS");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Kharagpur for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * milesk12) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk12 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("CLASS");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Kharagpur-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * milesk12) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk12 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("CLASS");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Digha for adult in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * milesk20) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk20 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("CLASS");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Digha-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * milesk20) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk20 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("CLASS");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Digha-->>Howrah for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * milesk20) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk20 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Digha for child in std class with return ticket===============//
        if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * milesk20) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk20 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Haldia for adult in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * milesk30) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk30 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Haldia-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * milesk30) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk30 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Haldia for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * milesk30) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk30 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Haldia-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * milesk30) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk30 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Medinipur for adult in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * milesk35) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk35 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Medinipur-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * milesk35) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk35 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Medinipur for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * milesk35) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk35 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Medinipur-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * milesk35) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk35 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Tarkeshwar for adult in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * milesk42) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk42 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Tarkeshwar-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * milesk42) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk42 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Tarkeshwar for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * milesk42) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk42 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Tarkeshwar-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * milesk42) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk42 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //============Howrah-->>Shewraphuli for adult in std class with single ticket============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * milesk50) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk50 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //=============Shewraphuli-->>Howrah for adult in std class with return ticket=============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * milesk50) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk50 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //============Howrah-->>Shewraphuli for child in std class with single ticket============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * milesk50) / 100;
            String stax = String.format("%.2f", total_cost  -18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk50 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Shewraphuli-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * milesk50) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk50 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Burdwan for adult in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * milesk60) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk60 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Burdwan-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * milesk60) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk60 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Burdwan for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * milesk60) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk60 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Burdwan-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * milesk60) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk60 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Katwa for adult in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * milesk65) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk65 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Katwa-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * milesk65) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk65 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Katwa for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * milesk65) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk65 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Katwa-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * milesk65) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk65 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Mecheda for Asnan in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * milesk66) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk66 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Asnan-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * milesk66) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk66 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Asnan for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * milesk66) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk66 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Asnan-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * milesk66) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk66 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Durgapur for adult in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * milesk70) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk70 + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Durgapur-->>Howrah for adult in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * milesk70) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk70 + total_cost) * 2);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Durgapur for child in std class with single ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * milesk70) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk70 + total_cost - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Durgapur-->>Howrah for child in std class with return ticket===============//
        else if((jRadioButton1.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * milesk70) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk70 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("STD");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Mecheda for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * (milesk8 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk8 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Mecheda for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * milesk8) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk8 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Mecheda-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * (milesk8 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk8 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Mecheda-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * (milesk8 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk8 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Kharagpur for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * (milesk12 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk12 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Kharagpur for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * milesk12) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk12 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Kharagpur-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * (milesk12 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk12 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Kharagpur-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * (milesk12 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk12 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Digha for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * (milesk20 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk20 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Digha for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * milesk20) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk20 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Digha-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * (milesk20 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk20 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Digha-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * (milesk20 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk20 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Haldia for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * (milesk30 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk30 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Haldia for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * milesk30) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk30 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Haldia-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * (milesk30 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk30 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Haldia-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * (milesk30 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk30 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Medinipur for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * (milesk35 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk35 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Medinipur for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * milesk35) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk35 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Medinipur-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * (milesk35 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk35 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Medinipur-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * (milesk35 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk35 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Tarkeshwar for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * (milesk42 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f ", milesk42 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk42 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Tarkeshwar for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * milesk42) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk42 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Tarkeshwar-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * (milesk42 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk42 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Tarkeshwar-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * (milesk42 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk42 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Shewraphuli for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * (milesk50 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk50 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Shewraphuli for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * milesk50) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk50 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Shewraphuli-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * (milesk50 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk50 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Shewraphuli-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * (milesk50 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk50 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Burdwan for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * (milesk60 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk60 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Burdwan for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * milesk60) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk60 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Burdwan-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * (milesk60 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk60 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Burdwan-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * (milesk60 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk60 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Katwa for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * (milesk65 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk65 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Katwa for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * milesk65) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk65 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Katwa-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * (milesk65 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk65 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Katwa-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * (milesk65 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk65 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Asnan for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * (milesk66 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk66 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Asnan for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * milesk66) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk66 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Asnan-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * (milesk66 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk66 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Asnan-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * (milesk66 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk66 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Durgapur for adult in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * (milesk70 + eco)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk70 + eco + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Durgapur for child in economy class with single ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * milesk70) / 100;
            String stax = String.format("%.2f", (total_cost + eco) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70 + eco);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk70 + total_cost + eco) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Durgapur-->>Howrah for child in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * (milesk70 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk70 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Durgapur-->>Howrah for adult in economy class with return ticket===============//
        else if((jRadioButton2.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * (milesk70 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk70 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("ECONOMY");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Mecheda for adult in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * (milesk8 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk8 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Mecheda for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * milesk8) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk8 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Mecheda-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * (milesk8 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk8 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Mecheda-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Mecheda")))
        {
            total_cost = (tax * (milesk8 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk8 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk8 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Kharagpur for adult in first class with single ticket===============//
         else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * (milesk12 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk12 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
         //===============Howrah-->>Kharagpur for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * milesk12) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk12 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Kharagpur-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * (milesk12 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk12 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Kharagpur-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Kharagpur")))
        {
            total_cost = (tax * (milesk12 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk12 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk12 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Digha for adult in first class with single ticket===============//
         else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * (milesk20 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk20 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
         //===============Howrah-->>Digha for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * milesk20) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk20 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Digha-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * (milesk20 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk20 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Digha-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Digha")))
        {
            total_cost = (tax * (milesk20 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk20 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk20 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Haldia for adult in first class with single ticket===============//
         else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * (milesk30 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk30 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
         //===============Howrah-->>Haldia for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * milesk30) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk30 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Haldia-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * (milesk30 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk30 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Haldia-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Haldia")))
        {
            total_cost = (tax * (milesk30 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk30 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk30 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Medinipur for adult in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * (milesk35 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk35 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Medinipur for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * milesk35) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk35 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Medinipur-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * (milesk35 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk35 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Medinipur-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Medinipur")))
        {
            total_cost = (tax * (milesk35 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk35 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk35 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Tarkeshwar for adult in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * (milesk42 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk42 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Tarkeshwar for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * milesk42) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk42 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Tarkeshwar-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * (milesk42 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk42 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Tarkeshwar-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Tarkeshwar")))
        {
            total_cost = (tax * (milesk42 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk42 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk42 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Shewraphuli for adult in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * (milesk50 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk50 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Shewraphuli for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * milesk50) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk50 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Shewraphuli-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * (milesk50 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk50 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Shewraphuli-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Shewraphuli")))
        {
            total_cost = (tax * (milesk50 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk50 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk50 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Burdwan for adult in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * (milesk60 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk60 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Burdwan for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * milesk60) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk60 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Burdwan-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * (milesk60 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk60 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Burdwan-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Burdwan")))
        {
            total_cost = (tax * (milesk60 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk60 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk60 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Katwa for adult in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * (milesk65 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk65 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Katwa for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * milesk65) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk65 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Katwa-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * (milesk65 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk65 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Katwa-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Katwa")))
        {
            total_cost = (tax * (milesk65 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk65 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk65 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Asnan for adult in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * (milesk66 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk66 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Asnan for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * milesk66) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk66 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Asnan-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * (milesk66 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk66 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Asnan-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Asnan")))
        {
            total_cost = (tax * (milesk66 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk66 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk66 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Durgapur for adult in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * (milesk70 + fclass)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", milesk70 + fclass + total_cost);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Howrah-->>Durgapur for child in first class with single ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton4.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * milesk70) / 100;
            String stax = String.format("%.2f", (total_cost + fclass) - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70 + fclass);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk70 + total_cost + fclass) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("ONE WAY");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Durgapur-->>Howrah for child in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton7.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * (milesk70 * 2)) / 100;
            String stax = String.format("%.2f", total_cost - 18);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", ((milesk70 + total_cost) * 2) - 18);
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
        //===============Durgapur-->>Howrah for adult in first class with return ticket===============//
        else if((jRadioButton3.isSelected()) && (jRadioButton5.isSelected()) && (jRadioButton6.isSelected())
                && (jComboBox1.getSelectedItem().equals("Durgapur")))
        {
            total_cost = (tax * (milesk70 * 2)) / 100;
            String stax = String.format("%.2f", total_cost);
            jLabel12.setText(stax);
            String sub_total = String.format("%.2f", milesk70 * 2);
            jLabel11.setText(sub_total);
            String total = String.format("%.2f Rs.", (milesk70 + total_cost) * 2) ;
            jLabel13.setText(total);
            jLabel35.setText(total);
            jLabel18.setText("FIRST");
            jLabel19.setText("RETURN");
            jLabel20.setText(a);
            jLabel21.setText(c);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        a="ONE";
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
        c="ONE";
    }//GEN-LAST:event_jRadioButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainsTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    // End of variables declaration//GEN-END:variables
}
