import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("morning");
        System.out.println(whenGoWalk(23, 33));

        System.out.println("midday");
        System.out.println(whenGoWalk(28, 13));

        System.out.println("day");
        System.out.println(whenGoWalk(26, 14));

        System.out.println("evenning");
        System.out.println(whenGoWalk(25, 28));

        System.out.println("night");
        System.out.println(whenGoWalk(15, 26));

        System.out.println("________");

        System.out.println("morning");
        System.out.println(randomnyi (38));

        System.out.println("midday");
        System.out.println(randomnyi(19));

        System.out.println("day");
        System.out.println(randomnyi(24));

        System.out.println("evenning");
        System.out.println(randomnyi(32));

        System.out.println("night");
        System.out.println(randomnyi(21));
    }

    public static String whenGoWalk(int ageOfMen, int temperature) {
        if (ageOfMen > 20 && ageOfMen < 45 && temperature > -20 && temperature < 30) {
            return "Go to walk";
        } else if (ageOfMen < 20 && temperature > 0 && temperature < 28) {
            return "Go to walk";
        } else if (ageOfMen > 45 && temperature > -10 && temperature < 25) {
            return "Go to walk";
        } else {
            return "Stay home";
        }

    }
    public static String randomnyi(int temperature){
        Random random = new Random();
        int randomnyi = random.nextInt(41)+2;
        if (randomnyi > 20 && randomnyi < 45 && temperature > -20 && temperature < 30) {
            return "Go to walk";
        } else if (randomnyi < 20 && temperature > 0 && temperature < 28) {
            return "Go to walk";
        } else if (randomnyi > 45 && temperature > -10 && temperature < 25) {
            return "Go to walk";
        } else {
            return "Stay home";
        }
    }

}

