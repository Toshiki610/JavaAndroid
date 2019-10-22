package sample;

public class Practice4_3 {

	public static void main(String[] args) {
		// 練習4-2
       int moneyList[] = {121902,8302,55100};
       for(int i = 0;i<moneyList.length;i++) {
    	   System.out.println(moneyList[i]);
       }
       System.out.println(" ");
       for(int number:moneyList) {
    	   System.out.println(number);
       }
       // 練習4-3
       int signal[] = {3,4,9};
       System.out.println("１桁の数字を入力してください");
       int input = new java.util.Scanner(System.in).nextInt();
       for(int k:signal) {
    	   if(k==input) {
    		   System.out.println("当たり！");
    	   }else if(k != input) {
               System.out.println("はずれ");
               break;
    	   }
       }
	}

}
