class Main {
public static void main(String[] args) {
int distance = 120;  
boolean isWeekend = true; 
int fare; 
if (distance < 50) {
fare = 50;
} 
else if (distance <= 100) {
fare = 100;
}
if (isWeekend==true){
fare = 300;
} 
else {
fare = 200;
}
System.out.println("Ravi's Bus Fare:" + fare);
}
}