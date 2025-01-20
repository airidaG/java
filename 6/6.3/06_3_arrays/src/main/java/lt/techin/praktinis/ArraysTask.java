package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {1, 3, 5, 6};

        int[] arrWithRemovedElement = insertElementAndReturnNewArray(arr, 1, 99);
        System.out.println(Arrays.toString(arrWithRemovedElement));

//        System.out.println(Arrays.toString(generateRandomArray(5, 2, 20)));

    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {

        int[] randomArr = new int[size];
        int i = 0;

        while (i < size) {

            int randomNumber = (int) (Math.random() * 10);

            if (randomNumber >= min && randomNumber <= max) {
                randomArr[i] = randomNumber;
                i++;
            }
        }
        return randomArr;
    }

//    Atsitiktinio skaičiaus generavimas intervale:
//    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        int min = 10;
//
//        int max = 14;
//
//        for (int i = 0; i < 10; i++) {
//
//            int randomNumber = random.nextInt(max - min + 1) + min;
//
//            System.out.println(randomNumber);
//
//        }
//
//    }


    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {

        if (arr.length - k <= 0 || k < 0) {
            return null;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == k) {
                continue;
            }

            newArr[j++] = arr[i];
        }
        return newArr;
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {

        if (arr.length - k <= 0 || k < 0) {
            return null;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arr.length; ) {
            if (j == k - 1) {
                newArr[j++] = x;
                continue;
            }

            newArr[j++] = arr[i];
            i++;
        }

        return newArr;
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {

        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {


        int leftNum = 0;
        int rightNum = arr.length - 1;

        while (leftNum < rightNum) {

            int temporary = arr[leftNum];
            arr[leftNum] = arr[rightNum];
            arr[rightNum] = temporary;

            leftNum++;
            rightNum--;
        }

    }


}
