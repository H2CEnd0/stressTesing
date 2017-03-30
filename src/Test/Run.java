package Test;

import Test.MyThread;
import Test.MyThreadB;

public class Run {
	public static void main(String[] args){
		int i = 1;
		while(i > 0){
			MyThread a = new MyThread("A");
			//MyThreadB a = new MyThreadB("B");
			a.start();
			//b.start();
			i--;
		}
		//while(true){
//		MyThread a = new MyThread("A");
//		MyThread b = new MyThread("B");
//		MyThread c = new MyThread("C");
//		MyThread d = new MyThread("D");
//		MyThread e = new MyThread("E");
//		MyThread f = new MyThread("F");
//		MyThread g = new MyThread("G");
//		MyThread h = new MyThread("H");
//		a.start();
//		b.start();
//		c.start();
//		d.start();
//		e.start();
//		f.start();
//		g.start();
//		h.start();
		//}
	}
}
