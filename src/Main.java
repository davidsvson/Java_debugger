public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

       int c = a + b * 2;

        b = a + c;

        for (int i = 0; i < 10 ; i++) {
            a = changeValue(a);
            c += a * 2;
        }

        Card card = new Card(3, "diamond");
        Card card2 = new Card(7, "diamond");

        if (card.value > card2.value) {
            System.out.println("We have a winner");
        }

    }

    static int changeValue(int value) {
        int a = 3 + value;
        value = a + value;
        return value;
    }

}