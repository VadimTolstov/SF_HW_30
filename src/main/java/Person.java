public class Person {

    public static boolean isTeenager(int age) {
        boolean result;

        //исходное условие
         if (age < 19) {

        // исправленное условие
       //if (age >= 13 && age <= 19) {

            result = true;
        } else {
            result = false;

        }

        return result;
    }
}
