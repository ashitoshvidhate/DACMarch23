import java.util.*;
import java.io.*;
class Book{
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    double price;
    int quantity;

    Book(){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.isbn=isbn;
        this.year=year;
        this.price=price;
        this.quantity=quantity;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getPublisher(){
        return this.publisher;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getIsbn(){
        return this.isbn;
    }

    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }

    public void increaseQuantity(int quantity){
        this.quantity=this.quantity+quantity;
        System.out.println("Updated Quantity ="+this.quantity);
    }

    public void decreaseQuantity(int quantity){
        this.quantity=this.quantity-quantity;
        System.out.println("Updated Quantity ="+this.quantity);
    }

    public void getInventoryValue(){
        double cal = this.price*this.quantity;
        System.out.println("Inventory Price ="+cal);
    }
}
public class Program {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book bk=new Book();
        char ch;
        do{
        System.out.println("enter 1.Add Book Data 2.Increase Book quantity 3.Decrease the book quantity 4.GetInventory Value 5.Print Data");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter Book title");
                sc.nextLine();
                bk.setTitle(sc.nextLine());
                
                System.out.println("Enter Book Author :");
                bk.setAuthor(sc.nextLine());
                System.out.println("Enter Book Publisher : ");
                bk.setPublisher(sc.nextLine());
                System.out.println("Enter Book ISBN :");
                bk.setIsbn(sc.nextLine());
                System.out.println("Enter Book year");
                bk.setYear(sc.nextInt());
                System.out.println("Enter Book Price :");
                bk.setPrice(sc.nextDouble());
                System.out.println("Enter Book quantity :");
                bk.setQuantity(sc.nextInt());
                break;
            case 2:
                System.out.println("Enter quantity :");
                bk.increaseQuantity(sc.nextInt());
                break;
            case 3:
                 System.out.println("Enter quantity :");
                bk.decreaseQuantity(sc.nextInt());
                break;
            case 4:
                bk.getInventoryValue();
                break;
            case 5:
                System.out.println(bk.getTitle()+" "+bk.getAuthor()+" "+bk.getPublisher()+" "+bk.getIsbn()+" "+bk.getYear()+" "+bk.getPrice()+" "+bk.getQuantity());
                break;

        }
        System.out.println("Do you want to continue Y=yes or n=no:");
        ch=sc.next().charAt(0);
        }while(ch=='Y' || ch=='y');
    }

}
