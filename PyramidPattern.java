package Java-Pattern-Printing;

    import java.util.Scanner;

public class PyramidPattern {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n :");
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
        //space
        for(int j=0; j<n-i-1; j++){
            System.out.println(" ");
        }
        for(int k=0; k<i; k++){
            System.out.print("* ");

        }
        System.out.println(" ");  //new line
    }
}
    
}

    

