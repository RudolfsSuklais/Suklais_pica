package lvt;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Apskatit extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JList<String> list; 
   
    private static final String FAILS = "pagaidu_pasutijuma_dati.txt";
 

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
        
  

        list = new JList<String>();
        list.setBounds(23, 31, 711, 499);
        contentPane.add(list);

        JButton btnNewButton = new JButton("Ielādēt pasūtījumus");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                nolasitUnParaditInformaciju();
            }
        });
        btnNewButton.setBounds(281, 541, 200, 23);
        contentPane.add(btnNewButton);
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
        
      
        return new pica(pasutijumaNosaukums, picasVeids, izveletieToppingi, picasDiametrs, vards, uzvards, telNr, adrese, pastaIndekss);
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