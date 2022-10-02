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
public class SalahMaker {
    private Salah warning;
    
    public SalahMaker(){
    warning = new Warning();
    }
    
    public void peringatanWarning(){
        warning.peringatan();
    }
}
