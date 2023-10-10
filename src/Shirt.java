public class Shirt extends Clothes{
    private String material;

    public Shirt(String brand, String color, int price, String material) {
        super(brand, color, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void print() {
        System.out.println("Shirt  Material: " + getMaterial() + " Color: " + getColor() + " Price: " + getPrice() + " Brand: " + getBrand());

    }
}
