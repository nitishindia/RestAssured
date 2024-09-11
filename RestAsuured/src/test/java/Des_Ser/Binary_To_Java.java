package Des_Ser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Binary_To_Java {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("./text.txt");
		ObjectInputStream out=new ObjectInputStream(fis);
		Object y=out.readObject();
		Pojo p=(Pojo)y;
		System.out.println(p.bal);
		System.out.println(p.name);
	}
}
