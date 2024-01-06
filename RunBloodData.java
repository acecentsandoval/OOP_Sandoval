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
  System.out.println(bloodType+rhFactor+" is added to the blood bank."); 
 }
}

public class RunBloodData {

 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in); 
  
  System.out.print("Enter blood type of patient: ");
  String input1=sc.nextLine(); 
  
  System.out.print("Enter the Rhesus factor (+ or -): ");
  String input2=sc.nextLine();
  
  BloodData bd; 
  
  if("".equals(input1) || "".equals(input2)) 
   bd=new BloodData(); 
  
  else    
   bd=new BloodData(input1,input2); 
  
  bd.display(); 
 }
}
