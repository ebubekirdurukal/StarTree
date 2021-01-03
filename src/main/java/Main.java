import java.util.Scanner;

public class Main {
    /**
     * StartTree Project for Testinium
     *
     * Created by ebubekir
     *
     * @author Ebubekir Durukal
     * @version 1.0
     * @since 3/01/2021
     *
     */

    public static void main(String[] args) {
        printSomeTree();
    }

    public static void printSomeTree(){
        String height="";
        int heightAsInt=0;
        System.out.print("Enter height of the tree or type exit for exiting:");
        Scanner sc = new Scanner(System.in);
        while(true) {
            height = sc.nextLine();
            if(height.equals("exit")){
                break;
            }
            try {
                heightAsInt = Integer.parseInt(height);
                if (heightAsInt < 1) {
                    System.out.println("Only Positive Numbers!");
                    heightAsInt = 0;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Only Positive Numbers!");
                heightAsInt = 0;
            }

            for (int i = 0; i < heightAsInt; i++) {
                for (int j = 0; j < heightAsInt - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }



    }

}
