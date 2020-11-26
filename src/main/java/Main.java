public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;
    //задаем ожидаемое значение
    //long expected = 30;

    //вызываем целевой метод
    long actual = service.calculate(amount, registered);

    //сравниваем ожидаемый и фактический результат
    //boolean passed = expected == actual;

    //выводим результат
    System.out.println(actual);
  }
}

