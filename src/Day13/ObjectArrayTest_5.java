package Day13;

class Book{
    private String bookName;
    private String author;

    public Book(){}
    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(bookName+","+author);
    }
}

public class ObjectArrayTest_5 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        String[] booknameList = {"태백산맥","데미안","어떻게 살 것인가", "토지","어린왕자"};
        String[] authorList = {"조정래","헤르맨 헤세","유시민","박경리","생텍쥐페리"};

        for (int i = 0;i<library.length;i++){
            library[i] = new Book(booknameList[i],authorList[i]);
            library[i].showBookInfo();
        }
    }
}
