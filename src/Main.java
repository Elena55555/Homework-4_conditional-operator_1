public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа № 4 ");

        System.out.println("Задание  № 1");


        int age = 18;
        if (age>=18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        }
        int age1 = 17;
        if (age1>=18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен 17, то он  еще  не достиг совершеннолетия," +
                    " но нужно немного подождать");
        }

        System.out.println("Задание  № 2");
        int t = 4;
        if (t<5) {
            System.out.println("Пора надеть шапку");
        }

        int t2 = 6;
        if (t2>5) {
            System.out.println("Сегодня тепло - можно идти без шапки ");
        }

        System.out.println("Задание № 3 ");

        int speed = 70;
        if (speed>60) {
            System.out.println("Если скорость " + speed +  "  км /ч, то водителю придется заплатить штраф" );
        }
        int speedАllowed = 50;
        if (speedАllowed < 60) {
            System.out.println("Если скорость " + speedАllowed +  "  км /ч, то водителю  можно ехать спокойно");
        }

        System.out.println("Задание № 4 ");


        int ageFrom2To6 =  2;
        if (ageFrom2To6>=2 && ageFrom2To6 <6) {
            System.out.println("Если возраст человека равен " + ageFrom2To6+   ", то ему нужно ходить  в детский сад");
        } else {
            System.out.println("Ему не нужно ходить в детский сад");
        }

        int ageFrom7To18 =  7;
        if (ageFrom7To18>=7 && ageFrom7To18 < 18) {
            System.out.println("Если возраст человека равен " + ageFrom7To18+   ", то ему нужно ходить  в школу");
        } else {
            System.out.println("Ему не нужно ходить в школу");
        }

        int ageFrom18To24 =  18;
        if (ageFrom18To24>=18 && ageFrom18To24 < 24) {
            System.out.println("Если возраст человека равен " + ageFrom18To24+   ", то ему нужно ходить в университет");
        } else {
            System.out.println("Ему не нужно ходить в университет");
        }

        int ageFromMoreThan24  =  25;
        if (ageFromMoreThan24>24 ) {
            System.out.println("Если возраст человека равен " + ageFromMoreThan24 +   ", то ему нужно ходить на работу");
        } else {
            System.out.println("Ему не нужно ходить на работу");
        }

        System.out.println("Задание № 5");


        int ageFromLessThan5   =  4;
        if (ageFromLessThan5<5 ) {
            System.out.println("Если возраст  ребенка равен " + ageFromLessThan5  +   ", то  он не может кататься на аттракционе.");
        } else {
            System.out.println("Если больше 5 лет, то может каталься на аттракционев в присутвствии взрослого");
        }

        int ageFrom5To14 = 6;
        if (ageFrom5To14 > 5 && ageFrom5To14 < 14) {
            System.out.println("Если возраст  ребенка равен " + ageFrom5To14  +   ", то  он   может кататься на аттракционе в сопровождении  взрослого.");
        } else {
            System.out.println("Если больше 14 лет, то может кататься без  сопровождения взрослого");
        }

        int ageFromMoreThan14 = 14;
        if (ageFromMoreThan14 >= 14) {
            System.out.println("Если возраст  ребенка равен " + ageFromMoreThan14  +   ", то  он   может кататься на " +
                    "аттракционе  без  сопровождения взрослого.");
        } else {
            System.out.println("Если меньше 14 лет, то может кататься, но в  сопровождении взрослого ");
        }

        System.out.println("Задание № 6 ");

        int place = 0;
        if (place  >  60) {
            System.out.println("Если место под номером " + place  +   ", то   место стоячее");
        }
        if (place  <= 60 && place != 0) {
            System.out.println("Если место под номером " + place + ", то   место сидячее");
        }   else {
            System.out.println("Если мест " + place +  ", то вагон уже полностью забит ");
        }

        System.out.println("Задание № 7");

        int One = 10;
        int Two = 2;
        int Three = 3;

        if (One>Two && One>Three) {
            System.out.println("Максимальное число равное " + One );
        }
        else if (Two>One && Two>Three) {
            System.out.println("Максимальное число равное " + Three );
        }
        else if  (Three>One && Three>Two) {
            System.out.println("Максимальное число равное " + Three );
        }




    


















    }
}