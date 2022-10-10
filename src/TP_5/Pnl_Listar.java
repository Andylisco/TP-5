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
	
	private JLabel  lblPeliculas;
	private JList JlistPeliculas;
	private DefaultListModel<ArrayList> DlModel;
	
	
	public Pnl_Listar() {
		setLayout(new BorderLayout(0, 0));
		
		lblPeliculas = new JLabel("Peliculas");
		add(lblPeliculas, BorderLayout.WEST);
		
		JlistPeliculas = new JList<ArrayList>();
		add(JlistPeliculas, BorderLayout.CENTER);
		
		DlModel= new DefaultListModel<ArrayList>();
		
		JlistPeliculas.setModel(DlModel);
		
		

	}


	public void setDefaultListModel(DefaultListModel<ArrayList> dlModel2) {
		this.DlModel=dlModel2;
		
	}

}
