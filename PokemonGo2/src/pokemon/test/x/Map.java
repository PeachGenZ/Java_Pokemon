/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.test.x;

/**
 *
 * @author DELL
 */
public class Map {
    private String a1="Pokemon Center";
    private String a2="Gym";
    private String a3="Forest Grass";
    
    public void gps(float now){
        if( now == 3.0 || now == 4.5 || now == 7.0 ||now == 9.5)
            System.out.print("Zenigame come to: "+ a3+"\n");
        if (now == 6.0) 
            System.out.print("Zenigame come to: "+ a1+"\n");
        if (now == 15.5)
            System.out.print("Zenigame come to: "+ a2+"\n");
       
    }
}
