 class SubtractionTable
{
   public static void main(String[] args)
   {

        // Byte subtraction
        byte byte1 = 10;
        byte byte2 = 20;
        int resultByte = byte1 - byte2;
        System.out.println("Byte subtraction:" + resultByte);             // -10

        // Short subtraction
        short short1 = 100;
        short short2 = 200;
        int resultShort = short1 - short2;
        System.out.println("Short subtraction:" + resultShort);           // -100

        // Int subtraction
        int int1 = 1000;
        int int2 = 2000;
        int resultInt = int1 - int2;
        System.out.println("Int subtraction:" + resultInt);               // -1000

        // Char subtraction (ASCII values)
        char char1 = 'a';                                                  // ASCII value 97
        char char2 = 'b';                                                 // ASCII value 98
        int resultChar = char1 - char2;
        System.out.println("Char subtraction:" + resultChar);             // -1

        // Long subtraction
        long long1 = 3000L;
        long long2 = 5000L;
        long resultLong = long1 - long2;
        System.out.println("Long subtraction:" + resultLong);             // -2000

        // Float subtraction
        float float1 = 2.2f;
        float float2 = 2.2f;
        float resultFloat = float1 - float2;
        System.out.println("Float subtraction:" + resultFloat);            // 0.0

        // Double subtraction
        double double1 = 2.2;
        double double2 = 2.2;
        double resultDouble = double1 - double2;
        System.out.println("Double subtraction:" + resultDouble);          // 0.0
    }
}
