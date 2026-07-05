package Library;

public class Book {

    private String title;
    private Member mbr;

    public Book(String title) {
        this.title = title;
    }

    public void status() {
        if (mbr == null)
            System.out.println(title + " not issued to any member");
        else
            System.out.println(title + " is issued to " + mbr);
    }

    // ISSUE BOOK (controlled from Book side)
    public void issueBook(Member m) {

        if (mbr != null) {
            System.out.println(title + " is already issued.");
            return;
        }

        if (m.getBk() != null) {
            System.out.println(m + " already has a book.");
            return;
        }

        this.mbr = m;
        m.setBk(this);

        System.out.println(m + " issued " + this);
    }

    // RETURN BOOK
    public void returnBook() {

        if (mbr == null) {
            System.out.println(title + " is not issued.");
            return;
        }

        System.out.println(mbr + " returned " + this);

        mbr.setBk(null);
        this.mbr = null;
    }

    public Member getMember() {
        return mbr;
    }

    public void setMember(Member mbr) {
        this.mbr = mbr;
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + "]";
    }
}