public class AtividadeIfElse {

	public static void main(String[] args) {

		int a = 3;

		if (a == 1) {
			System.out.println(" A � igual a Um");
		} else {

			if (a == 2) {
				System.out.println(" A � igual a Dois ");
			} else {

				if (a == 3) {
					System.out.println(" A � igual a Tres ");
				} else {

					if (a == 4) {
						System.out.println(" A � igual a Quatro ");
					} else {

						if (a == 5) {
							System.out.println(" A � igual a Cinco ");
						}
					}
				}
			}
		}

		if (a == 1) {
			System.out.println(" A � igual a Um");
		} else if (a == 2) {
			System.out.println(" A � igual a Dois ");
		} else if (a == 3) {
			System.out.println(" A � igual a Tres ");
		} else if (a == 4) {
			System.out.println(" A � igual a Quatro ");
		} else if (a == 5) {
			System.out.println(" A � igual a Cinco ");
		}
		System.out.println( "\n Com switch case \n\n");
		
		switch (a) { //passar variavel de n�mero inteiro ou string
		case 1:
			System.out.println(" A � igual a Um");
			break;
		case 2:
			System.out.println(" A � igual a Dois");
//			break;  // quando n�o existir o break ele vai executar todos os c�digo at� achar novo break
		case 3:
			System.out.println(" A � igual a Tres");
//			break;
		case 4:
			System.out.println(" A � igual a Quatro");
			break;
		case 5:
			System.out.println(" A � igual a Cinco");
			break;

		default:
			System.out.println(" Op��o Inv�lida ");
			break;
		}
	}
}
