import java.util.Comparator;

public class SortByBrand implements Comparator<Vehicle> {
    public int compare(Vehicle a, Vehicle b)
    {

        return a.brand.compareTo(b.brand);
    }
}

