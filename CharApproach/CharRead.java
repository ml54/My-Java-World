package project162;
import java.io.FileReader;
import java.io.IOException;

public class CharRead {
	public static void main(String[] args) throws IOException{
		
		FileReader f= new FileReader("C:\\Users\\ditiss\\Desktop\\MAN\\yo fcn\\Linard\\AAA\\ftp.txt");
		int ch=0;
		while((ch=f.read())!=-1) {
		System.out.print((char)ch);	
		}
		
	}

}
