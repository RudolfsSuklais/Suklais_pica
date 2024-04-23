package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.print.attribute.AttributeSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

public class Main7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField vards;
	private JTextField uzvards;
	private JTextField telNr;
	private JTextField Adrese;
	private JTextField pastaIndekss;
	private JButton turpinat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main7 frame = new Main7();
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
	public Main7() {
		
		Image bilde = new ImageIcon(this.getClass().getResource("/Main7.png")).getImage();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		turpinat = new JButton("");
		turpinat.addActionListener(new ActionListener(){
        	

			@Override
			public void actionPerformed(ActionEvent e) {
				 String vardss = vards.getText();
		         if (!vardss.isEmpty()) {
		        	 saglabaVarduFaila(vardss);
		         }
		         String uzvardss = uzvards.getText();
		         if (!uzvardss.isEmpty()) {
		        	 saglabaUzvarduFaila(uzvardss); 
		         }
		         String telnr = telNr.getText();
		         if (!telnr.isEmpty()) {
		        	 saglabaTelNr(telnr); 
		         }
		         String adrese = Adrese.getText();
		         if (!adrese.isEmpty()) {
		        	 saglabaAdresi(adrese); 
		         }
		         String indekss = pastaIndekss.getText();
		         if (!indekss.isEmpty()) {
		        	 saglabaPastaIndeksu(indekss); 
		         }
		         
		         
				boolean irTukss = (vards.getText().isEmpty() || uzvards.getText().isEmpty() ||
									telNr.getText().isEmpty() || Adrese.getText().isEmpty() || pastaIndekss.getText().isEmpty());
				
				
				if (!irTukss) {
					
				
				Main8 sf = new Main8(); 
				sf.setVisible(true);
				dispose();
				}
			} 
        });
		turpinat.setOpaque(false); 
		turpinat.setContentAreaFilled(false); 
		turpinat.setBorderPainted(false);
		turpinat.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
		turpinat.setBounds(310, 604, 168, 54);
		contentPane.add(turpinat);
		
		
		vards = new JTextField();
		vards.setBounds(228, 290, 230, 40);
		vards.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		vards.setOpaque(false);
		vards.setBorder(new LineBorder(new Color(255, 255, 255, 100), 1, true));
		contentPane.add(vards);
        vards.setColumns(10);   
		
		  
                    
                    
                             
		
		uzvards = new JTextField();
		uzvards.setBounds(228, 341, 230, 40);
		uzvards.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		uzvards.setOpaque(false);
		uzvards.setBorder(new LineBorder(new Color(255, 255, 255, 100), 1, true));
		uzvards.setColumns(10);
		contentPane.add(uzvards);
		
		telNr = new JTextField();
		telNr.setBounds(294, 392, 230, 40);
		telNr.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		telNr.setOpaque(false);
		telNr.setBorder(new LineBorder(new Color(255, 255, 255, 100), 1, true));
		telNr.setColumns(10);
		contentPane.add(telNr);
		
		Adrese = new JTextField();
		Adrese.setBounds(230, 442, 455, 40);
		Adrese.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		Adrese.setOpaque(false);
		Adrese.setBorder(new LineBorder(new Color(255, 255, 255, 100), 1, true));
		Adrese.setColumns(10);
		contentPane.add(Adrese);
		
		pastaIndekss = new JTextField();
        pastaIndekss.setBounds(364, 493, 110, 40);
        pastaIndekss.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
        pastaIndekss.setOpaque(false);
        pastaIndekss.setBorder(new LineBorder(new Color(255, 255, 255, 100), 1, true));
        pastaIndekss.setColumns(10);
     
        pastaIndekss.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                limitInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                limitInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                limitInput();
            }

            private void limitInput() {
                SwingUtilities.invokeLater(() -> {
                    
                    String text = pastaIndekss.getText();
                    
                    if (text.length() > 4) {
                        pastaIndekss.setText(text.substring(0, 4));
                    }
                }); 
            } 
        }); 
            
      contentPane.add(pastaIndekss);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 784, 761);
		lblNewLabel.setIcon(new ImageIcon(bilde));
		contentPane.add(lblNewLabel);
	}
	private void saglabaVarduFaila(String vardss) {
	    String fails = "vards.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	        wr.println(vardss); 
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt pasūtījuma nosaukumu failā " + fails);
	        e.printStackTrace();
	    }
	}

	private void saglabaUzvarduFaila(String uzvardss) {
	    String fails = "uzvards.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	        wr.println(uzvardss); 
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt pasūtījuma nosaukumu failā " + fails);
	        e.printStackTrace();
	    }
	}
	
	private void saglabaTelNr(String telnr) {
	    String fails = "telNr.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	        wr.println(telnr); 
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt pasūtījuma nosaukumu failā " + fails);
	        e.printStackTrace();
	    }
	}
	
	private void saglabaAdresi(String adrese) {
	    String fails = "adrese.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	        wr.println(adrese); 
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt pasūtījuma nosaukumu failā " + fails);
	        e.printStackTrace();
	    }
	}
	
	private void saglabaPastaIndeksu(String pastaIndekss) {
	    String fails = "pastaIndekss.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	        wr.println(pastaIndekss); 
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt pasūtījuma nosaukumu failā " + fails);
	        e.printStackTrace();
	    }
	}
	
	
}
