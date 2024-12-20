package Items;

import Authors.*;
import java.util.Date;

public class Book extends LibraryItem {
    private boolean printed = false;
    private boolean electronic = false;
    private boolean audio= false;

    public Book(String title,String ISBN,String publisher,int numberOfCopies,Author author){
        super(title, ISBN, publisher, numberOfCopies, author);
    }
    public Book(String title,String ISBN,String publisher,int numberOfCopies,Author author, String type){
        super(title, ISBN, publisher, numberOfCopies, author);
            switch (type.toLowerCase()) {
                case "printed":
                    this.printed = true;
                    break;
                case "electronic":
                    this.electronic = true;
                    break;
                case "audio":
                    this.audio = true;
                    break;
                default:
                System.err.println("Invalid book type: Please enter a valid book type ('printed' or 'electronic' or 'audio')");
                    break;
            }
    }

    public void setInfo(String title,String ISBN,String publisher,int numberOfCopies,String authorFname, String authorLname, String address, Date dateOfBirth , String type){
        this.setTitle(title);
        this.setISBN(ISBN);
        this.setPublisher(publisher);
        this.setNumberOfCopies(numberOfCopies);
        this.setAuthor(authorFname, authorLname, address, dateOfBirth);
        this.setBookType(type);
    }

    public void setBookType(String type) {
        // Reset all the false first to make sure only one istrue at a time
        this.printed = false;
        this.electronic = false;
        this.audio = false;
        switch (type.toLowerCase()) {
            case "printed":
                this.printed = true;
                break;
            case "electronic":
                this.electronic = true;
                break;
            case "audio":
                this.audio = true;
                break;
            default:
            System.err.println("Invalid book type: Please enter a valid book type ('printed' or 'electronic' or 'audio')");
                break;
        }
    }

    public String getBookType(){
        if (this.printed == true){
            return "Printed";}
        else{
            if(this.electronic == true){
                return "Electronic";
            }
            else{
                if(this.audio == true){
                    return "Audio";
                }
                else return "Not Specified";
            }
        }
    }

    @Override
    public String toString() {
        return "Book Info {" +
            "ID=" + getID() +
            ", Title='" + getTitle() + '\'' +
            ", ISBN='" + getISBN() + '\'' +
            ", Publisher='" + getPublisher() + '\'' +
            ", NumberOfCopies=" + getNumberOfCopies() +
            ", Book Type=" + this.getBookType() +
            '}';
    }
  
}
