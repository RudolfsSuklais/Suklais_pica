package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Main9 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main9 frame = new Main9();
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
	public Main9() {
		Image bilde = new ImageIcon(this.getClass().getResource("/Main9.png")).getImage();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(bilde));
		lblNewLabel.setBounds(0, 0, 784, 761);
		contentPane.add(lblNewLabel);
		
		JButton ja = new JButton("");
		ja.addActionListener(new ActionListener(){
	    	

			@Override
			public void actionPerformed(ActionEvent e) {
				 saglabaCenuFaila(2.5);
				Main7 sf = new Main7(); 
				sf.setVisible(true);
				dispose();
			} 
	    });
		ja.setBounds(186, 420, 192, 77);
		ja.setOpaque(false); 
		ja.setContentAreaFilled(false); 
		ja.setBorderPainted(false);
		ja.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
		contentPane.add(ja);
		
		JButton ne = new JButton("");
		ne.addActionListener(new ActionListener(){
	    	

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 try (BufferedWriter writer = new BufferedWriter(new FileWriter("adrese.txt"))) {
	                    writer.write(""); 
	                   
	                } catch (IOException ex) {
	                  
	                }
				 try (BufferedWriter writer = new BufferedWriter(new FileWriter("vards.txt"))) {
	                    writer.write(""); 
	                   
	                } catch (IOException ex) {
	                  
	                }
				 try (BufferedWriter writer = new BufferedWriter(new FileWriter("telNr.txt"))) {
	                    writer.write(""); 
	                   
	                } catch (IOException ex) {
	                  
	                }
				 try (BufferedWriter writer = new BufferedWriter(new FileWriter("pastaIndekss.txt"))) {
	                    writer.write(""); 
	                   
	                } catch (IOException ex) {
	                  
	                }
				 try (BufferedWriter writer = new BufferedWriter(new FileWriter("uzvards.txt"))) {
	                    writer.write(""); 
	                   
	                } catch (IOException ex) {
	                  
	                }
				Main8 sf = new Main8(); 
				sf.setVisible(true);
				dispose();
			} 
	    });
		ne.setBounds(395, 420, 192, 77);
		ne.setOpaque(false); 
		ne.setContentAreaFilled(false); 
		ne.setBorderPainted(false);
		ne.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
		contentPane.add(ne);
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
