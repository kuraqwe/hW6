public class Main {
    public static void main(String[] args) {
        for (int i =1; i<=10; i++){
            System.out.println(i);                      //the first task
        }

        for (int n = 10; n>=1; n--){
            System.out.println(n);                      //the second task
        }

        for (int x = 0; x < 17; x = x + 2){
            System.out.println(x);                      //the third task
        }

        for (int g = 10; g >= -10; g--){
            System.out.println(g);                      //the fourth task
        }

        for (int y = 1904; y <= 2096; y = y + 4){
            System.out.println(y);                      //the fifth task
        }

        for (int a = 7; a <= 98; a = a + 7){
            System.out.println(a);                      //the sixth task
        }

        for (int b = 1; b <= 512; b= b * 2){
            System.out.println(b);                      //the seventh task
        }

        int total = 0;
        for (int c = 1; c <= 12; c++){
            total = total + 29000;                                                                  //the eighth task
            System.out.println("Месяц " + c + " сумма накоплений равна " + total + " рублей.");
        }

        double total1 = 0;
        for (int c = 1; c <= 12; c++){
            total1 = (total1 + 29000) * 1.01;                                                       //the ninth task
            System.out.println("Месяц " + c + " сумма накоплений равна " + total1 + " рублей.");
        }
    }
}