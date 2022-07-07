package pl.mprzybysz.testing;

public class Meal {

    private int price;
    private String name;

    public Meal(int price) {
        this.price = price;
    }

    public Meal(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountedPrice(int discount){
        return this.price - discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meal)) return false;

        Meal meal = (Meal) o;

        if (getPrice() != meal.getPrice()) return false;
        return name != null ? name.equals(meal.name) : meal.name == null;
    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
