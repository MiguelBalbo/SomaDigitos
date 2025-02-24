package controller;

public class SomaDigtCtrl {
	public SomaDigtCtrl() {
		super();
	}
	public static int Soma (int valor, int somatoria) {
		//se o valor for igual ou menor que 0, ele retorna
		if (valor <= 0) {
			return somatoria;
		}
		else {
			//ele envia a soma dividido por 10, e adiciona o resto da divisão por 10 na somatória
				return Soma (valor/10, valor%10 + somatoria);
		}
	}
}
