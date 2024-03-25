package minggu06;

public class HotelService07 {
    Hotel07 listhotel[] = new Hotel07[3];
    int idx;

    void tambah(Hotel07 r) {
        if (idx < listhotel.length) {
            listhotel[idx] = r;
            idx++;
        } else {
            System.out.println("Kamar sudah penuh!");
        }
    }

    void tampil() {
        for (Hotel07 h : listhotel) {
            h.tampil();
            System.out.println("========================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listhotel.length - 1; i++) {
            for (int j = 1; j < listhotel.length - i; j++) {
                if (listhotel[j].harga < listhotel[j - 1].harga) {
                    Hotel07 tmp = listhotel[j];
                    listhotel[j] = listhotel[j - 1];
                    listhotel[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listhotel.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listhotel.length; j++) {
                if (listhotel[j].bintang > listhotel[idxMin].bintang) {
                    idxMin = j;
                }
            }

            Hotel07 tmp = listhotel[idxMin];
            listhotel[idxMin] = listhotel[i];
            listhotel[i] = tmp;
        }
    }
}
