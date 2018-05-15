package pokemon;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class GUI extends JFrame{
		private JLabel Pokemon, selectFood, selectPokemon, pokemonIcon, pokeballIcon1, pokeballIcon2, pokeballIcon3, pokeballIcon4, pokeballIcon5;
		private JButton eatButton, exerciseButton, sleepButton;
		private JTextArea statusArea;
		private JPanel panel;
		private JRadioButton psyduck,snorlax,meowth;
		private JComboBox foodBox;
		private Icon start, psyduckIcon, snorlaxIcon, meowthIcon, pokeballIcon, psyduckLazy, snorlaxLazy, meowthLazy, persianIcon, goldduckIcon, bigPokeball ;
		private String berryNames[];
		private Command command;
		
	    int  psyduckMember, snorlaxMember, meowthMember, persianMember, goldduckMember;
	    int  countPsyduckEvo;
		
		public GUI()
		{
			super("PokemonGUI");
	        Container c = getContentPane();
	        c.setBounds(100, 100, 850, 550);
	        berryNames = new String[] {
	                "Berry",     
	                "GoldBerry", 
	                "MysteryBerry",   
	        };
	        command = new Command();
	        command.pokemons.add(new Psyduck());
	        command.pokemons.add(new Snorlax());
	        command.pokemons.add(new Meowth());
	        command.pokemons.add(new Persian());
	        command.pokemons.add(new Goldduck());
	        //Set panel;
	        panel = new JPanel();
	        panel.setLayout(null);
	        
	        
	        //Create components and set position
	        Pokemon = new JLabel("Pokemon");
	        Pokemon.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        Pokemon.setBounds(380, 10, 73, 22);
	        selectFood = new JLabel("Select Food");
	        selectFood.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        selectFood.setBounds(680, 40, 65, 29);
	        selectPokemon = new JLabel("Select Pokemons");
	        selectPokemon.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        selectPokemon.setBounds(66, 47, 98, 14);
	        
	        
	        statusArea = new JTextArea("",425,227);
	        statusArea.setBounds(202, 249, 425, 227);
	        
	        eatButton = new JButton("Feed");
	        eatButton.setBounds(668, 108, 89, 23);
	        exerciseButton =  new JButton("Exercise");
	        exerciseButton.setBounds(620, 146, 89, 23);
	        sleepButton = new JButton("Sleep");
	        sleepButton.setBounds(719, 146, 89, 23);
	        
	        foodBox = new JComboBox<Object>(berryNames);
	        foodBox.setBounds(619, 71, 183, 20);
	        
	        psyduck = new JRadioButton("Psyduck");
	        psyduck.setBounds(80, 70, 109, 23);
	        snorlax = new JRadioButton("Snorlax");
	        snorlax.setBounds(80, 96, 109, 23);
	        meowth = new JRadioButton("Meowth");
	        meowth.setBounds(80, 122, 109, 23);
	        
	        ButtonGroup group = new ButtonGroup();
	        group.add(psyduck);
	        group.add(snorlax);
	        group.add(meowth);
	        
	        
	        
	        //Create Icon
	        start = new ImageIcon(getClass().getResource("StartGame.png"));
	        psyduckIcon = new ImageIcon(getClass().getResource("Psyduck.png"));
	        psyduckLazy = new ImageIcon(getClass().getResource("Psyduck_Lazy.gif"));
	        snorlaxIcon = new ImageIcon(getClass().getResource("Snorlax.png"));
	        snorlaxLazy = new ImageIcon(getClass().getResource("Snorlax_Lazy.gif"));
	        meowthIcon = new ImageIcon(getClass().getResource("Meowth.png"));
	        meowthLazy = new ImageIcon(getClass().getResource("Meowth_Lazy.gif"));
	        persianIcon = new ImageIcon(getClass().getResource("MeowthEvo.png"));
	        goldduckIcon = new ImageIcon(getClass().getResource("Goldduck.png"));
	        pokeballIcon = new ImageIcon(getClass().getResource("Pokeball.gif"));
	        bigPokeball = new ImageIcon(getClass().getResource("BigPokeball.png"));
	        pokemonIcon = new JLabel("");
	        pokeballIcon1 = new JLabel("");
	        pokeballIcon2 = new JLabel("");
	        pokeballIcon3 = new JLabel("");
	        pokeballIcon4 = new JLabel("");
	        pokeballIcon5 = new JLabel("");
	        pokemonIcon.setIcon(start);
	        pokemonIcon.setBounds(274, 43, 280, 188);
	        pokeballIcon1.setIcon(pokeballIcon);
	        pokeballIcon1.setBounds(53, 69, 26, 22);
	        pokeballIcon2.setIcon(pokeballIcon);
	        pokeballIcon2.setBounds(53, 95, 26, 22);
	        pokeballIcon3.setIcon(pokeballIcon);
	        pokeballIcon3.setBounds(53, 121, 26, 22);
	        pokeballIcon4.setIcon(bigPokeball);
	        pokeballIcon4.setBounds(20, 297, 144, 131);
	        pokeballIcon5.setIcon(bigPokeball);
	        pokeballIcon5.setBounds(658, 297, 144, 131);
	        
	        //Eatbutton action listener
	        eatButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(psyduck.isSelected() && (command.getEnergy(psyduckMember) > 5) && (command.getFeeling(psyduckMember) > 30)){
	                	if((command.getFeeling(psyduckMember) >= 500)) {
	                    	psyduckMember = goldduckMember;
	                    	pokemonIcon.setIcon(goldduckIcon);
	                    }
	                	else {
	                		pokemonIcon.setIcon(psyduckIcon);
	                	}
	                	command.pokemons.get(psyduckMember);
	                    switch (foodBox.getSelectedIndex()) {
	                    	case 0 :
	                    		
	                    		command.eatBerry(psyduckMember);
	                    		command.badFeeling(psyduckMember);
	                    		break;
	                    	case 1 :
		                    	command.eatGoldBerry(psyduckMember);
		                    	command.badFeeling(psyduckMember);
		                    	break;
	                    	case 2 :
		                    	command.eatMysteryBerry(psyduckMember);
		                    	command.badFeeling(psyduckMember);
		                    	break;
	                    }
	                    statusArea.setText(command.showStatus(command.pokemons,psyduckMember));
	                }
	                
	                else if(snorlax.isSelected() && (command.getEnergy(snorlaxMember) > 5)){
	                	command.pokemons.get(snorlaxMember);
	                	pokemonIcon.setIcon(snorlaxIcon);
	                	switch (foodBox.getSelectedIndex()) {
                    		case 0 :
                    			command.eatBerry(snorlaxMember);
                    			command.goodFeeling(snorlaxMember);
                    			break;
                    		case 1 :
	                    		command.eatGoldBerry(snorlaxMember);
	                    		command.goodFeeling(snorlaxMember);
	                    		break;
                    		case 2 :
                    			command.eatMysteryBerry(snorlaxMember);
                    			command.goodFeeling(snorlaxMember);
                    			break;
	                	}
	                	statusArea.setText(command.showStatus(command.pokemons,snorlaxMember));
	                }
	                
	                else if(meowth.isSelected() && (command.getEnergy(meowthMember) > 5) && (command.getFeeling(meowthMember) > 30)){
	                	if((command.getFeeling(meowthMember) >= 500)) {
	                		meowthMember = persianMember;
	                    	pokemonIcon.setIcon(persianIcon);
	                    }
	                	else {
	                		pokemonIcon.setIcon(meowthIcon);
	                	}
	                	command.pokemons.get(meowthMember);
	                	switch (foodBox.getSelectedIndex()) {
                			case 0 :
                				command.eatBerry(meowthMember);
                				command.badFeeling(meowthMember);
                				break;
                			case 1 :
                				command.eatGoldBerry(meowthMember);
                				command.badFeeling(meowthMember);
                				break;
                			case 2 :
                				command.eatMysteryBerry(meowthMember);
                				command.badFeeling(meowthMember);
                				break;
	                	}
	                	statusArea.setText(command.showStatus(command.pokemons,meowthMember));
	                }
	                
	                else if( (command.getEnergy(psyduckMember) <= 5) || (command.getFeeling(psyduckMember) <= 30))
	    	        	pokemonIcon.setIcon(psyduckLazy);
	                
	                else if( (command.getEnergy(snorlaxMember) <= 5) || (command.getFeeling(snorlaxMember) <= 30))
	    	        	pokemonIcon.setIcon(snorlaxLazy);
	                
	                else if( (command.getEnergy(meowthMember) <= 5) || (command.getFeeling(meowthMember) <= 30))
	    	        	pokemonIcon.setIcon(meowthLazy);
	            }
	        });
	        
	        //Exercise action listener
	        exerciseButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(psyduck.isSelected() && (command.getEnergy(psyduckMember) > 5) && (command.getFeeling(psyduckMember) > 30)){
	                	if((command.getFeeling(psyduckMember) >= 500)) {
	                    	psyduckMember = goldduckMember;
	                    	pokemonIcon.setIcon(goldduckIcon);
	                    }
	                	else {
	                		pokemonIcon.setIcon(psyduckIcon);
	                	}
	                	command.pokemons.get(psyduckMember);
	                    command.exercise(psyduckMember);
	                    command.badFeeling(psyduckMember);
	                    statusArea.setText(command.showStatus(command.pokemons,psyduckMember));
	                }
	                
	                else if(snorlax.isSelected() && (command.getEnergy(snorlaxMember) > 5) && (command.getFeeling(snorlaxMember) > 30)){
	                	command.pokemons.get(snorlaxMember);
	                	pokemonIcon.setIcon(snorlaxIcon);
	                	command.exercise(snorlaxMember);
	                	command.badFeeling(snorlaxMember);
	                	statusArea.setText(command.showStatus(command.pokemons,snorlaxMember));	
	                }
	                
	                else if(meowth.isSelected()  && (command.getEnergy(meowthMember) > 5)){
	                	if((command.getFeeling(meowthMember) >= 500)) {
	                		meowthMember = persianMember;
	                    	pokemonIcon.setIcon(persianIcon);
	                    }
	                	else {
	                		pokemonIcon.setIcon(meowthIcon);
	                	}
	                	command.pokemons.get(meowthMember);
	                	command.exercise(meowthMember);
	                	command.goodFeeling(meowthMember);
	                	statusArea.setText(command.showStatus(command.pokemons,meowthMember));
	                }
	                
	                else if( (command.getEnergy(psyduckMember) <= 5) || (command.getFeeling(psyduckMember) <= 30))
	    	        	pokemonIcon.setIcon(psyduckLazy);
	                
	                else if( (command.getEnergy(snorlaxMember) <= 5) || (command.getFeeling(snorlaxMember) <= 30))
	    	        	pokemonIcon.setIcon(snorlaxLazy);
	                
	                else if( (command.getEnergy(meowthMember) <= 5) || (command.getFeeling(meowthMember) <= 30))
	    	        	pokemonIcon.setIcon(meowthLazy);
	            }
	        });
	        
		      //Sleep action listener
	        sleepButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(psyduck.isSelected()){
	                	if((command.getFeeling(psyduckMember) >= 500)) {
	                    	psyduckMember = goldduckMember;
	                    	pokemonIcon.setIcon(goldduckIcon);
	                    }
	                	else {
	                		pokemonIcon.setIcon(psyduckIcon);
	                	}
	                	command.pokemons.get(psyduckMember);
	                    command.sleep(psyduckMember);
	                    command.goodFeeling(psyduckMember);
	                    statusArea.setText(command.showStatus(command.pokemons,psyduckMember));
	                }
	                
	                else if(snorlax.isSelected()){
	                	command.pokemons.get(snorlaxMember);
	                	pokemonIcon.setIcon(snorlaxIcon);
	                	command.sleep(snorlaxMember);
	                	command.goodFeeling(snorlaxMember);
	                	statusArea.setText(command.showStatus(command.pokemons,snorlaxMember));	
	                }
	                
	                else if(meowth.isSelected() && (command.getFeeling(meowthMember) > 30)){
	                	if((command.getFeeling(meowthMember) >= 500)) {
	                		meowthMember = persianMember;
	                    	pokemonIcon.setIcon(persianIcon);
	                    }
	                	else {
	                		pokemonIcon.setIcon(meowthIcon);
	                	}
	                	command.pokemons.get(meowthMember);
	                	command.sleep(meowthMember);
	                	command.badFeeling(meowthMember);
	                	statusArea.setText(command.showStatus(command.pokemons,meowthMember));
	                }
	                else if( (command.getEnergy(psyduckMember) <= 5) || (command.getFeeling(psyduckMember) <= 30))
	    	        	pokemonIcon.setIcon(psyduckLazy);
	                
	                else if( (command.getEnergy(snorlaxMember) <= 5) || (command.getFeeling(snorlaxMember) <= 30))
	    	        	pokemonIcon.setIcon(snorlaxLazy);
	                
	                else if( (command.getEnergy(meowthMember) <= 5) || (command.getFeeling(meowthMember) <= 30))
	    	        	pokemonIcon.setIcon(meowthLazy);
	            }
	        });
	        
	        //JRidoButton action listener
	        psyduck.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		if((command.getFeeling(psyduckMember) >= 500)) {
                    	psyduckMember = goldduckMember;
                    	pokemonIcon.setIcon(goldduckIcon);
                    }
                	else {
                		pokemonIcon.setIcon(psyduckIcon);
                	}
	    	        psyduckMember = 0;
	    	        statusArea.setText(command.showStatus(command.pokemons,psyduckMember));
	    	        if( (command.getEnergy(psyduckMember) <= 5) || (command.getFeeling(psyduckMember) <= 30))
	    	        	pokemonIcon.setIcon(psyduckLazy);
	        	}
	        });
	        
	        snorlax.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		pokemonIcon.setIcon(snorlaxIcon);
	    	        snorlaxMember = 1;
	    	        statusArea.setText(command.showStatus(command.pokemons,snorlaxMember));
	    	        if( (command.getEnergy(snorlaxMember) <= 5) || (command.getFeeling(snorlaxMember) <= 30))
	    	        	pokemonIcon.setIcon(snorlaxLazy);
	        	}
	        });
	        
	        meowth.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		if((command.getFeeling(meowthMember) >= 500)) {
                		meowthMember = persianMember;
                    	pokemonIcon.setIcon(persianIcon);
                    }
                	else {
                		pokemonIcon.setIcon(meowthIcon);
                	}
	    	        meowthMember = 2;
	    	        statusArea.setText(command.showStatus(command.pokemons,meowthMember));
	    	        if( (command.getEnergy(meowthMember) <= 5) || (command.getFeeling(meowthMember) <= 30))
	    	        	pokemonIcon.setIcon(meowthLazy);
	        	}
	        });
	        persianMember = 3;
	        goldduckMember = 4;
	
	        
	        //Set layout
	        panel.add(Pokemon);
	        panel.add(selectFood);
	        panel.add(selectPokemon);
	        panel.add(pokemonIcon);
	        panel.add(statusArea);
	        panel.add(foodBox);
	        panel.add(eatButton);
	        panel.add(psyduck);
	        panel.add(snorlax);
	        panel.add(meowth);
	        panel.add(pokeballIcon1);
	        panel.add(pokeballIcon2);
	        panel.add(pokeballIcon3);
	        panel.add(pokeballIcon4);
	        panel.add(pokeballIcon5);
	        panel.add(exerciseButton);
	        panel.add(sleepButton);
	        
	        c.add(panel);
	        
	        //Set others
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(850, 550);
	        setVisible(true);
		}
		
}

    