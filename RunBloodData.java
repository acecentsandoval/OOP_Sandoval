import java.util.Scanner;
class BloodData {
 private static String bloodType;
 private static String rhFactor;
 public BloodData() {
  bloodType="O";
  rhFactor="+";
 }
 public BloodData(String bt, String rh) {
  bloodType = bt;
  rhFactor = rh;
 }

 public void display() {
  System.out.println(bloodType+rhFactor+" is added to the blood bank."); //prints message
 }
}

public class RunBloodData {

 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in); //create Scanner instance
  
  System.out.print("Enter blood type of patient: ");
  String input1=sc.nextLine(); //accept input from user
  
  System.out.print("Enter the Rhesus factor (+ or -): ");
  String input2=sc.nextLine(); //accept input from user
  
  BloodData bd; //create instance
  
  if("".equals(input1) || "".equals(input2)) //if any of inputs is blank
   bd=new BloodData(); //allocates memory using default constructor
  
  else     //if valid inputs
   bd=new BloodData(input1,input2); //allocates memory using parameterized constructor
  
  bd.display(); //invokes display method
 }
}