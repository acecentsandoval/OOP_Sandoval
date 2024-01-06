import java.util.Scanner;

class BloodData {
  private String bloodType;
  private String rhFactor;
  
  public BloodData() {
    bloodType = "O"; 
    rhFactor = "+";
  }
  
  public BloodData(String bt, String rh) {
    bloodType = bt;
    rhFactor = rh;
  }
  
  public void display() {
    System.out.println(bloodType + rhFactor + " is added to the blood bank."); 
  }
}

public class RunBloodData {

  public static void main(String[] args) {
    boolean running = true;
    
    Scanner sc = new Scanner(System.in); 
    while(true){
    System.out.print("Enter blood type of patient: ");
    String input1 = sc.nextLine();
    
    System.out.print("Enter the Rhesus factor (+ or -): "); 
    String input2 = sc.nextLine();
    
    BloodData bd;
    
    if(input1.equals("") || input2.equals("")) {
      bd = new BloodData(); 
    } else {
      bd = new BloodData(input1, input2);
    }
    
    bd.display();

    if(input1.equalsIgnoreCase("exit") ) {
      System.out.println("Exit...");
      System.exit(0);
    }else if (input2.equalsIgnoreCase("exit")){
        System.out.println("Exit...");
        System.exit(0);
    }else{
      System.out.println("");
    }
  }
  }
}
