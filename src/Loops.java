public class Loops {

    public static void main(String[] args) {

        // Цикл for
        for(int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }

        for (int l = 1000; l >= 0; l--) {
            if ((l % 2) == 0) {
                System.out.println(l);
            }
        }

        // Цикл while
        int j = 1;
        while(j <= 1000) {
            System.out.println(j);
            j++;
            if(j == 5) {
                break;
            }
        }

        int k = 1001;
        while (k > 0) {
            k--;
            if ((k % 2) == 0) {
                System.out.println(k);

            }
        }

        // ForEach

        int[] firstArray = new int[900];
        for(int i = 0; i < firstArray.length; i++) {
            firstArray[i] += i + 100;
        }

        int[] secondArray = new int[firstArray.length];
        for(int i = 0, h = firstArray.length - 1; i < firstArray.length; i++, h--) {
            secondArray[h] = firstArray[i];
        }

        for(int i : secondArray) {
            System.out.println(i);
        }



    }
}
