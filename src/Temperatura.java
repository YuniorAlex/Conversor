
public class Temperatura {
	
	double valor;
	
	public Temperatura() {
		this.valor = 0;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean convertirValor(String valor) {
		try {
			this.valor = Double.parseDouble(valor);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public String convertirTemperatura(Object tipoOperacion) {
		System.out.println(this.valor +" - "+ tipoOperacion);
		String tipoTemperatura = "";
		
		if ("De Celcius a Fahrenheit" == tipoOperacion) {
			this.valor = (this.valor * 1.8) + 32;
			tipoTemperatura = "Fahrenheit";
		} else if ("De Celcius a Kelvin" == tipoOperacion) {
			this.valor = this.valor + 273.15;
			tipoTemperatura = "Kelvin";
		} else if ("De Fahrenheit a Celcius" == tipoOperacion) {
			this.valor = (this.valor - 32) / 1.8;
			tipoTemperatura = "Celcius";
		} else if ("De Fahrenheit a Kelvin" == tipoOperacion) {
			this.valor = (this.valor + 459.67) / 1.8;
			tipoTemperatura = "Kelvin";
		} else if ("De Kelvin a Celcius" == tipoOperacion) {
			this.valor = this.valor - 273.15;
			tipoTemperatura = "Celcius";
		} else if ("De Kelvin a Fahrenheit" == tipoOperacion) {
			this.valor = 9*this.valor - 459.67;
			tipoTemperatura = "Fahrenheit";
		} else {
		}
		
		return "Tienes "+  String.format("%.2f", this.valor) +" Grados "+tipoTemperatura;
	}
}
