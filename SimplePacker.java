package FilePackerUnpacker;

import java.io.*;

public class SimplePacker
{
    private String packName;
    private String dirName;

    public SimplePacker(String packName, String dirName)
    {
        this.packName = packName;
        this.dirName = dirName;
    }

    public void packing()
    {
        try
        {
            System.out.println("--------------------------------------------------");
            System.out.println("                 Packing Process                  ");
            System.out.println("--------------------------------------------------");

            int fileCount = 0;

            File dirObj = new File(dirName);

            if(!dirObj.exists() || !dirObj.isDirectory())
            {
                System.out.println("Directory not found.");
                return;
            }

            System.out.println("Directory Found: " + dirName);

            File packFile = new File(packName);

            if(!packFile.createNewFile())
            {
                System.out.println("Unable to create packed file.");
                return;
            }

            System.out.println("Packed file created: " + packName);

            FileOutputStream fout = new FileOutputStream(packFile);
            byte buffer[] = new byte[1024];

            File files[] = dirObj.listFiles();

            for(File f : files)
            {
                String header = f.getName() + " " + f.length();

                while(header.length() < 100)
                {
                    header += " ";
                }

                fout.write(header.getBytes());

                FileInputStream fin = new FileInputStream(f);

                int bytesRead = 0;

                while((bytesRead = fin.read(buffer)) != -1)
                {
                    fout.write(buffer, 0, bytesRead);
                }
                fin.close();

                System.out.println("Packed: " + f.getName());
                fileCount++;
            }

            System.out.println("--------------------------------------------------");
            System.out.println("Packing Completed.");
            System.out.println("Total Files Packed : " + fileCount);
            System.out.println("--------------------------------------------------");

            fout.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
