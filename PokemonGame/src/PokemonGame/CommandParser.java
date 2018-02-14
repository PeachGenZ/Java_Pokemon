package PokemonGame;

import java.util.Scanner;

public class CommandParser {
	private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;
	private String type;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;

		System.out.println("Welcome to Pokemon Game");
		while(isRunning){
			System.out.print("Enter commands:");
			String command = commandScanner.next();
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
		}

	}

	private void addPokemon(){
		commandScanner.nextLine();
		System.out.println("Input Pokemon Type");
		System.out.println("==>Goduck");
		System.out.println("==>Zenigame");
		System.out.println("==>Ringnguma");
		System.out.print("Type:");
		String pokemonType = commandScanner.next();
		System.out.print("Input Name: ");
		String name = commandScanner.next();
		System.out.print("Input weight: ");
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
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
	}
}
