package ua.jvdevpro.smlnk;

public class Main {

    public static void main(String[] args) {

        Multiply ml= new Multiply();

        // Использование перегруженных методов с разными параметрами

        System. out .println(ml.mul(1.2, 2.4, 3.5));
        System. out .println(ml.mul(1, 2, 3));
        System. out .println(ml.mul("ab", "cd", "ef"));



        Multiply2 ml2=new Multiply2();

        /**Название методов одинаково, но так как они принадлежат разным объектам, их результат разный*/

        System. out .println(ml.mul(2.0, 3.0, 4.0));
        System. out .println(ml2.mul(2.0, 3.0, 4.0));

        ml=new Multiply2();
        System. out .println(ml.mul(2.0, 3.0, 4.0));

        /**использование оператора instanceof(), сравнивает объекты (принадлежит ли объект указанному классу.
         * Вернет truе, если да и false, если наоборот.)*/

        System. out .println((ml instanceof Multiply2)); // принадлежит ли ml классу Multiply

    }
}
