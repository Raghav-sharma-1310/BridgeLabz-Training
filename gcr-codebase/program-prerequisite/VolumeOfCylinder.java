import java.util.*;
public class VolumeOfCylinder{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         double pi = 3.14;
         double radius=sc.nextDouble();
         double height=sc.nextDouble();
         double volume=pi*radius*radius*height;
         System.out.println(volume);
         sc.close();
     }
}