class Main{
public static void main(String[]args){
int percent=86;
boolean sportsCertificate=false;
int familyIncome=180000;
boolean volunteerExperience=false;
if (percent>=90 && sportsCertificate==true && familyIncome<=200000){
System.out.println("Full Scholorship");
}
else if (percent>=85 && sportsCertificate==true || volunteerExperience==true){
System.out.println("Partial Scholorship");
}
else{
System.out.println("No Scholorship");
}
}
}
