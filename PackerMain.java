package FilePackerUnpacker;

import java.util.Scanner;

public class PackerMain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter directory name to pack:");
        String dir = sc.nextLine();

        System.out.println("Enter packed file name:");
        String packFile = sc.nextLine();

        SimplePacker obj = new SimplePacker(packFile, dir);
        obj.packing();
    }
}
