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
        
        JButton atpakal = new JButton("");
        atpakal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main2 sf = new Main2(); 
    			sf.setVisible(true);
    			dispose();
            }
        });
        atpakal.setContentAreaFilled(false); 
        atpakal.setBorderPainted(false);
        atpakal.setBorder(new LineBorder(new Color(255, 255, 255, 100), 2));
        atpakal.setBounds(430, 648, 335, 70);
        contentPane.add(atpakal);
    
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