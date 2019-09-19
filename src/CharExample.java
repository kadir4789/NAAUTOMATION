package newPackage;

public class CharExample {
    public static void main(String [] args){
        byte myByte = 45;
        char myChar = 'z';
        short myShort= 5345;
        int myInt = 2342342;
        float myFloat = 435345;
        double myDouble = 453453;

        double  total = (myByte * myShort) + (myChar+21)*2 + (myDouble/myFloat);
        System.out.println("THIS IS THE RESULT:");
        System.out.println(total);


    }

}
