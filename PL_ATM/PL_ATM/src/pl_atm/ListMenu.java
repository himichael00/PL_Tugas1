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
public abstract class ListMenu {
    abstract void awal();
    abstract void awalmenu();
    abstract void akhirmenu();
    
    public final void menu(){
        awal();
        awalmenu();
        akhirmenu();
        
    }
    
}
