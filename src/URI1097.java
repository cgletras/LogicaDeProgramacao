
public class URI1097 {

	public static void main(String[] args) {
		int I = 1;
		int J = 7;
		while (I <= 9) {
			int Jaux = J;
			int Jlim = Jaux - 2;
			while (Jaux >= Jlim) {
				System.out.println("I="+I+" J="+Jaux);
				Jaux = Jaux - 1;
			}
			I = I + 2;
			J = J + 2;
		}
	}

}
