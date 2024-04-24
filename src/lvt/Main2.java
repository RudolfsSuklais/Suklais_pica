package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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

public class Main2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 frame = new Main2();
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
	public Main2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image bilde = new ImageIcon(this.getClass().getResource("/Main2.png")).getImage();
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener(){
        	

			@Override
			public void actionPerformed(ActionEvent e) {
				Main3 sf = new Main3(); 
				sf.setVisible(true);
				dispose();
			} 
        });
	
		
	JButton apskatitSutijumu = new JButton("");
	apskatitSutijumu.addActionListener(new ActionListener(){
    	

		@Override
		public void actionPerformed(ActionEvent e) {
			Apskatit sf = new Apskatit(); 
			sf.setVisible(true);
			dispose();
		} 
    });
	apskatitSutijumu.setOpaque(false);
	apskatitSutijumu.setForeground(Color.WHITE);
	apskatitSutijumu.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 28));
	apskatitSutijumu.setContentAreaFilled(false);
	apskatitSutijumu.setBorderPainted(false);
	apskatitSutijumu.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
	apskatitSutijumu.setBounds(241, 371, 321, 77);
	contentPane.add(apskatitSutijumu);
	btnNewButton.setForeground(new Color(255, 255, 255));
	btnNewButton.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 22));

	btnNewButton.setBounds(241, 272, 321, 77);
	 btnNewButton.setOpaque(false); 
        btnNewButton.setContentAreaFilled(false); 
        btnNewButton.setBorderPainted(false);
        btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
        
		contentPane.add(btnNewButton);
		lblNewLabel.setIcon(new ImageIcon(bilde));
		lblNewLabel.setBounds(0, 0, 784, 761);
		contentPane.add(lblNewLabel);
	}

}
