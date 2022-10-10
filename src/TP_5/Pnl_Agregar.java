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
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("ID");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 17, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 64, SpringLayout.WEST, this);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 77, SpringLayout.EAST, lblNewLabel);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 27, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 64, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, 110, SpringLayout.WEST, this);
		add(lblNewLabel_2);
		


		@SuppressWarnings("rawtypes")
		JComboBox<Generos> cb_Genero = new JComboBox<Generos>();
		springLayout.putConstraint(SpringLayout.WEST, cb_Genero, 153, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, cb_Genero, -168, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, cb_Genero, 243, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, cb_Genero, 348, SpringLayout.WEST, this);
		cb_Genero.addItem(new Generos("Seleccione un Genero"));
		cb_Genero.addItem(new Generos("Terror"));
		cb_Genero.addItem(new Generos("Accion"));
		cb_Genero.addItem(new Generos("Suspenso"));
		cb_Genero.addItem(new Generos("Romantica"));
		add(cb_Genero);
		
		
		txtNombre = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, cb_Genero, 32, SpringLayout.SOUTH, txtNombre);
		springLayout.putConstraint(SpringLayout.NORTH, txtNombre, 0, SpringLayout.NORTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, txtNombre, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, txtNombre, 79, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtNombre, 128, SpringLayout.EAST, lblNewLabel_2);
		add(txtNombre);
		txtNombre.setColumns(10);
		Peliculas p = new Peliculas();
		lblNewLabel_1.setText(p.getId());
		JButton btnNewButton = new JButton("Aceptar");
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
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Genero");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 39, SpringLayout.SOUTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 73, SpringLayout.SOUTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 111, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -32, SpringLayout.NORTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 64, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_3, 110, SpringLayout.WEST, this);
		add(lblNewLabel_3);
		
		
		

	}
	
	public void setDefaultListModel(DefaultListModel<ArrayList> dlModel2) {
		this.DlModel=dlModel2;
		
	}

}
