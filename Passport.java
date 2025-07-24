class Main{
public static void main(String[]args){
int age=8;
boolean haspassport=false;
boolean hasNoCriminalRecord=false;
if (age>=18 && haspassport==true && hasNoCriminalRecord==true){
System.out.println("eligible for visa");
}
else if ((age>=18 && haspassport==false) ||( hasNoCriminalRecord==true)){
System.out.println("Apply for passport first");
}
else if (age<18 && hasNoCriminalRecord==false){
System.out.println("Not eligible");
}
}
}