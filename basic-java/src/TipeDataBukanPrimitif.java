public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer thisIsInteger = 100;
        Long thisIsLong = 100L;

        Byte thisIsByte = null;

        System.out.println("Byte Non Primitif : "+ thisIsByte);

        thisIsByte = 10;
        System.out.println("Byte Non Primitif : "+ thisIsByte);

        /*Conversion from primitive to non primitive data type*/

        int age = 20;
        Integer Age = age;

        Long AgeLong = Long.valueOf(age);

        System.out.println("Age : "+Age);
        System.out.println("Age Long : "+AgeLong);


        /*Conversion from non primitive to primitive data type*/

        Integer ageObject = 30;
        int convAgeObject = ageObject;  //compatible to convert directly becuase same datatype

        System.out.println("Conversion Age : "+convAgeObject);

        byte convAgeByte = ageObject.byteValue();
        short convAgeShort = ageObject.shortValue();
        long convAgeLong = ageObject.longValue();

        System.out.println(convAgeByte+"-"+convAgeShort+"-"+ convAgeLong);

    }
}
