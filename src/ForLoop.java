public class ForLoop {
    public static void main(String[] args) {
//        for (;;){
//            System.out.println("unlimited");
//        }
//        var counter = 1;

//        for (;counter<=10;){
//            System.out.println("Perulangan "+counter);
//            counter++;
//        }
        for (var counter = 1;counter<=11;counter++){
            System.out.println("Perulangan "+counter);
        }

        String[] array = {
                "satu", "dua", "tiga", "empat"};

        for (int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }

//        enhance for
//        for (String s : array) {
//            System.out.println(s);
//        }

        
    }
}
