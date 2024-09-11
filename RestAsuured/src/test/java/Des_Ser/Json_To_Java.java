package Des_Ser;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json_To_Java {
    
	  public static void main(String[] args) throws IOException {
		File f=new File("./jso.json");
		ObjectMapper map=new ObjectMapper();
		Pojo p=map.readValue(f, Pojo.class);
		System.out.println(p.getName());
		System.out.println(p.getBal());
		System.out.println("json to java is done..........");
	}
}
