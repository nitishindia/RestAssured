package Des_Ser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Java_To_Binary {
    
	public static void main(String[] args) throws IOException {
		
		Pojo p=new Pojo("Nitish",293L);
		FileOutputStream out=new FileOutputStream("./text.txt");
		ObjectOutputStream obj=new ObjectOutputStream(out);
		obj.writeObject(p);
		System.out.println(" Serilizatin is done...............");
	}
}


