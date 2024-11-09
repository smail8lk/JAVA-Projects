import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.*;

public class Formulaire extends JFrame implements ActionListener{
	private Container c;
	private JLabel titre;
	private JLabel nom;
	private JLabel prenom;
	private JLabel genre;
	private JLabel dateNaissance;
	private JLabel adresse;
	private JLabel salaire;

	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField textSalaire;
	
	private JRadioButton male;
	private JRadioButton female;
	
	private JComboBox day;
	private JComboBox month;
	private JComboBox year;
	
	private JTextArea area;
	
	private JCheckBox box;
	
	private JButton valider;
	private JButton annuler;
	
	public Formulaire() {
		
		setTitle("Formulaire d'inscription");
		setBounds(300, 90, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		c = getContentPane();
		c.setLayout(null); 
		
		titre = new JLabel("Inscription");
		titre.setFont(new Font("Arial", Font.PLAIN, 30));
		titre.setSize(300, 30); 
		titre.setLocation(200, 30);
		c.add(titre);
		
		nom = new JLabel("Nom");
		nom.setFont(new Font("Arial", Font.PLAIN, 20));
		nom.setSize(200, 20); 
		nom.setLocation(100, 100);
		c.add(nom);
		
		prenom = new JLabel("Prénom");
		prenom.setFont(new Font("Arial", Font.PLAIN, 20));
		prenom.setSize(200, 20); 
		prenom.setLocation(100, 150);
		c.add(prenom);
		
		genre = new JLabel("Genre");
		genre.setFont(new Font("Arial", Font.PLAIN, 20));
		genre.setSize(200, 20); 
		genre.setLocation(100, 200);
		c.add(genre);
		
		dateNaissance = new JLabel("Date de naissance");
		dateNaissance.setFont(new Font("Arial", Font.PLAIN, 20));
		dateNaissance.setSize(200, 20); 
		dateNaissance.setLocation(100, 250);
		c.add(dateNaissance);
		
		adresse = new JLabel("Adresse");
		adresse.setFont(new Font("Arial", Font.PLAIN, 20));
		adresse.setSize(200, 20); 
		adresse.setLocation(100, 300);
		c.add(adresse);
		
		salaire = new JLabel("Salaire");
		salaire.setFont(new Font("Arial", Font.PLAIN, 20));
		salaire.setSize(200, 20); 
		salaire.setLocation(100, 400);
		c.add(salaire);
		
		textNom = new JTextField();
		textNom.setLocation(200, 100);
		textNom.setSize(200,20);
		textNom.setFont(new Font("Arial", Font.PLAIN, 30));
		c.add(textNom);
		
		textPrenom = new JTextField();
		textPrenom.setLocation(200, 150);
		textPrenom.setSize(200,20);
		textPrenom.setFont(new Font("Arial", Font.PLAIN, 30));
		c.add(textPrenom);
		
		textSalaire = new JTextField();
		textSalaire.setLocation(200, 400);
		textSalaire.setSize(200,20);
		textSalaire.setFont(new Font("Arial", Font.PLAIN, 30));
		c.add(textSalaire);
		
		male = new JRadioButton("Masculin");
		male.setLocation(220, 200);
		male.setSize(100,20);
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		c.add(male);
		
		female = new JRadioButton("Féminin");
		female.setLocation(320, 200);
		female.setSize(100,20);
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		c.add(female);
		
		area = new JTextArea("Écrivez votre adresse...");
		area.setFont(new Font("Arial", Font.ITALIC, 10));
		setForeground(Color.lightGray);
		area.setSize(200, 50); 
		area.setLocation(200, 300);
		c.add(area);
		
		day = new JComboBox();
		day.setFont(new Font("Arial", Font.PLAIN, 15));
		day.setSize(50, 20);
		day.setLocation(300, 250);
		c.add(day);
		
		month = new JComboBox();
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(50, 20);
		month.setLocation(350, 250);
		c.add(month);
		
		year = new JComboBox();
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(80, 20);
		year.setLocation(400, 250);
		c.add(year);
		
		for (int d = 1; d <= 31; d++) {
		    System.out.print("0");
		    day.addItem(String.valueOf(d));
		    }
		
		for (int m = 1; m <= 12; m++) {
		    month.addItem(m);
		}
		
		for (int y = 1900; y <= LocalDateTime.now().getYear(); y++) {
		    year.addItem(String.valueOf(y));
		}
		
		box = new JCheckBox("Accepter les conditions du contrat");
		box.setLocation(180, 450);
		box.setSize(250, 20);
		c.add(box);
		
		valider = new JButton("Valider");
		valider.setLocation(150,500);
		valider.setSize(80, 20);
		c.add(valider);
		
		annuler = new JButton("Annuler");
		annuler.setLocation(300,500);
		annuler.setSize(80, 20);
		c.add(annuler);
		
	}

	public static void main(String[] args) throws Exception
	{
	Formulaire f = new Formulaire();
	f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}


