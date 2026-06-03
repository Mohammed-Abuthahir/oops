package FunctionalInterface;

@FunctionalInterface
interface StringFormat{
    String format(String text);
}

public class functionalinterface {

    public static void main(String[] args) {

        StringFormat uppercaseLetter = (text) -> text.toUpperCase();

        StringFormat lowercaseLetter = (text) -> text.toLowerCase();

        String text = "Hello World";

        System.out.println("original :" + text);

        System.out.println("UpperCase Letter :"+uppercaseLetter.format(text));

        System.out.println("LowerCase Letter :"+lowercaseLetter.format(text));

    }

}
