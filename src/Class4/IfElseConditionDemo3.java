package Class4;

public class IfElseConditionDemo3 {
    public static void main(String[] args) {
        int day=4; // we use one equal sign to asing value to a variable.
        if(day==1){ // when we use 2 equal signs it is to compare two variables.
            System.out.println("Monday");
        }else if(day==2) {
            System.out.println("tuesday");
        } else if(day==3){
            System.out.println("wednesday");
        } else if(day==4){
            System.out.println("thursday");
        }else if(day==5){
            System.out.println("friday");
        }else if(day==6){
            System.out.println("saturday");
        } else if (day==7) {
            System.out.println("sunday");


        } else {
            System.out.println("wrong day number");
        }

    }
}
