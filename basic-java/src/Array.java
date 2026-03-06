public class Array {
    public static void main(String[] args) {
        /*Initiate Array*/

        // Option 1
        String[] arrString = new String[3];

        arrString[0] = "Hello";
        arrString[1] = "World";
        arrString[2] = "!";

        System.out.println("Array String : "+arrString.length);

        //Option 2
        int[] arrInteger = new int[] {
            1,2,3,4,5
        };

        //Option 3
        long[] arrLong = {
                10L,20L,30L
        };

        System.out.println("Array Integer :"+arrInteger[1]);
        System.out.println("Array Long :"+arrLong[arrLong.length-1]);

        /*Nested Array*/

        String[][] nestedArrString = {
                {"Welcome","To","Applications"},
                {"Learn","Java"}
        };

        //nestedArrString[0] = arrString;
        System.out.println("Access Nested Array Idx 0 :"+nestedArrString[0][0]);
        System.out.println("Access Nested Array Idx 0 :"+nestedArrString[1][0]);



    }
}
