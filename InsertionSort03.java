public class InsertionSort03 {
    static class Sorting{

        void insertionSort(int data[], int jumlahData) {
            for (int i = 1; i < jumlahData; i++) {
                int key = data[i];
                int j = i - 1;
                while (j >= 0 && data[j] > key) {
                    data[j + 1] = data[j];
                    j--;
                }
                data[j + 1] = key;
            }
        }

        void tampil(int data[], int jumlahData) {
            for (int i = 0; i < jumlahData; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    int c[] = {40, 10, 4, 9, 3};

    Sorting dataurut3 = new Sorting();

    System.out.println("Data awal 3");
    dataurut3.tampil(c, c.length);
    dataurut3.insertionSort(c, c.length);
    System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
    dataurut3.tampil(c, c.length);
    }
}
