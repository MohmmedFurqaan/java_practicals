class Calc{
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

}


public class Overloading {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        int add_2 = calculator.add(12, 13);
        System.out.println("2 var add : "+add_2);

        int add_3 = calculator.add(34, 90, 23);
        System.out.println("3 var add : "+add_3);

        int add_4 = calculator.add(34, 90, 23, 45);
        System.out.println("4 var add : "+add_4);

    }
}
