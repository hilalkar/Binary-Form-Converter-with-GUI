/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binaryformdonusturme;

import javax.swing.JPanel;
/**
 *
 * @author Hilal
 */
import javax.swing.*;
import java.util.Stack;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;






public class BinaryFormConvert extends JFrame {

    private final JPanel jPanel1;
    private final JLabel jLabel1;
    private final JLabel jLabel2;
    private final JTextField jTextField1;
    private final JButton jButton1;
    private final JLabel jLabel4;
    private final JLabel jLabel5;

    public BinaryFormConvert() {
        // JFrame ayarları
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1070, 813));
        getContentPane().setLayout(null);

        // JPanel ayarları (Arka plan resmi ekleniyor)
        jPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("C:\\Users\\Hilal\\OneDrive\\Masaüstü\\BinaryFormDonusturme\\BinaryFormDonusturme\\src\\binaryformdonusturme\\sky.jpg");
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1070, 813);

        // Başlık
        jLabel1 = new JLabel("BINARY FORM BULMA");
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 35));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setBounds(250, 100, 600, 50);
        jPanel1.add(jLabel1);

        // Sayı girişi etiketi
        jLabel2 = new JLabel("POZİTİF BİR TAM SAYI GİRİNİZ :");
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 25));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBounds(100, 250, 500, 30);
        jPanel1.add(jLabel2);

        // Kullanıcıdan giriş alacak TextField
        jTextField1 = new JTextField();
        jTextField1.setFont(new java.awt.Font("Georgia", 1, 18));
        jTextField1.setForeground(new java.awt.Color(0, 0, 102));
        jTextField1.setBounds(620, 250, 300, 40);
        jPanel1.add(jTextField1);

        // Dönüştür butonu
        jButton1 = new JButton("DÖNÜŞTÜRÜNÜZ");
        jButton1.setFont(new java.awt.Font("Georgia", 1, 14));
        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBounds(620, 350, 300, 40);
        jPanel1.add(jButton1);

        // Binary form etiketi
        jLabel4 = new JLabel("BINARY FORM :");
        jLabel4.setFont(new java.awt.Font("Georgia", 1, 25));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setBounds(300, 450, 300, 30);
        jPanel1.add(jLabel4);

        // Binary sonucu için etiket
        jLabel5 = new JLabel("");
        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setBounds(620, 450, 400, 30);
        jPanel1.add(jLabel5);

        // Dönüştür butonuna tıklama olayı
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                convertToBinary();
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    // Binary dönüştürme metodu
    private void convertToBinary() {
        String inputText = jTextField1.getText();

        try {
            int number = Integer.parseInt(inputText);
            if (number < 0) {
                jLabel5.setText("Lütfen pozitif bir sayı giriniz!");
                return;
            }

            // Binary formu hesapla (Stack kullanarak)
            Stack<Integer> stack = new Stack<>();
            while (number > 0) {
                stack.push(number % 2);
                number = number / 2;
            }

            StringBuilder binaryForm = new StringBuilder();
            while (!stack.isEmpty()) {
                binaryForm.append(stack.pop());
            }

            // Sonucu göster
            jLabel5.setText(binaryForm.toString());
        } catch (NumberFormatException ex) {
            jLabel5.setText("Geçerli bir tam sayı giriniz!");
        }
    }

    // Main metodu
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaryFormConvert().setVisible(true);
            }
        });
    }
}

    
    
   
    

