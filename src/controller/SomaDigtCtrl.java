package controller;

public class SomaDigtCtrl {
	public SomaDigtCtrl() {
		super();
	}
	public static int Soma (int valor, int somatoria) {
		if (valor <= 0) {
			return somatoria;
		}
		else {
				return Soma (valor/10, valor%10 + somatoria);
		}
	}
}
