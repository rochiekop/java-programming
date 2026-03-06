public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println("Total :"+sum(10,20));

        System.out.println(calculate(10,"*",20));
    }

    static int sum(int value1, int value2){
        return value1+value2;
    }


    static int calculate(int value1, String operasi, int value2){
        int response;
        response = switch (operasi){
            case "*": yield value1*value2;
            case "-": yield value1-value2;
            case "/": yield value1/value2;
            default:
                yield 0;
        };
        return  response;
    }

}
