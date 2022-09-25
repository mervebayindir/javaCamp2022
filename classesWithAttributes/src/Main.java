public class Main {

    public static void main(String[] args) {
	    Product product = new Product();
        product.name = "shoe";
        product.id = 123;
        product.description = "orthopaedic";
        product.price = 550;
        product.stockAmount = 6;


        ProductManager productManager = new ProductManager();
        productManager.add(product);


        System.out.println(product);

    }
}
