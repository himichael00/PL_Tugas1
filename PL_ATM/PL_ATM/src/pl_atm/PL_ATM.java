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

import java.util.Scanner;
public class PL_ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BankFactory bankFactory = new BankFactory();
        
        //menentukan saldo awal
        int saldo = 500000;
        
        //singleton untuk ketentuan minimal dan kelipatan
        Ketentuan object = Ketentuan.getInstance();
        int kelipatan = object.Kelipatan();
        int minimal = object.Minimal();
        
        while(true){
            
        //template pattern untuk print menu
        ListMenu listmenu = new Sambut();
        listmenu.menu();
        
        Scanner sc= new Scanner(System.in);
        int pilihan= sc.nextInt();
        
        // menu menggunakan factory pattern
        if(pilihan == 1){
            Bank bank1 = bankFactory.getBank("CEK");
            bank1.BANK();
            System.out.println(+saldo);
            Scanner s = new Scanner(System.in);
            System.out.print("Tekan Apapun Untuk Melanjutkan");
            s.nextLine();
        }
        else if(pilihan == 2){
            
            System.out.print("Masukkan Jumlah Yang Ingin Ditarik : ");
            Scanner t= new Scanner(System.in);
            int tarik = t.nextInt();
            
            if(saldo-tarik < minimal){
                Bank bank2 = bankFactory.getBank("SALDOMINIMAL");
                bank2.BANK();
            }else{
                if (tarik % kelipatan != 0){
                    Bank bank3 = bankFactory.getBank("KELIPATAN");
                    bank3.BANK();
                }else{
                    saldo = saldo - tarik;
                    System.out.println("Saldo Sekarang : " + saldo); 
                }
            }
            Scanner s = new Scanner(System.in);
            System.out.print("Tekan Apapun Untuk Melanjutkan");
            s.nextLine();
        }
        else if(pilihan == 3){
            System.out.print("Masukkan Jumlah Yang Ingin Disetor : ");
            Scanner s= new Scanner(System.in);
            int setor = s.nextInt();
            if (setor % kelipatan != 0){
                    Bank bank3 = bankFactory.getBank("KELIPATAN");
                    bank3.BANK();
                }else{
                    saldo = saldo + setor;
                    System.out.println("Saldo Sekarang : " + saldo);      
                }
            Scanner a = new Scanner(System.in);
            System.out.print("Tekan Apapun Untuk Melanjutkan");
            a.nextLine();
        }
        else if (pilihan == 4){
            System.out.println("Bay Bay");
            Scanner s = new Scanner(System.in);
            System.out.print("");
            s.nextLine();
            break;
            
        }else{
            //facade untuk warning salah input menu
            SalahMaker salahMaker = new SalahMaker();
            salahMaker.peringatanWarning();
            Scanner s = new Scanner(System.in);
            System.out.println("Tekan Tombol Apapun Untuk Kembali Kejalan Yang Benar");
            s.nextLine();
            
        }
        } 
    }
    
}
