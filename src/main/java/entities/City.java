package entities;

public class City {
    private String name;
    private Distance distance;

/*
    public City() {
    }

    public City(String name, Distance distance) {
        this.name = name;
        this.distance = distance;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
