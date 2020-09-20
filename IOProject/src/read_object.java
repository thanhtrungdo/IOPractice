import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class read_object {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		ObjectInputStream oj = null;
		try {
			fis = new FileInputStream("nhanvien.bin");
			oj = new ObjectInputStream(fis);
			NhanVien[] nhanViens = (NhanVien[]) oj.readObject();
			for(NhanVien nv: nhanViens) {
				System.out.println(nv.toString());
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (oj != null) {
				oj.close();
			}
		}

	}

}
