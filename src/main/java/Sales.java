


//Author Ayanda Phumzile Khoza 218057172

public class Sales {


    String name;
    int numberOfItems;
    double totalCost;
    boolean decline;

    public Sales(String ps, String s, String s1, String yes) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isDecline() {
        return decline;
    }

    public void setDecline(boolean decline) {
        this.decline = decline;
    }


    public Sales(String name, int numberOfItems, double totalCost, boolean decline) {
        this.name = name;
        this.numberOfItems = numberOfItems;
        this.totalCost = totalCost;
        this.decline = decline;

    }

    @Override
    public String toString() {
        return "Sales{" +
                "name='" + name + '\'' +
                ", numberOfItems=" + numberOfItems +
                ", totalCost=" + totalCost +
                ", decline=" + decline +
                '}';
    }

    public Object getTotalPrice() {

        return null;
    }
}


