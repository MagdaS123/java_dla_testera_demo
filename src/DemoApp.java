public class DemoApp {
    public static void main(String[] args) {

        // zadanie nr 1 - zamiana miejscami pierwszego elemntu z ostatnim

        System.out.println("---------------------Zamiana miejscami pierwszego elemntu z ostatnim------------------");

        int[] tab = {3, 4, 5, 1, 9};

        int first = tab[0];
        int last = tab[tab.length - 1];

        tab[0] = last;
        tab[tab.length - 1] = first;

        for (int number : tab) {
            System.out.println(number);
        }

        // zadanie nr 2 - zliczamy ilość liczb parzystych i nieparzystych

        int[] numbers = {3, 2, 9, 1, 1, 4};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Liczb parzystych jest: " + even);
        System.out.println(("Liczb nieparzystych jest: " + odd));

        // zadanie nr 3 - sortowanie liczb rosnąco

        System.out.println("---------------------Sortowanie liczb rosnąco-----------------------------------");

        int[] sort = {3, 5, 0, 22, 1, -9};

        int min;

        for (int i = 0; i < sort.length; i++) {
            min = sort[i];

            for (int j = i + 1; j < sort.length; j++) {
                if (sort[j] < min) {
                    min = sort[j];
                    sort[j] = sort[i];
                    sort[i] = min;
                }
            }
        }

        for (int sortNumber : sort) {
            System.out.println(sortNumber);
        }

        // zadanie nr 4 - sortowanie liczb malejąco

        System.out.println("---------------------Sortowanie liczb malejąco-----------------------------------");

        int[] sortDesc = {3, 5, 0, 22, 1, -9};

        int max;

        for (int i = 0; i < sortDesc.length; i++) {
            max = sort[i];

            for (int j = i + 1; j < sortDesc.length; j++) {
                if (sortDesc[j] > max) {
                    max = sortDesc[j];
                    sortDesc[j] = sortDesc[i];
                    sortDesc[i] = max;
                }
            }
        }

        for (int sortDescending : sortDesc) {
            System.out.println(sortDescending);
        }
    }
}
