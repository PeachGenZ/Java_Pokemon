package pokemon;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame{
		private JLabel Pokemon, selectFood, selectPokemon, icon;
		private JTextField textField;
		private JButton eatButton, statusButton;
		private JTextArea statusArea;
		private JPanel panel;
		private JRadioButton psyduck,snorlax,meowth;
		private JComboBox foodBox;
		private String pokemonNames[];
		private Icon start, psyduckIcon, snorlaxIcon, meowthIcon ;

		
		public GUI()
		{
			super("PokemonGUI");
	        Container c = getContentPane();
	        c.setBounds(100, 100, 850, 550);
	        pokemonNames = new String[] {"Psyduck", "Meowth", "Snorlax"};
	        
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
	        
	        textField = new JTextField("",10);
	        
	        statusArea = new JTextArea("",425,227);
	        statusArea.setBounds(202, 249, 425, 227);
	        
	        eatButton = new JButton("Feed");
	        eatButton.setBounds(668, 108, 89, 23);
	        statusButton =  new JButton("Status");
	        statusButton = new JButton("Show_status");
	        
	        foodBox = new JComboBox();
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
	        snorlaxIcon = new ImageIcon(getClass().getResource("Snorlax.png"));
	        meowthIcon = new ImageIcon(getClass().getResource("Meowth.png"));
	        icon = new JLabel("");
	        icon.setIcon(start);
	        icon.setBounds(274, 43, 280, 188);
	        
	        //Add action listener
	        psyduck.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	    	        icon.setIcon(psyduckIcon);
	        	}
	        });
	        
	        snorlax.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	    	        icon.setIcon(snorlaxIcon);
	        	}
	        });
	        
	        meowth.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	    	        icon.setIcon(meowthIcon);
	        	}
	        });
	        
	        //Set layout
	        panel.add(Pokemon);
	        panel.add(selectFood);
	        panel.add(selectPokemon);
	        panel.add(icon);
	        panel.add(statusArea);
	        panel.add(foodBox);
	        panel.add(eatButton);
	        panel.add(psyduck);
	        panel.add(snorlax);
	        panel.add(meowth);
	        
	        c.add(panel);
	        
	        //Set others
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(850, 550);
	        setVisible(true);
		}
		
}

    