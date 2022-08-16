import java.util.Comparator;
public class SortByYear implements Comparator<Vehicle> {
        public int compare(Vehicle a, Vehicle b)
        {

            return a.manufacturing_year-b.manufacturing_year;
        }
    }
