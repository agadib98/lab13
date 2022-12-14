import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Quiz {
    private int marks;
    private String id;
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public Quiz(int marks, String id ) {
        this.marks = marks;
        this.id = id;


    }

    public static void main(String[] args) {


        int count = 0;
        File f = new File("marks.txt");
        String s1  ="marks.txt";
        Quiz[] arr = new Quiz[34];

        try {
            f.createNewFile();
            System.out.println("file created");
        } catch (Exception e) {
            System.out.println(e);
        }
        if (f.exists()) {
            System.out.println("file exists");
        }
        else {
            System.out.println("file does not exits");
        }


        try {
            Formatter formatter = new Formatter("marks.txt");
            Scanner s = new Scanner(System.in);

            System.out.println(" enter number of students");
            int a = s.nextInt();
            System.out.println("now enter marks and id");

            for (int i = 0; i < a; i++) {
                int b = s.nextInt();
                int line = s.nextInt();
                formatter.format("%d  %d\r\n", b, line);
            }


            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        try {

            Scanner s = new Scanner(new File(s1));
            while (s.hasNextInt()&&count< arr.length) {
                int marks;
                String id;
                marks=s.nextInt();
                id = s.next();
                arr[count++]= new Quiz(marks,id);}
            s.close();
        }catch (Exception e){
            System.out.println(e);}
        int max = 0;
        for(int i =0;i<count;i++){
            System.out.println("ID ="+arr[i].getId()+" MARKS="+arr[i].getMarks());
            if(arr[i].getMarks()>arr[max].getMarks())
                max = i;

        }

        System.out.println("the highest mark id ="+arr[max].getId());
    }
}
