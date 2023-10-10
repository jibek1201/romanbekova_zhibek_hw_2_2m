public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {createObject("Jean"), createObject("Shirt"), createObject("Coat")};
        for (Clothes printable : clothes) {
            printable.print();

        }
    }

    public static Clothes createObject(String className) {
        Clothes clothes = null;
        switch (className) {
            case "Jean":
//                
                clothes = new Jeans("Zara","white",1500,"Small");
                break;
            case "Shirt":
                clothes = new Shirt("Mango","black",2000,"cotton");
                break;
            case "Coat":
                clothes = new Coat("Oysho","blue",5000,"street");
                break;
        }
        return clothes;
    }
}