package PokemonGame;

import java.util.Random;
import java.util.Scanner;

public class CommandParser {
	private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;
	private Backpack backpack;
	private WildPokemon wild;
	
	
	public CommandParser(PokemonFarm pokemonFarm, WildPokemon wild, Backpack backpack){
		this.pokemonFarm = pokemonFarm;
		this.backpack = backpack;
        this.wild = wild;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;

        String scan;

        while(isRunning){
            System.out.println("Where are you going?");
            System.out.print("<pokemonfarm,wild,quit> :");
            scan = commandScanner.next();
            if(scan.equals("pokemonfarm")) this.pokemonFarm();
            else if(scan.equals("wild")) this.wild();
            else if(scan.equals("quit")){
                isRunning = false;
                System.out.print("Goodbye.");
            }
            else System.out.println("No command.");
        }

    }
	
	public void pokemonFarm(){
		boolean isRunning1 = true;

		System.out.println("Welcome to Pokemon Farm");
		while(isRunning1){
			System.out.print("Enter commands:");
			String command = commandScanner.next();
			if(command.equals("quit")){
				isRunning1 = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
			else if(command.equals("exercise"))
				this.exercisePokemons();
			else if(command.equals("walk"))
				this.walkPokemons();
			else if(command.equals("sleep"))
				this.sleepPokemons();
		}

	}
	
	private void wild(){
        boolean isRunning2 = true;
        String command2;

        while(isRunning2){
            System.out.println("What do you want to do? catch wild pokemon or leave?");
            System.out.print("<catch,list,leave> :");
            command2 = commandScanner.next();

            if(command2.equals("catch")) this.catchPokemon();
            else if(command2.equals("list")) this.listWildPokemon();
            else if(command2.equals("leave")){
                isRunning2 = false;
                System.out.println("bye bye.");
            }
        }
    }
	
	 private void catchPokemon(){
	        Random rand = new Random();
	        String type = "";
	        boolean run = true;
	        boolean opportunity = false;

	        int numOfPoke = rand.nextInt(3);
	        System.out.println("Finding Wild Pokemon");
	        if(numOfPoke == 0){
	            System.out.println("----------------------------");
	            System.out.println("You found Dragonair!!");
	            System.out.println("----------------------------");
	            opportunity = wild.catchPokemon();
	        }
	        else if(numOfPoke == 1){
	            System.out.println("----------------------------");
	            System.out.println("You found Magikarp!!");
	            System.out.println("----------------------------");
	            opportunity = wild.catchPokemon();
	        }
	        else if(numOfPoke == 2){
	            System.out.println("----------------------------");
	            System.out.println("You found Ponyta!!");
	            System.out.println("----------------------------");
	            opportunity = wild.catchPokemon();
	        }
	        
	        if(opportunity){
	            System.out.print("You get "+type+" ");
	            while(run){
	                System.out.print("<keep,release> :");
	                String wantto = commandScanner.next();
	                if(wantto.equals("keep")){
	                    System.out.print("Enter Name of "+type+" :");
	                    String name = commandScanner.next();
	                    float weight = 10f;
	                    float stepLength = 5f;

	                    if(type.equals("Goduck")){
	                    	Goduck goduck = new Goduck(name, weight, stepLength);
	                        backpack.addPokemon(goduck);
	                    }
	                    else if(type.equals("Zenigame")){
	                    	Zenigame zenigame = new Zenigame(name, weight, stepLength);
	                        backpack.addPokemon(zenigame);
	                    }
	                    else if(type.equals("Ponyta")) {
	                    	Ringnguma ringnguma = new Ringnguma(name, weight, stepLength);
	                        backpack.addPokemon(ringnguma);
	                    }
	                    run = false;
	                }
	                else if(wantto.equals("release")){
	                    System.out.println("=======================");
	                    System.out.println("Pokemon Escape!!");
	                    System.out.println("=======================");
	                    run = false;
	                }
	            }


	        }
	    }

	 private void listWildPokemon(){
	        System.out.println("==========================================");
	        System.out.println("Pokemon List (in backpack)");
	        System.out.println("==========================================");
	        this.backpack.list();
	        System.out.println("==========================================");
	    }
	 
	private void addPokemon(){
		commandScanner.nextLine();
		System.out.println("Input Pokemon");
		System.out.println("==>Goduck");
		System.out.println("==>Zenigame");
		System.out.println("==>Ringnguma");
		System.out.print(":");
		String pokemonType = commandScanner.next();
		System.out.print("Input Name: ");
		String name = commandScanner.next();
		System.out.print("Input weight(kg): ");
		float weight = commandScanner.nextFloat();
		System.out.print("Input step length: ");
		float stepLength = commandScanner.nextFloat();

		if(pokemonType.equals("Goduck")){
			Goduck goduck = new Goduck(name, weight, stepLength);
			pokemonFarm.addPokemon(goduck);
		}
		
		else if(pokemonType.equals("Zenigame")){
			Zenigame zenigame = new Zenigame(name, weight, stepLength);
			pokemonFarm.addPokemon(zenigame);
		}
		
		else if(pokemonType.equals("Ringnguma")){
			Ringnguma ringnguma = new Ringnguma(name, weight, stepLength);
			pokemonFarm.addPokemon(ringnguma);
		}

	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed?\n: ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
		else{
			this.pokemonFarm.feed(name);
		}
	}
	
	private void exercisePokemons() {
		System.out.print("Which pokemon do you want to exercis?\n: ");
		String name = this.commandScanner.next();
		if(name.equals("all")) {
			this.pokemonFarm.exercise("all");
		}
		else{
			this.pokemonFarm.exercise(name);
		}
	}
	
	private void walkPokemons() {
		System.out.print("Which pokemon do you want to walk?\n: ");
		String name = this.commandScanner.next();
		if(name.equals("all")) {
			this.pokemonFarm.walk("all");
		}
		else{
			this.pokemonFarm.walk(name);
		}
	}
	
	private void sleepPokemons() {
		System.out.print("Which pokemon do you want to sleep?\n: ");
		String name = this.commandScanner.next();
		if(name.equals("all")) {
			this.pokemonFarm.sleep("all");
		}
		else{
			this.pokemonFarm.sleep(name);
		}
	}
}
