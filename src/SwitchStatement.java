public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "E";
        switch (nilai){
            case "A":
                System.out.println("Lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Cukup baik");
            break;
            case "D":
                System.out.println("Anda perlu remed");;
                break;
            default:
                System.out.println("Anda belum mendaftar kelas");
        }
        nilai = "D";
        switch (nilai){
            case "A" -> System.out.println("A");
            case "B", "C" -> System.out.println("B atau C");
            case "D" ->{
                System.out.print("D");
                System.out.print("E");
                System.out.print("Y");
                System.out.println("M");
            }
            default -> System.out.println("input anda salah");
        }

//        System.out.println("before nilai "+ nilai);
        String ucapan = switch (nilai){
            case "A":
                yield "100";
            case "B", "C": yield "80";
            case "D":
                yield "DEYMm";
            default:
                yield "Anda siapa";
        };
        System.out.println(ucapan);
    }
}
