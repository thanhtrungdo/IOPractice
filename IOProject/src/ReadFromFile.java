import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		try {
			fr = new FileReader("nhanvien.txt");
			int c;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr!=null) {
				fr.close();
			}
		}

	}

}
