import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class write_object {

	public static void main(String[] args) throws IOException {
		NhanVien[] nhanVien = new NhanVien[3];
		nhanVien[0] = new NhanVien();
		nhanVien[0].input();
		nhanVien[1] = new NhanVien();
		nhanVien[1].input();
		nhanVien[2] = new NhanVien();
		nhanVien[2].input();
		FileOutputStream fos = null;
		ObjectOutputStream oj = null;
		File f = new File("nhanvien.bin");
		if (!f.exists()) {
			f.createNewFile();
		} else {
			System.out.println("File is existed");
		}
		try {
			fos = new FileOutputStream(f);
			oj = new ObjectOutputStream(fos);
			oj.writeObject(nhanVien);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (fos != null) {
				fos.close();
			}
			if (oj != null) {
				oj.close();
			}
		}
	}

}
