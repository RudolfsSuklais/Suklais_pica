package lvt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;




public class Apskatit extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JList<String> list; 
   
    private static final String FAILS = "pagaidu_pasutijuma_dati.txt";
    private static final String CENAS_FAILS = "cenas.txt";
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	 Apskatit frame = new Apskatit();
                     frame.setVisible(true);
                    
                    
                     
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

 public Apskatit() {
	 
	 pica picasObjekts = nolasitUnSaglabatInformaciju();
	 ierakstitObjektuFaila(picasObjekts);
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 800);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        Image bilde = new ImageIcon(this.getClass().getResource("/apskatit.png")).getImage();
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(29, 175, 725, 355);
        contentPane.add(scrollPane);
        
  

        list = new JList<String>();
        list.setBorder(new CompoundBorder());
        list.setBackground(Color.ORANGE);
        scrollPane.setViewportView(list);

        JButton btnNewButton = new JButton("Ielādēt pasūtījumus");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                nolasitUnParaditInformaciju();
            }
        });
        btnNewButton.setOpaque(false); 
        btnNewButton.setContentAreaFilled(false); 
        btnNewButton.setBorderPainted(false);
        btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
        
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(bilde));
        lblNewLabel.setBounds(0, 0, 784, 761);
        contentPane.add(lblNewLabel);
        btnNewButton.setBounds(230, 552, 338, 72);
        contentPane.add(btnNewButton);
        list.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        
        JButton izdzest = new JButton("Izdzēst pasūtījumus");
        izdzest.setOpaque(false); 
        izdzest.setContentAreaFilled(false); 
        izdzest.setBorderPainted(false);
        izdzest.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
        izdzest.setBounds(10, 643, 366, 78);
        izdzest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                izdzestPasutijumus();
            }
        });
        contentPane.add(izdzest);
    
    }

    public void nolasitUnParaditInformaciju() {
        ArrayList<String> saraksts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FAILS))) {
            String line;
            while ((line = br.readLine()) != null) {
                saraksts.add(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Kļūda nolasot failu " + FAILS, "Kļūda", JOptionPane.ERROR_MESSAGE);
        }

        DefaultListModel<String> DLM = new DefaultListModel<>();
        for (String element : saraksts) {
            DLM.addElement(element);
        }
        list.setModel(DLM);
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
        private void izdzestPasutijumus() {
            try (BufferedWriter wr = new BufferedWriter(new FileWriter(FAILS, false))) {
                wr.write(""); 
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Kļūda izdzēšot pasūtījumus", "Kļūda", JOptionPane.ERROR_MESSAGE);
            }
            
            DefaultListModel<String> izdzest = new DefaultListModel<>();
            list.setModel(izdzest);
        }
    }