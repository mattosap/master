package mattosap.prova.certi.resource;

public class ConverteNumeroExtenso {

	static String umDoisDigitos[] = { "", "um ", "dois ", "tres ", "quatro ", "cinco ", "seis ", "sete ", "oito ",
			"nove ", "dez ", "onze ", "doze ", "treze ", "quatorze ", "quinze ", "dezeseis ", "dezesete ", "dezoito ",
			"dezenove " };

	static String potenciaDez[] = { "", "", "vinte ", "trinta ", "quarenta ", "cinquenta ", "sesenta ", "setenta ",
			"oitenta ", "noventa " };

	static String potenciaCem[] = { "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos",
			"setecentos", "oitocentos", "novecentos" };

	public static String numeroExtenso(int numero) {

		if (numero <= 99999 && numero >= -99999) {
			if (numero == 0)
				return "zero";

			if (numero < 0)
				return "menos " + numeroExtenso(Math.abs(numero));

			String extenso = "";

			if ((numero / 1000) > 0) {
				extenso += numeroExtenso(numero / 1000) + " mil ";
				numero %= 1000;
			}

			if ((numero / 100) > 0) {

				if (extenso != "")
					extenso += "e ";

				if (numero == 100)
					extenso += "cem";
				else
					extenso += potenciaCem[numero / 100] + " ";

				numero %= 100;
			}

			if (numero > 0) {
				if (extenso != "")
					extenso += "e ";

				if (numero < 20) {
					if (numero > 1 && extenso == "") {
						extenso += umDoisDigitos[numero];
					}
				} else {
					extenso += potenciaDez[numero / 10];
					if ((numero % 10) > 0)
						extenso += "e " + umDoisDigitos[numero % 10];

				}
			}

			return extenso;
		}

		return "O numero deve ser de -99999 até 99999";
	}
}