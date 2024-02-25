package models;

public class Product {

    private static int id;
    private static String name;
    private static String description;
    private static double price;
    private static int category_id;

    public Product(){

    }
    public Product(String name, String description,double price,int category_id){
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory_id(category_id);
    }

    public Product(int id,String name, String description,double price,int category_id){
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory_id(category_id);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Product.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Product.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Product.description = description;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Product.price = price;
    }

    public static int getCategory_id() {
        return category_id;
    }

    public static void setCategory_id(int category_id) {
        Product.category_id = category_id;
    }
}
