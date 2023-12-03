import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "Aman";
        int age = 30;
        String neighbour = "Akku";

        String friend = neighbour;

        //primitive types
        byte age2 = 30;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isadult = true;

        System.out.println("This is second day");
        String name2 = "Hiten";
        int age3 = 24;
        String neighbour2 = "Raju";

        String friend2 = neighbour2;

        //primitive types2
        byte age4 = 25;
        int phone3 = 1122334455;
        long phone4 = 112233445566L;
        float pi2 = 3.14F;
        char letter2 = 'a';
        boolean isadult2 = true;

        //non-primitives types
        String name3 = "Aman";
        String name4 = "Apu";

        System.out.println(name.length());

        //Strings
        //Concatenate
        String name5 = "Aman";
        String name6 = "Akku";
        String name7 = name5 + " and " + name6;
        System.out.println(name7);

        //Strings
        //charAt
        String name8 = "Aman";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));

        //Strings
        //length
        String name9 = "Aman";
        System.out.println(name.length());

        //Strings
        //replace
        String name10 = "Aman";
        String name11 = name10.replace('a', 'b');
        System.out.println(name11);

        //Strings
        //substring
        String name12 = "Aman and Akku";
        System.out.println(name12.substring(0, 4));
        System.out.println(name12.substring(5, 9));
        System.out.println(name12.substring(9, 13));

        //Arrays
        // Arrays are non-primitive type so we use new keyword

        int age5 = 30;
        int physics = 97;
        int chemistry = 98;
        int english = 95;

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[0]);

        boolean[] marks2 = new boolean[3];
//        marks2[0] = 97;
//        marks2[1] = 98;
//        marks2[2] = 95;

        System.out.println(marks2[0]);

        int[] marks3 = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;

        System.out.println(marks3[0]);

        int[] marks4 = new int[3];
        marks4[0] = 97;
        marks4[1] = 98;
        marks4[2] = 95;

        //length
//        System.out.println(marks4.length);

        //sort
        Arrays.sort(marks4);
        System.out.println(marks4[0]);
        System.out.println(marks4[1]);
        System.out.println(marks4[2]);

        int[] marks5 = {95,96,97};
        System.out.println(marks5[2]);

        //it's like 2D system and we implement that with the help of matrix system.
//        [0][0] here showing the first student with first marks, [1][1] will show
//        second student with second marks.
        int[][] finalmarks = {{95,96,97},{93,94,95}};
        System.out.println(finalmarks[0][0]);

        //casting
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);

        //double is when there is number after point e.g. 100.00, if it's only 100 then
        //it was integer or int. So you can add int into double because double size is
        //larger than int, but vice versa is not true, Is like bucket and glass example.
        // as you can see in below ex. in int i try to add 18.00 or 18.99 but it didn't
        //add so i convert that value into int but I lose some value.
        int p = 100;
        int fp = p + (int)18.00;
        System.out.println(fp);

        //constants
        int age6 = 30;
        age6 = 31;
        age6 = 32;

        final float PI = 3.14F;
        //final with this we show constants and use capital letters to show and not
        //change this value.

        //operators
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);

        int a1 = 1;
        int b1 = 2;
        int diff = a1 - b1;
        System.out.println(diff);

        int a2 = 1;
        int b2 = 2;
        int mul = a2 * b2;
        System.out.println(mul);

        int a3 = 1;
        int b3 = 2;
        int div = a3 / b3;
        System.out.println(div);

        double a4 = 1;
        double b4 = 2;
        double div1 = a4 / b4;
        System.out.println(div1);

        // In operators we are using Modulo % to get remainder from divide.
        double a5 = 1;
        double b5 = 2;
        double modulo = a5 % b5;
        System.out.println(modulo);

        int numb = 1;
        numb = numb + 1;
        System.out.println(numb);

        int numb1 = 1;
//        numb1++;
//        System.out.println(numb1);

        System.out.println(++numb1);
        System.out.println(numb1);

        System.out.println(--numb1);
        System.out.println(numb1);

        System.out.println(numb1--);
        System.out.println(numb1);
        



        
    }
}
