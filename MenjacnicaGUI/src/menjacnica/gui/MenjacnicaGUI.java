package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmAbout;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_1;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;
	private JTable table;
	private JPopupMenu popupMenu;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmIzvrsiZamenu;
	private MenjacnicaGUI mg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izadji();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/coins-icon.png")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 614, 386);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		this.mg = this;
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNewMenuItem());
			mnFile.add(getMntmNewMenuItem_1());
			mnFile.add(getMntmNewMenuItem_2());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Open");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					otvori();
				}
			});
			mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
			mntmNewMenuItem.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/folder-red-open-icon (1).png")));
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Save");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sacuvaj();
				}
			});
			mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
			mntmNewMenuItem_1.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/save-icon (1).png")));
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("Exit");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					izadji();
				}
			});
			mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmNewMenuItem_2;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About...");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,	"Autor aplikacije Ana Slovic.","About",JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAbout;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(150, 10));
			panel.setLayout(null);
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj kurs");
			btnNewButton.setBackground(new Color(240, 230, 140));
			btnNewButton.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/dollar-collection-icon.png")));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNewButton.setBounds(10, 11, 130, 33);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Obrisi kurs\r\n\r\n");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ObrisiKursGUI g = new ObrisiKursGUI(mg);
					g.setVisible(true);
				}
			});
			btnNewButton_1.setBackground(new Color(240, 230, 140));
			btnNewButton_1.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/playstation-cross-dark-icon.png")));
			btnNewButton_1.setBounds(10, 55, 130, 33);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Izvrsi zamenu");
			btnNewButton_2.setBackground(new Color(240, 230, 140));
			btnNewButton_2.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/Arrow-reload-3-icon.png")));
			btnNewButton_2.setBounds(10, 99, 130, 33);
		}
		return btnNewButton_2;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(47, 79, 79)));
			panel_1.setPreferredSize(new Dimension(10, 65));
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getScrollPane_1(), BorderLayout.CENTER);
		}
		return panel_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getTextArea());
		}
		return scrollPane_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
		}
		return textArea;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setBackground(new Color(240, 230, 140));
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			) {
				Class[] columnTypes = new Class[] {
					Object.class, Object.class, Double.class, Double.class, Double.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			addPopup(table, getPopupMenu());
			table.getColumnModel().getColumn(1).setPreferredWidth(90);
		}
		return table;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmNewMenuItem_3());
			popupMenu.add(getMntmNewMenuItem_4());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("Dodaj kurs");
			mntmNewMenuItem_3.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/malim.png")));
		}
		return mntmNewMenuItem_3;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("Obrisi kurs");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI g = new ObrisiKursGUI(mg);
					g.setVisible(true);
				}
			});
			mntmNewMenuItem_4.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/malix.png")));
		}
		return mntmNewMenuItem_4;
	}
	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
			mntmIzvrsiZamenu.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/malaa.png")));
		}
		return mntmIzvrsiZamenu;
	}
	private void otvori() {
		JFileChooser fc = new JFileChooser();
		int opcija = fc.showOpenDialog(null);
		
		if(opcija == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();
			textArea.setText(textArea.getText()+"Ucitan fajl: "+f.getAbsolutePath()+"\n");
		}
	}
	private void sacuvaj() {
		JFileChooser fc = new JFileChooser();
		int opcija = fc.showSaveDialog(null);
		
		if(opcija == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();
			textArea.setText(textArea.getText()+"Sacuvan fajl: "+f.getAbsolutePath()+"\n");
		}
	}
	private void izadji() {
		int opcija = 
				JOptionPane.showConfirmDialog(
					null, "Da li zelite da izadjete iz programa?",
					"Izlaz", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if (opcija == JOptionPane.YES_OPTION)
				System.exit(0);
	}
	
	public void ispisi(String s) {
		textArea.setText(textArea.getText()+s+"\n");
	}
}
