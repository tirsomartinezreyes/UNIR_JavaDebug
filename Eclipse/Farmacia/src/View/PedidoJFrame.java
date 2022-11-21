package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class PedidoJFrame extends JFrame {
	private JTextField medicamentoNombreTextField;
	private JTextField medicamentoCantidadTextField;

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
	public PedidoJFrame() {
		setResizable(false);
		setTitle("UNIR - Debugging en Eclipse");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel medicamentoNombreLabel = new JLabel("Nombre del medicamento:");
		medicamentoNombreLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoNombreLabel.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(medicamentoNombreLabel);
		
		medicamentoNombreTextField = new JTextField();
		getContentPane().add(medicamentoNombreTextField);
		medicamentoNombreTextField.setColumns(15);
		
		JLabel medicamentoTipoLabel = new JLabel("Tipo de medicamento:");
		medicamentoTipoLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoTipoLabel.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(medicamentoTipoLabel);
		
		JComboBox medicamentoTipoComboBox = new JComboBox();
		medicamentoTipoComboBox.setModel(new DefaultComboBoxModel(new String[] {"Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibiótico"}));
		medicamentoTipoComboBox.setMaximumRowCount(15);
		getContentPane().add(medicamentoTipoComboBox);
		
		JLabel medicamentoCantidadLabel = new JLabel("Cantidad de medicamento:");
		medicamentoCantidadLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoCantidadLabel.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(medicamentoCantidadLabel);
		
		medicamentoCantidadTextField = new JTextField();
		getContentPane().add(medicamentoCantidadTextField);
		medicamentoCantidadTextField.setColumns(15);
		
		JLabel medicamentoDistribuidorLabel = new JLabel("Nombre del Distribuidor:");
		medicamentoDistribuidorLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoDistribuidorLabel.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(medicamentoDistribuidorLabel);
		
		JRadioButton medicamentoDistribuidorRadioButton_1 = new JRadioButton("Cofarma");
		getContentPane().add(medicamentoDistribuidorRadioButton_1);
		
		JRadioButton medicamentoDistribuidorRadioButton_2 = new JRadioButton("Empsephar");
		getContentPane().add(medicamentoDistribuidorRadioButton_2);
		
		JRadioButton medicamentoDistribuidorRadioButton_3 = new JRadioButton("Cemefar");
		getContentPane().add(medicamentoDistribuidorRadioButton_3);
		
		JLabel medicamentoEntregaLabel = new JLabel("Sucursal de entrega:");
		medicamentoEntregaLabel.setVerticalAlignment(SwingConstants.TOP);
		medicamentoEntregaLabel.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(medicamentoEntregaLabel);
		
		JCheckBox medicamentoEntregaSucursalPrincipalCheckBox = new JCheckBox("Sucursal Principal");
		getContentPane().add(medicamentoEntregaSucursalPrincipalCheckBox);
		
		JCheckBox medicamentoEntregaSucursalSecundariaCheckBox = new JCheckBox("Sucursal Secundaria");
		getContentPane().add(medicamentoEntregaSucursalSecundariaCheckBox);
		
		JButton medicamentoConfirmarButton = new JButton("Confirmar");
		medicamentoConfirmarButton.setForeground(UIManager.getColor("textHighlight"));
		getContentPane().add(medicamentoConfirmarButton);
		
		JButton medicamentoCancelarButton = new JButton("Borrar");
		medicamentoCancelarButton.setForeground(UIManager.getColor("RadioButton.select"));
		getContentPane().add(medicamentoCancelarButton);

	}

}
