//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.print("=============DEFAULT CONSTRUCTOR=============");
    cars c1=new cars();
    c1.printMe();

    System.out.print("=============COPY of Default=================");
    cars c2=new cars(c1);
    c2.printMe();

    System.out.print("=============PARAMETRIC CONSTRUCTOR===========");
    cars c3=new cars("Ferrari", "Ford 4x4","BMW Z4","Toyata Sienna" );
    c3.printMe();

    System.out.print("=============Shallow COPY of Parametric========");
    cars c4=new cars(c3);
    c4.minivans="Kia Carnival";
    c4.printMe();
    }
}