public class Main {
    public static void main(String[] args) {
        // Задача №1
        int a = 300000000;
        byte b = 54;
        short c = 2000;
        long d = 4000000000000000000L;
        float z = 2.2f;
        double x = 2.1111111111;
        System.out.println("Значение переменной 'a' с типом 'int' равно " + a);
        System.out.println("Значение переменной 'b' с типом 'byte' равно " + b);
        System.out.println("Значение переменной 'c' с типом 'short' равно " + c);
        System.out.println("Значение переменной 'd' с типом 'long' равно " + d);
        System.out.println("Значение переменной 'z' с типом 'float' равно " + z);
        System.out.println("Значение переменной 'x' с типом 'double' равно " + x);

        // Задача №2
        float a2 =  27.12f;
        long b2 = 987678965549L;
        float c2 = 2.786f;
        short d2 = 569;
        short z2 = -159;
        short x2 = 27897;
        byte q2 = 67;

        //Задача №3
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheets = 480;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int eachSheets = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + eachSheets + " листов бумаги.");

        // Задача №4
        int controlTime = 16;
        System.out.println("За 2 минуты машина произвела " + controlTime + " штук бутылок.");
        controlTime = controlTime * 10;
        System.out.println("За 20 минуты машина произвела " + controlTime + " штук бутылок.");
        controlTime = controlTime * 72;
        System.out.println("За сутки машина произвела " + controlTime + " штук бутылок.");
        controlTime = controlTime * 3;
        System.out.println("За 3 дня машина произвела " + controlTime + " штук бутылок.");
        controlTime = controlTime * 10;
        System.out.println("За месяц машина произвела " + controlTime + " штук бутылок.");

        // Задача №5
        byte totalCans = 120;
        int totalClasses = totalCans / 6;
        int whitePaint = totalClasses *2;
        int brownPaint = totalClasses *4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        // Задача №6


    }
}