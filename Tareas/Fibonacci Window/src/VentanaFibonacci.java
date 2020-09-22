import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaFibonacci extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 354, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Haz click para activar la secuancia Fibonacci");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		        //Esta es la tarea de Eduardo Jared Aguirre Cardenas 19100140
		        int _intValor1 = 0;
		        int _intValor2 = 1;
		        int _intValor3 = 0;
		        int i=0;
		        int _intNumControl = 19100140;
		        while (_intValor3 < 89) {
		            _intValor3 = _intValor1 + _intValor2;
		            i++;
		            System.out.println("Vez " + i +"\nSuma de :\n Valor 1: " + _intValor1 + "\n Valor 2: " + _intValor2 + "\n Igual a: "  + _intValor3);

		            _intValor1 = _intValor2;
		            _intValor2 = _intValor3;
		        }
		        System.out.println("Muchas Gracias por Eduardo Jared Aguirre Cárdenas 19100140");
			}
		});
		btnNewButton.setBounds(10, 45, 312, 33);
		contentPane.add(btnNewButton);
	}
}
