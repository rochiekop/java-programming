package util;

public class StringUtil {
    public static boolean isLowerCase(String value){
        for(var e : value.toCharArray()){
            if(!Character.isLowerCase(e)){
                return false;
            }
        }
        return true;
    }
}
