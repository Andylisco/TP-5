package TP_5;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Pnl_Listar extends JPanel {

	/**
	 * Create the panel.
	 */
	private JPanel contentPanel;
	private JLabel  lblPeliculas;
	private JList JlistPeliculas;
	private DefaultListModel<ArrayList> DlModel;
	
	
	public Pnl_Listar() {
		setLayout(null);
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(0, 0, 40, 300);
		add(lblPeliculas);
		
		JlistPeliculas = new JList();
		JlistPeliculas.setBounds(40, 0, 410, 300);
		
		
		
		
		DlModel= new DefaultListModel<ArrayList>();
		
		JlistPeliculas.setModel(DlModel);
		
		add(JlistPeliculas);
		
		

	}


	public void setDefaultListModel(DefaultListModel<ArrayList> dlModel2) {
		this.DlModel=dlModel2;
		
	}

}
