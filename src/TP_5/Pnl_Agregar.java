package TP_5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import TP_5.Categorias;
import javax.swing.SpringLayout;
import TP_5.Peliculas;
public class Pnl_Agregar extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JComboBox cb_Genero;


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
		
		cb_Genero = new JComboBox();

		@SuppressWarnings("rawtypes")
		JComboBox<Categorias> cb_Genero = new JComboBox();
		springLayout.putConstraint(SpringLayout.WEST, cb_Genero, 153, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, cb_Genero, -168, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, cb_Genero, 348, SpringLayout.WEST, this);
		cb_Genero.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un genero", "Terror", "Accion", "Suspenso", "Romantica"}));
		add(cb_Genero);
		
		txtNombre = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, cb_Genero, 32, SpringLayout.SOUTH, txtNombre);
		springLayout.putConstraint(SpringLayout.NORTH, txtNombre, 0, SpringLayout.NORTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, txtNombre, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, txtNombre, 79, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtNombre, 128, SpringLayout.EAST, lblNewLabel_2);
		add(txtNombre);
		txtNombre.setColumns(10);
		lblNewLabel_1.setText("1");
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb_Genero.getSelectedIndex()==0) {
					System.out.println("INGRESO INCORRECTO");
				}
				else {					
					Categorias c = new Categorias();
					c.setId(Integer.parseInt(lblNewLabel_1.getText()));
					c.setNombre(txtNombre.getText());
					c.setGenero(cb_Genero.getSelectedItem().toString());
					JOptionPane.showMessageDialog(null, c.toString());
					System.out.println(c.getId()+1);
				}
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
	
	
}
