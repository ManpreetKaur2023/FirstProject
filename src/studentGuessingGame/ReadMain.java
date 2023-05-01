package studentGuessingGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ReadMain {

	public static void main(String[] args) {
		try {
		
		String fileName="C:\\\\Users\\\\Gurwinder\\\\OneDrive\\\\Desktop\\\\hello.txt";
		ArrayList<String> allNames=new ArrayList<String>();
		Random r=new Random();
		BufferedReader in =new BufferedReader(new FileReader(fileName));
		while(in.ready()) {
			allNames.add(in.readLine());
			//System.out.println(allNames);
		}
		in.close();
		String studentName=allNames.get(r.nextInt(allNames.size()));
		System.out.println(studentName);
		}catch(IOException e) {
			System.out.println("error");
		}
		
		}}
//		try {
//			File myOject = new File("C:\\Users\\Gurwinder\\OneDrive\\Desktop\\hello.txt");
//			//File myOjectw = new File("C:\\Users\\Gurwinder\\OneDrive\\Desktop\\namelist.docx");
//			Scanner sc = new Scanner(myOject);
//			while (sc.hasNextLine()) {
//				String data = sc.nextLine();
//				System.out.println(data);
//
//			}
//
//			sc.close();
//
//		} catch (FileNotFoundException e) {
//			System.out.println("error");
//			e.printStackTrace();
//
//		}
//		
//		try {
//		
//		Random r=new Random();
//		File[] files=new File("C:\\\\Users\\\\Gurwinder\\\\OneDrive\\\\Desktop\\\\hello.txt").listFiles();
//        File file=files[r.nextInt(files.length)];
//        FileReader file2=new FileReader(file);
//        BufferedReader buffer=new BufferedReader(file2);
//        String line="";
//        while((line=buffer.readLine()) !=null) {
//        	System.out.println(line);
//        }
//        buffer.close();
//	}catch(IOException e) {
//		System.out.println("error");
//	}
//	}

