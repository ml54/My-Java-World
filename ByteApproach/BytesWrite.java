package project161;
import java.io.FileOutputStream;
import java.io.IOException;

public class BytesWrite {
	public static void main(String args[]) throws IOException {
		FileOutputStream f= new FileOutputStream("C:\\Users\\ditiss\\Desktop\\manan.txt");
			String data = "welcome to manan.txt";
			//int c=0;
			f.write(data.getBytes());
			f.close();
			
			//while((data.getBytes())!=-1)
			//{
				//System.out.println((char)ch);
			//}
	}
}
