import javax.swing.JOptionPane;

public class SintaxeJava {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Numero 1");
		String n2 = JOptionPane.showInputDialog("Numero 2");
		
		Integer um = Integer.parseInt(n1);
		Integer dois = Integer.parseInt(n2);
		System.out.println (um + dois);
	}
	
	
}
