class Ticket {
public static void main(String[] args) { 
boolean isWeekend = true; 
boolean VIPseat=true;
boolean normalseat=true;
boolean isWeekday=true;
System.out.println("Movie Ticket Booking");
int ticket_price; 
if (isWeekend==false && VIPseat==false) {
System.out.println("ticket_price is 500");
} 
else if (isWeekend==true && normalseat==true) {
System.out.println("ticket_price = 300");
}
else if (isWeekday==true && VIPseat==true){
System.out.println("ticket_price = 400");
} 
else if (isWeekday==true && normalseat==true){
System.out.println("ticket_price = 200");
}
}
}