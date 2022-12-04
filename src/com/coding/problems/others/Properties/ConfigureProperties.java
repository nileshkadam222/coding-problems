package testing.DurgaSir.Properties;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigureProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		try(FileInputStream is = new FileInputStream("E:\\Workdpace\\Java Examples\\src\\testing\\DurgaSir\\Properties\\testing.properties")){
			p.load(is);
			System.out.println(p.getProperty("user"));
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
