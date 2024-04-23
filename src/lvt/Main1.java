package lvt;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;



public class Main1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
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
	public Main1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image bilde = new ImageIcon(this.getClass().getResource("/Main1.png")).getImage();
		
		JButton btnNewButton = new JButton("");
		 btnNewButton.addActionListener(new ActionListener(){
	        	

				@Override
				public void actionPerformed(ActionEvent e) {
					Main2 sf = new Main2(); 
					sf.setVisible(true);
					dispose();
				} 
	        });
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 28));
	
		btnNewButton.setBounds(245, 370, 312, 79);
		 btnNewButton.setOpaque(false); 
	        btnNewButton.setContentAreaFilled(false); 
	        btnNewButton.setBorderPainted(false);
	        btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
	        
		contentPane.add(btnNewButton);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, lblNewLabel, btnNewButton}));
		lblNewLabel.setIcon(new ImageIcon(bilde));
		lblNewLabel.setBounds(0, 0, 784, 761);
		contentPane.add(lblNewLabel);
	}
}
