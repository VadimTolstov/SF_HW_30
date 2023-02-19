import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {

    @Test(dataProvider = "teenagerDataProvider")
    public void testTeenager(int age, boolean result) {
        boolean isResult = Person.isTeenager(age);
        System.out.println(age + " " + isResult);
        assertEquals(isResult, result);
    }

    @DataProvider(name = "teenagerDataProvider")
    Object[][] teenagerDataProvider() {
        return new Object[][]{
                {-1, false},
                {0, false},
                {1, false},
                {12, false},
                {13, true},
                {14, true},
                {16, true},
                {18, true},
                {19, true},
                {20, false},
                {50, false}

        };
    }

}


//
//    //метод возвидения в квадрат числа
//    public int cvadrat(int age) {
//        return age * age;
//    }
//
//    //Провайдер массив с числами, первое значения которое возведут в квадрат
//    // второе проверка в данном случаи
//    @DataProvider(name = "quadraticDataProvider")
//    Object[][] quadraticDataProvider() {
//        return new Object[][]{
//                {2, 4},
//                {1, 1},
//                {-1, 1},
//                {0, 0}
//        };
//    }
//
//    //тест проверки возведения в квадрат
//    @Test(dataProvider = "quadraticDataProvider")
//    //обьявляем метот принимающий из масива чило и ответ
//    public void testCvadrat(int age, int exp){
//        int cvad = cvadrat(age);
//        System.out.println(cvad);
//        assertEquals(cvad, exp);
//    }
//}