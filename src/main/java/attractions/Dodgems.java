package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double defaultPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 4.50;
    }

    @Override
    public double defaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12) {
            return this.defaultPrice / 2;
        } else {
            return this.defaultPrice;
        }
    }
}
