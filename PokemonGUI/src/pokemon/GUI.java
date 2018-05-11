package pokemon;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

public class GUI {
	ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	JPanel p1,showData;
	JLabel text,pokemonIcon;
	JTextField textFleid;
	JTextArea showstatus;
	JComboBox selectPokemon;
	JButton eatBotton,statusButton;
	JRadioButton selectEat;
	Icon dataIcon0,dataIcon1,dataIcon2,dataIconStart;
	
	txtSelect  = new JLabel("เลือก โปเกม่อนเริ่มต้น : ");
    selectButton = new JButton("Select");
    eatButton  = new JButton("Eat");
	
    showstatus  = new JTextArea("",20,20);
    dataIconStart = new ImageIcon(getClass().getResource("Psyduck.png"));
    pokemonIcon   = new JLabel("");
    
    
    
}
