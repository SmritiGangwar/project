public class BoxingParseToString {
    public static void main(String[] args) {
        Integer i4 = 34;
        Integer i5 = 90;
        System.out.println(i4+i5);  //toString method is overridden.

        //parseInt
        String s ="120";
        int i = Integer.parseInt(s);     //static method i.e why called through integer class
        System.out.println(i+5);         //Coverts int into String.

        //equals()
        Integer i6 = 100;
        Integer i7 = 100;


        System.out.println(i6.equals(i7));   //Content comparison in equals(), not reference comparison.
        //toString() is Overridden.
        System.out.println(i6==i7);          //Value comparison.
        System.out.println(12==12);
    }
}
