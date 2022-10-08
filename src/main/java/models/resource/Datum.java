package models.resource;

public class Datum {
    public int id;
    public String name;
    public int year;
    public String color;
    public String pantone_value;

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", pantone_value='" + pantone_value + '\'' +
                '}';
    }
}
