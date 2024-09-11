package Endod_Decod;


import java.util.Base64;
public class Encode {
    public static void main(String[] args) {
		String str="Nitish";
		
		String enco=new String(Base64.getEncoder().encode(str.getBytes()));
		
		System.out.println(enco);
		
		String deco=new String(Base64.getDecoder().decode(enco.getBytes()));
		System.out.println(deco);
	}
}
