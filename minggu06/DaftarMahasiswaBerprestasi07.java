package minggu06;

public class DaftarMahasiswaBerprestasi07 {
    Mahasiswa07 ListMhs[] = new Mahasiswa07[5];
    int idx;

    void tambah(Mahasiswa07 m) {
        if (idx < ListMhs.length) {
            ListMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa07 m : ListMhs) {
            m.tampil();
            System.out.println("========================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < ListMhs.length - 1; i++) {
            for (int j = 1; j < ListMhs.length - i; j++) {
                if (ListMhs[j].ipk > ListMhs[j - 1].ipk) {

                    Mahasiswa07 tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j - 1];
                    ListMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < ListMhs.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < ListMhs.length; j++) {
                idxMin = j;
                if (ListMhs[j].ipk < ListMhs[idxMin].ipk) {
                }
            }

            Mahasiswa07 tmp = ListMhs[idxMin];
            ListMhs[idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }

    }

}
