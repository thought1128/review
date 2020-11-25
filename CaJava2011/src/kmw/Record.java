package kmw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;


public class Record {
	public static void main(String[] args) {
		String name="김민우";
		StringBuffer a= new StringBuffer();

		//name=user.next();
		int score=10;
		try {
		    OutputStream record = new FileOutputStream("C:/Users/admin/Desktop/"+name+".txt");
		    String str =score+"";
		    byte[] by=str.getBytes();
		    record.write(by);
				
		} catch (Exception e) {
	            e.getStackTrace();
		}
        try{
        
        File file = new File("C:/Users/admin/Desktop/"+name+".txt");
        
         FileReader file_reader = new FileReader(file);
         int cur = 0;
         while((cur = file_reader.read()) != -1){
        	a.append((char)cur);
         }
         String x=a.toString();
         int z= Integer.parseInt(x);
         System.out.println(z+1);
         file_reader.close();
        }catch (FileNotFoundException e) {
            e.getStackTrace();
        }catch(IOException e){
            e.getStackTrace();
        }
	}

}

