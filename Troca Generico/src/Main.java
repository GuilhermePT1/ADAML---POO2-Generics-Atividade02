
public class Main {

    public static void main(String[] args) {

        Integer[] Integerarrays = {1, 2, 3, 4, 5};
        Troca.troca(Integerarrays, 0, 4);
        System.out.println("Array integer: ");
        for (int i : Integerarrays) {
            System.out.print(i + " ");
        }
        System.out.println();

        String[] StringArrays = {"A", "B", "C", "D", "E"};
        Troca.troca(StringArrays, 0, 4);
        System.out.println("Array String: ");
        for (String i : StringArrays) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}