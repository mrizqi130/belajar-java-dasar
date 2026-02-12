public class Method {
    public static void main(String[] args) {
        sayHello();
        sayName("ibnu sumbul");
        System.out.println(getName());
        System.out.println(angka(999));
        int values[] = {
                100,100,20
        };
//        sayCongrats("nomaden",100,20,100);
        sayCongrats("nomaden",values);
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayName(String name){
        System.out.println("Hi "+name);
    }

    static String getName(){
        return "miwau miwau";
    }

    static String angka(int a){
        if (a%2==0){
            return "genap";
        }else{
            return "ganjil";
        }
    }

//    static void sayCongrats(String name, int[] values){
//        var total=0;
//        for (var value: values){
//            total += value;
//        }
//        var finalVerdict=total/ values.length;
//        if (finalVerdict>=75){
//            System.out.println("nilai "+name+"diatas sama dengan 75");
//        }else{
//            System.out.println("nilai "+name+" dibawah 75");
//        }
//    }
        static void sayCongrats(String name, int... values){
        var total=0;
        for (var value: values){
            total += value;
        }
        var finalVerdict=total/ values.length;
        if (finalVerdict>=75){
            System.out.println("nilai "+name+"diatas sama dengan 75");
        }else{
            System.out.println("nilai "+name+" dibawah 75");
        }
    }
}

