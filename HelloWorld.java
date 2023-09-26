
/**
 * Write a description of class forloops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("i is equal to "+1);
        }
    }

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}

