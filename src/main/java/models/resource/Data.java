package models.resource;

public class Data {
    public int id;
    public String name;
    public int year;
    public String color;
    public String pantone_value;

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", pantone_value='" + pantone_value + '\'' +
                '}';
    }
}
