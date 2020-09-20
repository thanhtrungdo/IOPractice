import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		List <NhanVien> NVs= new ArrayList<NhanVien>();
		NhanVien nv2 = new NhanVien();
		nv2.input();
		NVs.add(nv2);
		NhanVien nv3 = new NhanVien();
		nv3.input();
		NVs.add(nv3);
		NhanVien nv4 = new NhanVien();
		nv4.input();
		NVs.add(nv4);
		File f= new File("nhanvien.txt");
		if(!f.exists()) {
			f.createNewFile();
		}else {
			System.out.println("File is existed");
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			for(NhanVien nv:NVs) {
				fw.write(nv.toString()+"\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			if(fw!=null) {
				fw.close();
			}
		}
	}

}
