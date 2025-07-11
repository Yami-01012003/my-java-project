 class MultiplicationTable
{

   public static void main(String[] args) 
   {

        // Byte multiplication
        byte byte1 = 10;
        byte byte2 = 20;
        int resultByte = byte1 * byte2;
        System.out.println("Byte multiplication: " + resultByte);      // 200

        // Short multiplication
        short short1 = 100;
        short short2 = 200;
        int resultShort = short1 * short2;
        System.out.println("Short multiplication: " + resultShort);      // 20000

        // Int multiplication
        int int1 = 1000;
        int int2 = 2000;
        int resultInt = int1 * int2;
        System.out.println("Int multiplication: " + resultInt);      // 2000000

        // Char multiplication (ASCII values)
        char char1 = 'a';                                             // ASCII value 97
        char char2 = 'b';                                             // ASCII value 98
        int resultChar = char1 * char2;
        System.out.println("Char multiplication: " + resultChar);       // 9506

        // Long multiplication
        long long1 = 3000L;
        long long2 = 5000L;
        long resultLong = long1 * long2;
        System.out.println("Long multiplication: " + resultLong);       // 15000000

        // Float multiplication
        float float1 = 2.2f;
        float float2 = 2.2f;
        float resultFloat = float1 * float2;
        System.out.println("Float multiplication: " + resultFloat);      // 4.8400006

        // Double multiplication
        double double1 = 2.2;
        double double2 = 2.2;
        double resultDouble = double1 * double2;
        System.out.println("Double multiplication: " + resultDouble);       // 4.840000000000001
    }
}

