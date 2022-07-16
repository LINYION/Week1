import java.util.Date;

public class BookLost extends Lost {
    private String BookName;        //书名
    private String BookAuthor;      //作者
    private String BookPress;       //出版社

    public BookLost() {
    }

    public BookLost(String BookNa, String BookAuth, String BookPre, Date LostDa, String LostSp, String GetSp) {
        BookName = BookNa;
        BookAuthor = BookAuth;
        BookPress = BookPre;
        LostName = "书";
        LostDate = LostDa;
        LostSpot = LostSp;
        GetSpot = GetSp;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public String getBookName() {
        return BookName;
    }

    public String getBookPress() {
        return BookPress;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setBookPress(String bookPress) {
        BookPress = bookPress;
    }
}
