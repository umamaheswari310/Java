class Main{
public static void main(String[]args){
int cartAmount=8000;
boolean isMember=true;
boolean hasCoupon=true;
if (cartAmount>5000 && isMember==true){
System.out.println("20 % Discount");
}
else if (cartAmount>5000 && isMember==true && hasCoupon==true){
System.out.println("10% Discount");
}
else{
System.out.println("No Discount");
}
}
}