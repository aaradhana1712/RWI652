package com.abs;
 abstract class Demo{
	abstract void start();
	void view() {
		System.out.println("this is concreate Method of abstract");
	}
}
 class Start extends Demo{
	 void show()
	    {
		 System.out.println("this");
        }

	  void start() {}
 }
     public class Concreatemethod {

	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start s = new Start();
		s.view();
		s.show();
		

	}

}
