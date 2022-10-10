package TP_5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;



import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import TP_5.Generos;
import javax.swing.SpringLayout;
import TP_5.Peliculas;
public class Pnl_Agregar extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JComboBox<Generos> cb_Genero;
	private DefaultListModel<ArrayList> DlModel;
	


	/**
	 * Create the panel.
	 */
	public Pnl_Agregar() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(64, 17, 11, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(152, 17, 35, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(64, 58, 46, 21);
		add(lblNewLabel_2);
		


		//@SuppressWarnings("rawtypes")
		cb_Genero = new JComboBox<Generos>();
		cb_Genero.setBounds(153, 111, 195, 21);
		cb_Genero.addItem(new Generos("Seleccione un Genero"));
		cb_Genero.addItem(new Generos("Terror"));
		cb_Genero.addItem(new Generos("Accion"));
		cb_Genero.addItem(new Generos("Suspenso"));
		cb_Genero.addItem(new Generos("Romantica"));
		add(cb_Genero);
		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(152, 58, 86, 21);
		add(txtNombre);
		txtNombre.setColumns(10);
		Peliculas p = new Peliculas();
		lblNewLabel_1.setText(p.getId());
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(64, 164, 115, 37);
		ArrayList<Peliculas> ListaPeliculas = new ArrayList<Peliculas>();
		DlModel =new DefaultListModel<ArrayList>();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb_Genero.getSelectedIndex()!=0&&txtNombre.getText().trim()!="") {
					
                    /*Generos c = new Generos();
					
					c.setGenero(cb_Genero.getSelectedItem().toString());
					JOptionPane.showMessageDialog(null, c.toString());*/
					Peliculas p = new Peliculas();
					p.setNombre(txtNombre.getText());
					p.setGenero(cb_Genero.getSelectedItem().toString());
					ListaPeliculas.add(p);
				}
				else JOptionPane.showMessageDialog(null,"INGRESO INCORRECTO");
				
				Collections.sort(ListaPeliculas);
				
				DlModel.addElement(ListaPeliculas);
			}

			
		});
		add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Genero");
		lblNewLabel_3.setBounds(64, 111, 46, 14);
		add(lblNewLabel_3);
		
		
		

	}
	
	public void setDefaultListModel(DefaultListModel<ArrayList> dlModel2) {
		this.DlModel=dlModel2;
		
	}

}
