public class Main {
    public static void bubbleSort(Person[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if ( Person.compare(arr[j], arr[j + 1]) > 0) {
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Person[] people = {
                new Person("Bob", 35),
                new Person("Swen", 52),
                new Person("Max", 29),
                new Person("David", 42)
        };
        System.out.println("Before sorting: ");

        for (Person p : people) {
            System.out.println(p);
        }
        bubbleSort(people);

        System.out.println("___________________");
        System.out.println();

        System.out.println("After sorting: ");
        for (Person p : people) {
            System.out.println(p);
        }
    }

}
