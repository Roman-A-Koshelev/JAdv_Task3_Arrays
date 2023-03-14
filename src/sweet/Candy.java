package sweet;

public class Candy extends Sweet {
    private boolean isChocolate;

    public Candy(String name, double weight, double price, boolean isChocolate) {
        super(name, weight, (isChocolate ? 1.5 : 1.0) * price);
        this.isChocolate = isChocolate;
    }

    public boolean isChocolate() {
        return isChocolate;
    }

    public void setChocolate(boolean chocolate) {
        isChocolate = chocolate;
        setPrice((isChocolate ? 1.5 : 1.0) * getPrice());
    }

    @Override
    public String toString() {
        return (isChocolate ? "Шоколадная конфета ": "Конфета ") + super.toString();
    }
}
