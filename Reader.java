public class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String phoneNumber;
    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth=dateOfBirth;
        this.phoneNumber=phoneNumber;
    }
    public void takeBook(int BooksNumber) {
        System.out.println(fullName + " aldy " + BooksNumber + " kitepti.");
    }
    public  void returnBook(int BooksNumber) {
        System.out.println(fullName + " kaitardy " + BooksNumber + " kitept.");
    }

}
