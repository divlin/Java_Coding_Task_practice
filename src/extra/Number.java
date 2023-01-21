package extra;

public class Number {

    int num1 = 6;
    static int num2 = 10;

    public static void main(String[] args) {

        Number s1 = new Number();
        Number s2 = new Number();

        s1.num1 = 15;
        s1.num2 = 17;

        s2.num1 = 22;
        s2.num2 = 28;

        System.out.println(s1.num1 + " " + s1.num2++ + " " + ++s2.num1 + " " + ++s2.num2);
        // we can initilaze num1 = 15 so s1.num1 = 15
        // num2 is a static variable so the last initialization which is s1.num2 = 28 and we have an after increment
        // s2.num1 = 22 (which is teh last initialization bet we have a pre increment so s2.num1 = 23
        // num2 is a static variable so the last initialization which is s2.num2 = 28 but don't forget we have and after increment
        // from the second comment line and we have a pre increment so s2.num2 = 28+1+1=30

    }

}