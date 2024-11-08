// ArrayDeclaration.java
public class ArrayDeclaration {
    int[] arraySatu = {12, 10, 40};
    int[][] arrayDua = {
        {12, 10, 40},
        {13, 11, 41},
        {14, 12, 42}
    };

    public void displayArrays() {
        System.out.print("Array Satu Dimensi: ");
        for (int i : arraySatu) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Array Dua Dimensi: ");
        for (int i = 0; i < arrayDua.length; i++) {
            for (int j = 0; j < arrayDua[i].length; j++) {
                System.out.print(arrayDua[i][j] + " ");
            }
            System.out.println();
        }
    }
}
