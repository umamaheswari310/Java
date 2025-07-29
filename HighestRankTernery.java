class Main {
public static void main(String[] args) {
int a = 85;
int b = 90;
int c = 88;
String topStudent = (a > b) ? (a > c ? "Student A" : "Student C") : (b > c ? "Student B" : "Student C");
System.out.println("Highest ranker is: " + topStudent);
}
}
