package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;


public class PedidoJFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField medicamentoNombreTextField;
	private JTextField medicamentoCantidadTextField;
	@SuppressWarnings("rawtypes")
	private JComboBox medicamentoTipoComboBox = new JComboBox();
	private JLabel medicamentoValidaciónLabel = new JLabel("");
	private ButtonGroup medicamentoDistribuidorRadioButtonGroup = new ButtonGroup();
	private JRadioButton medicamentoDistribuidorRadioButton_1 = new JRadioButton("Cofarma");
	private JRadioButton medicamentoDistribuidorRadioButton_2 = new JRadioButton("Empsephar");
	private JRadioButton medicamentoDistribuidorRadioButton_3 = new JRadioButton("Cemefar");
	private JCheckBox medicamentoEntregaSucursalPrincipalCheckBox = new JCheckBox("Sucursal Principal");
	private JCheckBox medicamentoEntregaSucursalSecundariaCheckBox = new JCheckBox("Sucursal Secundaria");

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedidoJFrame frame = new PedidoJFrame();
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
	@SuppressWarnings("unchecked")
	public PedidoJFrame() {
		setResizable(false);
		setTitle("UNIR - Debugging en Eclipse");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel medicamentoNombreLabel = new JLabel("Nombre del medicamento:");
		medicamentoNombreLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoNombreLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		medicamentoNombreTextField = new JTextField();
		medicamentoNombreTextField.setColumns(15);
		
		JLabel medicamentoTipoLabel = new JLabel("Tipo de medicamento:");
		medicamentoTipoLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoTipoLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		@SuppressWarnings("rawtypes")
		
		String options[] = new String[] {"Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibiótico"};
		medicamentoTipoComboBox.setModel(new DefaultComboBoxModel<Object>(options));
		medicamentoTipoComboBox.setMaximumRowCount(15);
		
		JLabel medicamentoCantidadLabel = new JLabel("Cantidad de medicamento:");
		medicamentoCantidadLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoCantidadLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		medicamentoCantidadTextField = new JTextField();
		medicamentoCantidadTextField.setColumns(15);
		
		JLabel medicamentoDistribuidorLabel = new JLabel("Nombre del Distribuidor:");
		medicamentoDistribuidorLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoDistribuidorLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		
		medicamentoDistribuidorRadioButtonGroup.add(medicamentoDistribuidorRadioButton_1);
		medicamentoDistribuidorRadioButtonGroup.add(medicamentoDistribuidorRadioButton_2);
		medicamentoDistribuidorRadioButtonGroup.add(medicamentoDistribuidorRadioButton_3);
		
		
		JLabel medicamentoEntregaLabel = new JLabel("Sucursal de entrega:");
		medicamentoEntregaLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoEntregaLabel.setHorizontalAlignment(SwingConstants.LEFT);
				
		JButton medicamentoConfirmarButton = new JButton("Confirmar");
		medicamentoConfirmarButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("On Confirmar:mouseClicked");
				if(validar()) {
					ResumenJFrame.main(obtenerResumen());
				}
			}
		});
		
		medicamentoConfirmarButton.setForeground(UIManager.getColor("RadioButton.light"));
		
		JButton medicamentoCancelarButton = new JButton("Borrar");
		medicamentoCancelarButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("On Borrar:mouseClicked");
				medicamentoNombreTextField.setText("");
				medicamentoTipoComboBox.setSelectedItem("Analgésico");
				medicamentoCantidadTextField.setText("");
				medicamentoDistribuidorRadioButton_1.setSelected(false);
				medicamentoDistribuidorRadioButton_2.setSelected(false);
				medicamentoDistribuidorRadioButton_3.setSelected(false);
				medicamentoDistribuidorRadioButtonGroup.clearSelection();
				medicamentoEntregaSucursalPrincipalCheckBox.setSelected(false);
				medicamentoEntregaSucursalSecundariaCheckBox.setSelected(false);
				medicamentoValidaciónLabel.setText("");
			}
		});
		medicamentoCancelarButton.setForeground(UIManager.getColor("RadioButton.select"));
		medicamentoValidaciónLabel.setHorizontalAlignment(SwingConstants.CENTER);
		medicamentoValidaciónLabel.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		
		medicamentoValidaciónLabel.setForeground(UIManager.getColor("Button.select"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(medicamentoDistribuidorLabel)
							.addGap(5)
							.addComponent(medicamentoDistribuidorRadioButton_1)
							.addGap(5)
							.addComponent(medicamentoDistribuidorRadioButton_2)
							.addGap(5)
							.addComponent(medicamentoDistribuidorRadioButton_3))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(medicamentoEntregaLabel)
							.addGap(5)
							.addComponent(medicamentoEntregaSucursalPrincipalCheckBox)
							.addGap(5)
							.addComponent(medicamentoEntregaSucursalSecundariaCheckBox))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(95)
							.addComponent(medicamentoConfirmarButton)
							.addGap(5)
							.addComponent(medicamentoCancelarButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(medicamentoValidaciónLabel, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(medicamentoCantidadLabel)
								.addComponent(medicamentoNombreLabel)
								.addComponent(medicamentoTipoLabel))
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(medicamentoNombreTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(medicamentoTipoComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(medicamentoCantidadTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(4))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(medicamentoNombreLabel)
						.addComponent(medicamentoNombreTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(medicamentoTipoLabel)
						.addComponent(medicamentoTipoComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(medicamentoCantidadLabel)
						.addComponent(medicamentoCantidadTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(medicamentoDistribuidorLabel))
						.addComponent(medicamentoDistribuidorRadioButton_1)
						.addComponent(medicamentoDistribuidorRadioButton_2)
						.addComponent(medicamentoDistribuidorRadioButton_3))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(medicamentoEntregaLabel))
						.addComponent(medicamentoEntregaSucursalPrincipalCheckBox)
						.addComponent(medicamentoEntregaSucursalSecundariaCheckBox))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(medicamentoConfirmarButton)
						.addComponent(medicamentoCancelarButton))
					.addGap(14)
					.addComponent(medicamentoValidaciónLabel)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	
	public boolean validar() {
		System.out.println("On validar");
		Boolean resultado = true;
		
		
		if(resultado && !esAlfanumérico(medicamentoNombreTextField.getText())){
			medicamentoValidaciónLabel.setText("Ingrese el nombre del medicamento");
			resultado = false;
		}
		
		if(resultado && !esNúmeroPositivo(medicamentoCantidadTextField.getText())){
			medicamentoValidaciónLabel.setText("La cantidad de medicamento es incorrecto");
			resultado = false;
		}
		
		
		
		if(resultado && !distribuidorSeleccionado()) {
			medicamentoValidaciónLabel.setText("No se ha seleccionado un distribuidor");
			resultado = false;
		}
		
		if(resultado && !destinoSeleccionado()) {
			medicamentoValidaciónLabel.setText("No se ha seleccionado un destino");
			resultado = false;
		}
		
		
		
		if(!resultado) {
			System.out.println("validación no satisfecha");
			setTimeout(() -> limpiarMensajeDeError(), 3000);
		}
		
		
		return resultado;
	}
	
	public void limpiarMensajeDeError() {
		medicamentoValidaciónLabel.setText("");
	}
	
	
	public static boolean esVacío(String s) {
		System.out.println(s);
		if(s== null) {
			return true;
		}
		
		if(s=="") {
			return true;
		}
		
		if(s.isEmpty() ) {
			return true;
		}
		
		return false;
		
	}
	
	public static boolean esAlfanumérico(String s) {
		if(esVacío(s)) {
			return false;
		}
				
		if(s.matches("^[a-zA-Z0-9]*$")) {
			return true;
		}
		
		return false;
	}
	
	public static boolean esNúmeroPositivo(String s) {
		if(esVacío(s)) {
			return false;
		}
				
		if(s.matches("^[0-9]*$")) {
			return true;
		}
		
		return false;
	}
	
	public  boolean distribuidorSeleccionado() {
		
		if(medicamentoDistribuidorRadioButton_1.isSelected()) {
			return true;
		}
		
		if(medicamentoDistribuidorRadioButton_2.isSelected()) {
			return true;
		}
		
		if(medicamentoDistribuidorRadioButton_3.isSelected()) {
			return true;
		}
		
		return false;
	}
	
	public  boolean destinoSeleccionado() {
		
		if(medicamentoEntregaSucursalPrincipalCheckBox.isSelected()) {
			return true;
		}
		
		if(medicamentoEntregaSucursalSecundariaCheckBox.isSelected()) {
			return true;
		}
		
		
		return false;
	}
	
	
	public String obtenerTipoMedicamento() {
		return (String) medicamentoTipoComboBox.getSelectedItem();
	}
	
	public String obtenerDistribuidor() {
		
		if(medicamentoDistribuidorRadioButton_1.isSelected()) {
			return medicamentoDistribuidorRadioButton_1.getText();
		}
		
		if(medicamentoDistribuidorRadioButton_2.isSelected()) {
			return medicamentoDistribuidorRadioButton_2.getText();
		}
		
		if(medicamentoDistribuidorRadioButton_3.isSelected()) {
			return medicamentoDistribuidorRadioButton_3.getText();
		}
		
		return "";
	}
	
	public String obtenerDestino() {
		String output = new String(" para la farmacia situada en ");
		Boolean previaDirección =false;
		
		if(medicamentoEntregaSucursalPrincipalCheckBox.isSelected()) {
			output = output + "calle de la Rosa n. 28";
			previaDirección = true;
		}
		
		if(medicamentoEntregaSucursalSecundariaCheckBox.isSelected()) {
			
			if(previaDirección) {
				output = output + " y para la situada en calle Alcazabilla n. 3.";
			}else {
				output =  output + "calle Alcazabilla n. 3.";
			}
		}
		
		return output;
	}
	
	public String[] obtenerResumen() {
		return new String [] {obtenerDistribuidor(), medicamentoCantidadTextField.getText(), obtenerTipoMedicamento(), medicamentoNombreTextField.getText(),obtenerDestino()};
		
	}
	
	
	
	
	public static void setTimeout(Runnable runnable, int delay){
	    new Thread(() -> {
	        try {
	            Thread.sleep(delay);
	            runnable.run();
	        }
	        catch (Exception e){
	            System.err.println(e);
	        }
	    }).start();
	}

}
