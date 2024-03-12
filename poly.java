class Calc {
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        int result1 = calculator.add(1, 2);
        double result2 = calculator.add(1.2, 1.3);
        System.out.println(result1);
        System.out.println(result2);
    }
}