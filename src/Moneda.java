
public class Moneda {
	
	double valor;
	
	public Moneda() {
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
	
	public String convertirMoneda(Object tipoOperacion) {
		System.out.println(this.valor +" - "+ tipoOperacion);
		String tipoMoneda = "Soles";
		
		if ("De Soles a Dólar" == tipoOperacion) {
			this.valor = this.valor / 3.64;
			tipoMoneda = "Dolares";
		} else if ("De Soles a Euro" == tipoOperacion) {
			this.valor = this.valor / 3.95;
			tipoMoneda = "Euros";
		} else if ("De Soles a Libras Esterlinas" == tipoOperacion) {
			this.valor = this.valor / 4.63;
			tipoMoneda = "Libras Esterlinas";
		} else if ("De Soles a Yen Japonés" == tipoOperacion) {
			this.valor = this.valor / 0.025;
			tipoMoneda = "Yenes";
		} else if ("De Soles a Won sul-coreneao" == tipoOperacion) {
			this.valor = this.valor / 0.0028;
			tipoMoneda = "Wones";
		} else if ("De Dólar a Soles" == tipoOperacion) {
			this.valor = this.valor * 3.64;
		} else if ("De Euro a Soles" == tipoOperacion) {
			this.valor = this.valor * 3.95;
		} else if ("De Libras Esterlinas a Soles" == tipoOperacion) {
			this.valor = this.valor * 4.63;
		} else if ("De Yen Japonés a Soles" == tipoOperacion) {
			this.valor = this.valor * 0.025;
		} else if ("De Won sul-coreneao a Soles" == tipoOperacion) {
			this.valor = this.valor * 0.0028;
		} else {
		}
		
		return "Tienes "+  String.format("%.2f", this.valor) +" "+tipoMoneda;
	}
}
