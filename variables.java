class Variables{
int age=20;
String name="mahi";
public void var(){
char gender='F';
System.out.println(gender);
}
public static void main (String[]args){
Variables v1=new Variables();
System.out.println(v1.name);
System.out.println(v1.age);
v1.var();
}
}