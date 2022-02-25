import java.util.Scanner;
class Calculation {
  Scanner sc=new Scanner(System.in);
  int sum=0;
  int a=0;
  static int[][]arr=new int[30][40];
   void TotalTicket(){
    for(int i=0;i<30;i++){
      for(int j=0;j<30;j++){
        arr[i][j]=1;
        this.sum+=arr[i][j];
      }
      }
    System.out.println("Total Number of seats "+sum);
    System.out.println("number of rows avaliable is 30");
    System.out.println("Number of columns avaliable is 30");
      
   System.out.println("To procced type yes");
   String Decison=sc.nextLine();
   if (Decison.equals("yes")){
     System.out.println("We are processing");}
   else
     System.out.println("Thanks for checking");
   
   }

void seatbooking(int m,int n){
  boolean a=false;
    for(int i=0;i<30;i++){
      for(int j=0;j<30;j++){
        if (m==i && n==j){
        if (arr[m][n]==1){
          a=true;
          break;}}
        
      }
      }
        if(a==true)
           System.out.println("Seat is avaliable");
}
int print(int m,int n){
  
  System.out.println(" you are seat's been confirmed");
  a+=1;
return arr[m][n];
}
void doubleCheck(int m,int n){
  if (arr[m][n]==2);
  System.out.println("........Double checked as well");}
void seatsNow(){
     int sum=900-a;
     System.out.println("Now seat remains " +sum);}
}