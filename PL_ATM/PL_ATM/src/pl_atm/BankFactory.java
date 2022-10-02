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
public class BankFactory {
    public Bank getBank(String BANKType){
        if(BANKType == null){
        return null;
        }
        if(BANKType.equalsIgnoreCase("CEK")){
            return new Cek();
        } else if(BANKType.equalsIgnoreCase("KELIPATAN")){
            return new Kelipatan ();
        }   else if(BANKType.equalsIgnoreCase("SALDOMINIMAL")){
            return new SaldoMinimal ();
        }
        return null;
    }
}
