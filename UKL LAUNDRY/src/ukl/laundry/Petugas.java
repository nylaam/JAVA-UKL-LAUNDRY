/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class Petugas implements User {
private ArrayList<String> namaPetugas = new ArrayList<String>(); 
private ArrayList<String> alamat = new ArrayList<String>(); 
private ArrayList<String> telepon = new ArrayList<String>(); 
private ArrayList<String> jabatan = new ArrayList<String>();

public Petugas (){
    this.namaPetugas.add("Sekar");
    this.alamat.add("Malang");
    this.telepon.add("081368045693");
    this.jabatan.add("Pemilik toko");
    
    this.namaPetugas.add("Feina");
    this.alamat.add("Suhat");
    this.telepon.add("082234664321");
    this.jabatan.add("Petugas cuci");
    
    this.namaPetugas.add("Sufan");
    this.alamat.add("Sawojajar");
    this.telepon.add("081234234255");
    this.jabatan.add("Petugas setrika");
    
    this.namaPetugas.add("Tarisa");
    this.alamat.add("Danau Buyan");
    this.telepon.add("085452344230");
    this.jabatan.add("Petugas packing");
}
public void setJabatan(String jabatan){
    this.jabatan.add(jabatan);
}
public String getJabatan(int id){
    return this.jabatan.get(id);
}
public int getJmlPetugas(){
    return this.namaPetugas.size();
}

    @Override
    public void setNama(String namaKaryawan) {
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    
}
    
