package java_code_ptit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J07005{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        
        int[] dem=new int [1005];
        
        for (int i = 0; i < 100000; i++)
        {
            int a = in.readInt();
            dem[a]++;
        }
        for(int i = 0; i < 1000;i++){
            if(dem[i]!=0)
                System.out.println(i+" "+dem[i]);
        }
        in.close();
    }
}