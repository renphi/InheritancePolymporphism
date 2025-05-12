import java.util.Scanner;

import model.Student;

public class ScannerApp {
    public static void main(String[] args) throws Exception {
        
        // Erzeugt einen neuen Scanner der von System.in (dem Standard Input -> Console) Eingaben scannen kann
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: \t");
        String name = sc.nextLine(); // vs. sc.next() liest nur das nächste Token bis zum Leerzeichen ein!
        student.setName(name);
        
        System.out.print("Age: \t");
        int age = sc.nextInt();
        student.setAge(age);

        sc.close();

        student.info();

    }
}
