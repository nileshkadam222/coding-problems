package testing.DurgaSir.FileIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo1 {

	public static void main(String[] args) {

		
	    //code to create File
		File f = new File("test1.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		
		
		//Directory
		File f1= new File("Nilesh");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
		
		
		//Disply all filed in directorys
		File f2 = new File("E:\\Angular-6-7-8");
		String[] list = f2.list();
		System.out.println(list);
		Arrays.stream(list).forEach(dd->{
		 File fileObj = new File(f2,dd);
			if(fileObj.isFile()) {
				System.out.println("File :"+dd);
			}else if(fileObj.isDirectory()) {
				System.out.println("Directorey :"+dd);
			}
		});
		
		
		
		FileWriter fw;
		try {
			fw = new FileWriter("E:\\Nilesh\\test.txt");
			fw.write("Hii I am Nilesh\n");
			fw.write("Hii I am Nilesh");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Read Data From File
		try {
			//FileReader fr = new FileReader("E:\\Nilesh\\test.txt");
			File fff = new File("E:\\Nilesh\\test.txt");
			char[] c = new char[(int)fff.length()];
			FileReader fr = new FileReader(f);
			int r = fr.read(c);
			while(r != -1) {
				System.out.println((char)r);
				r = fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		
		
	}

}
