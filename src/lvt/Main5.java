package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Main5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main5 frame = new Main5();
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
	public Main5() {
		
		ButtonGroup buttonGroup = new ButtonGroup(); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image bilde = new ImageIcon(this.getClass().getResource("/Main5.png")).getImage();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setIcon(new ImageIcon(this.getClass().getResource("/radioButtonUnchecked_1.png")));
		rdbtnNewRadioButton.setSelectedIcon(new ImageIcon(this.getClass().getResource("/radioButtonChecked_1.png")));
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBounds(88, 370, 152, 97);
		contentPane.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setIcon(new ImageIcon(this.getClass().getResource("/radioButtonUnchecked_1.png")));
		rdbtnNewRadioButton_1.setSelectedIcon(new ImageIcon(this.getClass().getResource("/radioButtonChecked_1.png")));
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setBounds(464, 370, 152, 97);
		contentPane.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setIcon(new ImageIcon(this.getClass().getResource("/radioButtonUnchecked_1.png")));
		rdbtnNewRadioButton_2.setSelectedIcon(new ImageIcon(this.getClass().getResource("/radioButtonChecked_1.png")));
		rdbtnNewRadioButton_2.setOpaque(false);
		rdbtnNewRadioButton_2.setBounds(321, 541, 152, 97);
		contentPane.add(rdbtnNewRadioButton_2);
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(bilde));
		lblNewLabel.setBounds(0, 0, 784, 761);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener(){
        	

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 boolean irTukss = (!rdbtnNewRadioButton.isSelected() && 
			                !rdbtnNewRadioButton_1.isSelected() && 
			                !rdbtnNewRadioButton_2.isSelected());
				 
			    if(!irTukss) {
			    	Main7 sf = new Main7();
			    	sf.setVisible(true);
			    	dispose();
			    }
			} 
        });
	
		btnNewButton.setBounds(321, 645, 173, 54);
		btnNewButton.setOpaque(false); 
	    btnNewButton.setContentAreaFilled(false); 
	    btnNewButton.setBorderPainted(false);
	    btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
		contentPane.add(btnNewButton);
	}
}
