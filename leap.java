class Leap_year{
public static void main(String[]args){
int num=2004;
if(num%4==0 && num%100!=0 || num%400==0){
System.out.println("Leap Year");
}
else{
System.out.println("not a Leap Year");
}
}
}