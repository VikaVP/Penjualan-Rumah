package penjualan_rumah;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIKA
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    Connection koneksi;
    
    public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/penjualan_rumah", "root", "");
//            (`nama`, `harga_tanah`, `area`, `harga_bangunan`, `luas_tanah_asli`, `luas_tanah_tersedia`, `tipe_rumah`, `harga_sebelum_pajak`, `harga_dp`, `lama_cicilan`, `pajak`, `cicilan_bulanan`)
            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);           
            return null;
        }
    }
}
