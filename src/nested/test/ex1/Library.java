package nested.test.ex1;

public class Library {

    private int bookCount;
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {

        if (!canAddBooks()) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    private boolean canAddBooks() {
        if (bookCount >= books.length) {
            return false;
        }
        return true;
    }

    private static class Book {
        private String title;
        private String author;

        private Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
