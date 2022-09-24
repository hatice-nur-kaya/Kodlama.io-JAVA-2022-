public class classesWithAttributes {
    public static void main(String[] args) {
        Product product =new Product();
        product.setName("Laptop");
        product.setId(1);;
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.getKod();
        System.out.println(product.getName());
        System.out.println(product.getKod());

        ProductManager productManager =new ProductManager();
        productManager.Add(product);
        productManager.Add2(2, "Bardak", "Çay Bardağı", 2, 200);
    }
}
