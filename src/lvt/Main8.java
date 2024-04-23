package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Main8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main8 frame = new Main8();
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
	public Main8() {
		
		Image bilde = new ImageIcon(this.getClass().getResource("/Main8.png")).getImage();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
btnNewButton.addActionListener(new ActionListener(){
        	

			@Override
			public void actionPerformed(ActionEvent e) {
				Main1 sf = new Main1(); 
				sf.setVisible(true);
				dispose();
			} 
        });
btnNewButton.setOpaque(false); 
btnNewButton.setContentAreaFilled(false); 
btnNewButton.setBorderPainted(false);
btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
		btnNewButton.setBounds(168, 199, 113, 54);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setIcon(new ImageIcon(bilde));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}

}
