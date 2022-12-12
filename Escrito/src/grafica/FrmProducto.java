package grafica;

import logica.Producto;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


	public class FrmProducto extends JFrame {
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField txtCodigo;
		private JTextField txtNombre;
		private JTextField txtCosto;
		private JTextField txtPrecio;
		private JButton btnLimpiar;
		private JButton btnAceptar;


		public FrmProducto() {
			iniciarManejadoresEventos();
			iniciarComponentes();
		}
			
		
		public void iniciarComponentes() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.GREEN);
			panel.setBorder(new TitledBorder(null, "Datos de producto",
			TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(92, 11, 235, 192);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lblCodigo = new JLabel("Codigo");
			lblCodigo.setBounds(10, 26, 46, 14);
			panel.add(lblCodigo);
			
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(10, 64, 46, 14);
			panel.add(lblNombre);
			
			JLabel lblCosto = new JLabel("Costo");
			lblCosto.setBounds(10, 105, 46, 14);
			panel.add(lblCosto);
			
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(10, 148, 46, 14);
			panel.add(lblPrecio);
			
			txtCodigo = new JTextField();
			txtCodigo.setBounds(86, 23, 86, 20);
			panel.add(txtCodigo);
			txtCodigo.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(86, 61, 86, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtCosto = new JTextField();
			txtCosto.setBounds(86, 102, 86, 20);
			panel.add(txtCosto);
			txtCosto.setColumns(10);
			
			txtPrecio = new JTextField();
			txtPrecio.setBounds(86, 145, 86, 20);
			panel.add(txtPrecio);
			txtPrecio.setColumns(10);
			
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(237, 227, 89, 23);
			contentPane.add(btnAceptar);
			
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setBounds(335, 227, 89, 23);
			contentPane.add(btnLimpiar);
			
		}
		
		
			public void iniciarManejadoresEventos() {
				btnAceptar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int codigo=Integer.valueOf(txtCodigo.getText());
						String nombre =txtNombre.getText();
						double costo=Double.valueOf(txtCosto.getText());
						Producto p= new Producto(codigo, nombre, costo);
						txtPrecio.setText(String.valueOf(p.precioVenta()));
						JOptionPane.showInputDialog(p.toString(),"Datos");
					}
				});
				
				
				btnLimpiar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtCodigo.setText(null);
						txtNombre.setText(null);
						txtCosto.setText(null);
						txtPrecio.setText(null);
					}
				});
			}
			
			
			
			
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProducto frame = new FrmProducto();
					frame.setVisible(true);
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}