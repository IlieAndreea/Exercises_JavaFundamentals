/** Using nested for loops, draw:
        a.) triangle
        b.) triangle only outer line
        c.) rectangle with diagonals
        d.) Christmas tree
*/

package javafundamentals.statements;

public class CodingAdditional5 {
    public static void main(String[] args) {
        System.out.println("a1.)");
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = n; j > i + 1; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\na2.)");
        int m = 5;
        for(int i = 0; i < m; i++) {
            for(int j = m; j > i + 1; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            for(int l = 1; l < i + 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nc.)");




    }
}
