package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Main8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static final String FAILS = "pagaidu_pasutijuma_dati.txt";
	private static final String CENAS_FAILS = "cenas.txt";
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
		pica picasObjekts = nolasitUnSaglabatInformaciju();
		 ierakstitObjektuFaila(picasObjekts);
		
		
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
				Main2 sf = new Main2(); 
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
	 public pica nolasitUnSaglabatInformaciju() {
	        String pasutijumaNosaukums = "";
	        String picasVeids = "";
	        ArrayList<String> izveletieToppingi = new ArrayList<>();
	        String picasDiametrs = "";
	        String vards = "";
	        String uzvards = "";
	        String telNr = "";
	        String adrese = "";
	        String pastaIndekss = "";

	        try (BufferedReader br = new BufferedReader(new FileReader("pasutijumaNosaukums.txt"))) {
	            pasutijumaNosaukums = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu pasutijumaNosaukums.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }

	        try (BufferedReader br = new BufferedReader(new FileReader("picasVeids.txt"))) {
	            picasVeids = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu picasVeids.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }

	        try (BufferedReader br = new BufferedReader(new FileReader("izveletieToppingi.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] toppings = line.split(","); 
	                for (String topping : toppings) {
	                    izveletieToppingi.add(topping.trim());
	                }
	            }
	        } catch (IOException e) {
	         
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu izveletieToppingi.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }

	        try (BufferedReader br = new BufferedReader(new FileReader("picasDiametrs.txt"))) {
	            picasDiametrs = br.readLine();
	        } catch (IOException e) {
	            
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu picasDiametrs.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }

	        try (BufferedReader br = new BufferedReader(new FileReader("vards.txt"))) {
	            vards = br.readLine();
	        } catch (IOException e) {
	           
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu vards.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }

	        try (BufferedReader br = new BufferedReader(new FileReader("uzvards.txt"))) {
	            uzvards = br.readLine();
	        } catch (IOException e) {
	          
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu uzvards.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }
	        
	        try (BufferedReader br = new BufferedReader(new FileReader("telNr.txt"))) {
	            telNr = br.readLine();
	        } catch (IOException e) {
	           
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu uzvards.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }
	        
	        try (BufferedReader br = new BufferedReader(new FileReader("adrese.txt"))) {
	            adrese = br.readLine();
	        } catch (IOException e) {
	         
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu uzvards.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }
	        
	        try (BufferedReader br = new BufferedReader(new FileReader("pastaIndekss.txt"))) {
	            pastaIndekss = br.readLine();
	        } catch (IOException e) {
	          
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu uzvards.txt", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }
	        double summa = 0.0;
	        try (BufferedReader br = new BufferedReader(new FileReader(CENAS_FAILS))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                double cena = Double.parseDouble(line.trim());
	                summa += cena;
	            }
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu " + CENAS_FAILS, "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }
	        
	     
	        
	      
	        return new pica(pasutijumaNosaukums, picasVeids, izveletieToppingi, picasDiametrs, vards, uzvards, telNr, adrese, pastaIndekss, summa);
	    }
	  
	 

	        private static void ierakstitObjektuFaila(pica pica) {
	            try (BufferedWriter wr = new BufferedWriter(new FileWriter(FAILS, true))) {
	                wr.write(pica.toString());
	                wr.newLine();
	            } catch (IOException e) {
	                JOptionPane.showMessageDialog(null, "Kļūda ierakstot objektu failā " + FAILS, "Kļūda", JOptionPane.ERROR_MESSAGE);
	            }
	        }

}
