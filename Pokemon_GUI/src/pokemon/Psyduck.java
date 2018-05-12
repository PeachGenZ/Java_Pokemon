package pokemon;

public class Psyduck extends Pokemon implements Runnable {
    private static final int maxGroupHealth = 200;
	public  Psyduck(){
		super("Psyduck",
		      80,45.00);

		this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
	}

	public void move(){
		this.run();
	}

	public void run(){
		this.reducedWeight(1.5);
	}

	public void walk(){
		this.reducedWeight(0.5);
	}
}
