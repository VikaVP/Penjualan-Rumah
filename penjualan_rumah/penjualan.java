/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan_rumah;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author VIKA
 */
public class penjualan extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    Connection c = (Connection) penjualan_rumah.koneksi.Koneksi();
    /**
     * Creates new form penjualan
     */
    public penjualan() {
        initComponents();
    }
    public void simpan() {
        try {
            st = (Statement) c.createStatement();
            String nama = "'" + name.getText() + "',";
            String harga_tanah = "'" + hrgtanah.getText() + "',";
            String areas = "'" + area.getSelectedItem() + "',";
            String harga_bangunan = "'" + hrgbangunan.getText() + "',";
            String luas_tanah_asli = "'" + luasAsli.getText() + "',";
            String luas_tanah_tersedia = "'" + luasTersedia.getText() + "',";
            String tipe_rumah = "'" + tipe.getText() + "',";
            String harga_sebelum_pajak = "'" + harga.getText() + "',";
            String harga_dp = "'" + dp.getText() + "',";
            String lama_cicilan = "'" + lama.getText() + "',";
            String pajak = "'" + ppn.getText() + "',";
            String cicilan_bulanan = "'" + cicilan.getText() + "'";
            try {
                st.executeUpdate("INSERT INTO penjualan (`nama`, `harga_tanah`, `area`, `harga_bangunan`, `tipe_rumah`, `luas_tanah_asli`, `luas_tanah_tersedia`, `harga_sebelum_pajak`, `harga_dp`, `lama_cicilan`, `pajak`, `cicilan_bulanan`) VALUES (" + nama + harga_tanah + areas + harga_bangunan + tipe_rumah + luas_tanah_asli + luas_tanah_tersedia + harga_sebelum_pajak + harga_dp + lama_cicilan + pajak + cicilan_bulanan + ")");
                JOptionPane.showMessageDialog(null, "Simpan Berhasil");
                name.setText("");
                hrgtanah.setText("");
                area.setSelectedItem("");
                hrgbangunan.setText("");
                luasAsli.setText("");
                luasTersedia.setText("");
                tipe.setText("Type Rumah");
                harga.setText("");
                dp.setText("");
                lama.setText("");
                ppn.setText("");
                cicilan.setText("");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        hrgtanah = new javax.swing.JTextField();
        area = new javax.swing.JComboBox();
        hrgbangunan = new javax.swing.JTextField();
        luasAsli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipe = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipe36 = new javax.swing.JRadioButton();
        tipe45 = new javax.swing.JRadioButton();
        proses = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        harga = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        luasTersedia = new javax.swing.JTextField();
        lama = new javax.swing.JTextField();
        ppn = new javax.swing.JTextField();
        cicilan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cek = new javax.swing.JCheckBox();
        tipe54 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        lblgambar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Nama pemesan");

        jLabel2.setText("Harga Tanah/m2");

        jLabel3.setText("Area");

        area.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "Bogenvile", "Melati", "Flamboyan" }));
        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });

        jLabel7.setText("Luas Tanah Tersedia");

        jLabel8.setText("Harga");

        jLabel9.setText("DP");

        jLabel4.setText("Harga Bangunan");

        tipe.setText("Tipe Rumah");

        jLabel6.setText("Luas Tanah Asli");

        buttonGroup1.add(tipe36);
        tipe36.setText("Tipe-36");
        tipe36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipe36ActionPerformed(evt);
            }
        });

        buttonGroup1.add(tipe45);
        tipe45.setText("Tipe-45");
        tipe45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipe45ActionPerformed(evt);
            }
        });

        proses.setText("Process");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        clear.setText("Clear");

        jLabel10.setText("Lama Cicilan");

        jLabel11.setText("PPN(10%)");

        jLabel12.setText("Cicilan/bln");

        ppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppnActionPerformed(evt);
            }
        });

        jLabel13.setText("Bulan");

        cek.setText("Setuju");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });

        buttonGroup1.add(tipe54);
        tipe54.setText("Tipe-54");
        tipe54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipe54ActionPerformed(evt);
            }
        });

        lblgambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjualan_rumah/rumah.jpg"))); // NOI18N
        lblgambar.setMaximumSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblgambar, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrgtanah, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(proses)
                        .addGap(25, 25, 25)
                        .addComponent(simpan)
                        .addGap(42, 42, 42)
                        .addComponent(clear)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cicilan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ppn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tipe)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(tipe54)
                                    .addComponent(tipe36)
                                    .addComponent(tipe45))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(luasTersedia)
                                    .addComponent(harga)
                                    .addComponent(dp)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(hrgbangunan)
                                    .addComponent(luasAsli)
                                    .addComponent(lama))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cek)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(hrgbangunan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(hrgtanah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipe)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(luasAsli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(lama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ppn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cek))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(proses)
                                    .addComponent(simpan)
                                    .addComponent(clear)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblgambar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipe36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipe45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipe54)
                            .addComponent(luasTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pilihan");

        jMenuItem3.setText("Penjualan Rumah");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Tampil Data");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Cari Data");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();  
        new login().setVisible(true); 

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ppnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppnActionPerformed

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
         int pilih;
        String namaArea;
        int hargaBangunan;
        int hargaTanah;
        pilih = area.getSelectedIndex();
        switch (pilih) {
            case 1:
                namaArea = String.valueOf(area.getSelectedItem());
                hargaBangunan = 90000000;
                hargaTanah = 500000;
                break;
            case 2:
                namaArea = String.valueOf(area.getSelectedItem());
                hargaBangunan = 120000000;
                hargaTanah = 600000;
                break;
            case 3:
                namaArea = String.valueOf(area.getSelectedItem());
                hargaBangunan = 150000000;
                hargaTanah = 700000;
                break;
            default:
                hargaBangunan = 0;
                hargaTanah = 0;
                break;
        }
        
        hrgtanah.setText(String.valueOf(hargaTanah));
        hrgbangunan.setText(String.valueOf(hargaBangunan));
        hrgtanah.setVisible(true);
        hrgbangunan.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_areaActionPerformed

    private void tipe36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipe36ActionPerformed
        int luasA = 0;
        int luasT = 0;
        String tipeRumah = null;
        if(tipe36.isSelected()){
            luasA = 90;
            luasT = 90;
            tipeRumah = "Type-45";
        }
        luasAsli.setText(String.valueOf(luasA));
        luasTersedia.setText(String.valueOf(luasT));
        luasAsli.setVisible(true);
        luasTersedia.setVisible(true);
        tipe.setText(String.valueOf(tipeRumah));
        // TODO add your handling code here:
    }//GEN-LAST:event_tipe36ActionPerformed

    private void tipe45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipe45ActionPerformed
        int luasA = 0;
        int luasT = 0;
        String tipeRumah = null;
        if(tipe45.isSelected()){
            luasA = 120;
            luasT = 120;
            tipeRumah = "Type-45";
        }
        luasAsli.setText(String.valueOf(luasA));
        luasTersedia.setText(String.valueOf(luasT));
        luasAsli.setVisible(true);
        luasTersedia.setVisible(true);
        tipe.setText(String.valueOf(tipeRumah));
        // TODO add your handling code here:
    }//GEN-LAST:event_tipe45ActionPerformed

    private void tipe54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipe54ActionPerformed
        int luasA = 0;
        int luasT = 0;
        String tipeRumah = null;
        if(tipe54.isSelected()){
            luasA = 140;
            luasT = 140;
            tipeRumah = "Type-54";
        }
        luasAsli.setText(String.valueOf(luasA));
        luasTersedia.setText(String.valueOf(luasT));
        luasAsli.setVisible(true);
        luasTersedia.setVisible(true);
        tipe.setText(String.valueOf(tipeRumah));
        // TODO add your handling code here:
    }//GEN-LAST:event_tipe54ActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        int hargaSebelumPajak , lamaCicil = 36,pajak, dpAwal, cicilanBulanan;
        hargaSebelumPajak = (Integer.parseInt(luasTersedia.getText()) * Integer.parseInt(hrgtanah.getText())) + Integer.parseInt(hrgbangunan.getText());
        lama.setText(String.valueOf(lamaCicil));
        pajak = (int) (0.1 * hargaSebelumPajak);
        dpAwal = pajak;
        cicilanBulanan = (hargaSebelumPajak + pajak - dpAwal)/lamaCicil;
        harga.setText(String.valueOf(hargaSebelumPajak));       
        ppn.setText(String.valueOf(pajak));
        dp.setText(String.valueOf(dpAwal));
        cicilan.setText(String.valueOf(cicilanBulanan));
        // TODO add your handling code here:
    }//GEN-LAST:event_prosesActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
        if(cek.isSelected()){
            int jawab = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi?");
    
    switch(jawab){
        case JOptionPane.YES_OPTION: 
            JOptionPane.showMessageDialog(this, "Kamu menjawab ya");
            break;
        case JOptionPane.NO_OPTION:
            JOptionPane.showMessageDialog(this, "Kamu menjawab tidak");
            break;
    }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cekActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        simpan();
        // TODO add your handling code here:
    }//GEN-LAST:event_simpanActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose(); 
        new tampil_data().setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        dispose(); 
        new cari_data().setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox area;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cek;
    private javax.swing.JTextField cicilan;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dp;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField hrgbangunan;
    private javax.swing.JTextField hrgtanah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lama;
    private javax.swing.JLabel lblgambar;
    private javax.swing.JTextField luasAsli;
    private javax.swing.JTextField luasTersedia;
    private javax.swing.JTextField name;
    private javax.swing.JTextField ppn;
    private javax.swing.JButton proses;
    private javax.swing.JButton simpan;
    private javax.swing.JLabel tipe;
    private javax.swing.JRadioButton tipe36;
    private javax.swing.JRadioButton tipe45;
    private javax.swing.JRadioButton tipe54;
    // End of variables declaration//GEN-END:variables

    private static class rumah1 {

        public rumah1() {
        }
    }
}
