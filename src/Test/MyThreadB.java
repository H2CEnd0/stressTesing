package Test;
import java.text.*;
public class MyThreadB extends Thread{
	private int count = 5;
	private int sum = 0;
	public MyThreadB(String name){
		super();
		this.setName(name);
	}
	@Override
 public void run(){
	//public void run(){
	super.run();
		int time = 10;
	 	DecimalFormat df=new DecimalFormat("0.00000000");
	 	String timeRes = df.format((float)time/1000);
	    while(true){
	    count--;
	    sum++;
	    String sr=HttpRequest.sendPost("http://localhost:8080/Test_Voice", "name=liupan");
		//System.out.println("由 " +this.currentThread().getName()+" 计算, count="+count);
	    System.out.println(sr);
	    try  
        {  
		 this.currentThread().sleep(time);  
        }  
        catch (InterruptedException e)  
        {  
        }
		//System.out.println(timeRes + "m后在叫我吧！"); 
	}
	}
}