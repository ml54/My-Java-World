package project161;
import java.io.FileInputStream;
import java.io.IOException;

public class BytesRead {

	public static void main(String[] args) throws IOException {
		FileInputStream f= new FileInputStream("C:\\Users\\ditiss\\Desktop\\hello.txt");
		
		int ch=0;
		while ((ch=f.read())!=-1) {
			System.out.print((char)ch);
		}
	}

}
