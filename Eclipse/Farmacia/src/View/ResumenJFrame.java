package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResumenJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel pedidoResultadoLabel = new JLabel("");
	private JTextArea pedidoResumenTextArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResumenJFrame frame = new ResumenJFrame(args);
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
	public ResumenJFrame(String[] args) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pedidoResultadoLabel.setText("");
		pedidoResumenTextArea.setText("");
		
		
		JButton pedidoAceptarButton = new JButton("Enviar");
		pedidoAceptarButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pedidoResultadoLabel.setText("Pedido enviado");
			}
		});
		pedidoAceptarButton.setForeground(Color.BLUE);
		
		JButton pedidoCancelarButton = new JButton("Cancelar");
		pedidoCancelarButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit (0);
			}
		});
		pedidoCancelarButton.setForeground(Color.RED);
		
		
		pedidoResultadoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pedidoResultadoLabel.setForeground(Color.BLUE);
		
		
		pedidoResumenTextArea.setLineWrap(true);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addComponent(pedidoAceptarButton)
					.addPreferredGap(ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
					.addComponent(pedidoCancelarButton)
					.addGap(86))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(76)
					.addComponent(pedidoResultadoLabel, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(95, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(pedidoResumenTextArea, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addComponent(pedidoResumenTextArea, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(pedidoResultadoLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(pedidoCancelarButton)
						.addComponent(pedidoAceptarButton))
					.addGap(29))
		);
		getContentPane().setLayout(groupLayout);
		System.out.println(args);
		this.setTitle("Pedido del distribuidor "+args[0]);
		pedidoResumenTextArea.setText(args[1]+" unidades del "+ args[2]+" " + args[3] + " "+args[4]);
		
	}
}
