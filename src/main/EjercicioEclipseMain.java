package main;


public class EjercicioEclipseMain {
	private String testImprimir;
	

	public EjercicioEclipseMain() {
		this.testImprimir = "";
	}


	public static void main(String[] args) {
		EjercicioEclipseMain ejemplo1=new EjercicioEclipseMain();
		ejemplo1.setTestImprimir("valor xxxx");
		System.out.println("holaaaaaaa ");
		System.out.println(ejemplo1);

	}


	public String getTestImprimir() {
		return testImprimir;
	}


	public void setTestImprimir(String numImprimir) {
		this.testImprimir = numImprimir;
	}


	@Override
	public String toString() {
		return "EjercicioEclipseMain [testImprimir=" + testImprimir + "]";
	}

}
