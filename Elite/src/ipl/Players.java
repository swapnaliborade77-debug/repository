package ipl;

public class Players {

    private String name;
    private Double bid;

    public Players(String name, Double bid) {
        this.name = name;
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public Double getBid() {
        return bid;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Bid: " + bid + " CR";
    }
}