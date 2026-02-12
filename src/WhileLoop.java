public class WhileLoop {
    public static void main(String[] args) {
        var angka = 1;
//        while(angka<=3){
//            System.out.println(angka);
//            angka++;
//        }

//        do {
//            System.out.println(angka);
//            angka++;
//        }while (angka<=0);


//        while (angka<=11){
//            angka++;
//            if (angka>=10){
//                break;
//            }
//            System.out.println(angka);
//        }
//        ini jg kurang tepat karena iterasi ganjil tidak pernah kena if
//        angka=1;
        while (angka<=11){
            if (angka%2==0){
                System.out.println(angka + " adalah angka genap");
                angka++;
                continue;
            }
            angka++;
        }
//        logikanya kurang tepat
//        for (angka =1;angka<=10;angka++){
//            if (angka%2==0){
//                System.out.println(angka+" adalah genaps");
////                continue;
//            }
//        }

//        for (int a = 1;a<=10;a++){
//            if (a%2==1){
//                continue;
//            }
//            System.out.println("perulangan genap "+a);
//        }
    }
}
