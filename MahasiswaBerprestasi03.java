public class MahasiswaBerprestasi03 {
    Mahasiswa03 [] lisMhs = new Mahasiswa03[5];
    int idx;

    void tambah(Mahasiswa03 m){
        if(idx < lisMhs.length){
            lisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(Mahasiswa03 m : lisMhs){
            m.tampil();
            System.out.println("-------------------");
        }
    }

    void bublesort(){
        for(int i = 0; i < lisMhs.length - 1; i++){
            for(int j = 0; j < lisMhs.length - 1 - i; j++){
                if(lisMhs[j].ipk < lisMhs[j + 1].ipk){
                    Mahasiswa03 tmp = lisMhs[j];
                    lisMhs[j] = lisMhs[j + 1];
                    lisMhs[j + 1] = tmp;
                }
            }
        }
    }
}

