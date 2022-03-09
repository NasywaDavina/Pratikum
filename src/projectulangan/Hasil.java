/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectulangan;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Nasywa Davina
 */
public class Hasil {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        nama a = new nama();
        System.out.println("Minat Membaca di Indonesia menurut Jenjang SD, SMK, dan SMK");
        
        System.out.println("------------------");
        
        System.out.println("♥ Jenjang");
        SD y = new SD();
        y.jenjang = input.next();
        y.Perempuan();
        y.LakiLaki();
        
        System.out.println("-------------------");
        
        SMP x = new SMP();
        System.out.println("♥ Jenjang");
        x.Jenjang = input.next();
        x.perempuan();
        x.LakiLaki();
        
        System.out.println("--------------------");
        
        SMK p = new SMK();
        System.out.println("♥ Jenjang");
        p.JENJANG = input.next();
        p.perempuan();
        p.lakiLaki();
        
        System.out.println("---------------------");
        
        
        System.out.println("Total Minat Baca Perempuan keseluruhan "+a.total(9));
        System.out.println("Total Minat Baca Laki Laki Keseluruhan "+a.total(4));

    }
}
