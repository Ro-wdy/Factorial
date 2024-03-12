   
class Calc {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double a, double y) {
        return a + y;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        int resultInt = calc.add(1, 2);
        double resultDouble = calc.add(1.2, 1.3);
        System.out.println("Result of adding integers: " + resultInt);
        System.out.println("Result of adding doubles: " + resultDouble);
    }
}

