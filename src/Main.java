import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException
    {          List<Vehicle> vehiclesList = new ArrayList<Vehicle>();
        List<Person> personList = new ArrayList<Person>();
        StringTokenizer token=null;
        String personal_identification_number;
        String first_name;
        String last_name;
        String date_of_birth;
        String gender;
        int emited_year_of_driving_license;
        File file=new File("C:/Cursuri Siemens/Java/VehicleRentingApp/persoane.txt");
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine())
        { token=new StringTokenizer(scan.nextLine(),", ");
            personal_identification_number= token.nextToken();
            last_name= token.nextToken();
            first_name=token.nextToken();
            gender=token.nextToken();
            emited_year_of_driving_license=Integer.parseInt(token.nextToken());


            try{
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Mailo");
        Statement statement=connection.createStatement();
        statement.executeUpdate("insert into clients" + "(`personal_identification_number`,\n" +
                "`last_name`,\n"+
                "`first_name`,\n" +
                "`gender`,\n" +
                "`emited_year_of_driving_license`)"+" "+"values ("+"'"+personal_identification_number+"'"+","+"'"+last_name+"'"+", "+"'"+first_name+"'"+", "+"'"+gender+"',"+emited_year_of_driving_license+")");

    }catch (Exception e)
    {
        e.printStackTrace();
    }
        }



    }
}

