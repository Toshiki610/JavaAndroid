package sample;

public class practice {
	
	public static void main(String[] args) {
		System.out.println("あなたの運勢は");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch(fortune) {
		case 1:
			System.out.println("a");
			break;
		case 2:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
			break;
		case 4:
			System.out.println("d");
			break;
		case 5:
			System.out.println("e");
			break;
		}
	}

}
