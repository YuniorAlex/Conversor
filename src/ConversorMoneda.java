
import javax.swing.JOptionPane;


public class ConversorMoneda {
	
	public void iniciar() {
		Object[] monedaConversion = { "De Soles a Dólar", "De Soles a Euro", "De Soles a Libras Esterlinas", 
				"De Soles a Yen Japonés", "De Soles a Won sul-coreneao", "De Dólar a Soles", "De Euro a Soles", 
				"De Libras Esterlinas a Soles", "De Yen Japonés a Soles", "De Won sul-coreneao a Soles"};
		
		/*JTextField monto = new JTextField(5);
	    JTextField tasaCambio = new JTextField(5);

	    JPanel myPanel = new JPanel();
	    myPanel.add(new JLabel("Monto:"));
	    myPanel.add(monto);
	    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	    myPanel.add(new JLabel("T/C:"));
	    myPanel.add(tasaCambio);
	      
	    int result = JOptionPane.showConfirmDialog(null, myPanel, 
	               "Ingrese los valores", JOptionPane.OK_CANCEL_OPTION);
	      
	    System.out.println(monto.getText());*/
		
		String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir:");
		if (inputValue != null) {
			Moneda moneda = new Moneda();
			if (moneda.convertirValor(inputValue)) {
				
				Object selectedValue = JOptionPane.showInputDialog(null,
			             "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
			             JOptionPane.INFORMATION_MESSAGE, null,
			             monedaConversion, monedaConversion[0]);
				
				System.out.println(selectedValue);
				if (selectedValue != null) {
					JOptionPane.showMessageDialog(null, moneda.convertirMoneda(selectedValue));
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "Valor no válido");
			}
		}
	}
	
}
