package PokemonGame;

public class PokeBall {
	private float pokeball;
	private float greatball;
	private float ultraball;
	
	public PokeBall() {
		pokeball = (float) 0.8;
		greatball = (float) 0.9;
		ultraball = (float) 1.0;
	}

	public float getPokeball() {
		return pokeball;
	}


	public float getGreatball() {
		return greatball;
	}


	public float getUltraball() {
		return ultraball;
	}

}
