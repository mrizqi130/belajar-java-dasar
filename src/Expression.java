public class Expression {
    public static void main(String[] args) {
//        - konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi
//        menjadi sebuah single value
//        - core component dari statement
//        int value; expression
//        value = 10; expression
//        System.out.println(value = 10; expression); statement
//        Statement bida dibliang kalimat lengkap dalam bahasa
//        sebuah statement berisikan execution komplit,  biasanya diakhiri dengan
//        titik koma
//        ada beberapa jenis statement
//        - assignment expression
//        - penggunaan ++ dan --
//        - method invoation
//        - object creation expression
//        assignment statement
        double aValue = 1234.56;
//        increment statement
        aValue++;
//        method invocation statement
        System.out.println("Hello world");
//        object creation statement
//        Date date = new Date();

//        Block adalah kumpulan statement yang terdiri dari nol
//        atau lebih statement
//        block diawali dan diakhiri dengan kurung kurawal {}
        System.out.println("hello");
        {
            System.out.println("Hello 2");
            System.out.println("Hello 3");
            {
                System.out.println("Hello 4");
            }
        }


    }
}
