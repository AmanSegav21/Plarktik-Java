// Main.java
public class main {
    public static void main(String[] args) {
        // Buat objek dari setiap kelas untuk menjalankan deklarasi
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        ArrayDeclaration arrayDeclaration = new ArrayDeclaration();
        LinkedListDeclaration linkedListDeclaration = new LinkedListDeclaration();

        // Panggil metode untuk menampilkan deklarasi
        variableDeclaration.displayVariables();
        arrayDeclaration.displayArrays();
        linkedListDeclaration.displayLinkedList();
    }
}
