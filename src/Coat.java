public class Coat extends Clothes{
    String style;

    public Coat(String brand, String color, int price, String style) {
        super(brand, color, price);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public void print() {
        System.out.println("Coat Color: " + getColor() + " Price: " + getPrice() + " Brand:  " + getBrand() + " Style: " + getStyle());

    }
}
