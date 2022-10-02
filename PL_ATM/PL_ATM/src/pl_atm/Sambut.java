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
public class Sambut extends ListMenu {

    @Override
    void awal() {
        System.out.println("Selamat Datang Di Bank Kapitalis");
        System.out.println("Pilih Menu Dibawah Ini:");
    }

    @Override
    void awalmenu() {
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Setor Tunai");
        System.out.println("4. Keluar");
    }

    @Override
    void akhirmenu() {
        System.out.print("Pilihanmu : ");
    }
}
    
