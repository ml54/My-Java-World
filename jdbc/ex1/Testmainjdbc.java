package project2e;


import java.util.Scanner;

public class Testmainjdbc {
	
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		jdbcinsert j = new jdbcinsert();
		
		System.out.println("1.insert \n2.delete \n3.update \n4.fetch");
		int ch = scan.nextInt();
		switch(ch) {
			case 1:
				j.jdbci();
				break;
			case 2:
				j.jdbcdel();
				break;
			case 3:
				j.jdbcupdate();
				break;
			case 4:
				j.fetch();
			default:
				break;
	}}}


