
public class Converter {
    public static void main(String[] args) {
        String strFloat = "374.25";
        float from_strFloat = Float.parseFloat(strFloat);

        String strInt = "1250";
        int from_strInt = Integer.parseInt(strInt);

        float floatNum = 56.715f;
        int from_floatNum = (int) floatNum;

        int intNum = 1500;
        float from_intNum = (float) intNum;

        double doubleNum = 3.14159265;
        String from_doubleNum = "" + doubleNum;
    }
}