package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;

public class Main3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnNewRadioButton_5;
	private JRadioButton rdbtnNewRadioButton;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	private JButton pogaJa;
	private JButton pogaNe;
	private int toppings = 3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main3 frame = new Main3();
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

	public Main3() {
		
	
		 
		int kluda = 0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image bilde = new ImageIcon(this.getClass().getResource("/Main3.png")).getImage();
		
		ButtonGroup buttonGroup = new ButtonGroup(); 
		
		 JSpinner spinner = new JSpinner();
	        spinner.setFont(new Font("MV Boli", Font.PLAIN, 14));
	        spinner.setBackground(new Color(128, 128, 0));
	        spinner.setBounds(122, 595, 40, 20);
	        saglabaDaudzumu((int)spinner.getValue());
	        contentPane.add(spinner);
		
		lblNewLabel_6 = new JLabel("Daudzums:");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_6.setBounds(73, 558, 201, 36);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_5 = new JLabel("Nē");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_5.setBounds(226, 514, 46, 36);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("Jā");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_4.setBounds(106, 514, 46, 36);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("Papildus Toppings ir?");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_3.setBounds(74, 467, 201, 36);
		contentPane.add(lblNewLabel_3);
		
	
		
		
		rdbtnNewRadioButton = new JRadioButton("Lauku (4.50€)");
		rdbtnNewRadioButton.setIcon(new ImageIcon(this.getClass().getResource("/radioButtonUnchecked.png")));
		rdbtnNewRadioButton.setSelectedIcon(new ImageIcon(this.getClass().getResource("/radioButtonChecked.png")));
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setFont(new Font("Trebuchet MS", Font.ITALIC, 16));
		rdbtnNewRadioButton.setBounds(182, 320, 145, 23);
		contentPane.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		  btnNewButton_1 = new JButton("");
		  btnNewButton_1.addActionListener(new ActionListener() {
			  
			    public void actionPerformed(ActionEvent e) {
			    	saglabaDaudzumu((int)spinner.getValue());
			    	 String nosaukums = textField.getText();
			         if (!nosaukums.isEmpty()) {
			        	 saglabaNosaukumuFaila(nosaukums);
			         }
			    	
			         if(rdbtnNewRadioButton.isSelected()) {
			        	 saglabaPicuFaila("Lauku (4.50 €)");
			        	  saglabaCenuFaila(4.5);
			         }
			         if(rdbtnNewRadioButton_1.isSelected()) {
			        	 saglabaPicuFaila("Pikantā (4.00 €)");
			        	 saglabaCenuFaila(4);
			         }
			         if(rdbtnNewRadioButton_2.isSelected()) {
			        	 saglabaPicuFaila("Šķiņķa (5.20 €)");
			        	 saglabaCenuFaila(5.2);
			         }
			         if(rdbtnNewRadioButton_3.isSelected()) {
			        	 saglabaPicuFaila("Margarita (3.80 €)");
			        	 saglabaCenuFaila(3.8);
			         }
			         if(rdbtnNewRadioButton_4.isSelected()) {
			        	 saglabaPicuFaila("Salami (5.00 €)");
			        	 saglabaCenuFaila(5);
			         }
			         
			        boolean irTukss = textField.getText().isEmpty() || 
			                (!rdbtnNewRadioButton.isSelected() && 
			                !rdbtnNewRadioButton_1.isSelected() && 
			                !rdbtnNewRadioButton_2.isSelected() && 
			                !rdbtnNewRadioButton_3.isSelected() && 
			                !rdbtnNewRadioButton_4.isSelected()) ||
			                (pogaJa.isSelected() && pogaNe.isSelected() || (int)spinner.getValue()<=0);
			        
			        if (irTukss) {
			            
			           
			            if (textField.getText().isEmpty()) {
			                textField.setBorder(new LineBorder(Color.RED, 1, true));
			            }
			            if (!rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_1.isSelected() && !rdbtnNewRadioButton_2.isSelected() && !rdbtnNewRadioButton_3.isSelected() && !rdbtnNewRadioButton_4.isSelected()) {
			                rdbtnNewRadioButton.setForeground(Color.RED);
			                rdbtnNewRadioButton_1.setForeground(Color.RED);
			                rdbtnNewRadioButton_2.setForeground(Color.RED);
			                rdbtnNewRadioButton_3.setForeground(Color.RED);
			                rdbtnNewRadioButton_4.setForeground(Color.RED);
			                
			            }
			            if(toppings==3) {
			            	lblNewLabel_3.setForeground(Color.RED);
			            }
			            if((int)spinner.getValue()<=0) {
			            	lblNewLabel_6.setForeground(Color.RED);
			            }
			        } else {
			        	if (toppings == 1) {
			            Main4 sf = new Main4(); 
			            sf.setVisible(true);
			            dispose();
			            
			        	}else if (toppings == 0) {
			        		 Main5 df = new Main5(); 
					            df.setVisible(true);
					            dispose();
					           
			        	}
			        		
			        }
			    }
			});

	        btnNewButton_1.setBounds(177, 630, 165, 61);
	        btnNewButton_1.setOpaque(false); 
	        btnNewButton_1.setContentAreaFilled(false); 
	        btnNewButton_1.setBorderPainted(false);
	        btnNewButton_1.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
	        contentPane.add(btnNewButton_1);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Salami (5.00 €)");
		rdbtnNewRadioButton_4.setIcon(new ImageIcon(this.getClass().getResource("/radioButtonUnchecked.png")));
		rdbtnNewRadioButton_4.setSelectedIcon(new ImageIcon(this.getClass().getResource("/radioButtonChecked.png")));
		rdbtnNewRadioButton_4.setOpaque(false);
		rdbtnNewRadioButton_4.setFont(new Font("Trebuchet MS", Font.ITALIC, 16));
		rdbtnNewRadioButton_4.setBounds(182, 425, 165, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		buttonGroup.add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Margarita (3.80 €)");
		rdbtnNewRadioButton_3.setIcon(new ImageIcon(this.getClass().getResource("/radioButtonUnchecked.png")));
		rdbtnNewRadioButton_3.setSelectedIcon(new ImageIcon(this.getClass().getResource("/radioButtonChecked.png")));
		rdbtnNewRadioButton_3.setOpaque(false);
		rdbtnNewRadioButton_3.setFont(new Font("Trebuchet MS", Font.ITALIC, 16));
		rdbtnNewRadioButton_3.setBounds(182, 399, 165, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		buttonGroup.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Šķiņķa (5.20 €)");
		rdbtnNewRadioButton_2.setIcon(new ImageIcon(this.getClass().getResource("/radioButtonUnchecked.png")));
		rdbtnNewRadioButton_2.setSelectedIcon(new ImageIcon(this.getClass().getResource("/radioButtonChecked.png")));
		rdbtnNewRadioButton_2.setOpaque(false);
		rdbtnNewRadioButton_2.setFont(new Font("Trebuchet MS", Font.ITALIC, 16));
		rdbtnNewRadioButton_2.setBounds(182, 373, 155, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		buttonGroup.add(rdbtnNewRadioButton_2);
		
	
		lblNewLabel_2 = new JLabel("Picas veids:");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_2.setBounds(74, 310, 201, 36);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		if (textField == null)
			kluda += 1;
		textField.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		textField.setOpaque(false);
		textField.setBorder(new LineBorder(new Color(255, 255, 255, 100), 1, true));
		textField.setBounds(278, 271, 186, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pasūtījuma nosaukums:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(74, 263, 201, 36);
		contentPane.add(lblNewLabel_1);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Pikantā (4.00 €)");
		rdbtnNewRadioButton_1.setIcon(new ImageIcon(this.getClass().getResource("/radioButtonUnchecked.png")));
		rdbtnNewRadioButton_1.setSelectedIcon(new ImageIcon(this.getClass().getResource("/radioButtonChecked.png")));
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 16));
		rdbtnNewRadioButton_1.setBounds(182, 346, 155, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_1);
		lblNewLabel.setIcon(new ImageIcon(bilde));
		lblNewLabel.setBounds(0, 0, 784, 761);
		contentPane.add(lblNewLabel);
		
		pogaNe = new JButton("");
		pogaNe.addActionListener(new ActionListener(){
        	

			@Override
			public void actionPerformed(ActionEvent e) {
				toppings=0;
				lblNewLabel_5.setForeground(Color.gray);
				lblNewLabel_4.setForeground(Color.WHITE);
			} 
        });
		pogaNe.setOpaque(false);
		pogaNe.setContentAreaFilled(false);
		pogaNe.setBorderPainted(false);
		pogaNe.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
		pogaNe.setBounds(188, 508, 103, 42);
		contentPane.add(pogaNe);
		
		pogaJa = new JButton("");
		pogaJa.addActionListener(new ActionListener(){
        	

			@Override
			public void actionPerformed(ActionEvent e) {
				toppings=1;
				lblNewLabel_4.setForeground(Color.gray);
				lblNewLabel_5.setForeground(Color.WHITE);
			} 
        });
		pogaJa.setBounds(73, 508, 103, 42);
		pogaJa.setOpaque(false); 
		pogaJa.setContentAreaFilled(false); 
		pogaJa.setBorderPainted(false);
		pogaJa.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
		contentPane.add(pogaJa);
		
		if (rdbtnNewRadioButton_1 == null || rdbtnNewRadioButton_2 == null || rdbtnNewRadioButton_3 == null || rdbtnNewRadioButton_4 == null || rdbtnNewRadioButton == null)
			kluda += 1;
	
	        
	}
	private void saglabaNosaukumuFaila(String nosaukums) {
	   
	    String fails = "pasutijumaNosaukums.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	        
	        wr.println(nosaukums);
	        
	       
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt pasūtījuma nosaukumu failā " + fails);
	     
	    }
	}
	
	
	private void saglabaPicuFaila(String picasVeids) {
	 
	    String fails = "picasVeids.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	        
	        wr.println(picasVeids);
	        
	        
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt picas veidu failā " + fails);
	        
	    }
	}

	private void saglabaDaudzumu(int daudzums) {
        
        String fails = "daudzums.txt";
        
        try (PrintWriter wr = new PrintWriter(fails)) {
            
            wr.println(daudzums);
            
            
        } catch (FileNotFoundException e) {
            System.err.println("Kļūda: Neizdevās saglabāt picas veidu failā " + fails);
            
        }
    }
	
	private void saglabaCenuFaila(double cena) {
	    String fails = "cenas.txt";
	    
	    try (PrintWriter wr = new PrintWriter(fails)) {
	        wr.println(cena);
	    } catch (FileNotFoundException e) {
	        System.err.println("Kļūda: Neizdevās saglabāt cenu failā " + fails);
	        
	    }
	}
}
