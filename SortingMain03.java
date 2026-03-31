public class SortingMain03 {

    static class Sorting {
        int data[];
        int jumlahData;

        Sorting(int data[], int jumlahData) {
            this.data = data;
            this.jumlahData = jumlahData;
        }

        void tampil() {
            for (int i = 0; i < jumlahData; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void selectionSort() {
            for (int i = 0; i < jumlahData - 1; i++) {
                int min = i;
                for (int j = i + 1; j < jumlahData; j++) {
                    if (data[j] < data[min]) {
                        min = j;
                    }
                }
                int temp = data[i];
                data[i] = data[min];
                data[min] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int b[] = {30, 20, 2, 8, 14};

        Sorting dataurut1 = new Sorting(b, b.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();

        dataurut1.selectionSort();

        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}