package menjacnica.gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajni;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSrednji;
	private JLabel lblNaziv;
	private JTextField textFieldNaziv;
	private JLabel lblNewLabel;
	private JTextField textFieldKupovni;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSkraceni;
	private JButton btnDodaj;
	private JButton btnOdustani;
	
	private MenjacnicaGUI mg;
	

	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI mg) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodajKursGUI.class.getResource("/icons/malim.png")));
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 345, 276);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSkraceni());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		
		this.mg = mg;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBackground(new Color(255, 255, 255));
			lblSifra.setBounds(28, 24, 122, 14);
		}
		return lblSifra;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(28, 49, 122, 20);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(28, 80, 86, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setBounds(28, 105, 122, 20);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(28, 142, 122, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setBounds(28, 167, 122, 20);
			textFieldSrednji.setColumns(10);
		}
		return textFieldSrednji;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(177, 24, 82, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(177, 49, 122, 20);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
			lblNewLabel.setBounds(177, 80, 86, 14);
		}
		return lblNewLabel;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setBounds(177, 105, 122, 20);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(177, 142, 122, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setBounds(177, 167, 122, 20);
			textFieldSkraceni.setColumns(10);
		}
		return textFieldSkraceni;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.setIcon(new ImageIcon(DodajKursGUI.class.getResource("/icons/as.png")));
			btnDodaj.setBackground(new Color(255, 255, 255));
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sastaviString();
				}
			});
			btnDodaj.setBounds(28, 198, 122, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBackground(new Color(255, 255, 255));
			btnOdustani.setBounds(177, 198, 122, 23);
		}
		return btnOdustani;
	}
	
	private void sastaviString() {
		String sifra = textFieldSifra.getText();
		String naziv = textFieldNaziv.getText();
		String skraceniNaziv = textFieldSkraceni.getText();
		double prodajni = Double.parseDouble(textFieldProdajni.getText());
		double kupovni = Double.parseDouble(textFieldKupovni.getText());
		double srednji = Double.parseDouble(textFieldSrednji.getText());
		
		String krajnji = "Uneli ste novi kurs: Sifra: "+sifra+" Naziv: "+naziv+" Skraceni naziv: "+skraceniNaziv+
				" Prodajni kurs: "+prodajni+" Kupovni kurs: "+kupovni+" Srednji kurs: "+srednji;
		mg.ispisiNovi(krajnji);
		dispose();
	}
}
