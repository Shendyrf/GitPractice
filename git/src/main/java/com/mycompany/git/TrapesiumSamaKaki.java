/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.git;

/**
 *
 * @author User
 */
public class TrapesiumSamaKaki extends BangunDatar{
    private double sisimiring;
    private double sisiAtas;
    private double sisiBawah;
    private double tinggi;

    public TrapesiumSamaKaki() {
    }

    public TrapesiumSamaKaki(double sisimiring, double sisiAtas, double sisiBawah, double tinggi, String name, int jumlahSudut) {
        super(name, jumlahSudut);
        this.sisimiring = sisimiring;
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    
    
    @Override
    public double hitungLuas() {
        return 1/2 * (sisiAtas + sisiBawah) * tinggi;
    }

    @Override
    public double hitungKeliing() {
        return (sisimiring * 2) + sisiAtas + sisiBawah;
    }
    
    
}
