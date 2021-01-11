public class ExampleClassTest {
    private static ExampleClass exampleClass;
    public static final String[] validClass = new String[] { "C0318G", "P0318K", "A1234H"};
    public static final String[] invalidClass = new String[] { "N6789M", "A234H", "P5678@",};
    public static void main(String[] args) {
        exampleClass = new ExampleClass();
        for (String grade: validClass) {
            boolean isValid = exampleClass.validates(grade);
            System.out.println("Class is "+ grade + " is valid: " + isValid);
        }
        for (String grade: invalidClass) {
            boolean isValid = exampleClass.validates(grade);
            System.out.println("Class is "+ grade + " is valid: " + isValid);
        }
    }
}
