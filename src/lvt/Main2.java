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
		
		JButton btnNewButton = new JButton("Pievienot sutijumu");
		btnNewButton.addActionListener(new ActionListener(){
        	

			@Override
			public void actionPerformed(ActionEvent e) {
				Main3 sf = new Main3(); 
				sf.setVisible(true);
				dispose();
			} 
        });
	
		
	JButton btnNewButton_1 = new JButton("Pievienot sutijumu");
	btnNewButton_1.setOpaque(false);
	btnNewButton_1.setForeground(Color.WHITE);
	btnNewButton_1.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 28));
	btnNewButton_1.setContentAreaFilled(false);
	btnNewButton_1.setBorderPainted(false);
	btnNewButton_1.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
	btnNewButton_1.setBounds(251, 389, 312, 100);
	contentPane.add(btnNewButton_1);
	btnNewButton.setForeground(new Color(255, 255, 255));
	btnNewButton.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 22));

	btnNewButton.setBounds(241, 272, 312, 100);
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
