/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zgadywanka;

/**
 *
 * @author Sebix
 */
public class Gracz {
    int liczba = 0;
    
    public void zgaduj(){
        liczba = (int) (Math.random()*10);
        System.out.println("Typuje liczbe: " + liczba);
    }
    
}
