package javafundamentals.statements;

public class Triangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for(int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i +1; k++) {
                if(i != n - 1) {
                    if(k == 0 || k == i) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                } else
                    System.out.print("*");
                    System.out.print(" ");
            }
            System.out.println();
        }
//        int a = 123;
//        int b = 1;
//
//        String x = Integer.toString(a);
//        String y = Integer.toString(b);
//
//        for (int i = 0; i < y.length(); i++) {
//            for (int j = 0; j < x.length(); j++){
//                if (x.charAt(j) == y.charAt(i)) {
//                    System.out.println(true);
//                }
//            }
//        }
    }
}
