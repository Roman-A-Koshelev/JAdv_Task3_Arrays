package sweet;

public class Jellybean extends Sweet {
    private int color;

    /**
     * Конструктор мармеладки
     * @param name Наименование
     * @param weight Вес
     * @param price Цена
     * @param color Цвет. 0 - Зелёная, 1 - Жёлтая, 2 - Розовая
     */
    public Jellybean(String name, double weight, double price, int color) {
        super(name, weight, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    /**
     * Задаёт цвет мармеладки
     * @param color Цвет. 0 - Зелёная, 1 - Жёлтая, 2 - Розовая
     */
    public void setColor(int color) {
        if (color < 0 || 2 < color) {
            System.err.println("Цвет должен быть в интервале [0;2].");
            return;
        }

        this.color = color;
    }

    @Override
    public String toString() {
        return (0 == color ? "Зелёная" : (1 == color ? "Жёлтая" : "Розовая")) + " мармеладка " + super.toString();
    }
}
