package pokemon;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
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

public class GUI extends JFrame{
		private JLabel showNames, showOptions, icon;
		private JTextField textField;
		private JButton eatButton, statusButton;
		private JTextArea statusArea;
		private JPanel toppicZone,buttonZone, statusZone,selectZone;
		private JRadioButton selectPokemon;
		private String pokemonNames[];
		private Icon start;

		
		public GUI()
		{
			super("PokemonGUI");
	        Container c = getContentPane();
	        c.setLayout(new BorderLayout());
	        pokemonNames = new String[] {"Psyduck", "Meowth", "Snorlax"};
	        
	        //Set panel
	        toppicZone = new JPanel();
	        toppicZone.setLayout(new FlowLayout());
	        buttonZone = new JPanel();
	        buttonZone.setLayout(new FlowLayout());
	        selectZone = new JPanel();
	        selectZone.setLayout(new FlowLayout());
	        statusZone = new JPanel();
	        statusZone.setLayout(null);
	        
	        //Create components
	        showNames = new JLabel("PokemonNameTest");
	        showOptions = new JLabel("Pokemon Control");
	        eatButton = new JButton("Feed");
	        statusButton = new JButton("Show_status");
	        textField = new JTextField("",10);
	        statusArea = new JTextArea("",10,2);
	        statusArea.setBounds(50, 20, 80, 80);
	        eatButton = new JButton("Feed");
	        statusButton =  new JButton("Status");
	        
	        //Create Icon
	        start = new ImageIcon(getClass().getResource("Start.png"));
	        icon = new JLabel("");
	        icon.setIcon(start);
	        icon.setBounds(150, 10, 500, 500);
	        
	        //set layout
	        toppicZone.add(showNames);
	        buttonZone.add(showOptions);
	        statusZone.add(icon);
	        statusZone.add(statusArea);
	        c.add(toppicZone, BorderLayout.PAGE_START);
	        c.add(buttonZone, BorderLayout.PAGE_END);
	        c.add(statusZone, BorderLayout.CENTER);
	        c.add(selectZone, BorderLayout.LINE_END);

	        //set others
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        pack();
	        setVisible(true);
		}
		
}

    