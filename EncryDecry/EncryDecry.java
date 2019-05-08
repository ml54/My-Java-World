package project163;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncryDecry {
	public static void main(String[] args) throws IOException {
		Enc();
		Dec();

	}

	public static void Enc() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\ditiss\\Desktop\\hello.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ditiss\\Desktop\\hello_enc.txt");
		int c = 0;
		while ((c = fin.read()) != -1) {
			c++;
			fos.write(c);

			// System.out.print((char)c);
		}

		// String data = "this is the encrypted file"
	}

	public static void Dec() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\ditiss\\Desktop\\hello_enc.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ditiss\\Desktop\\hello_dec.txt");
		int c = 0;
		while ((c = fin.read()) != -1) {
			c--;
			fos.write(c);

			// System.out.print((char)c);
		}

		// String data = "this is the encrypted file"
	}

}
