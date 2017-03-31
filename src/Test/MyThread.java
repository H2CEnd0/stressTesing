package Test;
import java.text.*;
public class MyThread extends Thread{
	private int count = 5;
	private int sum = 0;
	private int num = 100;
	public MyThread(String name){
		super();
		this.setName(name);
	}
//	synchronized public int setI(int i){
//		i--;
//		return i;
//	}
	@Override
	//synchronized public void run(){
	public void run(){
	super.run();
		int time = 1000;
	 	DecimalFormat df=new DecimalFormat("0.00000000");
	 	String timeRes = df.format((float)time/1000);
	 	
	 	while(true){
	 	//num = setI(num);
	    count--;
	    sum++;
	    //String str = "file_name="+ num +"" +"_1489987417&file_number=5&type=1&age=50&sex=1";
	    //System.out.println(str);
	    String sr=HttpRequest.sendPost("http://182.92.96.114:1080/bupa/Test_Voice", "file_name=10_1489848312&file_number=5&type=1&age=50&sex=1");
		//System.out.println("由 " +this.currentThread().getName()+" 计算, count="+count);
		//System.out.println(sr+count+"");
		//System.out.println(sum*50);
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