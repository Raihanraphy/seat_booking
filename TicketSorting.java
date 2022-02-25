/* This project shows, how we usually confirms a seat online 
 via this type of codes  */


import java.util.Scanner;

public class TicketSorting {
  public static void main(String[]args){
    String Y=" ";
    Scanner sc=new Scanner(System.in);
    Calculation g= new Calculation();
    g.TotalTicket(); //number of tockets That we have 
    System.out.println("which row?, sir");
    int row=sc.nextInt();
    System.out.println("which column?, sir");             
    int column=sc.nextInt();
    g.seatbooking(row,column);//turn arr value 1 to 2
    System.out.println("Usually Price for First 5 row's, it's 600 Tk");
    System.out.println(" Others 500 Tk");
    System.out.println("*type yes to confirm your searched seat");
    Y=sc.next();
    if (Y.equals("yes")){
      g.print(row,column); // As for The normal case we though arr[i][j]==0 but as reserved it will make it as 2. so other's can not reserve again
      g.doubleCheck(row,column); // #Checks For reserve
      g.seatsNow();
      //seats avaliabele
      sc.close();
     }
  
  }}
      
  
    
        
        
        
