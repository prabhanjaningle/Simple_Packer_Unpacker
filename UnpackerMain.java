package FilePackerUnpacker;

import java.util.Scanner;

public class UnpackerMain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter packed file name:");
        String packFile = sc.nextLine();

        SimpleUnPacker obj = new SimpleUnPacker(packFile);
        obj.unpacking();
    }
}
