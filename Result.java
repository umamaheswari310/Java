class Result {
public static void main(String[] args) {
int s1 = 85;
int s2 = 90;
int s3 = 80;
int s4 = 91;
int s5 = 92;
if (s1 < 35 || s2 < 35 || s3 < 35 || s4 < 35 || s5 < 35) {
System.out.println("Result: Fail");
}
else {
int total = s1 + s2 + s3 + s4 + s5;
double avg = total / 5.0;
System.out.print("Result: Pass - ");
if (avg >= 90) {
System.out.println("Outstanding");
}
else if (avg >= 75) {
System.out.println("Distinction");
} 
else if (avg >= 60) {
System.out.println("First Class");
} 
else {
System.out.println("Pass");
}
}
}
}
