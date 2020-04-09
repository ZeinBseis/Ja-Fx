package sample;

public class funcInterface {
    public static void main (String[]args) {
        MyFI imp = () -> {System.out.println("Displa from Lambda");};
        imp.display();

        MyFI2 op = (a, b) -> (a+b);
        System.out.println(op.operation(10,5));

    }
}

@FunctionalInterface
interface MyFI {
    public void display ();
}

@FunctionalInterface
interface MyFI2 {
    int operation (int a, int b);
}
