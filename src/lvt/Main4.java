package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
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
		
		
		 ImageIcon background = new ImageIcon("background.jpg"); // Nomaini "background.jpg" ar savas fona attēla faila nosaukumu
	        JFrame frame = new JFrame("Main Window");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		
						JButton btnNewButton = new JButton("");
						btnNewButton.addActionListener(new ActionListener(){
				        	
							
							
							public void actionPerformed(ActionEvent e) {
								 boolean irTukss = (!checkBoxSiers.isSelected()&&!checkBoxSenes.isSelected()&&!checkBoxMaltaGala.isSelected()&&!checkBoxOlives.isSelected()
										 &&!checkBoxAnanass.isSelected()&&!checkBoxHalapeno.isSelected());
								 
								 if (irTukss) {
									 JOptionPane optionPane = new JOptionPane("Izvēlies vismaz vienu Toppingu!", JOptionPane.WARNING_MESSAGE);
									 JDialog dialog = optionPane.createDialog("Brīdinājums");
									 dialog.setLocation(400, 400); 
									 dialog.setVisible(true);


										}else {
								Main5 sf = new Main5(); 
								sf.setVisible(true);
								dispose();
							} 
							}//nezinu 
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
}
