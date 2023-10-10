public class Jeans extends Clothes{
private String size;

    public Jeans(String brand, String color, int price, String size) {
        super(brand, color, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("Jeans Size: " + getSize() + "  Color: " + getColor()  + " Brand: " + getBrand() + " Price:  " + getPrice());

    }
}
