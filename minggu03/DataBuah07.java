package minggu03;

public class DataBuah07 {
    public static void main(String[] args) {

        Buah[][] keranjangBuah = new Buah[2][3];
        keranjangBuah[0][0] = new Buah();
        keranjangBuah[0][0].nama = "Mangga";
        keranjangBuah[0][0].warna = "Kuning";
        keranjangBuah[0][1] = new Buah();
        keranjangBuah[0][1].nama = "Apel";
        keranjangBuah[0][1].warna = "Merah";
        keranjangBuah[1][0] = new Buah();
        keranjangBuah[1][0].nama = "Anggur";
        keranjangBuah[1][0].warna = "Hijau";
        keranjangBuah[1][1] = new Buah();
        keranjangBuah[1][1].nama = "Pisang";
        keranjangBuah[1][1].warna = "Kuning";

        System.out.println(keranjangBuah[0][0].nama + " memiliki warna " + keranjangBuah[0][0].warna);
        System.out.println(keranjangBuah[0][1].nama + " memiliki warna " + keranjangBuah[0][1].warna);
        System.out.println(keranjangBuah[1][0].nama + " memiliki warna " + keranjangBuah[1][0].warna);
        System.out.println(keranjangBuah[1][1].nama + " memiliki warna " + keranjangBuah[1][1].warna);

    }
}
