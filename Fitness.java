class Main{
public static void main(String[]args){
int age=25;
int bmi=18;
boolean hasheartcondition=false;
if (age<40 && bmi<=25 && !hasheartcondition==true){
System.out.println("High Intensity Program");
}
else if ((age<60 && bmi<=30) ||( hasheartcondition==true)){
System.out.println("Moderate");
}
else {
System.out.println("Consult Doctor First");
}
}
}