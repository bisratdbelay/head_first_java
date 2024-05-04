package head_first_java;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Output output = new Output();
		output.go();
	}
	
	void go() {
		int value = 7;
		for(int i = 1; i < 8; i++) {
			value++;
			if (i >4) {
				System.out.print(++value + " ");
			}
			if (value > 14) {
				System.out.println("i = " + i);
				break;
			}
		}
	}

}
