public class MahasiswaDemo03 {
    public static void main(String[] args) {
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        Mahasiswa03 m1 = new Mahasiswa03("123", "Zidan", "2A", 3.2);
        Mahasiswa03 m2 = new Mahasiswa03("124", "Ayu", "2A", 3.5);
        Mahasiswa03 m3 = new Mahasiswa03("125", "Sofi", "2A", 3.1);
        Mahasiswa03 m4 = new Mahasiswa03("126", "Sita", "2A", 3.9);
        Mahasiswa03 m5 = new Mahasiswa03("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        list.bubbleSort();
        list.tampil();
    }
}

class Mahasiswa03 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa03(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
}

class MahasiswaBerprestasi03 {
    Mahasiswa03[] list = new Mahasiswa03[10];
    int idx = 0;

    void tambah(Mahasiswa03 m) {
        if (idx < list.length) {
            list[idx] = m;
            idx++;
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Nama: " + list[i].nama);
            System.out.println("NIM: " + list[i].nim);
            System.out.println("IPK: " + list[i].ipk);
            System.out.println("Kelas: " + list[i].kelas);
            System.out.println("----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (list[j].ipk < list[j + 1].ipk) { // DESC
                    Mahasiswa03 tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }
}