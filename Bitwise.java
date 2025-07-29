public class Main {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        //System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        //System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");

        // Bitwise AND
        int andResult = a & b;
        System.out.println(andResult+Integer.toBinaryString(andResult));

        // Bitwise OR
        int orResult = a | b;
        System.out.println("a | b = " + orResult + " (" + Integer.toBinaryString(orResult) + ")");

        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult + " (" + Integer.toBinaryString(xorResult) + ")");

        // Bitwise NOT (inverts bits of a)
        int notResult = ~a;
        System.out.println("~a = " + notResult + " (" + Integer.toBinaryString(notResult) + ")");

        // Left Shift
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift + " (" + Integer.toBinaryString(leftShift) + ")");

        // Right Shift
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + " (" + Integer.toBinaryString(rightShift) + ")");
    }
}

