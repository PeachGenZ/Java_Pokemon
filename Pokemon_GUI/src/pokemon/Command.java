package pokemon;

import java.util.ArrayList;
import pokemon.Pokemon;
import pokemongui.Berry;

public class Command {
	public static String printPokemons(ArrayList<Pokemon> pokemons,int member){
        String hp = "======== Pokemon List ======== \n"+"Pokemon "+
                pokemons.get(member).getName()+" health: "+pokemons.get(member).getHealth()
                +"/"+pokemons.get(member).maxHealth;
        String weight = "\n======== Pokemon Weight ======== \n"+" Weight: "+
                pokemons.get(member).getWeight();
        return hp+weight;
    }
	
}
