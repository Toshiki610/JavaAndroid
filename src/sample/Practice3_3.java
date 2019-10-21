package sample;

public class Practice3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
       System.out.println("【数当てゲーム】");
       int ans = new java.util.Random().nextInt(9);
        for(int i = 0;i < 6;i++) {
        	System.out.println("０～９の数字を入力してください");
        	int num = new java.util.Scanner(System.in).nextInt();
        	if(num == ans) {
        		System.out.println("当たり");
        		break;
        	}else {
        		System.out.println("はずれ");
        	}
        }
        System.out.println("ゲームを終了します");
	}

}
