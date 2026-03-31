public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas; 
    double ipk;

    // Konstruktor
    Mahasiswa03(){
    }
    //Konstruktor dengan parameter
    Mahasiswa03(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
