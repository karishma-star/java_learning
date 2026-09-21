public class typecasting{
    public static void main(String[] args){
        //narrowing conversation
        int a=10;
        double b=a;
        System.out.println(b);
        //widening conversation
        double c=10.5;
        int d=(int)c;
        System.out.println(d);
        //implict typecasting
        int x=10;
        x=(int)b;
        System.out.println(x);
        //explict typecasting
        int y=5;
        int z=10;
        System.out.println("x/z"+((float)x/z));

    }

}