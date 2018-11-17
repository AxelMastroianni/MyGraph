
public class Nodo {
	private int peso=0;
	private int numero=0;
	
	public Nodo(int numero, int peso) {
		this.numero=numero;
		this.peso=peso;
	}
	
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public int getPeso() {
		return peso;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	public int getNumero() {
		return numero;
	}

}
