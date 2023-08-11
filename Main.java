public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Petrov V.V", 177876, "Applied Math & Informatics", "17.07.2003", "0702702170");
        reader.takeBook(3);
        reader.returnBook(3);
    }
}
