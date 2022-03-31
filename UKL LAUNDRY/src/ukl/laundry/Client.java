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
public class Client implements User {
    
    private ArrayList<String> namaClient = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    //konstruktor : method yang namanya=
    public Client(){
        this.namaClient.add("Nayla");
        this.alamat.add("Sawojajar ");
        this.telepon.add("08523500531");
        this.saldo.add(50000);
        
        this.namaClient.add("Nutsya");
        this.alamat.add("Lowokwaru ");
        this.telepon.add("06193718372");
        this.saldo.add(100000);
        
        this.namaClient.add("Nedya");
        this.alamat.add("Kedungkandang ");
        this.telepon.add("07418361826");
        this.saldo.add(55000);
        
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    
    
    @Override
    public void setNama(String namaMember) {
        this.namaClient.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaClient.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }
    
}
    
