package Java100daysofcode;

public class Day69 {
    static public class Triangle {
        void triangle(){
            System.out.println(" I am a Triangle ");
        }
    }
    static class Isosceles extends Triangle{
        void Isosceles(){
            System.out.println(" I am an Isosceles Triangle ");
        }
    }
    static class Equilateral extends Isosceles{

        void Equilateral(){
            System.out.println(" I am an Equilateral Triangle ");
        }
    }

    public static void main(String[] args) {

        Equilateral obj1= new Equilateral();
        obj1.Equilateral();
        obj1.Isosceles();
        obj1.triangle();
    }
}
