package B2026_J08;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AplicatieFlorarie extends JFrame {

    private static final long serialVersionUID = 1L;

    // Buchetul curent (componenta + decoratori)
    private Florarie buchetCurent = new Buchet();

    private JLayeredPane buchetPanou;
    private JTextField descriereField;
    private JTextField pretField;
    
    private int indexFloare = 0;
    private final int startX = 150;
    private final int startY = 100;     
    private final int sizeW = 200;
    private final int sizeH = 220;
    private final int stepX = 35;  

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            AplicatieFlorarie frame = new AplicatieFlorarie();
            frame.setVisible(true);
        });
    }

    public AplicatieFlorarie() {
        setTitle("Florarie");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon appIcon = new ImageIcon("src/PozePIP/icon.png");
        setIconImage(appIcon.getImage());
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(255, 220, 230));

        // Titlu sus
        JTextField welcome = new JTextField("BUN VENIT LA FLORARIE");
        welcome.setHorizontalAlignment(SwingConstants.CENTER);
        welcome.setBackground(new Color(255, 220, 230));
        welcome.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
        welcome.setEditable(false);
        welcome.setBorder(null);
        welcome.setCaretColor(new Color(0, 0, 0, 0));
        getContentPane().add(welcome, BorderLayout.NORTH);

        // Panou stanga cu butoane
        JPanel panouStanga = new JPanel();
        panouStanga.setBackground(new Color(255, 220, 230));
        panouStanga.setLayout(new BoxLayout(panouStanga, BoxLayout.Y_AXIS));
        getContentPane().add(panouStanga, BorderLayout.WEST);

        JButton btnT = new JButton("Trandafir");
        btnT.setMaximumSize(new Dimension(140, 30));
        btnT.setAlignmentX(Component.CENTER_ALIGNMENT);
        panouStanga.add(Box.createVerticalStrut(10));
        panouStanga.add(btnT);

        JButton btnB = new JButton("Bujor");
        btnB.setMaximumSize(new Dimension(140, 30));
        btnB.setAlignmentX(Component.CENTER_ALIGNMENT);
        panouStanga.add(Box.createVerticalStrut(10));
        panouStanga.add(btnB);
        
        JButton btnC = new JButton("Crizantema");
		btnC.setMaximumSize(new Dimension(120, 30));
		btnC.setAlignmentX(Component.CENTER_ALIGNMENT);
		panouStanga.add(Box.createVerticalStrut(10));
		panouStanga.add(btnC);
		
		JButton btnL = new JButton("Lalea");
		btnL.setMaximumSize(new Dimension(120, 30));
		btnL.setAlignmentX(Component.CENTER_ALIGNMENT);
		panouStanga.add(Box.createVerticalStrut(10));
		panouStanga.add(btnL);
		
		JButton btnM = new JButton("Margareta");
		btnM.setMaximumSize(new Dimension(120, 30));
		btnM.setAlignmentX(Component.CENTER_ALIGNMENT);
		panouStanga.add(Box.createVerticalStrut(10));
		panouStanga.add(btnM);
		
		JButton btnF = new JButton("Fundita");
		btnF.setMaximumSize(new Dimension(120, 30));
		btnF.setAlignmentX(Component.CENTER_ALIGNMENT);
		panouStanga.add(Box.createVerticalStrut(10));
		panouStanga.add(btnF);


        JButton btnReset = new JButton("Reset buchet");
        btnReset.setMaximumSize(new Dimension(140, 30));
        btnReset.setAlignmentX(Component.CENTER_ALIGNMENT);
        panouStanga.add(Box.createVerticalStrut(10));
        panouStanga.add(btnReset);

        // Panou centru pentru poze
        buchetPanou = new JLayeredPane();
        buchetPanou.setLayout(null);
        buchetPanou.setOpaque(true);
        buchetPanou.setBackground(new Color(255, 220, 230));
        getContentPane().add(buchetPanou, BorderLayout.CENTER);
        
        // Panou jos: descriere + pret
        JPanel info = new JPanel();
        info.setBackground(new Color(255, 220, 230));
        info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));

        descriereField = new JTextField();
        descriereField.setEditable(false);
        descriereField.setBorder(null);
        descriereField.setBackground(new Color(255, 220, 230));

        pretField = new JTextField();
        pretField.setEditable(false);
        pretField.setBorder(null);
        pretField.setBackground(new Color(255, 220, 230));
        pretField.setFont(new Font("Verdana", Font.BOLD, 13));

        info.add(descriereField);
        info.add(pretField);
        getContentPane().add(info, BorderLayout.SOUTH);

        actualizeazaText();

        // Actiuni butoane (decorare)
        btnT.addActionListener(e -> {
            buchetCurent = new Trandafir(buchetCurent);
            adaugaImagine("src/PozePIP/trandafir.png");
            actualizeazaText();
        });

        btnB.addActionListener(e -> {
            buchetCurent = new Bujor(buchetCurent);
            adaugaImagine("src/PozePIP/bujor.png");
            actualizeazaText();
        });
        
        btnC.addActionListener(e -> {
            buchetCurent = new Crizantema(buchetCurent);
            adaugaImagine("src/PozePIP/crizantema.png");
            actualizeazaText();
        });
        
        btnL.addActionListener(e -> {
            buchetCurent = new Lalea(buchetCurent);
            adaugaImagine("src/PozePIP/lalea.png");
            actualizeazaText();
        });
        
        btnM.addActionListener(e -> {
            buchetCurent = new Margareta(buchetCurent);
            adaugaImagine("src/PozePIP/margareta.png");
            actualizeazaText();
        });
        
        btnF.addActionListener(e -> {
            buchetCurent = new Funda(buchetCurent);
            adaugaImagineFunda("src/PozePIP/fundita.png");
            actualizeazaText();
        });

        btnReset.addActionListener(e -> {
            buchetCurent = new Buchet();
            buchetPanou.removeAll();
            buchetPanou.revalidate();
            buchetPanou.repaint();
            actualizeazaText();
            indexFloare=0;
        });
    }

    private void adaugaImagine(String path) {
    	 ImageIcon icon = new ImageIcon(path);
         Image img = icon.getImage().getScaledInstance(sizeW, sizeH, Image.SCALE_SMOOTH);

         JLabel floare = new JLabel(new ImageIcon(img));
         floare.setOpaque(false);

         int x = startX + indexFloare * stepX;  
         int y = startY;                   

         floare.setBounds(x, y, sizeW, sizeH);

         buchetPanou.add(floare, Integer.valueOf(indexFloare));
         indexFloare++;

         buchetPanou.repaint();
    }
    
    private void adaugaImagineFunda(String path) {
   	 ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(sizeW, sizeH, Image.SCALE_SMOOTH);

        JLabel floare = new JLabel(new ImageIcon(img));
        floare.setOpaque(false);

        int x = startX + (indexFloare * stepX)/2;  
        int y = 200;                        

        floare.setBounds(x, y, sizeW, sizeH);

        buchetPanou.add(floare, Integer.valueOf(indexFloare));
        indexFloare++;

        buchetPanou.repaint();
   }

    private void actualizeazaText() {
        descriereField.setText("Descriere: " + buchetCurent.descriere());
        pretField.setText(String.format("Pret total: %.2f lei", buchetCurent.pret()));
    }
}
