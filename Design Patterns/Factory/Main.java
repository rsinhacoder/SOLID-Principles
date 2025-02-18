// Product interface
interface Product {
    void use();
}

// Concrete products
class ProductA implements Product {
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}

class ProductB implements Product {
    @Override
    public void use() {
        System.out.println("Using Product B");
    }
}

// Factory class
class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else if (type.equals("B")) {
            return new ProductB();
        }
        throw new IllegalArgumentException("Unknown product type");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        productA.use(); // Output: Using Product A

        Product productB = ProductFactory.createProduct("B");
        productB.use(); // Output: Using Product B
    }
}