package Rueda;

@SuppressWarnings("serial")
public class RuedaPinchadaException extends Exception {
	
	private float presionPSI;
	private float temperaturaC;
	
	public RuedaPinchadaException(String msg) {
		super(msg);
	}
	public RuedaPinchadaException (String msg, float presionPSI, float temperaturaC){
		super(msg);
		this.presionPSI = presionPSI;
		this.temperaturaC = temperaturaC;
		
	}
	public float getPresionPSI() {
		return presionPSI;
	}
	public void setPresionPSI(float presionPSI) {
		this.presionPSI = presionPSI;
	}
	public float getTemperaturaC() {
		return temperaturaC;
	}
	public void setTemperaturaC(float temperaturaC) {
		this.temperaturaC = temperaturaC;
	}

}
