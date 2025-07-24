class Main{
public static void main(String[]args){
int cgpa=8;
int attendence=65;
boolean noBacklogs=true;
int maxbacklogs=2;
if (cgpa>=7 && attendence>=75 && noBacklogs==true){
System.out.println("Eligible");
}
else if (cgpa>=6.5 && attendence>=80 && maxbacklogs<=1){
System.out.println("Eligible for Tier-2 companies");
}
else {
System.out.println("Not Eligible");
}
}
}