package PokemonFarm;

import java.util.Scanner;
import java.util.ArrayList;

public class PokemonFarm {
	
	public static void main(String[] args) {
		
		System.out.println("ยืนดีต้อนรับสู่ฟาร์ม Pokemon");
		System.out.print("ป้อนจำนวน Pokemon ที่ต้องการสร้าง: ");
		
		
		System.out.print("ป้อนคำสั่ง(list): ");
		String command = data.next();
		int diff = command.compareToIgnoreCase("list");
		System.out.printf("\n");
		
		if(diff == 0) {
			for(int i=0; i<amount ;i++){   
                	System.out.printf("Pokemon ตัวที่  %d ==> ชื่อ :"+list.get(i).getNames() +"\n",i+1);
                	System.out.printf("น้ำหนัก: %.2f kg\n", list.get(i).getWeight());
                	System.out.printf("ระยะทางที่เดินได้ : %.2f km \n\n", list.get(i).getStep());
			}
		}
	}
	
	public class PokemonList {
	
		Scanner data = new Scanner(System.in);	
	-
		int amount = data.nextInt();
		
		ArrayList<ListPokemon> list;
		list = new ArrayList<ListPokemon>();
	
		for(int i=0; i<amount; i++) {
			System.out.printf("ตั้งชื่อให้กับ Pokemon ตัวที่  %d : ",i+1);
			String names = data.next();
			float weight = (float)Math.random()*100;
			float step = (float)Math.random()*10;
			list.add(new ListPokemon(names,weight,step));
		}
	

	}
