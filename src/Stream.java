import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Stream {

	public static void main(String[] args) throws IOException {
		
		InputStream dis = new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		BufferedReader bis = new BufferedReader(read);
		System.out.println("Mark supported read: " + read.markSupported());
		System.out.println("Mark supported dis: " + dis.markSupported());
		String line = "";
		try {
			
			while( (line = bis.readLine()) != null){
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
					      FileOutputStream(FileDescriptor.out), "ASCII"), 512);
					    out.write(line);
					    out.write('\n');
					    out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}	 
	

}
