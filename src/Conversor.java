import javax.swing.JOptionPane;

public class Conversor {
	
	public static void main(String[] args) {
		
		Object[] tipoOpciones = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		int interator = 0;
		while (interator == 0 ) {
			
			Object selectedTipoOpciones = JOptionPane.showInputDialog(null,
			             "Seleccione una opción de conversión", "Menu",
			             JOptionPane.INFORMATION_MESSAGE, null,
			             tipoOpciones, tipoOpciones[0]);
			
			if (selectedTipoOpciones == "Conversor de Moneda") {
				ConversorMoneda cm = new ConversorMoneda();
				cm.iniciar();
						
				interator = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Seleccione una opcion", 1);
				System.out.println(interator);
			} else {
				ConversorTemperatura ct = new ConversorTemperatura();
				ct.iniciar();
				
				interator = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Seleccione una opcion", 1);
				System.out.println(interator);
			}
			
			
		}
	}
	
}
