public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

//        Augmented Assignment
//        a = a+10   a+=10
        int c = 100;
        c+=10;
        System.out.println(c);

        c-=10;
        System.out.println(c);

        c*=10;
        System.out.println(c);

//        unary operator
//        front placed operator
//        ++  a = a+1
//        --  a = a-1
//        ! reverse boolean

        int d = 10;
        d++;
//        d = d+1;
//        d -=1;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);
    }
}
