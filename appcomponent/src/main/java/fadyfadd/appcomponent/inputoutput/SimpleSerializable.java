package fadyfadd.appcomponent.inputoutput;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class SimpleSerializable {

	public static void main(String[] args) throws Exception {
		//ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("c:/users/fadyf/test"));
		//f.writeObject(new DataObject());
		//f.close();
		
		 //ObjectInputStream f = new ObjectInputStream(new FileInputStream("c:/users/fadyf/test"));		 
		
		 
		 //DataObject x1 = (DataObject)f.readObject();
		
		Path x = FileSystems.getDefault().getPath("c:\\windows" , "..\\intel");
		
		 

	}

}
