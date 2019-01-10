public class ClassLiuOne {
    public static boolean[] findPrime(int n){
        boolean[] list = new boolean[n];
        for (int i = 0; i < list.length; i++){
            list[i] = true;
            for (int j = 2; j <= i; j++){
                if((i + 1) % j == 0){
                    list[i] = false;
                    break;
                }
            }
        }
        return list;
    }

    public static void printPrime(boolean[] list){
        int count = 0;
        for (int i = 1; i < list.length; i++){
            if (list[i]){
                System.out.printf("%5d", (i + 1));
                count++;
                if(count % 10 == 0){
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args){
        boolean[] list = findPrime(1000);
        printPrime(list);
    }
}