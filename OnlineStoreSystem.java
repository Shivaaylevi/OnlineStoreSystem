interface Discountable{
    public double getDiscount();
}
class Product implements Discountable{
    String name;
    double price;
    String category;
    int stock_quantity;
    public Product(String name,double price,String category,int stock_quantity){
        this.name=name;
        this.price=price;
        this.category=category;
        this.stock_quantity=stock_quantity;
    }
    public void displayProduct(){
        System.out.println("name: "+name);
        System.out.println("price: "+price);
        System.out.println("category: "+category);
        System.out.println("stock_quantity: "+stock_quantity);
        if(stock_quantity>0){
            System.out.println(name+" of "+category+" is in stock");
        }else{
            System.out.println(name+" of "+category+" is out of stock");
        }
    }
    public double getDiscount(){
        return 0.05;
    }
    double getPriceAfterDiscount(){
        return price -(price*getDiscount());
    }
}
class Electronics extends Product{
    int warranty_period;
    String brand;
    Electronics(String name,int price,String category,int stock_quantity,int warranty_period,String brand){
        super(name, price, category, stock_quantity);
        this.warranty_period=warranty_period;
        this.brand=brand;
    }
    public void displayProduct(){
        super.displayProduct();
        System.out.println("warranty period till "+warranty_period);
        System.out.println("product is of brand "+warranty_period);

    }
    public double getDiscount(){
        return 0.25;
    }
}
class Clothing extends Product{
    String size;
    String color;
    Clothing(String name,int price,String category,int stock_quantity,String size,String color){
        super(name,price,category,stock_quantity);
        this.size=size;
        thos.color=color;
    }
    public void displayProduct(){
        super.displayProduct();
        System.out.println("size is "+size);
        System.out.println("color: "+color);
    }
    public double getDiscount(){
        return 0.54;
    }
}

class ShoppingCart{

}

class OnlineStoreSystem{
    public static void main(String[] args) {
        
    }
}