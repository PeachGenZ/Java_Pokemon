package PokemonFarm;

import java.util.Scanner;
import java.util.ArrayList;

public class PokemonFarm {
	
	public static void main(String[] args) {
		
		System.out.println("�׹�յ�͹�Ѻ������� Pokemon");
		System.out.print("��͹�ӹǹ Pokemon ����ͧ������ҧ: ");
		
		
		System.out.print("��͹�����(list): ");
		String command = data.next();
		int diff = command.compareToIgnoreCase("list");
		System.out.printf("\n");
		
		if(diff == 0) {
			for(int i=0; i<amount ;i++){   
                	System.out.printf("Pokemon ��Ƿ��  %d ==> ���� :"+list.get(i).getNames() +"\n",i+1);
                	System.out.printf("���˹ѡ: %.2f kg\n", list.get(i).getWeight());
                	System.out.printf("���зҧ����Թ�� : %.2f km \n\n", list.get(i).getStep());
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
			System.out.printf("��駪������Ѻ Pokemon ��Ƿ��  %d : ",i+1);
			String names = data.next();
			float weight = (float)Math.random()*100;
			float step = (float)Math.random()*10;
			list.add(new ListPokemon(names,weight,step));
		}
	

	}
