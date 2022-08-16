import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Main {
    public static void cerinta(int expression, List<Vehicle> vehiclesList)
    {
        switch (expression) {
            case 1: //toate vehiculele
                break;
            case 2: //dupa brand
                Collections.sort(vehiclesList, new SortByBrand());
                break;
            case 3: //dupa manufactaring year Comparable
                Collections.sort(vehiclesList, new SortByYear());
                break;
            case 4: //cauta dupa tip
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        for(Vehicle v:vehiclesList)
        { v.print();
            System.out.print("\n");
        }
    }
    public static void main(String[] args) throws FileNotFoundException
    {          List<Vehicle> vehiclesList = new ArrayList<Vehicle>();
        List<Person> personList = new ArrayList<Person>();
        List<Rented> rentedList=new ArrayList<Rented>();
        StringTokenizer token=null;
        /*  String date_start;
        String date_finish;
        String kilometeters;
        String u_id;
        String licence;
        File file=new File("C:/Cursuri Siemens/Java/VehicleRentingApp/inchirieri.txt");
        Scanner scan=new Scanner(file);
        Inserare in baza de date din fisier
        while(scan.hasNextLine())
        { token=new StringTokenizer(scan.nextLine(),", ");
            date_start= token.nextToken();
            date_finish= token.nextToken();
            kilometeters=token.nextToken();
            u_id=token.nextToken();
            licence= token.nextToken();
            try{
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Mailo");
        Statement statement=connection.createStatement();
        statement.executeUpdate("insert into rented" +
                "(`date_start`,\n" +
                "`date_end`,\n" +
                "`kilometeters`,\n"  +"`FK_cnp`,\n" +"`FK_registration_number`"+ ")"+" "
                +"values ("+"'"+date_start+"'"+","+"'"+date_finish+"'"+","+"'"+kilometeters+"'"+", "+"'"+u_id+"','"+licence+"')");

    }catch (Exception e)
    {
        e.printStackTrace();
    }
        } */

        String registration_number;
        int manufacturing_year;
        String brand;
        String colour;
        String a;
        Vehicle.Category category;
        File file=new File("C:/Cursuri Siemens/Java/VehicleRentingApp/vehicles.txt");
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine())
        { token=new StringTokenizer(scan.nextLine(),", ");
            registration_number= token.nextToken();
            a=token.nextToken();
            category= Vehicle.Category.valueOf(a);
            brand=token.nextToken();
            manufacturing_year=Integer.parseInt(token.nextToken());
            colour=token.nextToken();
            Vehicle vehicle=new Vehicle(registration_number,category,brand,manufacturing_year,colour);
            vehiclesList.add(vehicle);
        }
        int expression=1;
        //view all vehicles
       // cerinta(1,vehiclesList);
        cerinta(3,vehiclesList);

    }
}

