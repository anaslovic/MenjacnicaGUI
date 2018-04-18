package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblSkraceniNaziv;
	private JLabel lblKupovniKurs;
	private JLabel lblProdajniKurs;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSifra;
	private JTextField textFieldProdajni;
	private JTextField textFieldSrednji;
	private JTextField textFieldNaziv;
	private JTextField textFieldKupovni;
	private JTextField textFieldSkraceni;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JCheckBox cek;
	private MenjacnicaGUI mg;


	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI mg) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/icons/malix.png")));
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 344, 292);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getTextFieldSkraceni());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getCek());
		this.mg = mg;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(20, 21, 133, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(180, 21, 46, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(180, 132, 133, 14);
		}
		return lblSkraceniNaziv;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(180, 77, 133, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(20, 77, 133, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(20, 132, 133, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(20, 46, 133, 20);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setBounds(20, 101, 133, 20);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setBounds(20, 157, 133, 20);
			textFieldSrednji.setColumns(10);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(180, 46, 133, 20);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setBounds(180, 101, 133, 20);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setBounds(180, 157, 133, 20);
			textFieldSkraceni.setColumns(10);
		}
		return textFieldSkraceni;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sastaviString();
				}
			});
			btnObrisi.setForeground(new Color(255, 255, 255));
			btnObrisi.setBackground(new Color(47, 79, 79));
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(20, 217, 133, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setForeground(new Color(255, 255, 255));
			btnOdustani.setBackground(new Color(47, 79, 79));
			btnOdustani.setBounds(180, 217, 133, 23);
		}
		return btnOdustani;
	}
	private JCheckBox getCek() {
		if (cek == null) {
			cek = new JCheckBox("Zaista obrisi kurs");
			cek.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(cek.isSelected())
						btnObrisi.setEnabled(true);
					else btnObrisi.setEnabled(false);
				}
			});
			cek.setBounds(20, 184, 133, 23);
		}
		return cek;
	}
	private void sastaviString() {
		String naziv = textFieldNaziv.getText();
		String skraceni = textFieldSkraceni.getText();
		String sifra = textFieldSifra.getText();
		Double kupovni = Double.parseDouble(textFieldKupovni.getText());
		Double prodajni = Double.parseDouble(textFieldProdajni.getText());
		Double srednji = Double.parseDouble(textFieldSrednji.getText());
		
		String krajnji = "Obrisan je kurs: "+naziv+" Skraceni naziv: "+skraceni+" Sifra: "+sifra
				+" Prodajni kurs: "+prodajni+" Kupovni kurs: "+kupovni+" Srednji kurs: "+srednji;
		
		mg.ispisiNovi(krajnji);
		dispose();
	}
}
