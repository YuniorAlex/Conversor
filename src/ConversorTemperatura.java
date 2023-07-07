import javax.swing.JOptionPane;

public class ConversorTemperatura {
	public void iniciar() {
		Object[] temperaturaConversion = { "De Celcius a Fahrenheit", "De Celcius a Kelvin", "De Fahrenheit a Celcius", 
				"De Fahrenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Fahrenheit"};
		
		
		String inputValue = JOptionPane.showInputDialog("Ingrese el numero que deseas convertir:");
		if (inputValue != null) {
			Temperatura temperatura = new Temperatura();
			if (temperatura.convertirValor(inputValue)) {
				
				Object selectedValue = JOptionPane.showInputDialog(null,
			             "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
			             JOptionPane.INFORMATION_MESSAGE, null,
			             temperaturaConversion, temperaturaConversion[0]);
				
				System.out.println(selectedValue);
				if (selectedValue != null) {
					JOptionPane.showMessageDialog(null, temperatura.convertirTemperatura(selectedValue));
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "Valor no válido");
			}
		}
	}
}
