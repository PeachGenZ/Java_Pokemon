package PokemonFarm;

public class ListPokemon {
	    
		private String names;
	    private float weight;
	    private float step;
	    
	    public ListPokemon(String names, float weight,float step){
	    	setNames(names);
	    	setWeight(weight);
	        setStep(step);
	    }
	    
	    public void setNames(String names) {
			this.names = names;
		}
	    
		
	    public void setWeight(float weight) {
			this.weight = weight;
		}

	    public void setStep(float step) {
			this.step = step;
		}
	    
		public String getNames() {
			return names;
		}
		
		public float getWeight() {
			return weight;
		}
		
		public float getStep() {
			return step;
		}
			
}
