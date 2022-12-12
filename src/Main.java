import task1.Data;
import task1.WrongLoginException;
import task1.WrongPasswordException;
import task2.*;

public class Main {
    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {
        System.out.println("Task 1");
        Data vend = new Data("1234_ajA12", "1234_ajA_", "1234_ajA_");
        Data.checkCorrectData(vend);
        System.out.println("");
        System.out.println("Task 2");
        Car lada = new Car("Лада", "Гранта", 59.5599, "Бурый", "Хетчбэк", "автомат");
//        System.out.println(lada);
//        System.out.println();
        Bus neman = new Bus("Неман", "420211-10", 57.49, "Зеленый");
//        System.out.println(neman);
//        System.out.println();
        Truck gazel4 = new Truck("Газель", "Рута", 110);
//        System.out.println(gazel4);
//        gazel4.finishMoving();
//        System.out.println();

//        CategoryBDriver azazel = new CategoryBDriver("ТАА", true, 12, lada);
//        System.out.println(azazel);
//        azazel.stop();
//        CategoryCDriver max = new CategoryCDriver("АМТ", true, 10, gazel4);
//        System.out.println(max);
//        CategoryDDriver dinislam = new CategoryDDriver("ГДА", true, 20, neman);
//        System.out.println(dinislam);
//        System.out.println();

        service(lada, neman, gazel4);


    }

    private static void service(MotorTransport... motorTransports) {
        for (MotorTransport motorTransport : motorTransports) {
            serviceT(motorTransport);
        }
    }

    private static void serviceT(MotorTransport motorTransport) {
        try {
            if (!motorTransport.service()) {
                throw new RuntimeException("Автотранспорт " + motorTransport.getBrand() + " " + motorTransport.getModel() + " не прошёл диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

}