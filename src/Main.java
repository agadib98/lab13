import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b;
        int i =0;
        int sum = 0;
        double avg;
        File f = new File("integers.txt");
        try{
            f.createNewFile();
            System.out.println("file created");
        }catch (Exception e){
        System.out.println(e);}
        if(f.exists()){
            System.out.println("file exists");
        }else {
            System.out.println("file does not exits");
        }
        try {
            Formatter formatter = new Formatter("integers.txt");
            Scanner s = new Scanner(System.in);
            while (true){

                int a = s.nextInt();
                if(a>0){
                formatter.format("%d\r\n",a);}
                else
                  break;
            }
            formatter.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        try {
            File file = new File("integers.txt");
            Scanner s = new Scanner(file);
            while (s.hasNext()){
                i++;
                 b = s.nextInt();
                 sum = sum+b;
            }
            avg = (double)sum/i;
            System.out.println("the agv is="+avg);
        }catch (Exception e){
        System.out.println(e);}

        }
    }
