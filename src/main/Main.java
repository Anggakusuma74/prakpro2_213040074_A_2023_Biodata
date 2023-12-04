/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
package main;

import javax.swing.*;
import dao.BiodataDao;
import biodata.BiodataFrame;

// Class Main untuk menjalankan program
public class Main extends JFrame {
    private final BiodataDao biodataDao; // Variable biodataDao untuk menyimpan nilai biodataDao
    private final BiodataFrame biodataFrame; // Variable biodataFrame untuk menyimpan nilai biodataFrame

    // Constructor Main
    public Main() {
        // Mengatur judul dari frame
        this.setTitle("Biodata");

        // Mengatur ukuran dari frame
        this.setSize(400, 500);
        
        // Inisialisasi objek dao untuk biodataDao dan biodataFrame
        this.biodataDao = new BiodataDao();
        this.biodataFrame = new BiodataFrame(biodataDao);

        // Mengatur frame agar tidak dapat di resize
        this.biodataFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Method invokeLater dari SwingUtilities untuk menjalankan program
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
