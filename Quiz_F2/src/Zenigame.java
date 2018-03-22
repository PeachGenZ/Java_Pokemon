public class Zenigame extends Pokemon implements  Swimmable{
	private static final int maxGroupHealth = 400;
	public Zenigame(){
		super("Zenigame",
		      (Math.random()*1000) % (maxGroupHealth+1));

		this.attackSkill = PokemonSkill.getPokemonSkill("tail whip");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse");
	}

	public void move(){
		this.swim();
	}

	public void swim() {
		this.reducedHealth(27);
	}
	
}
