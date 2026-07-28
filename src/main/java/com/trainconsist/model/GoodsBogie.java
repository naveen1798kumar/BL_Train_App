package main.java.com.trainconsist.model;

public class GoodsBogie {

    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Goods Bogie : " + type +
                "\nCargo : " + cargo;
    }
}