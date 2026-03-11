package pzn.java.oop.application;

public class StackTraceApp {
    public static void main(String[] args) {

        /**
         * Model 1
         */
        //try{
        //    String[] data = {
        //            "1","2","3"
        //    };
        //
        //    System.out.println(data[1000]);
        //}catch (Throwable err){
        //    //StackTraceElement[] stackTraceElements = err.getStackTrace();
        //    //for (var value : stackTraceElements){
        //    //    System.out.println(value);
        //    //}
        //
        //    err.printStackTrace();
        //}

        /**
         * Model 2
         */
        try{
            sampleError();
        }catch (Throwable error){
            error.printStackTrace();
        }
    }

    public static void sampleError() throws Throwable{
        try{
            String[] data = {
                    "1","2","3"
            };

            System.out.println(data[1000]);
        }catch (Throwable err){
            throw new Throwable(err);
        }
    }

}
