import java.util.Scanner;
class Stu {
    public static void main(String[] args) {
        String name;
        int rno;
        int phy, chem, mat, tot;
        float avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        name = sc.next();

        System.out.println("Enter the roll number:");
        rno = sc.nextInt();

        System.out.println("Enter Physics mark:");
        phy = sc.nextInt();

        System.out.println("Enter Chemistry mark:");
        chem = sc.nextInt();

        System.out.println("Enter Maths mark:");
        mat = sc.nextInt();

        tot = phy + chem + mat;
        System.out.println("Total = " + tot);

        avg = tot / 3.0f; // Ensures float division
        System.out.println("Average = " + avg);
    }
}

