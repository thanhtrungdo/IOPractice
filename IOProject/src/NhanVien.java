import java.io.Serializable;
import java.util.Scanner;

public class NhanVien implements Serializable {
	private String maNV;
	private String hoTen;
	private int tuoi;
	private float luong;
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String hoTen, int tuoi, float luong) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.luong = luong;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public float getLuong() {
		return luong;
	}
	public void setLuong(float luong) {
		this.luong = luong;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", luong=" + luong + "]";
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma nhan vien: ");
		this.maNV=sc.nextLine();
		System.out.println("Ho va ten: ");
		this.hoTen=sc.nextLine();
		System.out.println("Tuoi: ");
		this.tuoi=sc.nextInt();
		System.out.println("Luong: ");
		this.luong=sc.nextFloat();
	}

}
