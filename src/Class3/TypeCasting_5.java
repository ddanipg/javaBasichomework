package Class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);

        /* byte
        short
        int
        long
        float
        double
        if we try to store the content  from a smaller box to a larger box java does not complain because the content
        can easily fit inside the larger box but if we try the other way around we need an error and we need to type
        cast it to store the content.
         */

        byte b=10;
        int number2=b;
        short C=(short) number2;
        System.out.println(b);

        float egg=12.5f;
        int wholePart=(int) egg;// type casting we are converting from float to an int
        System.out.println(wholePart); // this method is only used if we need the whole number only.( not decimals)

        System.out.println((char)97); // converting the value of number 97 in to a char





    }

}