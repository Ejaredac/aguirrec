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
		setBounds(100, 100, 235, 153);
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
		        	_intValorLimFin = Integer.parseInt(txtFin.getText());
		        }
		        catch(Exception e){
		        	_intValorLimFin = 0;
		        }
		        
		        //int _intValorLimiteFinal = Integer.parseInt()
		        int i=0;
		        do {
		            _intValor3 = _intValor1 + _intValor2;
		            i++;
		            if(!(_intValor3 > _intValorLimFin)) {
		            	System.out.println("Vez " + i +"\nSuma de :\n Valor 1: " + _intValor1 + "\n Valor 2: " + _intValor2 + "\n Igual a: "  + _intValor3);
		            	_strMessage = _strMessage + "\nVez " + i +"\nSuma de :\n Valor 1: " + _intValor1 + "\n Valor 2: " + _intValor2 + "\n Igual a: "  + _intValor3;
		            }
		            

		            _intValor1 = _intValor2;
		            _intValor2 = _intValor3;
		            
		        }while (_intValor3 < _intValorLimFin);
		        System.out.println("Muchas Gracias por Eduardo Jared Aguirre Cárdenas 19100140");
		        _strMessage = _strMessage + "\nMuchas Gracias por Eduardo Jared Aguirre Cárdenas 19100140";
		        JOptionPane.showMessageDialog(null, _strMessage);
			}
		});
		btnNewButton.setBounds(47, 61, 119, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Fin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(47, 30, 23, 20);
		contentPane.add(lblNewLabel);
		
		txtFin = new JTextField();
		txtFin.setBounds(80, 32, 86, 20);
		contentPane.add(txtFin);
		txtFin.setColumns(10);
	}
}
