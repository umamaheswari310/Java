class MovieTicketBooking {
public static void main(String[] args){
String movie = "HIT";  
String ageGroup = "adult";
int numOfPeople = 5;
int pricePerPerson=0;
if (ageGroup.equals ("child")) {
pricePerPerson = 80;
} 
else if (ageGroup.equals ("adult")) {
pricePerPerson = 120;
}
else if (ageGroup.equals ("old")) {
pricePerPerson = 100;
} 
int total = numOfPeople * pricePerPerson;
double discount = 0.10 * total;
double pay = total - discount;
System.out.println("Movie:" + movie);
System.out.println("Age Group:" + ageGroup);
System.out.println("No. of People:" + numOfPeople);
System.out.println("Total:" + total);
System.out.println("Discount:" + discount);
System.out.println("Pay:" + pay);
}
}