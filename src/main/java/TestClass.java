public class TestClass {

    public static void main(String args[]) {

        //Create an instance of ComputeMethods,
        //invoke the 3 methods and dispay their results

        ComputeMethods compute = new ComputeMethods();

        compute.roll();
        compute.fToC(74);
        compute.hypotenuse(5, 6);
    }
}