public class GoldenEditionBook extends Book
{
   public GoldenEditionBook(String title, String author, double price){
       super(title,author,price);
   }
   
   public double getPrice(){
       return this.price;
   }
}
