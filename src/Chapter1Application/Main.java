package Chapter1Application;

public class Main {

    public static <T> void show(T data[]) { // as objects (references)
        for (T d : data) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        Double data1[] = {3.0, 5.0, 1.0, 2.0, 4.0};
        show(data1);
        
        Person people[] = {
            new Student("Ahmed", "SE", 88.9),
            new Employee("Ali", "Sales", 999.7),
            new Student("Huda", "CS", 94.79)
        };
        
        show(people);
    }
}
