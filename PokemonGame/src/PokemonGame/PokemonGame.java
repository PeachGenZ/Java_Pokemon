package PokemonGame;

class PokemonGame {
	public static void main(String[] args){
		PokemonFarm pokemonFarm = new PokemonFarm();
		Backpack backpack = new Backpack();
        PokeBall pokeball = new PokeBall();
        WildPokemon wild = new WildPokemon(pokeball);
		CommandParser commandParser = new CommandParser(pokemonFarm, wild, backpack);
		
		commandParser.run();
	}

}
