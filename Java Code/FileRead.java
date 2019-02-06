package com.java.pack;
import java.io.*;
class FileRead {
	public static void fileRead() throws IOException{
		File fp = new File("D:/Workspace/Java Code/src/com/java/pack/file.txt");
		BufferedReader br = new BufferedReader(new FileReader(fp));
		String s="";
		String str="";
		while((s=br.readLine())!=null){
			str=str+s+" ";
		}
		String string[] = str.split(" ");
		GetSetDetails gd = new GetSetDetails();
		for(String m: string){
			String details[] = m.split("-");
			gd.setName(details[0]);
			gd.setEmail(details[1]);
			gd.setPhone(details[2]);
			gd.setSex(details[3]);
			System.out.println("Name: "+gd.getName()+" Email ID: "+gd.getEmail()+" Phone Number: "+gd.getPhone()+" Sex: "+gd.getSex());
		}
	}
}
