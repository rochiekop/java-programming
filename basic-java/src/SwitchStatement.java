public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Sangat Baik");
                break;
            case "B":
            case "C":
                System.out.println("Baik");
            case "D":
                System.out.println("Kurang");
            default:
                System.out.println("Not Found");
        }

        /*Switch Lambda*/
        switch (nilai){
            case "A" -> System.out.println("Sangat Baik");
            case "B,C" -> System.out.println("Baik");
            case "D" -> System.out.println("Kurang");
            default -> System.out.println("Not Found");
        }

        String ucapan;
        switch (nilai){
            case "A"-> ucapan="Sangat Baik";
            case "B,C" -> ucapan="Baik";
            case "D" -> ucapan="Kurang";
            default -> ucapan="Not Found";
        };
        System.out.println(ucapan);

        /*Use Yield instead of duplicate*/

        ucapan = switch (nilai){
            case "A": yield "Sangat Baik";
            case "B,C": yield "Baik";
            case "D" : yield "Kurang";
            default : yield "Not Found";
        };
        System.out.println(ucapan);
    }
}
