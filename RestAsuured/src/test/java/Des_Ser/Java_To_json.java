package Des_Ser;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Java_To_json {
    public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Pojo p=new Pojo("Kumar", 100l);
		
		File f=new File("./jso.json");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(f,p); // convert java to json
		
		System.out.println("java to json done..............");
		
	}
}
