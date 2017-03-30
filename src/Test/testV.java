package Test;

public class testV {
	//private int count = 10;
	public static void main(String[] args){
	int count = 5;
	while(true){
		count--;
		String sr=HttpRequest.sendPost("http://182.92.96.114:1080/bupa/Test_Voice", "file_name=3_1489987417&file_number=5&type=1&age=50&sex=1");
		String sr1=HttpRequest.sendPost("http://182.92.96.114:1080/bupa/Test_Voice", "file_name=3_1489987417&file_number=5&type=1&age=50&sex=1");
		//System.out.println("”… " +this.currentThread().getName()+" º∆À„, count="+count);
		System.out.println(sr+count+"");
	}
	}
};
