package project162;
import java.io.FileWriter;
import java.io.IOException;
public class CharWrite {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\ditiss\\Desktop\\charwrite.txt");
		String data = "you aRe currently viewing charwrite.txt";
		String data1 = "welcome";
		f.write(data);
		f.write(data1);
		f.close();

	}

}
