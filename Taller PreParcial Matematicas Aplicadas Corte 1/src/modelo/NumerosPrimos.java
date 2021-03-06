package modelo;

public class NumerosPrimos {

	private int[] arreglo = new int[230];
	private String resultado;

	public int[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(int[] arreglo) {
		this.arreglo = arreglo;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public int[][] eliminarMultiplos(int matriz[][], int numero) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (((matriz[i][j] % numero) == 0) && (matriz[i][j] != numero)) {
					matriz[i][j] = 0;
				}
			}
		}
		return matriz;
	}

	public String imprimirMatriz(int matriz[][]) {
		resultado = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if ((matriz[i][j] != 0) && matriz[i][j] <= 200) {
					resultado += matriz[i][j] + "    ";
				}
			}
			resultado += "\n\n";
		}
		return resultado;
	}
}
