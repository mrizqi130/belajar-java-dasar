public class TernaryOperation {
    public static void main(String[] args) {
        var nilai = 100;
        String ucapan;
        if (nilai>=75) {
            System.out.println("Nilai diatas 74");
        }else{
            System.out.println("Nilai dibawah 75");
        }

        ucapan = nilai >= 75 ? "74 keatas" : "75 kebawah";
        System.out.println(ucapan);
    }
}
