import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop("Emag", "logo.jpg", new ArrayList<>());

        Product laptop = new Product("Laptop", 3200.5, 1, 1, 1123, "");
        Product fridge = new Product("Fridge", 207.95, 1, 2, 1245, "");

        Product copyLaptop = new Product(laptop);
        copyLaptop.setQuantity(5);
        copyLaptop.setName("Bread");

        shop.add(laptop);
        shop.add(fridge);

        shop.remove(laptop);
        System.out.println(laptop.equals(fridge));
    }
}

class OnlineShop {
    private String name;
    private String logoUrl;
    private ArrayList<Product> products;

    OnlineShop(String name, String logoUrl, ArrayList<Product> products) {
        this.name = name;
        this.logoUrl = logoUrl;
        this.products = new ArrayList<>(products);
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void remove(Product product) {
        this.products.remove(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}

class Product {
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int quantity;
    private String expiry;
    private String details;

    public Product(String name, double price, int type, int category, int id, String expiry) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.id = id;
        this.expiry = expiry;
    }

    public Product(Product product) {
        this.name = product.name;
        this.price = product.price;
        this.type = product.type;
        this.category = product.category;
        this.id = product.id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return id == other.id && Double.compare(other.price, price) == 0 && type == other.type && category == other.category && name.equals(other.name);
    }

    public void adjustPriceByPercentage(boolean increase, int percentage) {
        double percentageValue = percentage / 100.0;
        if (increase) {
            price += price * percentageValue;
        } else {
            price -= price * percentageValue;
        }
    }

    public void adjustPriceByAmount(double amount) {
        price += amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}


//CONTINUARE SEM 2 public class Main {
    //Dependency Inversion Principle

    //OLD CODE
//    public class Car {
//        private Engine engine;
//        public Car(Engine e) {
//            engine = e;
//        }
//        public void start() {
//            engine.start();
//        }
//    }
//    public class Engine {
//        public void start() {
//        }
//    }

    //NEW CODE
//    public interface Engine {
//        public void start();
//    }
//
//    public class Car {
//        private Engine engine;
//        public Car(Engine e) {
//            engine = e;
//        }
//        public void start() {
//            engine.start();
//        }
//    }
//    public class PetrolEngine implements Engine {
//        public void start() {
//        }
//    }
//
//    public class DieselEngine implements Engine {
//        public void start() {
//        }
//    }
//
//    interface Engine {
//        void start();
//    }
//
//    class CarEngine implements Engine {
//        public void start() {
//        }
//    }
//
//    class Car {
//        private final Engine engine;
//
//        public Car(Engine engine) {
//            this.engine = engine;
//        }
//
//        public void start() {
//            engine.start();
//        }
//    }




