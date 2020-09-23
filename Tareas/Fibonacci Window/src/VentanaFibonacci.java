import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import java.awt.List;
import java.awt.Choice;

public class VentanaFibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtFin;
	private JTextField txtValor2;
	private JTextField txtValor1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFibonacci frame = new VentanaFibonacci();
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
	public VentanaFibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		        //Esta es la tarea de Eduardo Jared Aguirre Cardenas 19100140
		        int _intValor1 = 0;
		        int _intValor2 = 1;
		        int _intValor3 = 0;
		        int _intValorLimFin = 0;
		        String _strMessage = new String();
		        
		        try {
		        	_intValor1 = Integer.parseInt(txtValor1.getText());
		        	_intValor2 = Integer.parseInt(txtValor2.getText());
		        	_intValorLimFin = Integer.parseInt(txtFin.getText());
		        }
		        catch(Exception e){
		        	_intValor1 = 0;
		        	_intValor2 = 0;
		        	_intValorLimFin = 1;
		        	JOptionPane.showMessageDialog(null, e);
		        }
		        
		        //int _intValorLimiteFinal = Integer.parseInt()
		        int i=0;
		        for (int j = 0; j < _intValorLimFin; j++) {
		        	_intValor3 = _intValor1 + _intValor2;
		            
		            
		            	System.out.println("Vez " + j +"\nSuma de :\n Valor 1: " + _intValor1 + "\n Valor 2: " + _intValor2 + "\n Igual a: "  + _intValor3);
		            	_strMessage = _strMessage + "\nVez " + j +"\nSuma de :\n Valor 1: " + _intValor1 + "\n Valor 2: " + _intValor2 + "\n Igual a: "  + _intValor3;
		            
		            

		            _intValor1 = _intValor2;
		            _intValor2 = _intValor3;
					
				}
		            
		            
		        
		        System.out.println("Muchas Gracias por Eduardo Jared Aguirre Cárdenas 19100140");
		        _strMessage = _strMessage + "\nMuchas Gracias por Eduardo Jared Aguirre Cárdenas 19100140";
		        JOptionPane.showMessageDialog(null, _strMessage);
			}
		});
		btnNewButton.setBounds(61, 104, 119, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Iteraciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(22, 73, 86, 20);
		contentPane.add(lblNewLabel);
		
		txtFin = new JTextField();
		txtFin.setBounds(129, 75, 86, 20);
		contentPane.add(txtFin);
		txtFin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(54, 48, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		txtValor2 = new JTextField();
		txtValor2.setBounds(129, 42, 86, 20);
		contentPane.add(txtValor2);
		txtValor2.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor 1");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(54, 17, 54, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtValor1 = new JTextField();
		txtValor1.setColumns(10);
		txtValor1.setBounds(129, 11, 86, 20);
		contentPane.add(txtValor1);
	}
}
