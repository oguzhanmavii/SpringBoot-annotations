package oguzhan.mavi.RequestMappingannotations.entity;

public class Phone {
    private int id;
    private String model;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone(int id, String model, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }
}
