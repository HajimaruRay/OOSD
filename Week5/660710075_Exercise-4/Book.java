public class Book
{
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }
    
    private void setTitle(String title)throws IllegalArgumentException{
        if (title.length()<3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }
    
    private void setAuthor(String auther)throws IllegalArgumentException{
        int space = author.indexOf(" ");
        String firstName = author.substring(0, space).trim();
        String lastName = author.substring(space+1).trim();
        if (Character.isDigit(lastName.charAt(0))){
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }
    
    private void setPrice(double price)throws IllegalArgumentException{
        if (price < 1.0){
            throw new IllegalArgumentException("Price not valid!");
        }
    }
}
