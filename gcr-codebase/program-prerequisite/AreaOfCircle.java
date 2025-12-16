import java.util.*;
class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double pi = 3.14;
        double radius = sc.nextDouble();
        double area = pi*radius*radius;
        System.out.println(area);
        sc.close();
    }
}