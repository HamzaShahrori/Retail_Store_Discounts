package Products;

public class Product {
    private int id;
    private String nameProduct;
    private String addToCart;
    private int price;
    private int discount;


    public Product(int id ,String nameProduct,String addToCart,int price,int discount) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.addToCart = addToCart;
        this.price = price;
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getAddToCart() {
        return addToCart;
    }

    public void setAddToCart(String addToCart) {
        this.addToCart = addToCart;
    }
}
