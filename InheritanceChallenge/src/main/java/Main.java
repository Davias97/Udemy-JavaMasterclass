import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        SalariedEmployee test = new SalariedEmployee("Dave", "11/11/1985", "01/01/2020",35000);
        System.out.println(test);
        System.out.println("Age = " + test.getAge());
        System.out.println("Pay = " + test.collectPay());
        test.retire();
        System.out.println("Joe's Paycheck = $" + test.collectPay());

        Employee joe = new Employee("Joe", "11/11/1990", "03/03/2020");
        System.out.println(joe);

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = " + mary.collectPay());
        System.out.println("Mary'S Holiday Pay = " + mary.getDoublePay());
    }
}
