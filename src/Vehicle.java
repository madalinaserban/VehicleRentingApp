interface VehicleRequirementsInterface {
 public boolean manufacturingYearIsValid();
 public boolean registration_numberIsValid();
}

public class Vehicle implements  VehicleRequirementsInterface
{
 String registration_number;
 int manufacturing_year;
 String brand;
 String colour;
 enum type {HATCHBACK,
  SEDAN,
  SUV}


 @Override
 public boolean manufacturingYearIsValid() {
  return false;
 }

 @Override
 public boolean registration_numberIsValid() { //regex
  return false;
 }

 public String getRegistration_number() {
  return registration_number;
 }

 public int getManufacturing_year() {
  return manufacturing_year;
 }

 public String getBrand() {
  return brand;
 }

 public String getColour() {
  return colour;
 }

 public Vehicle(String registration_number, int manufacturing_year, String brand, String colour) {
  this.registration_number = registration_number;
  this.manufacturing_year = manufacturing_year;
  this.brand = brand;
  this.colour = colour;
 }

 public void setRegistration_number(String registration_number) {
  this.registration_number = registration_number;
 }

 public void setManufacturing_year(int manufacturing_year) {
  this.manufacturing_year = manufacturing_year;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public void setColour(String colour) {
  this.colour = colour;
 }
}
