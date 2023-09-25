/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4caud;

/**
 *
 * @author ASUS
 */
public class Bai4cauD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soGiay = 70;
        int gio = soGiay / 3600; // 1gio = 3600 giay
        int phut = (soGiay % 3600) / 60; // 1 phut = 60 giay
        int giay = soGiay % 60;
     System.out.println(gio + "gio" + phut + "phut" + giay + "giay");
    }
    
}
