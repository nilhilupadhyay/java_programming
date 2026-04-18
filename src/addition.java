import java.util.Scanner;
public class addition {
    public static void main(String[] args){
        System.out.println("Enter your maths score");
        Scanner sc= new Scanner(System.in);
        int maths = sc.nextInt();
        System.out.println("Enter your comp score");
        int comp = sc.nextInt();
        System.out.println("Enter your sci score");
        int sci = sc.nextInt();
        System.out.println("Enter your eng score");
        int eng = sc.nextInt();
        int sum = maths + comp + sci + eng;
        System.out.println("Total marks " + sum);


    }
}
