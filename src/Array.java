public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Aka";
        stringArray[1] = "Ika";
        stringArray[2] = "Uka";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "eka";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,0
        };

        long[] arrayLong  = new long[]{
                1,2,3,4,5,6
        };

//        array[index]
//        array[index] = value
//        array.length
        stringArray[0] = null;
        System.out.println(stringArray[0]);
        System.out.println(arrayLong.length);

        String[][] members = {
                {"Aka", "Maka"},
                {"Ika", "Mika"},
                {"Uka", "Muka"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[0]);
    }
}
