package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFiles {
	public static void main(String[] args) throws IOException {
		

	File myfile =new File("C:\\Users\\draba\\OneDrive\\Desktop");
	if (myfile.createNewFile()) {
		System.out.println( "File is created :"+ myfile.getName());
	}
	else {
		System.out.println("File already exist");
	}
	}
	

}
