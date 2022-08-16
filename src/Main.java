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
        List<Rented> rentedList=new ArrayList<Rented>();
        StringTokenizer token=null;
        String date_start;
        String date_finish;
        String kilometeters;
        String u_id;
        String licence;
        File file=new File("C:/Cursuri Siemens/Java/VehicleRentingApp/inchirieri.txt");
        Scanner scan=new Scanner(file);
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
        }



    }
}

