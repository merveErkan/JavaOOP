class Customer{
    String name;
    String surname;
    String eposta;
    public Customer(String name, String surname, String eposta){
        this.name = name;
        this.surname = surname;
        this.eposta = eposta;
    }
    public void CInformation(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("eposta: " + eposta);
    }
}
class Product{
    String name;
    int price;
    int stock;
    public Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public void PInformation(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}
public class CustomerAndProduct {
    public static void main(String[] args){
        Customer customer = new Customer("Merve", "Erkan", "mkfdjkmc");
        System.out.println("Sutomer of information:");
        customer.CInformation();
        Product product = new Product("clothes", 300, 2);
        System.out.println("\nProduct of information:");
        product.PInformation();
    }
}
