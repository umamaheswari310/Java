class VowelConsonantCount{
public static void main(String[] args) {
String VowelConsonantCount=new String("Java Programming");
int vowels = 0, consonants = 0;
for (int i = 0; i < VowelConsonantCount.length(); i++) {
char ch = VowelConsonantCount.charAt(i);
if (Character.isLetter(ch)) {
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
vowels++;
} 
else {
consonants++;
}
}
}
System.out.println("Vowels: " + vowels);
System.out.println("Consonants: " + consonants);
}
}