public class Sorting {

    int [] data;
    int jumData;

    Sorting(int Data[], int jmlData) {
        jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 0; j < jumData - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    void tampil() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting dataurut1 = new Sorting(a, a.length);

        System.out.println("Data awal");
        dataurut1.tampil();

        dataurut1.bubbleSort();

        System.out.println("Data setelah diurutkan dengan bubble sort");
        dataurut1.tampil();
    }
}