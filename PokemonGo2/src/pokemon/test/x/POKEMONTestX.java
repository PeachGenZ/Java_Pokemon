/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.test.x;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class POKEMONTestX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
            System.out.println("Wellcome to the PokemonWorld");
            Map map = new Map();
            float step=2;
            System.out.println("Starter pokemon is Zenigame");
            Scanner scanf = new Scanner(System.in);
            System.out.print("How much Zenigame:");
       
            int much = scanf.nextInt();
            scanf.nextLine();
            
            ArrayList<Zenigame> list = new ArrayList<>();
            for(int i=0;i<much;i++){
                System.out.printf("Enter Pokemon Name[%d]: ",i+1);
                String names =  scanf.next();
                scanf.nextLine();
                float mass = (float)Math.random()*100;
                list.add(new Zenigame(names,mass,step));
            }
            
            for(int i=0;i<much;i++){   
                System.out.print("Index Zenigame["+(+1)+"]->Name :"+list.get(i).getName()+"  ");
                System.out.printf("Mass:%.2f kg\n",list.get(i).getMass());
            }
            int stop=0;
            while(stop >=0){
                System.out.print("ฉันจะเลือกนายแล้วนะ :");
                int nameZeni =scanf.nextInt(); 
                scanf.nextLine();
                if (nameZeni <= 0 )
                    break;
                stop=nameZeni;
                System.out.println("->"+list.get(nameZeni-1).getName());
                System.out.print("Zenigame-ว่ายน้ำสิ!!!(ครั้ง): ");
                int term =scanf.nextInt();    
                if (nameZeni <= 0 || term <=0)
                    break;
                scanf.nextLine();
                list.get(nameZeni-1).setSwim(term);
                
                System.out.println(list.get(nameZeni-1).getSwim()+" km");
                System.out.println("Sum distance: " + list.get(nameZeni-1).sumDistance() + "km");
                
            }
            System.out.println(" Thank you!!! ");
            
    }
            
            
            /*
            เวอร์ชั่นที่แล้ว 
            float stay ; 
            for(int i=1;i<11;i++){
                zeni.walk();
                System.out.println("Zenigame distance with walk ["+ i + "] : " + zeni.getDistance());
                stay = zeni.sumDistance(zeni.getDistance(),0,0);
                map.gps(stay);
                     
            }
            for(int i=1;i<4;i++){
                zeni.jump();
                System.out.println("Zenigame distance with jump ["+ i + "] : " + zeni.getJump());
                stay = zeni.sumDistance(zeni.getDistance(),zeni.getJump(),0);
                map.gps(stay);  
                
            }
            for(int i=1;i<6;i++){
                zeni.swim();
                System.out.println("Zenigame distance of swim  ["+ i + "] : " + zeni.getSwim());
                stay = zeni.sumDistance(zeni.getDistance(),zeni.getJump(),zeni.getSwim());
                map.gps(stay);   
            }
            System.out.println("SumDistance:"+ zeni.sumDistance(zeni.getDistance(),zeni.getJump(),zeni.getSwim()));
              */  
}
    
