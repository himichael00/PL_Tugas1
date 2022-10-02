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
public class Ketentuan {
    private static Ketentuan instance = new Ketentuan();
    
    private Ketentuan(){}
    
    public static Ketentuan getInstance(){
    return instance;
    }
    
    public int Minimal(){
        return 100000;   
    }
    
    public int Kelipatan(){
        return 50000;
    }
}
