public class IfStatement {
    public static void main(String[] args) {
        var nilai = 80;
        var absen = 90;
        var lulusAbsen = absen >= 75;
        if (nilai >= 75 && lulusAbsen){
            System.out.println("Selamat kita lulus");
        }

        nilai = 74;
        if (nilai >= 75 && lulusAbsen){
            System.out.println("Selamat kita lulus");
        }else{
            System.out.println("Keren kita lulus");
        }

        if (nilai >= 75 && nilai<= 100){
            System.out.println("A");
        }else if (nilai >= 60 && nilai<= 74){
            System.out.println("B");
        }else if (nilai >= 30 && nilai<= 59){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
