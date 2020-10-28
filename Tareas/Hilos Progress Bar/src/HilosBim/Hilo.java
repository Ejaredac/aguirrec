package HilosBim;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JProgressBar;
public class Hilo extends Thread{


	private JProgressBar component;
	
	private Random rand;
	public Hilo competidor;
	private JButton boton;
	
	public volatile boolean estaCompletado = false;
	
	private Random getRand() {
		return rand;
	}
	
	public Hilo(JProgressBar component, String nombre,JButton boton,Hilo competidor) {
		this.component = component;
		rand = new Random();
		this.component.setName(nombre);
		this.component.setMaximum(100);
		this.boton = boton;
		this.competidor = competidor;
	}
	
	public synchronized boolean isCompleted() {
		return estaCompletado;
	}
	
	@Override
	public void run() {
		int intPorciento = 0;
		while(!estaCompletado) {
			boton.setEnabled(false);
			if(component.getValue() >= 100) {
				estaCompletado = true;
			}
			component.setValue(intPorciento); 
			intPorciento += getRand().nextInt(3);
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		component.setValue(0);
		if(competidor.estaCompletado == false) {
			JOptionPane.showMessageDialog(component, component.getName() + " ha ganado");
		}
		JOptionPane.showMessageDialog(component, component.getName() + " esta completado");
		
		boton.setEnabled(true);
	}
}
