import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import HilosBim.Hilo;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class MainHilos extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCorrer;
	private JProgressBar progresoPrimero;
	private JProgressBar progresoSegundo;
	private Hilo barraUno,barraDos;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainHilos frame = new MainHilos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainHilos() {
		setResizable(false);
		setTitle("Carrera de JProgressBar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 532, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnCorrer = new JButton("Correr");
		btnCorrer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCorrer.addActionListener(this);
		btnCorrer.setBounds(157, 201, 162, 51);
		panel.add(btnCorrer);
		
		progresoPrimero = new JProgressBar();
		progresoPrimero.setBounds(122, 50, 368, 51);
		panel.add(progresoPrimero);
		
		progresoSegundo = new JProgressBar();
		progresoSegundo.setBounds(122, 114, 368, 51);
		panel.add(progresoSegundo);
		
		JLabel lblProgressDos = new JLabel("Segundo");
		lblProgressDos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblProgressDos.setBounds(122, 176, 95, 14);
		panel.add(lblProgressDos);
		
		JLabel lblNewLabel = new JLabel("Primero");
		lblNewLabel.setBounds(122, 21, 95, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCorrer) {
			
			 barraUno = new Hilo(progresoPrimero,"El primero",btnCorrer,barraDos);
			 barraDos = new Hilo(progresoSegundo, "El segundo",btnCorrer,barraUno);			
			
			
			barraUno.start();
			barraDos.start();
			 
			 
		}
	}
	
	
	
}
