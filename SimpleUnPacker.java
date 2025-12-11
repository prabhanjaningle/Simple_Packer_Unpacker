package FilePackerUnpacker;

import java.io.*;

public class SimpleUnPacker
{
    private String packName;

    public SimpleUnPacker(String packName)
    {
        this.packName = packName;
    }

    public void unpacking()
    {
        try
        {
            System.out.println("--------------------------------------------------");
            System.out.println("                Unpacking Process                 ");
            System.out.println("--------------------------------------------------");

            File packFile = new File(packName);

            if(!packFile.exists())
            {
                System.out.println("Packed file not found.");
                return;
            }

            FileInputStream fin = new FileInputStream(packFile);

            byte headerBuffer[] = new byte[100];
            int bytesRead = 0;
            int fileCount = 0;

            while((bytesRead = fin.read(headerBuffer)) != -1)
            {
                String header = new String(headerBuffer).trim();

                String tokens[] = header.split(" ");

                String fileName = tokens[0];
                int fileSize = Integer.parseInt(tokens[1]);

                File newFile = new File(fileName);
                newFile.createNewFile();

                FileOutputStream fout = new FileOutputStream(newFile);

                byte fileData[] = new byte[fileSize];
                fin.read(fileData, 0, fileSize);
                fout.write(fileData);

                fout.close();

                System.out.println("Unpacked: " + fileName + " (Size: " + fileSize + ")");
                fileCount++;
            }

            System.out.println("--------------------------------------------------");
            System.out.println("Unpacking Completed.");
            System.out.println("Total Files Unpacked: " + fileCount);
            System.out.println("--------------------------------------------------");

            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
