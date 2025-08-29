public class DSA_1 {
    public static void main(String argc[]){
        System.out.print("this is star pattern-basic");
        for(int i=1;i<=5;i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\nthis is inverted one ");
        for (int i = 5; i>=0; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("\nthe numeric half pyramid");
        for (int i = 1; i < 5;i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("\nthe alphabet prymid");
        int n=4;
        char ch='A';
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
    }

