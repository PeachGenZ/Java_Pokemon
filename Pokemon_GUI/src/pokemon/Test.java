package pokemon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JTable;
import java.awt.Choice;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPokemon = new JLabel("Pokemon");
		lblPokemon.setBounds(380, 10, 73, 22);
		lblPokemon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblPokemon);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(274, 43, 280, 188);
		contentPane.add(textArea);
		
		JTextArea txtrText = new JTextArea();
		txtrText.setBounds(202, 249, 425, 227);
		txtrText.setDropMode(DropMode.INSERT);
		contentPane.add(txtrText);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Psyduck");
		rdbtnNewRadioButton.setBounds(80, 70, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Snorlax");
		rdbtnNewRadioButton_1.setBounds(80, 96, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Meowth");
		rdbtnNewRadioButton_2.setBounds(80, 122, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(619, 71, 183, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Feed");
		btnNewButton.setBounds(668, 108, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Select Food");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(680, 40, 65, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblSelectPokemon = new JLabel("Select Pokemons");
		lblSelectPokemon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectPokemon.setBounds(66, 47, 98, 14);
		contentPane.add(lblSelectPokemon);
	}
}
