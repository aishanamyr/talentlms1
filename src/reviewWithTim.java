public class reviewWithTim {

    public static void main(String[] args) {
        System.out.println("This is the printout");
        int a = 0;
        int b = 20;

        System.out.println("The sum is " + returnSum(a, b));



        StringBuilder stringBuilder = new StringBuilder();

        String temp = "this is america";
        StringBuffer stringBuffer = new StringBuffer();

        stringBuilder.append(temp);

        String temp1 = temp.replace('a', 'b');

        System.out.println(temp1);

        if (a + b < 20) {
            System.out.println("a + b is smaller than 20");

            if (a > 0) {

            }
            else if (a == 0) {

            }
        }
        else if (a + b == 10) {
            System.out.println("a + b is equal to 10");
        }
        else System.out.println("the edn");













    }

    public static int returnSum(int num1, int num2) {
        return num1 + num2;
    }
}
