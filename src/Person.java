interface PersonRequirementsInterface {
    public boolean isOver18();
    public boolean licenseIsValid();
}

public class Person implements PersonRequirementsInterface {
   String personal_identification_number;
    String first_name;
    String last_name;
    String date_of_birth;
    String gender; //f sau m
    int emited_year_of_driving_license;

    public Person(String personal_identification_number, String first_name, String last_name, String date_of_birth, String gender, short emited_year_of_driving_license) {
        this.personal_identification_number = personal_identification_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.emited_year_of_driving_license = emited_year_of_driving_license;
    }

    //setters

    public void setPersonal_identification_number(String personal_identification_number) {
        this.personal_identification_number = personal_identification_number;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmited_year_of_driving_license(short emited_year_of_driving_license) {
        this.emited_year_of_driving_license = emited_year_of_driving_license;
    }

    //getters
    public String getPersonal_identification_number() {
        return personal_identification_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public int getEmited_year_of_driving_license() {
        return emited_year_of_driving_license;
    }

    @Override
    public boolean isOver18() {
        return false;
    }

    @Override
    public boolean licenseIsValid() {
        return false;
    }
}

