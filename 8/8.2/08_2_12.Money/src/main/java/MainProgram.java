
public class MainProgram {

    public static void main(String[] args) {
        // test your class here

//        Money a = new Money(10, 0);
//        Money b = new Money(8, 0);
//
//        Money c = a.minus(b);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//        a = a.plus(c);
//        System.out.println(a);

//        System.out.println(a.lessThan(b));
//        System.out.println(b.lessThan(c));
//
//        Money firstMoneyObject = new Money(1, 0);
//        Money secondMoneyObject = new Money(1, 50);
//        Money thirdMoneyObject = new Money(-3, 5);
//        Money fourthMoneyObject = new Money(2, 0);
//        firstMoneyObject.lessThan(secondMoneyObject);

//        Money firstMoneyObject = new Money(10, 0);
//        Money secondMoneyObject = new Money(7, 40);
//        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
//        System.out.println(firstMinusSecond);

//        Money firstMoneyObject = new Money(10, 0);
//        Money secondMoneyObject = new Money(7, 40);
//        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
//        System.out.println(firstMinusSecond.cents());

        Money firstMoneyObject = new Money(1, 0);
        Money secondMoneyObject = new Money(2, 0);
        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
        System.out.println(firstMinusSecond.euros());

    }
}
