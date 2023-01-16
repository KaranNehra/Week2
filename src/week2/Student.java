
package week2;
import java.util.*;

public class Student {
    public static void main(String[] args){
        
        StudentData[] list = new StudentData[3];
        StudentData s1 = new StudentData();
        StudentData s2 = new StudentData();
        StudentData s3 = new StudentData();
        
        Scanner input =  new Scanner(System.in);
        
        
        System.out.print("Enter your name : ");
        String name = input.next();
        s1.setName(name);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        s1.setAge(age);
        
        s2.setAge(23);
        s2.setName("Uri");
        
        s3.setAge(56);
        s3.setName("Siraz Bhai");
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for (int i=0;i<list.length;i++){
            System.out.println("Name : "+list[i].getName() +" Age : "+ list[i].getAge());           
        }
        
    }
    
}
