package keisyou;

public class Box{
  public static void box(String[] args) {
	  Y[] array = new Y[2];
	  array[0] = new A();
	  array[1] = new B();
	  
	  for(Y y : array) {
		  y.b();
	  }
	  
  }
}
