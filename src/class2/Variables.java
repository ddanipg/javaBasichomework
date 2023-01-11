package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        below line is reserving a box in the computer memory
        we are calling it box1 if we need the information that we are storing inside this box
        we can simply say to computer give us the contest of box1.
        int=> is the name of the box
        = sign will whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        // if we are printing something from a box we do not need ""
        System.out.println(box1);//bring the contest of box1 and print them on the console
        double box2=10.5;
        System.out.println(box2);
        /*to store whole numbers we have 4 different types of boxes.
         for example numbers like 10 20 300 10000 etc..
         1) byte 2) short 3) int 4) long

         */
        byte box6=127; // range for byte is from -128 to 127 if we need to store a larger numbers we should try short
        byte box3=-128;
        short box4=32767;
        int biggerBox=123456484; //most common type of box
        long maxBox=132401974l;
        /* reserve a box which can hold the number 10000 call it mybox and print its value on the console

         */
     short myBox=10000;
        System.out.println(myBox);




    }
}
