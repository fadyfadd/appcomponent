package miscellaneous;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyApp {

	public static void main(String[] args) throws Exception {
		//ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("c:/users/fadyf/test"));
		//f.writeObject(new DataObject());
		//f.close();
		
		 ObjectInputStream f = new ObjectInputStream(new FileInputStream("c:/users/fadyf/test"));		 
		
		 
		 DataObject x1 = (DataObject)f.readObject();
		 

	}

}
