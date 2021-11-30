 class Calculator {



    public int addAToB( int a, int b){
        return a + b;
    }
    public int subtractAFromB ( int a, int b) {
        return a - b;
    }

    public static void main (String[] args) {
        Calculator calculator = new Calculator();
            int result = calculator.addAToB(15,5);

        System.out.println(result);

    }
}




