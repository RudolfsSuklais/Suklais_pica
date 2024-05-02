package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Main4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main4 frame = new Main4();
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
	
	
	
	public Main4() {
	
		List<String> izveletieToppingi = new ArrayList<>();
		
		
		Image bilde = new ImageIcon(this.getClass().getResource("/Main4.png")).getImage();
		Image bilde1 = new ImageIcon(this.getClass().getResource("/Main4.1.png")).getImage();
		Image bilde2 = new ImageIcon(this.getClass().getResource("/Main4.2.png")).getImage();
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 784, 761);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 761);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox checkBoxSiers = new JCheckBox("");
		checkBoxSiers.setIcon(new ImageIcon(this.getClass().getResource("/unchecked.png")));
		checkBoxSiers.setSelectedIcon(new ImageIcon(this.getClass().getResource("/checked.png")));
		checkBoxSiers.setOpaque(false);
		checkBoxSiers.setContentAreaFilled(false);
		checkBoxSiers.setBounds(185, 218, 47, 44);
		panel.add(checkBoxSiers);

		JCheckBox checkBoxSenes = new JCheckBox("");
		checkBoxSenes.setIcon(new ImageIcon(this.getClass().getResource("/unchecked.png")));
		checkBoxSenes.setSelectedIcon(new ImageIcon(this.getClass().getResource("/checked.png")));
		checkBoxSenes.setOpaque(false);
		checkBoxSenes.setContentAreaFilled(false);
		checkBoxSenes.setBounds(185, 293, 47, 44);
		panel.add(checkBoxSenes);

		JCheckBox checkBoxMaltaGala = new JCheckBox("");
		checkBoxMaltaGala.setIcon(new ImageIcon(this.getClass().getResource("/unchecked.png")));
		checkBoxMaltaGala.setSelectedIcon(new ImageIcon(this.getClass().getResource("/checked.png")));
		checkBoxMaltaGala.setOpaque(false);
		checkBoxMaltaGala.setContentAreaFilled(false);
		checkBoxMaltaGala.setBounds(185, 367, 47, 44);
		panel.add(checkBoxMaltaGala);

		JCheckBox checkBoxOlives = new JCheckBox("");
		checkBoxOlives.setIcon(new ImageIcon(this.getClass().getResource("/unchecked.png")));
		checkBoxOlives.setSelectedIcon(new ImageIcon(this.getClass().getResource("/checked.png")));
		checkBoxOlives.setOpaque(false);
		checkBoxOlives.setContentAreaFilled(false);
		checkBoxOlives.setBounds(185, 445, 47, 44);
		panel.add(checkBoxOlives);
		
		JCheckBox checkBoxAnanass = new JCheckBox("");
		checkBoxAnanass.setIcon(new ImageIcon(this.getClass().getResource("/unchecked.png")));
		checkBoxAnanass.setSelectedIcon(new ImageIcon(this.getClass().getResource("/checked.png")));
		checkBoxAnanass.setOpaque(false);
		checkBoxAnanass.setContentAreaFilled(false);
		checkBoxAnanass.setBounds(185, 517, 47, 44);
		panel.add(checkBoxAnanass);
		
		JCheckBox checkBoxHalapeno = new JCheckBox("");
		checkBoxHalapeno.setIcon(new ImageIcon(this.getClass().getResource("/unchecked.png")));
		checkBoxHalapeno.setSelectedIcon(new ImageIcon(this.getClass().getResource("/checked.png")));
		checkBoxHalapeno.setOpaque(false);
		checkBoxHalapeno.setContentAreaFilled(false);
		checkBoxHalapeno.setBounds(185, 592, 47, 44);
		panel.add(checkBoxHalapeno);
		
		
		
	     			
		
						JButton btnNewButton = new JButton("");
						btnNewButton.addActionListener(new ActionListener(){
				        	
							
							
							public void actionPerformed(ActionEvent e) {
								if (checkBoxSiers.isSelected()) {
									izveletieToppingi.add("Siers");
									 saglabaCenuFaila(0.3);
								}
								if (checkBoxSenes.isSelected()) {
									izveletieToppingi.add("Sēnes");
									 saglabaCenuFaila(0.25);
								}
								if (checkBoxMaltaGala.isSelected()) {
									izveletieToppingi.add("Maltā gaļa");
									 saglabaCenuFaila(0.55);
								}
								if (checkBoxOlives.isSelected()) {
									izveletieToppingi.add("Olīves");
									 saglabaCenuFaila(0.15);
								}
								if (checkBoxAnanass.isSelected()) {
									izveletieToppingi.add("Ananass");
									 saglabaCenuFaila(0.1);
								}
								if (checkBoxHalapeno.isSelected()) {
									izveletieToppingi.add("Halapeno");
									 saglabaCenuFaila(0.2);
								}
								saglabaToppingsFaila(izveletieToppingi);
								
								 boolean irTukss = (!checkBoxSiers.isSelected()&&!checkBoxSenes.isSelected()&&!checkBoxMaltaGala.isSelected()&&!checkBoxOlives.isSelected()
										 &&!checkBoxAnanass.isSelected()&&!checkBoxHalapeno.isSelected());
								 
								 if (irTukss) {
									 Main6 sf = new Main6(); 
										sf.setVisible(true);


										}else {
								Main5 sf = new Main5(); 
								
								sf.setVisible(true);
								dispose();
							} 
							}
				        });
						
						btnNewButton.setBounds(312, 642, 165, 62);
						btnNewButton.setOpaque(false); 
						btnNewButton.setContentAreaFilled(false); 
						btnNewButton.setBorderPainted(false);
						btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
						panel.add(btnNewButton);
				
						
						JLabel sakums = new JLabel("");
						sakums.setIcon(new ImageIcon(bilde));
						sakums.setBounds(1, 0, 783, 763);
						panel.add(sakums);
					
						
	}
	private void saglabaToppingsFaila(List<String> toppings) {
	    
	    String fails = "izveletieToppingi.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	       
	        for (String toppingi : toppings) {
	            wr.println(toppingi);
	        }
	        
	       
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt informāciju failā " + fails);
	        e.printStackTrace();
	    }
	}
	
	
	private void saglabaCenuFaila(double cena) {
	    String fails = "cenas.txt";
	    
	    try (PrintWriter wr = new PrintWriter(new FileWriter(fails, true))) {
	        wr.println(cena);
	    } catch (IOException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt cenu failā " + fails);
	        
	    }
	}
	
	
	
}
