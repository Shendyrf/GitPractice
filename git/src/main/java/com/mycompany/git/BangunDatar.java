/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.git;

/**
 *
 * @author hp
 */
public abstract class BangunDatar {
    private String name;
    private int jumlahSudut;

    public BangunDatar() {
    }
    

    public BangunDatar(String name, int jumlahSudut) {
        this.name = name;
        this.jumlahSudut = jumlahSudut;
    }
    
    public abstract double hitungLuas();
    public abstract double hitungKeliing();
       
}
