public class Array2D {
    static int[][] arr = new int[2][2];
    static int size = 0;

    public static void insert(int row, int col, int element) {
        if (row < 0 || row > 1 || col < 0 || col > 1) {
            System.out.println("Invalid index");
            return;
        }

        if (arr[row][col] != 0) {
            System.out.println("Cell already occupied");
            return;
        }

        if (size == 4) {
            System.out.println("Array full");
            return;
        }

        arr[row][col] = element;
        size++;
    }

    public static void delete(int row, int col) {
        if (row < 0 || row > 1 || col < 0 || col > 1) {
            System.out.println("Invalid index");
            return;
        }

        if (arr[row][col] == 0) {
            System.out.println("Cell already empty");
            return;
        }

        arr[row][col] = 0;
        size--;
    }

    public static void traverse() {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void search(int element) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == element) {
                    System.out.println("Element found at index " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        insert(0, 0, 1);
        insert(0, 1, 2);
        insert(1, 0, 3);
        insert(1, 1, 4);

        traverse();
        System.out.println();

        delete(0, 0);
        traverse();
        System.out.println();

        search(2);
        search(5);
    }
}