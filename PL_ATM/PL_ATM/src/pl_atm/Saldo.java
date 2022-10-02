/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl_atm;

/**
 *
 * @author Bima Krisnawan
 */
public class Saldo {
    private static Saldo instance = new Saldo();
    private Saldo(){}
    
    public static Saldo getInstance(){
    return instance;
    }
    
    public void Saldo(){
        System.out.print("Saldo Kamu Adalah : ");
    }
    
    public void Kelipatan(){
        System.out.println("Mohon Maaf, Tarik Tunai Hanya Bisa Kelipatan 50.000 ");
    }
    
    public void SaldoMinimal(){
        System.out.println("Mohon Maaf, Saldo Dibawah Batas Minimal (100.000)");
    }
    
    


}
