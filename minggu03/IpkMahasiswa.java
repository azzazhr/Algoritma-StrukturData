package minggu03;

public class IpkMahasiswa {
    public String namaMhs, jenisKelamin;
    public int nim;
    public double ipk;

    void tampilInformasi() {
        System.out.println("Nama: " + namaMhs);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
}
