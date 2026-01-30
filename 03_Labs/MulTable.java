public class MulTable{
    public static void main(String[] args){
        int number = Integer.parseInt(args[0]);
        System.out.println("Multiplication table for " + number + ':');
        for (int g=1;g<=12;g++)
            System.out.println("" + g + " x " + number + " = " + number*g);
    }
}